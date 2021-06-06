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
			if (other.bodyCondition != null)
				return false;
		} else if (!bodyCondition.equals(other.bodyCondition))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (parameters == null) {
			if (other.parameters != null)
				return false;
		} else if (!parameters.equals(other.parameters))
			return false;
		if (postconditions == null) {
			if (other.postconditions != null)
				return false;
		} else if (!postconditions.equals(other.postconditions))
			return false;
		if (preconditions == null) {
			if (other.preconditions != null)
				return false;
		} else if (!preconditions.equals(other.preconditions))
			return false;
		if (return1 == null) {
			if (other.return1 != null)
				return false;
		} else if (!return1.equals(other.return1))
			return false;
		return true;
	}

	
}
