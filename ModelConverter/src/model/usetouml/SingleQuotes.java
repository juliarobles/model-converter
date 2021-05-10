package model.usetouml;

import java.io.File;
import java.util.Scanner;

import model.Auxiliary;

public class SingleQuotes {
	
	private static enum Mode {Normal, Begin};
	
	private static String line;
	private static String auxLine;
	private static Boolean newLine;
	private static Boolean beginEnd;
	
	private SingleQuotes() {}
	
	static void modifyFileBeforeGenerating(String source) {
		StringBuilder sBuilder = new StringBuilder();
		int indexStart, aux;
		newLine = true;
		String stripLine;
		
		try {
            Scanner input = new Scanner(new File(source));
            while (input.hasNextLine()) {
            	if(newLine) {
            		line = input.nextLine();
            	} else {
            		newLine = true;
            	}
            	stripLine = line.strip();
                if(isOclStart(stripLine)) {
                	indexStart = line.indexOf(':');
                	sBuilder.append(line.substring(0, indexStart) + ": ");
                	obteinOCL(sBuilder, input, indexStart, Mode.Normal);
                	
                } else if (isOclBeginStart(stripLine)) {
                	aux = line.indexOf("begin");
                	indexStart = aux+("begin").length();
                	
                	if(line.strip().indexOf("begin")-1 > 0) {
                		sBuilder.append(line.substring(0, aux) + "\n");
                	}
                	
                	sBuilder.append("begin\n");
                	obteinOCL(sBuilder, input, indexStart, Mode.Begin);
                } else if (isOclQueryStart(stripLine)) {
                	indexStart = line.indexOf('=');
                	sBuilder.append(line.substring(0, indexStart) + "= ");
                	obteinOCL(sBuilder, input, indexStart, Mode.Normal);
                	
            	} else {
                	sBuilder.append(line + "\n");
                }
            }
            input.close();
            Auxiliary.stringToFile("auxiliary.use", sBuilder.toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		
	}
	
	private static void obteinOCL(StringBuilder sBuilder, Scanner input, int indexStart, Mode mode) {
		Boolean fin = false, primero = true;
		int i, aux;
		String word;
		beginEnd = false;
		
    	if(indexStart+1 < line.length()) {
    		line = line.substring(indexStart+1, line.length()).strip();
    		if(primero && line.length() > 0) {			//Si es la primera linea le ponemos la coma
				line = "'" + line;
				primero = false;
			}
    	} else {
    		sBuilder.append("\n");
    		line = input.nextLine().strip();
    	}
    		
    	while (input.hasNextLine() && !fin) {			//Obtenemos todas las lineas que formen el OCL
    		if(primero && line.length() > 0) {			//Si es la primera linea le ponemos la coma
    			line = "'" + line;
    			primero = false;
    		}
    			
    		i = 0;										//Analizamos más detenidamente las palabras, puesto
    		String[] words = line.split(" ");			//que se puede empezar el siguiente pre/post/end
    		auxLine = line;								//sin un salto de linea
    		line = "";											
    																
    		while(i < words.length && !fin) {
    			word = words[i];
    			if(isOclEnd(word, words, i, mode)) {
    				deleteLastLineBreak(sBuilder);
    				if(beginEnd) {
    					aux = sBuilder.lastIndexOf("end");
    					if(aux != -1) {
    						sBuilder.delete(aux, aux + ("end").length());
    						deleteLastLineBreak(sBuilder);
    					}
    					sBuilder.append(line + "'\n end\n");
    					beginEnd = false;
    				} else {
    					sBuilder.append(line + "'\n");
    				}
    				fin = true;
    				newLine = false;
    				line = joinWords(words, i);
    			} else {
    				line = line + words[i] + " ";
    				i++;
    			}
    		}
    		if(!fin) {											//Si hemos analizado toda la frase y no se ha terminado,
    			sBuilder.append(line + "\n");					//seguimos con la siguiente linea
    			do {
    				line = input.nextLine().strip();
    			} while (line.length() == 0);
    		}
    	}
    		
    	if(!input.hasNextLine()) {
    		deleteLastLineBreak(sBuilder);
    		sBuilder.append("'");
    	}
	}
	
	private static Boolean isOclStart(String string) {
		return (string.startsWith("pre") || string.startsWith("post") 
        		|| string.startsWith("inv")) && string.contains(":");
	}
	
	private static Boolean isOclBeginStart(String line) {
		int ini, fin;
		if (line.contains("begin")) {
        	ini = line.indexOf("begin");
        	fin = ini+("begin").length();
        	return ((ini-1 > 0 && line.charAt(ini-1) != ' ') 			 
        			|| (fin+1 < line.length() && line.charAt(fin+1) != ' ')
        			|| (ini-1 <= 0 && fin+1 >= line.length()));
		} else {
			return false;
		}
	}
	
	private static Boolean isOclQueryStart(String string) {
		int index2 = string.indexOf(")");
		int index3 = string.indexOf("=");
		return isOperationDeclaration(string) && index2 != -1 && index3 != -1 
				&& index2 < index3 && !string.substring(0, index3).contains(".");
	}
	
	private static Boolean isOperationDeclaration(String string) {
		int index1 = string.indexOf("(");
		int index2 = string.indexOf(")");
		return index1 != -1 && index2 != -1
				&& index1 < index2 && !string.substring(0, index2).contains(".");
	}
	
	private static Boolean isOclEnd(String word, String[] words, int i, Mode mode) {
		switch (mode) {
			case Normal:
				return (word.equals("post") || word.equals("pre") || word.equals("inv"))
						&& (i+1 >= words.length || words[i+1].contains(":") 
						|| (i+2 < words.length && words[i+2].equals(":"))
						&& (i-1 < 0 || !words[i-1].equals("@")))
						|| word.startsWith("post:") || word.startsWith("pre:")
						|| word.startsWith("inv:") || word.equals("constraints")
						|| word.equals("statemachines") || word.equals("context")
						|| word.equals("end") || isOperationDeclaration(auxLine.substring(i));
			case Begin:
				if(beginEnd && !word.equals(";")) {
					return true;
				}
				if(word.equals("end") && (i+1 >= words.length || !words[i+1].contains(";"))) {
					beginEnd = true;
				}
				return false;
			default:
				return true;
		}
	}
	
	private static void deleteLastLineBreak(StringBuilder sBuilder) {
		if(sBuilder.charAt(sBuilder.length()-1) == '\n') {
			sBuilder.deleteCharAt(sBuilder.length()-1);
			if(sBuilder.charAt(sBuilder.length()-1) == ' ') {
				sBuilder.deleteCharAt(sBuilder.length()-1);
			}
		}
	}
	
	private static String joinWords(String[] words, int ini) {
		String res = "";
		for(int j = ini; j < words.length; j++) {
			res = res + words[j] + " ";
		}
		return res;
	}
}
