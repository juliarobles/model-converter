package test.utilities;

import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Vertex;
import org.eclipse.uml2.uml.resource.UMLResource;

import main.model.umltouse.General;
import main.model.umltouse.U9_Auxiliary;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.AssociationClass;
import org.eclipse.uml2.uml.CallEvent;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;

public class MC_UMLtoTModel {
	
	private static String nameModel = "";
	
	public static TModel getModelFromFileMD(String modelMD) {
		Package packet = (Package) EcoreUtil.getObjectByType(load(modelMD).getContents(), UMLPackage.Literals.PACKAGE);
		TModel tModel = new TModel(packet.getModel().getName());
		nameModel = packet.getModel().getName();
		
		for (PackageableElement pe : packet.getPackagedElements()) {
			//https://stackoverflow.com/questions/61668719/read-sequence-diagram-from-xmi-using-emf
			if(pe.eClass() == UMLPackage.Literals.ENUMERATION) {
				Enumeration enumeration = (Enumeration) pe;
				TEnum enum1 = new TEnum(enumeration.getName());
				for(EnumerationLiteral enumerationLiteral : enumeration.getOwnedLiterals()) {
					enum1.addValue(enumerationLiteral.getName());
				}
				tModel.addEnum(enum1);
			} else if(pe.eClass() == UMLPackage.Literals.CLASS || pe.eClass() == UMLPackage.Literals.ASSOCIATION_CLASS) {
				Class class1 = (Class) pe;
				TClass tClass = new TClass(class1.getName());
				tClass.setAbstract1(class1.isAbstract());
				if(pe.eClass() == UMLPackage.Literals.ASSOCIATION_CLASS) {
					tClass.setAssociation(processAssociation((AssociationClass)class1));
				}
				for(Generalization generalization : class1.getGeneralizations()) {
					tClass.addInheritance(generalization.getGeneral().getName());
				}
				for(Property property : class1.getAttributes()) {
					if(property.getAssociation() == null || !isNavigable(property.getAssociation())) {
						String upperValue = (property != null && property.getUpperValue() != null) ? property.getUpperValue().stringValue() : null;
						tClass.addAttribute(new TAttribute(property.getName(), checkAvailableType(packet.getModel().getName(), property.getType()), upperValue, property.isUnique(), property.isOrdered()));
					}
				}
				for(Operation operation : class1.getOperations()) {
					TOperation tOperation = new TOperation(operation.getName());
					for(Parameter parameter : operation.getOwnedParameters()) {
						String upperValue = (parameter != null && parameter.getUpperValue() != null) ? parameter.getUpperValue().stringValue() : null;
						if(parameter.getDirection() != ParameterDirectionKind.RETURN_LITERAL) {
							tOperation.setReturn1(new TAttribute("", checkAvailableType(packet.getModel().getName(), parameter.getType()), upperValue, parameter.isUnique(), parameter.isOrdered()));
						} else {
							tOperation.addParameter(new TAttribute(parameter.getName(), checkAvailableType(packet.getModel().getName(), parameter.getType()), upperValue, parameter.isUnique(), parameter.isOrdered()));
						}
					}
					if (operation.getBodyCondition() != null && operation.getBodyCondition().getSpecification() != null) tOperation.setBodyCondition(operation.getBodyCondition().getSpecification().stringValue());
					for(Constraint constraint : operation.getPreconditions()) {
						TConstraint tCondition = new TConstraint(constraint.getName());
						if(constraint.getSpecification() != null && constraint.getSpecification().stringValue() != null && !constraint.getSpecification().stringValue().isBlank()) tCondition.setOcl(constraint.getSpecification().stringValue());
						tOperation.addPreconditions(tCondition);
					}
					for(Constraint constraint : operation.getPostconditions()) {
						TConstraint tCondition = new TConstraint(constraint.getName());
						if(constraint.getSpecification() != null && constraint.getSpecification().stringValue() != null && !constraint.getSpecification().stringValue().isBlank()) tCondition.setOcl(constraint.getSpecification().stringValue());
						tOperation.addPostconditions(tCondition);
					}
					tClass.addOperation(null);
				}
				for(Constraint constraint : class1.getOwnedRules()) {
					TConstraint tConstraint = new TConstraint(constraint.getName());
					tConstraint.setOcl((constraint.getSpecification() != null) ? constraint.getSpecification().stringValue() : null);
					tClass.addConstraint(tConstraint);
				}
				for(StateMachine stateMachine : class1.getOwnedBehaviors().stream().filter(sc -> sc instanceof StateMachine).map(sc -> (StateMachine) sc).collect(Collectors.toList())) {
					TStateMachine tStateMachine = new TStateMachine(stateMachine.getName());
					for(Region region : stateMachine.getRegions()) {
						for(Vertex vertex : region.getSubvertices()) {
							if(vertex instanceof State) {
								TState tState = new TState(vertex.getName());
								Constraint constraint = ((State)vertex).getStateInvariant();
								if(constraint != null && constraint.getSpecification() != null && !constraint.getSpecification().stringValue().isBlank()) tState.setInvariant(constraint.getSpecification().stringValue());
								tStateMachine.addState(tState);
							} else {
								tStateMachine.addState(new TState(vertex.getName()));
							}
						}
						for(Transition transition : region.getTransitions()) {
							TTransition tTransition = new TTransition(transition.getTarget().getName(), transition.getSource().getName());
							if(transition.getGuard() != null && transition.getGuard().getSpecification() != null && transition.getGuard().getSpecification().stringValue() != null  && !transition.getGuard().getSpecification().stringValue().isBlank()) tTransition.setPreCondition(transition.getGuard().getSpecification().stringValue());
							EList<Constraint> postConditions = transition.getOwnedRules();
							if(transition.getGuard() != null) postConditions.remove(transition.getGuard());
							if(postConditions.size() > 0 && postConditions.get(0) != null && postConditions.get(0).getSpecification() != null && postConditions.get(0).getSpecification().stringValue() != null && !postConditions.get(0).getSpecification().stringValue().isBlank()) tTransition.setPostCondition(postConditions.get(0).getSpecification().stringValue());
							if(transition.getTriggers().size() > 0) tTransition.setOperation(((CallEvent)transition.getTriggers().get(0).getEvent()).getOperation().getName());
							tStateMachine.addTransition(tTransition);
						}
					}
					tClass.addStateMachine(tStateMachine);
				}
				tModel.addClass(tClass);
			} else if (pe.eClass() == UMLPackage.Literals.ASSOCIATION) {
				if(isNavigable((Association)pe)){
					tModel.addRelation(processAssociation((Association)pe));
				}
			}
		}
		
		return tModel;
	}
	
