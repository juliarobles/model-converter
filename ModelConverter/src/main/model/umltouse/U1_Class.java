package main.model.umltouse;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.AssociationClass;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Package;

public class U1_Class {
	
	private U1_Class() {}
	
	static void getAll(Package packet, StringBuilder sBuilder, U9_CountUnnamed countUnnamed) {	
		checkAllClassName(packet, countUnnamed);
		for (PackageableElement pe : packet.getPackagedElements()) {
			//https://stackoverflow.com/questions/61668719/read-sequence-diagram-from-xmi-using-emf
			if(pe.eClass() == UMLPackage.Literals.CLASS) {
				analyzeClass(((Class) pe), sBuilder, countUnnamed);
			}
		}
	}
	
	private static void checkAllClassName(Package packet, U9_CountUnnamed countUnnamed) {
		for (PackageableElement pe : packet.getPackagedElements()) {
			if(pe.eClass() == UMLPackage.Literals.CLASS) {
				Class aux = ((Class) pe);
				aux.setName(U9_Auxiliary.checkUnnamed(aux.getName(), General.namesUsedGeneral, countUnnamed));
			} else if (pe.eClass() == UMLPackage.Literals.ASSOCIATION_CLASS) {
				AssociationClass aux = ((AssociationClass) pe);
				aux.setName(U9_Auxiliary.checkUnnamed(aux.getName(), General.namesUsedGeneral, countUnnamed));
			}
		}
	}
	
	private static void analyzeClass(Class classToAnalyze, StringBuilder sBuilder, U9_CountUnnamed countUnnamed) {
		sBuilder.append(classStatement(classToAnalyze, "class", countUnnamed) + "\n" + classContents(classToAnalyze));
	}
	
	static String classStatement(Class classToAnalyze, String classType, U9_CountUnnamed countUnnamed) {
		EList<Generalization> generalizations = classToAnalyze.getGeneralizations();
		boolean primero = true;
		StringBuilder sBuilder = new StringBuilder("");
		
		if(classToAnalyze.isAbstract()) { //¿ABSTRACTA?
			sBuilder.append("abstract ");
		}
		
		sBuilder.append(classType + " " + classToAnalyze.getName()); //NOMBRE	
		
		if(generalizations.size() > 0) { //HERENCIA
			sBuilder.append(" < ");
			for(Generalization generalization : generalizations) {
				if (!primero) {
					sBuilder.append(", ");
				} else {
					primero = false;
				}
				sBuilder.append(generalization.getGeneral().getName());
			}
		}
		
		return sBuilder.toString();
	}
	
	static String classContents(Class classToAnalyze) {
		List<String> namesUsedParticular;
		EList<Operation> operations = classToAnalyze.getOperations();
		EList<Constraint> constraints = classToAnalyze.getOwnedRules();
		List<StateMachine> stateMachines = classToAnalyze.getOwnedBehaviors().stream().filter(sc -> sc instanceof StateMachine).map(sc -> (StateMachine) sc).collect(Collectors.toList());
		StringBuilder sBuilder = new StringBuilder("");
		List<Property> attributes = classToAnalyze.getAttributes().stream().filter(p -> p.getAssociation() == null || !U9_Auxiliary.isNavigable(p.getAssociation())).collect(Collectors.toList());
		
		//ATRIBUTOS
		if(attributes.size() > 0) {
			sBuilder.append("\tattributes\n");
			U9_CountUnnamed countUnnamed = new U9_CountUnnamed();
			namesUsedParticular = new ArrayList<>();
			
			for(Property property : attributes) {
				String defaultValue = "";
				U9_Auxiliary.CollectionName collection = null;
				if(property.getDefault() != null && !property.getDefault().isBlank()) {
					defaultValue = (property.isDerived()) ? (" derive: " + property.getDefault()) : (" init: " + property.getDefault());
				}
				if(property.getUpperValue() != null && !property.getUpperValue().stringValue().equals("1")) {
					if(property.isOrdered()) {
						collection = U9_Auxiliary.CollectionName.Sequence;
					} else if (property.isUnique()) {
						collection = U9_Auxiliary.CollectionName.Set;
					} else {
						collection = U9_Auxiliary.CollectionName.Bag;
					}
				}
				sBuilder.append("\t\t" + U9_Auxiliary.checkUnnamed(property.getName(), namesUsedParticular, countUnnamed) + U9_Auxiliary.typeToStringOptional(property.getType(), collection) + defaultValue + "\n");
			}
		}
				
		//OPERACIONES
		if(operations.size() > 0) {
			sBuilder.append("\toperations\n");
			U9_CountUnnamed countUnnamed = new U9_CountUnnamed();
			namesUsedParticular = new ArrayList<>();
			
			for(Operation operation : operations) {
				sBuilder.append("\t\t" + U4_Operation.analyzeOperation(operation, namesUsedParticular, countUnnamed) + "\n");
			}
		}
		
		//CONSTRAINTS
		if(constraints.size() > 0) U5_Constraint.addConstraintsToMap(classToAnalyze, constraints);
		
		
		//MAQUINAS DE ESTADOS
		if(stateMachines.size() > 0) {
			sBuilder.append("\tstatemachines\n");
			U9_CountUnnamed countUnnamed = new U9_CountUnnamed();
			namesUsedParticular = new ArrayList<>();
			
			for(StateMachine stateMachine : stateMachines) {
				sBuilder.append(U6_StateMachine.analyzeStateMachine(stateMachine, namesUsedParticular, countUnnamed) + "\n");
			}
		}
		
		sBuilder.append("end\n\n");
		
		return sBuilder.toString();
	}
	
}
