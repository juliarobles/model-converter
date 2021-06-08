package main.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Auxiliary {
	
	public static void stringToFileNew(String destination, String fileName, String suffix, String text) throws IOException {
		int num = 1;
		File file = new File(destination, fileName + suffix);
		
		while(file.exists()) {
		    file = new File(destination, fileName + "(" + num + ")" + suffix);
		    num++;
		}
		stringToFile(file, text);
		
	}
	
	public static void stringToFileExist(String destination, String text) throws IOException {
		File file = new File(destination);
		stringToFile(file, text);
	}
	
	public static File stringToTempFile(String filename, String suffix, String text) throws IOException {
		File tempFile = File.createTempFile(filename, suffix);
		stringToFile(tempFile, text);
		return tempFile;
	}
	
	private static void stringToFile(File file, String text) throws IOException {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
		    writer.write(text);
		}
	}
	
}
