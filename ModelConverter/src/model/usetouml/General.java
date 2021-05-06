package model.usetouml;

import java.io.File;
import java.util.List;
import java.util.Scanner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.GeneratorDelegate;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Injector;
import modelConverter.use_language.USEStandaloneSetup;

public class General {
	
	private General() {}
	
	public static void generateUML(String source) {
		//modifyFileBeforeGenerating(source);
		Injector injector = new USEStandaloneSetup().createInjectorAndDoEMFRegistration();
        ResourceSet rs = injector.getInstance(ResourceSet.class);
        Resource r = rs.getResource(URI.createFileURI("comillas.use"), true);

        IResourceValidator validator = injector.getInstance(IResourceValidator.class);
        List<Issue> issues = validator.validate(r, CheckMode.ALL, CancelIndicator.NullImpl);
        for (Issue i : issues) {
                System.out.println(i);
        }

        GeneratorDelegate generator = injector.getInstance(GeneratorDelegate.class);
        JavaIoFileSystemAccess fsa = injector.getInstance(JavaIoFileSystemAccess.class);
        fsa.setOutputPath("src-gen-code/");
        GeneratorContext context = new GeneratorContext();
        context.setCancelIndicator(CancelIndicator.NullImpl);

        generator.generate(r, fsa, context);
	}

	private static void modifyFileBeforeGenerating(String source) {
		StringBuilder sBuilder = new StringBuilder();
		Boolean fin, primero, nuevaLinea = true;
		String line = "", lastLine, stripLine;
		try {
            Scanner input = new Scanner(new File(source));
            while (input.hasNextLine()) {
            	if(nuevaLinea) {
            		line = input.nextLine();
            	} else {
            		nuevaLinea = true;
            	}
            	stripLine = line.strip();
                if(isOclStart(stripLine)) {
                	fin = false;
                	primero = true;
                	sBuilder.append(line.substring(0, line.indexOf(':')) + ": ");
                	if(line.indexOf(':')+1 < line.length()) {
                		line = line.substring(line.indexOf(':')+1, line.length()).strip();
                		while (input.hasNextLine() && !fin) {
                			if(primero && line.strip().length() > 0) {
                				line = "'" + line;
                				primero = false;
                			}
                			int i = 0;
                			String[] words = line.strip().split(" ");
                			line = "";
                			String word;
                			while(i < words.length && !fin) {
                				word = words[i];
                				if(isOclEnd(word, words, i)) {
                					sBuilder.append(line + "'\n");
                					fin = true;
                					nuevaLinea = false;
                					line = "";
                					for(int j = i; j < words.length; j++) {
                						line = line + words[j] + " ";
                					}
                				} else {
                					line = line + words[i] + " ";
                					i++;
                				}
                			}
                			if(!fin) {
                				sBuilder.append(line + "\n");
                				line = input.nextLine();
                			}
                		}
                		if(!input.hasNextLine()) {
                			sBuilder.append("'");
                		}
                	} else {
                		sBuilder.append("\n");
                	}
                } else if (line.strip().equals("begin")) {
                	lastLine = line;
                	fin = false;
                	primero = true;
                	while (input.hasNextLine() && !fin) {
                		lastLine = line;
                		line = input.nextLine();
                		if(line.strip().equals("end")) {
                			fin = true;
                		} else {
                			if(primero && line.strip().length() > 0) {
                				int index = line.indexOf(line.strip().charAt(0));
                				if(index > 0) {
                					line = line.substring(0, index-1) + "'" + line.substring(index, line.length());
                				} else {
                					line = "'" + line.substring(index, line.length());
                				}
                				primero = false;
                			}
                			sBuilder.append(lastLine + "\n");
                		}
                	}
                	sBuilder.append(lastLine.stripLeading() + "'\n");
                	sBuilder.append(line + "\n");
            	} else {
                	sBuilder.append(line + "\n");
                }
            }
            input.close();
            System.out.println(sBuilder.toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		
	}
	
	private static Boolean isOclStart(String string) {
		return (string.startsWith("pre") || string.startsWith("post") 
        		|| string.startsWith("inv")) && string.contains(":");
	}
	
	private static Boolean isOclEnd(String word, String[] words, int i) {
		return (word.equals("post") || word.equals("pre") || word.equals("inv"))
				&& (i+1 >= words.length || words[i+1].contains(":") 
				|| (i+2 < words.length && words[i+2].equals(":")))
				|| word.startsWith("post:") || word.startsWith("pre:")
				|| word.startsWith("inv:");
	}
}
