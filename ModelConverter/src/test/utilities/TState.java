package test.utilities;

public class TState {
	private String name;
	private String invariant;
	private boolean isInitial;
	private boolean isFinal;
	
	public TState(String name) {
		this.name = name;
	}

	public TState(String name, String invariant, boolean isInitial, boolean isFinal) {
		this.name = name;
		this.invariant = invariant;
		this.isInitial = isInitial;
		this.isFinal = isFinal;
	}
	
	public void setInvariant(String invariant) {
		this.invariant = invariant;
	}

	public void setInitial(boolean isInitial) {
		this.isInitial = isInitial;
	}

	public void setFinal(boolean isFinal) {
		this.isFinal = isFinal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((invariant == null) ? 0 : invariant.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		TState other = (TState) obj;
		if (isFinal != other.isFinal) return false;
		if (isInitial != other.isInitial) return false;
		if (invariant == null) {
			if (other.invariant != null && !other.invariant.equals("USE"))
				return false;
		} else if (!invariant.equals(other.invariant)
					&& !(other.invariant != null && other.invariant.equals("USE")) && !invariant.equals("USE")
					&& !(other.invariant != null && invariant.strip().replaceAll(" ", "").equals(other.invariant.strip().replaceAll(" ", ""))))
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
		return true;
	}
	
	
}
