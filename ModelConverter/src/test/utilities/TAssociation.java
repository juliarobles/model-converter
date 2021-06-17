package test.utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TAssociation {
	private String name;
	private List<TMemberEnd> memberEnds;
	private String typeAssociation;
	
	public TAssociation(String name) {
		this.name = name;
		this.memberEnds = new ArrayList<>();
	}

	public TAssociation(String name, String typeAssociation) {
		this.name = name;
		this.memberEnds = new ArrayList<>();
		this.typeAssociation = typeAssociation;
	}

	public void addMemberEnd(TMemberEnd memberEnd) {
		memberEnds.add(memberEnd);
	}

	public void setTypeAssociation(String typeAssociation) {
		this.typeAssociation = typeAssociation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((memberEnds == null) ? 0 : memberEnds.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((typeAssociation == null) ? 0 : typeAssociation.hashCode());
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
		TAssociation other = (TAssociation) obj;
		if (memberEnds == null) {
			if (other.memberEnds != null)
				return false;
		} else {
			Collections.sort(memberEnds, new Comparator<TMemberEnd>() {
				@Override
				public int compare(TMemberEnd p1, TMemberEnd p2) {
					return p1.getNameClass().compareTo(p2.getNameClass());
				}
			});
			Collections.sort(other.memberEnds, new Comparator<TMemberEnd>() {
				@Override
				public int compare(TMemberEnd p1, TMemberEnd p2) {
					return p1.getNameClass().compareTo(p2.getNameClass());
				}
			});
			if (!memberEnds.equals(other.memberEnds)) return false;
		}
		if (name == null) {
			if (other.name != null && !other.name.contains("unnamed") && !other.name.isBlank())
				return false;
		} else if (!name.equals(other.name)
					&& !(name.isBlank() && other.name == null)
					&& !(name.isBlank() && other.name.contains("unnamed"))
					&& !((other.name == null || other.name.isBlank()) && name.contains("unnamed"))
					&& !((other.name != null && name.contains(other.name.substring(0, other.name.length()-1))))
					&& !((other.name != null && other.name.contains(name.substring(0, name.length()-1))))
					&& !((other.name != null && name.contains(other.name) && name.length() == other.name.length()+1))
					&& !((other.name != null && other.name.contains(name) && other.name.length() == name.length()+1)))
			return false;
		if (typeAssociation == null) {
			if (other.typeAssociation != null)
				return false;
		} else if (!typeAssociation.equals(other.typeAssociation))
			return false;
		System.out.println("Equals tassociation " + name + "es true");
		return true;
	}
}
