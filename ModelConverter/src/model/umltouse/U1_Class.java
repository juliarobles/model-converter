package model.umltouse;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLPackage;

public class U1_Class {
	
	private U1_Class() {}
	
	static void getAll(StringBuilder sBuilder, StringBuilder warnings, int countUnnamed) {
		for (PackageableElement pe : General.packet.getPackagedElements()) {
			//https://stackoverflow.com/questions/61668719/read-sequence-diagram-from-xmi-using-emf
			if(pe.eClass() == UMLPackage.Literals.CLASS) {
				analyzeClass((Class) pe, sBuilder, countUnnamed);
			}
		}
	}
	
	private static void analyzeClass(Class classToAnalyze, StringBuilder sBuilder, int countUnnamed) {
		sBuilder.append(classStatement(classToAnalyze, "class", countUnnamed) + "\n" + classContents(classToAnalyze));
	}
	
	static String classStatement(Class classToAnalyze, String classType, int countUnnamed) {
		EList<Generalization> generalizations = classToAnalyze.getGeneralizations();
		boolean primero = true;
		StringBuilder sBuilder = new StringBuilder("");
		
		if(classToAnalyze.isAbstract()) { //¿ABSTRACTA?
			sBuilder.append("abstract ");
		}
		
		classToAnalyze.setName(U9_Auxiliary.checkUnnamed(classToAnalyze.getName(), General.namesUsedGeneral, countUnnamed));
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
		StringBuilder sBuilder = new StringBuilder("");
		List<Property> attributes = classToAnalyze.getAttributes().stream().filter(p -> p.getAssociation() == null || !U9_Auxiliary.isNavigable(p.getAssociation())).collect(Collectors.toList());
		
		//ATRIBUTOS
		if(attributes.size() > 0) {
			sBuilder.append("\tattributes\n");
			int countUnnamed = 0;
			namesUsedParticular = new ArrayList<>();
			
			for(Property property : attributes) {
				sBuilder.append("\t\t" + U9_Auxiliary.checkUnnamed(property.getName(), namesUsedParticular, countUnnamed) + U9_Auxiliary.typeToStringOptional(property.getType()) + "\n");
			}
		}
				
		//OPERACIONES
		if(operations.size() > 0) {
			sBuilder.append("\toperations\n");
			int countUnnamed = 0;
			namesUsedParticular = new ArrayList<>();
			
			for(Operation operation : operations) {
				sBuilder.append("\t\t" + U4_Operation.analyzeOperation(operation, namesUsedParticular, countUnnamed) + "\n");
			}
		}
		
		//CONSTRAINTS
		if(constraints.size() > 0) U5_Constraint.addConstraintsToMap(classToAnalyze, constraints);
		
		sBuilder.append("end\n\n");
		
		return sBuilder.toString();
	}
	
}
