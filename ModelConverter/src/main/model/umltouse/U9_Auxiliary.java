package main.model.umltouse;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

public class U9_Auxiliary {
	
	private U9_Auxiliary() {}
	
	public enum CollectionName {Bag, Sequence, Set};
	
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
	
	static String checkRoleNotNull(String role, String classRole, List<String> nameClassMemberEnd) {
		boolean reflexive = false;
		if (role != null && !role.isBlank()) {
			for(String nameClass : nameClassMemberEnd) {
				if(!nameClass.equals(classRole) || reflexive) {
					role = searchRoleExist(role, nameClass);
				} else {
					reflexive = true;
				}
			}
			return " role " + role;
		} else {
			for(String nameClass : nameClassMemberEnd) {
				if(!nameClass.equals(classRole) || reflexive) {
					role = searchRoleExist(classRole.toLowerCase(), nameClass);
				}else {
					reflexive = true;
				}
			}
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
		if(!base.equals(search))System.out.println("WARNING: Element with repeated name found. Fixed by assigning name " + search + ".");
		list.add(search);
		return search;
	}
	
	static String checkUnnamed(String name, List<String> namesUsed, U9_CountUnnamed countUnnamed) {
		if(name == null || name.isBlank()) {
			countUnnamed.countUnnamedAddOne();
			System.out.println("WARNING: Element with no name found. Fixed by assigning name unnamed" + countUnnamed.getCountUnnamed() + ".");
			return "unnamed" + countUnnamed.getCountUnnamed();
		} else {
			return searchInList(name, namesUsed);
		}
	}
	
	static String multToString(String lower, String upper) {
		return "[" + ((lower.equals(upper) || (lower.equals("0") && upper.equals("*"))) ? upper : lower + ".." + upper) + "]";
	}
	
	private static String collectionToString(CollectionName collection) {
		switch(collection) {
			case Sequence:
				return "Sequence(";
			case Set:
				return "Set(";
			case Bag:
				return "Bag(";
			default:
				return "";
		}
	}
	
	static String typeToStringNecessary(Type type, CollectionName collection) {
		String collectionName = "";
		String collectionEnd = ")";
		if(collection != null) {
			collectionName = collectionToString(collection);
		} else {
			collectionEnd = "";
		}
		
		return collectionName + ((typeIsNull(type)) ? "String" : checkAvailableType(type)) + collectionEnd;
	}
	
	static String typeToStringOptional(Type type, CollectionName collection) {
		String collectionName = "";
		String collectionEnd = ")";
		if(collection != null) {
			collectionName = collectionToString(collection);
		} else {
			collectionEnd = "";
		}
		
		return (typeIsNull(type)) ? "" : " : " + collectionName + checkAvailableType(type) + collectionEnd;
	}
	
	static boolean typeIsNull(Type type) {
		return type == null || (type.getQualifiedName() != null && !type.getQualifiedName().startsWith(General.nameModel) && type.getName().contains("void")); //|| type.getQualifiedName() == null
	}
	
	static String checkAvailableType(Type type) {
		//String name = type.getQualifiedName();
		//if(name == null) {
			//return "String";
		//} else if(name.startsWith(General.nameModel)) {
		if(type instanceof Class || type instanceof Enumeration) {
			return type.getName();
		} else {
			if(type.getName() != null) {
				String name = type.getName().toLowerCase();
				if(name.contains("bool")) {
					return "Boolean";
				} else if (name.contains("int") || name.contains("long") || name.contains("short")) {
					return "Integer";
				} else if (name.contains("double") || name.contains("float") || name.contains("real")) {
					return "Real";
				} else {
					return "String";
				}
			} else {
				return "String";
			}
		}
	}
	
}
