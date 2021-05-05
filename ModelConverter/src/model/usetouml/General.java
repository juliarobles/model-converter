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
		modifyFileBeforeGenerating(source);
		Injector injector = new USEStandaloneSetup().createInjectorAndDoEMFRegistration();
        ResourceSet rs = injector.getInstance(ResourceSet.class);
        Resource r = rs.getResource(URI.createFileURI("pruebaoperationcontext.use"), true);

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
		try {
            Scanner input = new Scanner(new File(source));
            while (input.hasNextLine()) {
            	String start = "", end = "", line = input.nextLine();
                if((line.strip().startsWith("pre") || line.strip().startsWith("post") 
                		|| line.strip().startsWith("inv")) && line.contains(":")) {
                	start = line.substring(0, line.indexOf(':'));
                	if(line.indexOf(':')+1 < line.length()) {
                		end = line.substring(line.indexOf(':')+1, line.length()).strip();
                	}
                	sBuilder.append(start + ": '" + end + "'\n");
                } else if (line.strip().equals("begin")) {
                	String lastLine = line;
                	Boolean fin = false, primero = true;
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
}
