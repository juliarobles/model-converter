package test.utilities;

import java.util.ArrayList;
import java.util.List;

class TClass{
	private String name;
	private boolean abstract1;
	private List<TAttribute> attributes;
	private List<TOperation> operations;
	private List<TConstraint> constraints;
	private List<TStateMachine> stateMachines;
	private List<String> inheritances;
	private TAssociation association; //Para associationClass
	
	public TClass(String name) {
		this.name = name;
		attributes = new ArrayList<>();
		operations = new ArrayList<>();
		constraints = new ArrayList<>();
		stateMachines = new ArrayList<>();
		inheritances = new ArrayList<>();
	}
	
	public TOperation searchOperationByName(String name) {
		int i = 0;
		while(i < this.operations.size()) {
			if(this.operations.get(i).getName().equals(name)) {
				return this.operations.get(i);
			}
			i++;
		}
		return null;
	}
	
	public void setAbstract1(boolean abstract1) {
		this.abstract1 = abstract1;
	}
	
	public void setAssociation(TAssociation association) {
		this.association = association;
	}

	public void addAttribute(TAttribute attribute) {
		attributes.add(attribute);
	}
	
	public void addOperation(TOperation operation) {
		operations.add(operation);
	}
	
	public void addConstraint(TConstraint constraint) {
		constraints.add(constraint);
	}
	
	public void addStateMachine(TStateMachine stateMachine) {
		if(stateMachine.getStatesSize() > 1 && stateMachine.getTransitionsSize() > 0) {
			stateMachines.add(stateMachine);
		}
	}
	
	public void addInheritance(String tclass) {
		if(tclass != null && tclass.startsWith("unnamed") && tclass.length() == ("unnamed").length() + 1) {
			inheritances.add("");
		} else {
			inheritances.add(tclass);
		}
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((association == null) ? 0 : association.hashCode());
		result = prime * result + ((attributes == null) ? 0 : attributes.hashCode());
		result = prime * result + ((constraints == null) ? 0 : constraints.hashCode());
		result = prime * result + ((inheritances == null) ? 0 : inheritances.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((operations == null) ? 0 : operations.hashCode());
		result = prime * result + ((stateMachines == null) ? 0 : stateMachines.hashCode());
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
		TClass other = (TClass) obj;
		if(abstract1 != other.abstract1)
			return false;
		if (association == null) {
			if (other.association != null)
				return false;
		} else if (!association.equals(other.association))
			return false;
		if (attributes == null) {
			if (other.attributes != null)
				return false;
		} else if (!attributes.equals(other.attributes))
			return false;
		if (constraints == null) {
			if (other.constraints != null)
				return false;
		} else if (!constraints.equals(other.constraints))
			return false;
		if (inheritances == null) {
			if (other.inheritances != null)
				return false;
		} else if (!inheritances.equals(other.inheritances))
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
		if (operations == null) {
			if (other.operations != null)
				return false;
		} else if (!operations.equals(other.operations))
			return false;
		if (stateMachines == null) {
			if (other.stateMachines != null)
				return false;
		} else if (!stateMachines.equals(other.stateMachines))
			return false;
		System.out.println("Equals tclass " + name + "es true");
		return true;
	}
}
