/*import java.io.IOException;
import java.util.Scanner;

import org.eclipse.emf.common.util.WrappedException;

import model.Generators;*/

public class prueba {

	/*public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String lectura;
		String destino = "aaa.use";
		
		do {
			
			System.out.println("Introduzca el nombre del archivo .uml o .use que quiere convertir en el formato contrario o escriba FIN para salir");
			lectura = sc.nextLine();
			
			if(lectura != null && !lectura.equalsIgnoreCase("FIN")) {
				try {
					if(lectura.endsWith(".use")) {
						Generators.fromUSEtoUML(lectura, destino);
						System.out.println("Listo");
					} else if (lectura.endsWith(".uml")) {
						Generators.fromUMLtoUSE(lectura, destino);
						System.out.println("Listo");
					} else {
						System.err.println("Porfavor, introduzca un archivo .use o .uml");
					}
					System.out.println();
				} catch (WrappedException e) {
					System.err.println("El nombre del archivo es incorrecto o se ha producido un error");
				} catch (RuntimeException e) {
					System.err.println("No se ha podido crear el recurso." + e.getMessage());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.err.println("No se ha podido crear el fichero destino.");
				}
			}
			
		} while(lectura != null && !lectura.equalsIgnoreCase("FIN"));
		
		System.out.println("Programa finalizado");
		
		//FromUSEtoUML.exportUML("prueba.use");
		System.out.println("Listo");
	}*/

}
