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
		values.add(value.replaceAll(",", ""));
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
			if (other.name != null && !other.name.contains("unnamed") && !other.name.isBlank())
				return false;
		} else if (!name.equals(other.name)
					&& !(name.isBlank() && other.name == null)
					&& !(name.isBlank() && other.name.contains("unnamed"))
					&& !((other.name == null || other.name.isBlank()) && name.contains("unnamed"))
					&& !((other.name != null && name.contains(other.name) && name.length() == other.name.length()+1))
					&& !((other.name != null && other.name.contains(name) && other.name.length() == name.length()+1)))
			return false;
		if (values == null) {
			if (other.values != null && !(other.values.size() == 1 && other.values.get(0).equals("requiredValue")))
				return false;
		} else if (!values.equals(other.values)
				&& !(other.values == null && values.size() == 1 && values.get(0).equals("requiredValue"))
				&& !(values.isEmpty() && other.values.size() == 1 && other.values.get(0).equals("requiredValue"))
				&& !(other.values.isEmpty() && values.size() == 1 && values.get(0).equals("requiredValue")))
			return false;
		System.out.println("Equals tenum " + name + "es true");
		return true;
	}
	
	
	
}
