package test.utilities;

import java.util.ArrayList;
import java.util.List;

public class TEnum {
	private String name;
	private List<String> values;
	
	public TEnum(String name) {
		this.name = name;
		values = new ArrayList<>();
	}
	
	public void addValue(String value) {
		values.add(value);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((values == null) ? 0 : values.hashCode());
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
		TEnum other = (TEnum) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name) 
				&& !(name.isBlank() && other.name.contains("unnamed"))
				&& !(other.name.isBlank() && name.contains("unnamed")))
			return false;
		if (values == null) {
			if (other.values != null)
				return false;
		} else if (!values.equals(other.values) 
				&& !(values.isEmpty() && other.values.size() == 1 && other.values.get(0).equals("requiredValue"))
				&& !(other.values.isEmpty() && values.size() == 1 && values.get(0).equals("requiredValue")))
			return false;
		return true;
	}
	
	
	
}
