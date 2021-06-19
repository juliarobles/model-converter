package main.model.usetouml;

import java.io.File;
import java.util.Scanner;

import main.model.Auxiliary;

public class SingleQuotes {
	
	private static final String STARTSOIL = "begin";
	private static final String ENDSOIL = "end";
	private static final String[] ENDCLASS = {"class", "association", "abstract", "constraints", "associationclass", "composition", "aggregation"};
	
	private SingleQuotes() {}
	
	public static File modifyFileBeforeGeneratingOnlyBeginEnd(String source) {
		StringBuilder sBuilder = new StringBuilder();
		String aux = "", line;
		boolean nofin = true, soil = false, next = false;
		String auxLine;
		
		try {
            Scanner input = new Scanner(new File(source));
            
            while(input.hasNextLine()) {
            	line = input.nextLine();
            	if(soil && isContain(line, ENDSOIL)) { //Si estoy analizando SOIL y me encuentro el final
            		soil = false;
            		nofin = true;
            		while(input.hasNextLine() && nofin) {
            			auxLine = line;
            			line = input.nextLine();
            			while(input.hasNextLine() && (line.isBlank() || line.startsWith("--"))) {
                			line = input.nextLine();
                		}
            			if(isContain(line, ENDSOIL)) {
            				sBuilder.append(auxLine+"\n");
            			} else {
            				nofin = false;
            				if(!next) {
            					if(isEndOfClass(line)) {
            						deleteLastLineBreak(sBuilder);
            						sBuilder.delete(sBuilder.length()-4, sBuilder.length());
            						deleteLastLineBreak(sBuilder);
                            		sBuilder.append("'\nend\n");
            					} else {
            						deleteLastLineBreak(sBuilder);
                            		sBuilder.append("'\n");
            					}
                        	}
                        	sBuilder.append(auxLine + "\n");
                        	next = false;
            			}
            		}
            		
            	} else if (soil && next) {
            		while(input.hasNextLine() && line.isBlank()) {
            			line = input.nextLine();
            		}
            		line = "'" + line.strip();
            		next = false;
            	} else if(isContain(line, STARTSOIL)) { //Analizando todo el archivo y me encuentro el principio
            		soil = true;
            		auxLine = line.substring(line.indexOf(STARTSOIL)+(STARTSOIL).length()).strip();
            		if(auxLine == null || auxLine.isBlank()) {
            			next = true;
            		} else {
            			sBuilder.append(line.substring(0, line.indexOf(STARTSOIL)) + "\nbegin\n");
            			line = "'" + auxLine.strip();
            		}
            	}
            	sBuilder.append(line + "\n");
            }
            input.close();
            return Auxiliary.stringToTempFile("auxModelConverter", ".use", sBuilder.toString());
            
		} catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
	}
	
	private static boolean isEndOfClass(String line) {
		boolean contains = false;
		int i = 0;
		while(i<ENDCLASS.length && !contains) {
			contains = isContain(line, ENDCLASS[i]);
			i++;
		}
		return contains;
	}
	
	private static boolean isContain(String source, String subItem){
		String[] parts = source.split(" ");
		for(int i = 0; i < parts.length; i++) {
		    if(parts[i].strip().replace("\t", "").equals(subItem)) return true;
		}
		return false;
   }
	
	private static void deleteLastLineBreak(StringBuilder sBuilder) {
		while(sBuilder.charAt(sBuilder.length()-1) == '\n' || sBuilder.charAt(sBuilder.length()-1) == ' ') {
			sBuilder.deleteCharAt(sBuilder.length()-1);
		}
	}
}
