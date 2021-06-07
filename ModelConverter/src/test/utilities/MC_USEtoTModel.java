package test.utilities;

import java.io.File;
import java.sql.Struct;
import java.util.Collections;
import java.util.Scanner;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.Injector;

import main.model.usetouml.SingleQuotes;
import modelConverter.use_language.USEStandaloneSetup;
import modelConverter.use_language.use.ModelUSE;
import modelConverter.use_language.use.OperationContext;
import modelConverter.use_language.use.OperationType;
import modelConverter.use_language.use.Parameter;
import modelConverter.use_language.use.Postcondition;
import modelConverter.use_language.use.Precondition;
import modelConverter.use_language.use.SimpleTypes;
import modelConverter.use_language.use.Class;
import modelConverter.use_language.use.CollectionType;
import modelConverter.use_language.use.ConditionType;
import modelConverter.use_language.use.ContextsType;
import modelConverter.use_language.use.Enum;
import modelConverter.use_language.use.Generalization;
import modelConverter.use_language.use.InvariantContext;
import modelConverter.use_language.use.InvariantDefinition;
import modelConverter.use_language.use.Type;
import modelConverter.use_language.use.AssociationClass;
import modelConverter.use_language.use.AllClassAndEnum;
import modelConverter.use_language.use.AllTypes;
import modelConverter.use_language.use.Association;
import modelConverter.use_language.use.AssociationEnd;
import modelConverter.use_language.use.Attribute;

public class MC_USEtoTModel {
	
	public static TModel getModelFromFileUSE(String modelUSE) {
		TModel tModel = null;
		
		File tempFile = SingleQuotes.modifyFileBeforeGeneratingOnlyBeginEnd(modelUSE);
		Injector injector = new USEStandaloneSetup().createInjectorAndDoEMFRegistration();
        ResourceSet rs = injector.getInstance(ResourceSet.class);
        Resource r = rs.getResource(URI.createFileURI(tempFile.getAbsolutePath()), true);
        
        TreeIterator<EObject> iter = r.getAllContents();
		while(iter.hasNext()) {
			EObject object = iter.next();
			if(object instanceof ModelUSE) {
				ModelUSE model = (ModelUSE) object;
				tModel = new TModel(model.getName());
				for(Enum enum1 : model.getEnums()) {
					TEnum tEnum = new TEnum(enum1.getName());
					for(String element : enum1.getElements()) {
						tEnum.addValue(element);
					}
					tModel.addEnum(tEnum);
				}
				for(Type type : model.getPackagedElement()) {
					if(type instanceof Class) {
						Class class1 = (Class) type;
						TClass tClass = new TClass(class1.getName());
						tClass.setAbstract1(class1.isAbstract());
						for(Generalization gen : class1.getGeneralization()) {
							tClass.addInheritance(allClassAndEnumToString(gen.getGeneral()));
						}
						
						tClass.addInheritance(modelUSE);
						if(class1.getAttributes() != null) {
							for(Attribute attribute : class1.getAttributes().getAttributes()) {
								TAttribute tAttribute = new TAttribute(attribute.getName());
								typeToAttribute(tAttribute, attribute.getType());
								tClass.addAttribute(tAttribute);
							}
						}
						if(class1.getOperations() != null) {
							for(OperationType operation : class1.getOperations().getOperations()) {
								TOperation tOperation = new TOperation(operation.getOperationDeclaration().getName());
								TAttribute returnAttr = new TAttribute("");
								typeToAttribute(returnAttr, operation.getOperationDeclaration().getReturnType());
								tOperation.setReturn1(returnAttr);
								for(Parameter parameter : operation.getOperationDeclaration().getParameters()) {
									TAttribute tParameter = new TAttribute(parameter.getName());
									typeToAttribute(tParameter, parameter.getType());
									tOperation.addParameter(tParameter);
								}
								tOperation.setBodyCondition("USE");
								addConditionsToOperation(operation.getConditions(), tOperation);
								tClass.addOperation(tOperation);
							}
						}
						if(class1.getConstraints() != null) {
							for(InvariantDefinition invariantDefinition : class1.getConstraints().getInvariants()) {
								tClass.addConstraint(new TConstraint(invariantDefinition.getName(), "USE"));
							}
						}
						tModel.addClass(tClass);
					} else if (type instanceof Association){
						
					} else if (type instanceof AssociationClass) {
						
					}
				}
				if(model.getConstraints() != null) {
					for(ContextsType contextsType : model.getConstraints().getContexts()) {
						TClass tClass = tModel.searchClassByName(allClassAndEnumToString(contextsType.getClassname()));
						if(tClass != null) {
							if(contextsType instanceof InvariantContext) {
								for(InvariantDefinition invariantDefinition : ((InvariantContext)contextsType).getInvariants()) {
									tClass.addConstraint(new TConstraint(invariantDefinition.getName(), "USE"));
								}
							} else if (contextsType instanceof OperationContext){
								TOperation tOperation = tClass.searchOperationByName(((OperationContext) contextsType).getConstrains().getOperationDeclaration().getName());
								if(tOperation != null) {
									addConditionsToOperation(((OperationContext) contextsType).getConstrains().getConditions(), tOperation);
								}
							}
						}
					}
				}
			}
		}
		
		return tModel;
	}
	
	private static void addConditionsToOperation(EList<ConditionType> conditions, TOperation tOperation) {
		for(Precondition precondition : conditions.stream().filter(sc -> sc instanceof Precondition).map (sc -> (Precondition) sc).toList()) {
			tOperation.addPreconditions(new TConstraint(precondition.getName(), "USE"));
		}
		for(Postcondition postcondition : conditions.stream().filter(sc -> sc instanceof Postcondition).map (sc -> (Postcondition) sc).toList()) {
			tOperation.addPostconditions(new TConstraint(postcondition.getName(), "USE"));
		}
	}
	
	private static void typeToAttribute(TAttribute tAttribute, AllTypes type) {
		if(type instanceof CollectionType) {
			CollectionType ct = (CollectionType) type;
			tAttribute.setCollection(ct.getCollection());
			if(ct.getType() != null && ct.getType().size() > 0) {
				simpleTypesToAttribute(tAttribute, (SimpleTypes)ct.getType().get(0));
			}
		} else if (type instanceof SimpleTypes) {
			simpleTypesToAttribute(tAttribute, (SimpleTypes)type);
		}
	}
	
	private static void simpleTypesToAttribute(TAttribute tAttribute, SimpleTypes simpleTypes) {
		if(simpleTypes.getReferended() != null) {
			tAttribute.setType(allClassAndEnumToString(simpleTypes.getReferended()));
		} else if (simpleTypes.getDefaultType() != null) {
			tAttribute.setType(simpleTypes.getDefaultType());
		}
	}
	
	private static String allClassAndEnumToString(AllClassAndEnum allClassAndEnum) {
		if(allClassAndEnum instanceof AssociationClass) {
			return ((AssociationClass) allClassAndEnum).getName();
		} else if (allClassAndEnum instanceof Class) {
			return ((Class) allClassAndEnum).getName();
		} else if (allClassAndEnum instanceof Enum) {
			return ((Enum) allClassAndEnum).getName();
		}
		return null;
	}
}
