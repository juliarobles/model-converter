package model.umltouse;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;

public class U4_Operation {
	
	static String analyzeOperation(Operation operation, List<String> namesUsedParticular, int countUnnamed) {
		boolean primero = true;
		int countUnnamedParameter = 0;
		String value = null;
		Constraint bodycondition = operation.getBodyCondition();
		StringBuilder sBuilder = new StringBuilder("");
		List<String> namesUsedParameter = new ArrayList<>();
		
		sBuilder.append(U9_Auxiliary.checkUnnamed(operation.getName(), namesUsedParticular, countUnnamed) + "(");
		//sBuilder.append("\tMultiplicidad: " + multToString(operation.getLower(), operation.getUpper()) + "\n");
		
		for(Parameter parameter : operation.getOwnedParameters()) {
			if(parameter.getDirection() != ParameterDirectionKind.RETURN_LITERAL) { //Para que no aparezca el tipo del return
				if (!primero) {
					sBuilder.append(", ");
				} else {
					primero = false;
				}
				sBuilder.append(analyzeParameter(parameter, namesUsedParameter, countUnnamedParameter));
			}
		}
		
		sBuilder.append(")" + U9_Auxiliary.typeToStringOptional(operation.getType()));
		if (bodycondition != null && bodycondition.getSpecification() != null) {
			value = bodycondition.getSpecification().stringValue();
		}
		
		if(operation.isQuery() && value != null) {
			sBuilder.append(" = " + value);
		} else {
			if(value != null) {
				sBuilder.append("\n\t\t\tbegin\n\t\t\t\t" + value + "\n\t\t\tend\n");
			}
			for(Constraint constraint : operation.getPreconditions()) {
				sBuilder.append("\t\t\t" + analyzeOperationCondition(constraint, "pre"));
			}
			for(Constraint constraint : operation.getPostconditions()) {
				sBuilder.append("\t\t\t" + analyzeOperationCondition(constraint, "post"));
			}
		}
		
		return sBuilder.toString();
	}
	
	private static String analyzeOperationCondition(Constraint constraint, String conditionType) {
		return conditionType + " " + constraint.getName() + ":" + constraint.getSpecification().stringValue() + "\n";
	}
	
	private static String analyzeParameter(Parameter parameter, List<String> namesUsed, int countUnnamed) {
		return U9_Auxiliary.checkUnnamed(parameter.getName(), namesUsed, countUnnamed) + " : " + U9_Auxiliary.typeToStringNecessary(parameter.getType());
	}
	
}
