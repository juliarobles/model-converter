package main.model.umltouse;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;

public class U4_Operation {
	
	private U4_Operation() {}
	
	static String analyzeOperation(Operation operation, List<String> namesUsedParticular, U9_CountUnnamed countUnnamed) {
		boolean primero = true;
		U9_CountUnnamed countUnnamedParameter = new U9_CountUnnamed();
		String value = null;
		Constraint bodycondition = operation.getBodyCondition();
		StringBuilder sBuilder = new StringBuilder("");
		List<String> namesUsedParameter = new ArrayList<>();
		U9_Auxiliary.CollectionName collection = null;
		Parameter returnParam = null;
		
		operation.setName(U9_Auxiliary.checkUnnamed(operation.getName(), namesUsedParticular, countUnnamed));
		sBuilder.append(operation.getName() + "(");
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
		
		if(returnParam != null && returnParam.getUpperValue() != null && !returnParam.getUpperValue().stringValue().equals("1")) {
			if(returnParam.isOrdered()) {
				collection = U9_Auxiliary.CollectionName.Sequence;
			} else if (returnParam.isUnique()) {
				collection = U9_Auxiliary.CollectionName.Set;
			} else {
				collection = U9_Auxiliary.CollectionName.Bag;
			}
		}
		
		if(returnParam == null && operation.isQuery()) {
			sBuilder.append(") : Boolean");
		} else {
			sBuilder.append(")" + U9_Auxiliary.typeToStringOptional(operation.getType(), collection));
		}
		
		if (bodycondition != null && bodycondition.getSpecification() != null && bodycondition.getSpecification().stringValue() != null && !bodycondition.getSpecification().stringValue().isBlank()) {
			value = bodycondition.getSpecification().stringValue();
		}
		
		if(operation.isQuery()) {
			if(value != null) {
				sBuilder.append(" = " + value + "\n");
			} else {
				sBuilder.append(" = true\n");
			}
		} else {
			sBuilder.append("\n\t\t\tbegin\n");
			if(value != null) {
				sBuilder.append("\t\t\t\t" + value + "\n");
			} 
			sBuilder.append("\t\t\tend\n");
		}
		for(Constraint constraint : operation.getPreconditions()) {
			sBuilder.append("\t\t\t" + analyzeOperationCondition(constraint, "pre"));
		}
		for(Constraint constraint : operation.getPostconditions()) {
			sBuilder.append("\t\t\t" + analyzeOperationCondition(constraint, "post"));
		}
		
		return sBuilder.toString();
	}
	
	private static String analyzeOperationCondition(Constraint constraint, String conditionType) {
		String value = (constraint.getSpecification() != null && constraint.getSpecification().stringValue() != null && !constraint.getSpecification().stringValue().isBlank()) ? constraint.getSpecification().stringValue() : "true";
		return conditionType + " " + constraint.getName() + ": " + value + "\n";
	}
	
	private static String analyzeParameter(Parameter parameter, List<String> namesUsed, U9_CountUnnamed countUnnamed) {
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
