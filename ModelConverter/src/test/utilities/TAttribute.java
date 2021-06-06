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
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	
	
}
