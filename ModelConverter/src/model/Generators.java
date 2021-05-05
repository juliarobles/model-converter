package model;

import java.io.IOException;

public class Generators {
	
	public static void fromUSEtoUML(String input) {
		model.usetouml.General.generateUML(input);
        System.out.println("Listo");
	}

	public static void fromUMLtoUSE(String source, String destination) throws IOException {
		model.umltouse.General.generateUSE(source, destination);
		System.out.println("Listo");
	}
	
}
