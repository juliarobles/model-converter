package test.utilities;

import java.util.ArrayList;
import java.util.List;

class TOperation {
	private String name;
	private TAttribute return1;
	private List<TAttribute> parameters;
	private String bodyCondition;
	private List<TConstraint> preconditions;
	private List<TConstraint> postconditions;
	
	public TOperation(String name) {
		this.name = name;
		parameters = new ArrayList<>();
		preconditions = new ArrayList<>();
		postconditions = new ArrayList<>();
	}

	public void setReturn1(TAttribute return1) {
		this.return1 = return1;
	}

	public void setBodyCondition(String bodyCondition) {
		this.bodyCondition = bodyCondition;
	}
	
	public void addParameter(TAttribute parameter) {
		parameters.add(parameter);
	}
	
	public void addPreconditions(TConstraint precondition){
		preconditions.add(precondition);
	}
	
	public void addPostconditions(TConstraint postcondition){
		postconditions.add(postcondition);
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bodyCondition == null) ? 0 : bodyCondition.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((parameters == null) ? 0 : parameters.hashCode());
		result = prime * result + ((postconditions == null) ? 0 : postconditions.hashCode());
		result = prime * result + ((preconditions == null) ? 0 : preconditions.hashCode());
		result = prime * result + ((return1 == null) ? 0 : return1.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TOperation other = (TOperation) obj;
		if (bodyCondition == null) {
			if (other.bodyCondition != null && !other.bodyCondition.isBlank() && !other.bodyCondition.equals("USE") && !other.bodyCondition.equals("true"))
				return false;
		} else if (!bodyCondition.equals(other.bodyCondition)
					&& (other.bodyCondition != null && !other.bodyCondition.equals("true") && bodyCondition.isBlank())
					&& !other.bodyCondition.equals("USE")
					&& !bodyCondition.equals("USE"))
			return false;
		if (name == null) {
			if (other.name != null && !other.name.contains("unnamed") && !other.name.isBlank())
				return false;
		} else if (!name.equals(other.name)
					&& !(name.isBlank() && other.name == null)
					&& !(name.isBlank() && other.name.contains("unnamed"))
					&& !((other.name == null || other.name.isBlank()) && name.contains("unnamed"))
					&& !((other.name != null && name.contains(other.name) && name.length() == other.name.length()+1))
					&& !((other.name != null && other.name.contains(name) && other.name.length() == name.length()+1)))
			return false;
		if (parameters == null) {
			if (other.parameters != null)
				return false;
		} else if (!parameters.containsAll(other.parameters) || !parameters.containsAll(other.parameters))
			return false;
		if (postconditions == null) {
			if (other.postconditions != null)
				return false;
		} else if (!postconditions.containsAll(other.postconditions) || !postconditions.containsAll(other.postconditions))
			return false;
		if (preconditions == null) {
			if (other.preconditions != null)
				return false;
		} else if (!preconditions.containsAll(other.preconditions) || !preconditions.containsAll(other.preconditions))
			return false;
		if (return1 == null) {
			if (other.return1 != null && !(other.return1.equals(new TAttribute("", "String", null))) && !(other.return1.equals(new TAttribute("", "Boolean", null))))
				return false;
		} else if (!return1.equals(other.return1)
					&& !(other.return1 == null && return1.equals(new TAttribute("", "String", null)))
					&& !(other.return1 == null && return1.equals(new TAttribute("", "Boolean", null))))
			return false;
		System.out.println("Equals toperation " + name + " es true");
		return true;
	}

	
}
