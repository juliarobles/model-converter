package model.umltouse;

import java.util.List;

import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.UMLPackage;

public class U0_Enumeration {
	
	private static int countUnnamed;
	
	static void getAll(StringBuilder sBuilder, StringBuilder warnings) {
		countUnnamed = 0;
		for (PackageableElement pe : General.packet.getPackagedElements()) {
			//https://stackoverflow.com/questions/61668719/read-sequence-diagram-from-xmi-using-emf
			if(pe.eClass() == UMLPackage.Literals.ENUMERATION) {
				analyzeEnumeration((Enumeration) pe, sBuilder);
			}
		}
	}
	
	private static void analyzeEnumeration(Enumeration enumeration, StringBuilder sBuilder) {
		List<EnumerationLiteral> literals = enumeration.getOwnedLiterals();
		boolean primero = true;
		
		sBuilder.append("enum " + U9_Auxiliary.checkUnnamed(enumeration.getName(), General.namesUsedGeneral, countUnnamed) + " {");
		if(literals.size() <= 0) {
			sBuilder.append("requiredValue");
		} else {
			for(EnumerationLiteral enumerationLiteral : literals) {
				if (!primero) {
					sBuilder.append(", ");
				} else {
					primero = false;
				}
				sBuilder.append(enumerationLiteral.getName());
			}
		}
		sBuilder.append("}\n\n");
	}
	
}
