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
		U9_Auxiliary.CollectionName collection = null;
		Parameter returnParam = null;
		
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
			} else {
				returnParam = parameter;
			}
		}
		
		if(returnParam.getUpperValue() != null && !returnParam.getUpperValue().stringValue().equals("1")) {
			if(returnParam.isOrdered()) {
				collection = U9_Auxiliary.CollectionName.Sequence;
			} else if (returnParam.isUnique()) {
				collection = U9_Auxiliary.CollectionName.Set;
			} else {
				collection = U9_Auxiliary.CollectionName.Bag;
			}
		}
		
		sBuilder.append(")" + U9_Auxiliary.typeToStringOptional(operation.getType(), collection));
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
		U9_Auxiliary.CollectionName collection = null;
		if(parameter.getUpperValue() != null && !parameter.getUpperValue().stringValue().equals("1")) {
			if(parameter.isOrdered()) {
				collection = U9_Auxiliary.CollectionName.Sequence;
			} else if (parameter.isUnique()) {
				collection = U9_Auxiliary.CollectionName.Set;
			} else {
				collection = U9_Auxiliary.CollectionName.Bag;
			}
		}
		return U9_Auxiliary.checkUnnamed(parameter.getName(), namesUsed, countUnnamed) + " : " + U9_Auxiliary.typeToStringNecessary(parameter.getType(), collection);
	}
	
}
