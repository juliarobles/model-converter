package model;

import java.io.IOException;

public class Generators {
	
	public static String chooseGeneratorBySourceFile(String source, String destiny) {
		try {
			if(source.endsWith(".use")) {
				return fromUSEtoUML(source);
			} else if (source.endsWith(".uml")) {
				return fromUMLtoUSE(source, destiny);
			} else {
				return "Porfavor, introduzca un archivo .use o .uml";
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return "No se ha podido leer el archivo. Porfavor, introduzca un archivo .use o .uml válido.";
		} catch (Exception e) {
			return "Error: " + e.getMessage();
		}
	}
	
	public static String fromUSEtoUML(String source) {
		model.usetouml.General.generateUML(source);
		return "El modelo USE " + source + " se ha convertido correctamente a UML.";
	}

	public static String fromUMLtoUSE(String source, String destination) throws IOException {
		model.umltouse.General.generateUSE(source, destination);
		return "El modelo UML " + source + " se ha convertido correctamente a USE.";
	}
	
}
