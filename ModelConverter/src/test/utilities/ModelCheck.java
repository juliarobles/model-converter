package test.utilities;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import com.google.inject.Injector;

import modelConverter.use_language.USEStandaloneSetup;

public class ModelCheck {
	
	public static boolean checkModelsAreEquivalentUSEUML(String modelUSE, String modelUML) {
		TModel tModelUML = MC_UMLtoTModel.getModelFromFileMD(modelUML);
		TModel tModelUSE = MC_USEtoTModel.getModelFromFileUSE(modelUSE);
		return tModelUML.equals(tModelUSE);
	}

	public static boolean checkModelsAreEquivalentUMLUML(String modelUML1, String modelUML2) {
		TModel tModelUML1 = MC_UMLtoTModel.getModelFromFileMD(modelUML1);
		TModel tModelUML2 = MC_UMLtoTModel.getModelFromFileMD(modelUML2);
		return tModelUML1.equals(tModelUML2);
	}
	
	public static boolean checkModelsAreEquivalentUSEUSE(String modelUSE1, String modelUSE2) {
		TModel tModelUSE1 = MC_USEtoTModel.getModelFromFileUSE(modelUSE1);
		TModel tModelUSE2 = MC_USEtoTModel.getModelFromFileUSE(modelUSE2);
		return tModelUSE1.equals(tModelUSE2);
		/*Injector injector = new USEStandaloneSetup().createInjectorAndDoEMFRegistration();
        ResourceSet rs = injector.getInstance(ResourceSet.class);
        Resource tModelUSE1 = rs.getResource(URI.createFileURI(modelUSE1), true);
        
        Injector injector2 = new USEStandaloneSetup().createInjectorAndDoEMFRegistration();
        ResourceSet rs2 = injector2.getInstance(ResourceSet.class);
        Resource tModelUSE2 = rs2.getResource(URI.createFileURI(modelUSE2), true);
		
		return tModelUSE1.getAllContents().equals(tModelUSE2.getAllContents());*/
	}
	
	
	
	
}