	private static TAssociation processAssociation(Association association) {
		// TODO Auto-generated method stub
		TAssociation tAssociation = new TAssociation(association.getName());
		String tipoRelacionFinal = "association", tipoRelacionVariable;
		for(Property property : association.getMemberEnds()) {
			TMemberEnd tMemberEnd = new TMemberEnd(property.getType().getName());
			tipoRelacionVariable = property.getAggregation().getName();
			tMemberEnd.setLower((property.getLowerValue() == null)? "1" : property.getLowerValue().stringValue());
			tMemberEnd.setUpper((property.getUpperValue() == null)? "1" : property.getUpperValue().stringValue());
			if(tipoRelacionFinal.equals("association")) {
				if(tipoRelacionVariable.equals("composite")) {
					tipoRelacionFinal = "composition";
				} else if (tipoRelacionVariable.equals("shared")) {
					tipoRelacionFinal = "aggregation";
				}
			}
			tMemberEnd.setRole(property.getName());
			tAssociation.addMemberEnd(tMemberEnd);
		}
		tAssociation.setTypeAssociation(tipoRelacionFinal);
		return tAssociation;
	}

	private static Resource load(String path) throws WrappedException, RuntimeException {
		//A collection of related persistent documents.
		ResourceSet set = new ResourceSetImpl();
		
		//Register the UML Package
		set.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		set.getResourceFactoryRegistry().getExtensionToFactoryMap()
		   .put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		//Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
		   //.put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		set.getResourceFactoryRegistry().getExtensionToFactoryMap()
			.put(UMLResource.PROFILE_FILE_EXTENSION, UMLResource.Factory.INSTANCE );
 
		//Extraer la url del UML2 independiente al path de mi pc
		//https://www.eclipse.org/forums/index.php/t/151576/
		final String profile = "profiles/UML2.profile.uml";
		URL url = MC_UMLtoTModel.class.getClassLoader().getResource(profile);
		
		if (url == null)
		{
			throw new RuntimeException("Error getting UML2.profile.uml");
		}
		
		String urlString = url.toString();
		if (!urlString.endsWith(profile))
		{
			throw new RuntimeException("Error getting UML2.profile.uml. Got: " + urlString);
		}
		urlString = urlString.substring(0, urlString.length() - profile.length());
		
		//Añadir las librerias porque en standalone sino no funciona
		//https://www.eclipse.org/forums/index.php/t/457622/
		Map<URI, URI> uriMap = set.getURIConverter().getURIMap();
		URI uri = URI.createURI(urlString); // for example
		uriMap.put(URI.createURI(UMLResource.LIBRARIES_PATHMAP), uri.appendSegment("libraries").appendSegment(""));
		uriMap.put(URI.createURI(UMLResource.METAMODELS_PATHMAP), uri.appendSegment("metamodels").appendSegment(""));
		uriMap.put(URI.createURI(UMLResource.PROFILES_PATHMAP), uri.appendSegment("profiles").appendSegment(""));
		//uriMap.put(URI.createURI(UMLResource.STANDARD_PROFILE_URI), uri.appendSegment("standard").appendSegment(""));
		
		Resource res = set.getResource(URI.createFileURI(path), true);
		return res;
	}	
	private static String checkAvailableType(String nameModel, Type type) {
		if(!typeIsNull(type)) {
			if(type instanceof Class || type instanceof Enumeration) {
				return type.getName();
			} else {
				String name = type.getName().toLowerCase();
				if(name.contains("bool")) {
					return "Boolean";
				} else if (name.contains("int") || name.contains("long") || name.contains("short")) {
					return "Integer";
				} else if (name.contains("double") || name.contains("float") || name.contains("real")) {
					return "Real";
				} else {
					return "String";
				}
			}
		}
		return "String";
	}
	
	private static boolean typeIsNull(Type type) {
		return type == null || (type.getQualifiedName() != null && !type.getQualifiedName().startsWith(nameModel) && type.getName().contains("void"));
	}
	
	private static boolean isNavigable(Association association) {
		boolean res = true;
		List<Property> memberEnds = association.getMemberEnds();
		int i = 0;
		
		while(res && i < memberEnds.size()) {
			if(!memberEnds.get(i).isNavigable()) {
				res = false;
			} else {
				i++;
			}
		}
		
		return res;
	}
}
