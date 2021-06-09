package test.utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TModel {
	private String name;
	private List<TClass> classes;
	private List<TEnum> enums;
	private List<TAssociation> relations;
	
	public TModel(String name) {
		this.name = name;
		classes = new ArrayList<>();
		enums = new ArrayList<>();
		relations = new ArrayList<>();
	}

	public void addClass(TClass class1) {
		classes.add(class1);
	}

	public void addEnum(TEnum enum1) {
		enums.add(enum1);
	}

	public void addRelation(TAssociation relation) {
		relations.add(relation);
	}

	public TClass searchClassByName(String name) {
		int i = 0;
		while(i < this.classes.size()) {
			if(this.classes.get(i).getName().equals(name)) {
				return this.classes.get(i);
			}
			i++;
		}
		return null;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((classes == null) ? 0 : classes.hashCode());
		result = prime * result + ((enums == null) ? 0 : enums.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((relations == null) ? 0 : relations.hashCode());
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
		TModel other = (TModel) obj;
		if (classes == null) {
			if (other.classes != null)
				return false;
		} else {
			Collections.sort(classes, new Comparator<TClass>() {
				@Override
				public int compare(TClass p1, TClass p2) {
					return ((p1.getName().isBlank() || p1.getName().contains("unnamed"))) ? -1 : p1.getName().compareTo(p2.getName());
				}
			});
			Collections.sort(other.classes, new Comparator<TClass>() {
				@Override
				public int compare(TClass p1, TClass p2) {
					return ((p1.getName().isBlank() || p1.getName().contains("unnamed"))) ? -1 : p1.getName().compareTo(p2.getName());
				}
			});
			if (!classes.equals(other.classes))
				return false;
		}
		if (enums == null) {
			if (other.enums != null)
				return false;
		} else if (!enums.equals(other.enums))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (relations == null) {
			if (other.relations != null)
				return false;
		} else if (!relations.equals(other.relations))
			return false;
		return true;
	}
}
