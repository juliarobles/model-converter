package main.model.umltouse;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.UMLPackage;

public class U0_Enumeration {
	
	private U0_Enumeration() {}
	
	static void getAll(Package packet, StringBuilder sBuilder, U9_CountUnnamed countUnnamed) {
		for (PackageableElement pe : packet.getPackagedElements()) {
			//https://stackoverflow.com/questions/61668719/read-sequence-diagram-from-xmi-using-emf
			if(pe.eClass() == UMLPackage.Literals.ENUMERATION) {
				analyzeEnumeration((Enumeration) pe, sBuilder,countUnnamed);
			}
		}
	}
	
	private static void analyzeEnumeration(Enumeration enumeration, StringBuilder sBuilder, U9_CountUnnamed countUnnamed) {
		List<EnumerationLiteral> literals = enumeration.getOwnedLiterals();
		boolean primero = true;
		
		enumeration.setName(U9_Auxiliary.checkUnnamed(enumeration.getName(), General.namesUsedGeneral, countUnnamed));
		sBuilder.append("enum " + enumeration.getName() + " {");
		
		if(literals.size() <= 0) {
			System.out.println("WARNING: Enumeration " + enumeration.getName() + " does not contain any value. Fixed by assigning a value by default (requiredValue).");
			sBuilder.append("requiredValue");
		} else {
			U9_CountUnnamed countUnnamedLiterals = new U9_CountUnnamed();
			List<String> namesUsedParticularLiterals = new ArrayList<>();
			for(EnumerationLiteral enumerationLiteral : literals) {
				if (!primero) {
					sBuilder.append(", ");
				} else {
					primero = false;
				}
				sBuilder.append(U9_Auxiliary.checkUnnamed(enumerationLiteral.getName(), namesUsedParticularLiterals, countUnnamedLiterals));
			}
		}
		sBuilder.append("}\n\n");
	}
	
}
