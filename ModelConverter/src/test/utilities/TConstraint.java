package test.utilities;

class TConstraint {
	private String name;
	private String ocl;
	
	public TConstraint(String name) {
		this.name = name;
	}

	public void setOcl(String ocl) {
		this.ocl = ocl;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((ocl == null) ? 0 : ocl.hashCode());
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
		TConstraint other = (TConstraint) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (ocl == null) {
			if (other.ocl != null)
				return false;
		} else if (!ocl.equals(other.ocl))
			return false;
		return true;
	}
	
	
}
