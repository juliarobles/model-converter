package test.utilities;

public class TMemberEnd {
	private String nameClass;
	private String role;
	private String lower;
	private String upper;
	
	public TMemberEnd(String nameClass) {
		this.nameClass = nameClass;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setLower(String lower) {
		this.lower = lower;
	}

	public void setUpper(String upper) {
		this.upper = upper;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lower == null) ? 0 : lower.hashCode());
		result = prime * result + ((nameClass == null) ? 0 : nameClass.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + ((upper == null) ? 0 : upper.hashCode());
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
		TMemberEnd other = (TMemberEnd) obj;
		if (lower == null) {
			if (other.lower != null)
				return false;
		} else if (!lower.equals(other.lower))
			return false;
		if (nameClass == null) {
			if (other.nameClass != null)
				return false;
		} else if (!nameClass.equals(other.nameClass))
			return false;
		if (role == null) {
			if (other.role != null && !other.role.isBlank() && !other.role.contains(nameClass.toLowerCase()))
				return false;
		} else if (!role.equals(other.role)
					&& !(role.isBlank() && other.role == null)
					&& !(role.isBlank() && other.role != null && other.role.contains(nameClass.toLowerCase()))
					&& !((other.role == null || other.role.isBlank()) && role.contains(nameClass.toLowerCase())))
			return false;
		if (upper == null) {
			if (other.upper != null)
				return false;
		} else if (!upper.equals(other.upper))
			return false;
		return true;
	}
	
	
}
