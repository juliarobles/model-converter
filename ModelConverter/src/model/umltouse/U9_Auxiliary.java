package model.umltouse;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

public class U9_Auxiliary {
	
	private U9_Auxiliary() {}
	
	static boolean isNavigable(Association association) {
		boolean res = true;
		List<Property> memberEnds = association.getMemberEnds();
		int i = 0;
		
		while(res && i < memberEnds.size()) {
			if(!memberEnds.get(i).isNavigable()) {
				res = false;
			} else {
				i++;
			}
		}
		
		return res;
	}
	
	static String checkRoleNotNull(String role, String classRole) {
		if (role != null && !role.isBlank()) {
			role = searchRoleExist(role, classRole);
			return " role " + role;
		} else {
			role = searchRoleExist(classRole.toLowerCase(), classRole);
			if(role.equals(classRole.toLowerCase())) {
				return "";
			} else {
				return " role " + role;
			}
		}
	}
	
	static String searchRoleExist(String role, String classRole) {
		if(General.namesUsedRoles.containsKey(classRole)) {
			role = searchInList(role, General.namesUsedRoles.get(classRole));
		} else {
			List<String> list = new ArrayList<String>();
			list.add(role);
			General.namesUsedRoles.put(classRole, list);
		}
		return role;
	}
	
	static String searchInList(String search, List<String> list) {
		int i = 1;
		String base = search;
		while(list.contains(search)) {
			search = base + i;
			i++;
		} 
		list.add(search);
		return search;
	}
	
	static String checkUnnamed(String name, List<String> namesUsed, int countUnnamed) {
		if(name == null || name.isBlank()) {
			countUnnamed++;
			return "unnamed" + countUnnamed;
		} else {
			return searchInList(name, namesUsed);
		}
	}
	
	static String multToString(String lower, String upper) {
		return "[" + ((lower.equals(upper) || (lower.equals("0") && upper.equals("*"))) ? upper : lower + ".." + upper) + "]";
	}
	
	static String typeToStringNecessary(Type type) {
		return (typeIsNull(type)) ? "String" : checkAvailableType(type);
	}
	
	static String typeToStringOptional(Type type) {
		return (typeIsNull(type)) ? "" : " : " + checkAvailableType(type);
	}
	
	static boolean typeIsNull(Type type) {
		return type == null || (!type.getQualifiedName().startsWith(General.nameModel) && type.getName().contains("void"));
	}
	
	static String checkAvailableType(Type type) {
		String name = type.getQualifiedName();
		if(name.startsWith(General.nameModel)) {
			return type.getName();
		} else {
			name = type.getName().toLowerCase();
			if(name.contains("bool")) {
				return "Boolean";
			} else if (name.contains("int")) {
				return "Integer";
			} else if (name.contains("double") || name.contains("float") || name.contains("real")) {
				return "Real";
			} else {
				return "String";
			}
		}
	}
	
}
