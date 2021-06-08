package main.model;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Generators {
	
	public static void chooseGeneratorBySourceFile(String source, String destiny) {
		try {
			if(source == null || source.isBlank() || destiny == null || destiny.isBlank()) {
				System.err.println("ERROR: Both fields must be completed.\n");
			} else if (!Files.exists(Paths.get(source))) {
				System.err.println("ERROR: Invalid source path.\n");
			} else if (!Files.exists(Paths.get(destiny))) {
				System.err.println("ERROR: Invalid destination path.\n");
			} else if(source.endsWith(".use")) {
				fromUSEtoUML(source, destiny);
			} else if (source.endsWith(".uml")) {
				fromUMLtoUSE(source, destiny);
			} else {
				System.err.println("ERROR: Please enter a valid .use or .uml file.\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("The file could not be read. Please enter a valid .use or .uml file.\n");
		} catch (Exception e) {
			System.err.println("ERROR: " + e.getMessage() + "\n");
		}
	}
	
	public static void fromUSEtoUML(String source, String destiny) {
		File file = new File(source);
		System.out.println("The USE file \"" + file.getName() + "\" will be converted to UML...");
		main.model.usetouml.General.generateUML(source, destiny);
		System.out.println("Process ended.\n");
		
	}

	public static void fromUMLtoUSE(String source, String destination) throws IOException {
		File file = new File(source);
		System.out.println("The UML file \"" + file.getName() + "\" will be converted to USE...");
		main.model.umltouse.General.generateUSE(source, destination);
		System.out.println("Process ended.\n");
	}
	
}
