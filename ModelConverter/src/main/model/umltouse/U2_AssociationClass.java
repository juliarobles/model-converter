package main.model.umltouse;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.uml.AssociationClass;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;

public class U2_AssociationClass {
	
	private U2_AssociationClass() {}

	static void getAll(Package packet, StringBuilder sBuilder, U9_CountUnnamed countUnnamed) {
		for (PackageableElement pe : packet.getPackagedElements()) {
			//https://stackoverflow.com/questions/61668719/read-sequence-diagram-from-xmi-using-emf
			if(pe.eClass() == UMLPackage.Literals.ASSOCIATION_CLASS) {
				analyzeAssociationClass((AssociationClass) pe, sBuilder, countUnnamed);
			}
		}
	}
	
	private static void analyzeAssociationClass(AssociationClass associationClass, StringBuilder sBuilder, U9_CountUnnamed countUnnamed) {
		String lowerValue, upperValue, ordered;
		sBuilder.append(U1_Class.classStatement(associationClass, "associationclass", countUnnamed) + " between\n");
		
		List<String> nameClassMemberEnd = new ArrayList<>();
		for(Property property : associationClass.getMemberEnds()) {
			nameClassMemberEnd.add(property.getType().getName());
		}
		
		for(Property property : associationClass.getMemberEnds()) {
			ordered = (property.isOrdered()) ? " ordered" : "";
			lowerValue = (property.getLowerValue() == null)? "1" : property.getLowerValue().stringValue();
			upperValue = (property.getUpperValue() == null)? "1" : property.getUpperValue().stringValue();
			sBuilder.append("\t" + property.getType().getName() + " " 
					+ U9_Auxiliary.multToString(lowerValue, upperValue) 
					+ U9_Auxiliary.checkRoleNotNull(property.getName(), property.getType().getName(), nameClassMemberEnd) + ordered +"\n");
		}
		sBuilder.append(U1_Class.classContents(associationClass));
	}
}
