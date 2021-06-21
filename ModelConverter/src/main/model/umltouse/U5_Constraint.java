package main.model.umltouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;

public class U5_Constraint {
	
	private U5_Constraint() {}
	
	static void addConstraintsToMap(Class classToAnalyze, EList<Constraint> constraints) {
		StringBuilder sBuilder = new StringBuilder("");
		String value, name;
		List<String> namesUsedParticular = new ArrayList<>();
				
		for(Constraint constraint : constraints) {
			
			name = constraint.getName();
			value = (constraint.getSpecification() != null) ? constraint.getSpecification().stringValue() : null;
			
			name = (name != null && !name.isBlank()) ? " " + U9_Auxiliary.searchInList(name, namesUsedParticular) : "";
			
			if(value == null || value.isBlank()) {
				System.out.println("WARNING: Constraint without OCL found. Fixed by assigning OCL by default (true).");
				value = "true";
			} 
		
			sBuilder.append("\tinv" + name+ ":\n\t\t" + value + "\n");
		}
		
		General.allconstraints.put(classToAnalyze.getName(), sBuilder.toString());
	}
	
	static void printAllConstraints(StringBuilder sBuilder, Map<String, String> allconstraints) {
		if(allconstraints.size() > 0) {
			sBuilder.append("constraints\n");
			for(String clase : allconstraints.keySet()) {
				sBuilder.append("context " + clase + "\n");
				sBuilder.append(allconstraints.get(clase) + "\n");
			}
		}
	}
	
}
