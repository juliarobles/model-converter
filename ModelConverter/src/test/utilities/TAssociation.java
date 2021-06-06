package test.utilities;

import java.util.List;

public class TAssociation {
	private String name;
	private List<TMemberEnd> memberEnds;
	
	public TAssociation(String name) {
		this.name = name;
	}

	public void addMemberEnd(TMemberEnd memberEnd) {
		memberEnds.add(memberEnd);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((memberEnds == null) ? 0 : memberEnds.hashCode());
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
		TAssociation other = (TAssociation) obj;
		if (memberEnds == null) {
			if (other.memberEnds != null)
				return false;
		} else if (!memberEnds.equals(other.memberEnds))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
