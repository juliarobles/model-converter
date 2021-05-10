package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Auxiliary {
	
	public static void stringToFile(String destination, String string) throws IOException {
		File file = new File(destination);
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
		    writer.write(string);
		}
	}
	
}
