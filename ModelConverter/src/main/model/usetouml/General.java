package main.model.usetouml;

import java.io.File;
import java.util.List;
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
	
	public static void generateUML(String source, String destiny) {
		File tempFile = SingleQuotes.modifyFileBeforeGeneratingOnlyBeginEnd(source);
		Injector injector = new USEStandaloneSetup().createInjectorAndDoEMFRegistration();
        ResourceSet rs = injector.getInstance(ResourceSet.class);
        Resource r = rs.getResource(URI.createFileURI(tempFile.getAbsolutePath()), true);

        IResourceValidator validator = injector.getInstance(IResourceValidator.class);
        List<Issue> issues = validator.validate(r, CheckMode.ALL, CancelIndicator.NullImpl);
        boolean continueb = true;
        for (Issue i : issues) {
        	System.out.println(i);
        	if(i.isSyntaxError()) {
        		continueb = false;
        	}
        }
        
        if(continueb) {
        	GeneratorDelegate generator = injector.getInstance(GeneratorDelegate.class);
            JavaIoFileSystemAccess fsa = injector.getInstance(JavaIoFileSystemAccess.class);
            fsa.setOutputPath(destiny);
            GeneratorContext context = new GeneratorContext();
            context.setCancelIndicator(CancelIndicator.NullImpl);

            generator.generate(r, fsa, context);
        }
        
        tempFile.deleteOnExit();
	}
	
}
