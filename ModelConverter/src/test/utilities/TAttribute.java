package test.utilities;

import java.util.Collection;

import main.model.umltouse.U9_Auxiliary;

class TAttribute {
	private String name;
	private String type;
	private String collection;
	
	public TAttribute(String name, String type, String collection) {
		this.name = name;
		this.type = type;
		this.collection = collection;
	}
	
	public TAttribute(String name, String type, String upper, boolean isUnique, boolean isOrdered) {
		this.name = name;
		this.type = type;
		if(upper != null && !upper.equals("1")) {
			if(isOrdered) {
				this.collection = "Sequence";
			} else if (isUnique) {
				this.collection = "Set";
			} else {
				this.collection = "Bag";
			}
		}
	}

	public TAttribute(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setCollection(String collection) {
		this.collection = collection;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		TAttribute other = (TAttribute) obj;
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
		if (type == null) {
			if (other.type != null && !other.type.contains("unnamed") && !other.type.isBlank())
				return false;
		} else if (!type.equals(other.type)
				&& !(type.isBlank() && other.type == null)
				&& !(type.isBlank() && other.type.contains("unnamed"))
				&& !((other.type == null || other.type.isBlank()) && type.contains("unnamed"))
				&& !((other.type != null && type.contains(other.type) && type.length() == other.type.length()+1))
				&& !((other.type != null && other.type.contains(type) && other.type.length() == type.length()+1)))
			return false;
		return true;
	}
	
	
	
}
