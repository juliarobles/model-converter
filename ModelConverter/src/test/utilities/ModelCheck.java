package test.utilities;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import com.google.inject.Injector;

import modelConverter.use_language.USEStandaloneSetup;

public class ModelCheck {
	
	public static boolean checkModelsAreEquivalentUSEMD(String modelUSE, String modelMD) {
		TModel tModelUSE = MC_USEtoTModel.getModelFromFileUSE(modelUSE);
		TModel tModelMD = MC_MDtoTModel.getModelFromFileMD(modelMD);
		return tModelMD.equals(tModelUSE);
	}

	public static boolean checkModelsAreEquivalentMDMD(String modelMD1, String modelMD2) {
		TModel tModelMD1 = MC_MDtoTModel.getModelFromFileMD(modelMD1);
		TModel tModelMD2 = MC_MDtoTModel.getModelFromFileMD(modelMD2);
		return tModelMD1.equals(tModelMD2);
	}
	
	public static boolean checkModelsAreEquivalentUSEUSE(String modelUSE1, String modelUSE2) {
		Injector injector = new USEStandaloneSetup().createInjectorAndDoEMFRegistration();
        ResourceSet rs = injector.getInstance(ResourceSet.class);
        Resource tModelUSE1 = rs.getResource(URI.createFileURI(modelUSE1), true);
        
        Injector injector2 = new USEStandaloneSetup().createInjectorAndDoEMFRegistration();
        ResourceSet rs2 = injector2.getInstance(ResourceSet.class);
        Resource tModelUSE2 = rs2.getResource(URI.createFileURI(modelUSE2), true);
		
		return tModelUSE1.getAllContents().equals(tModelUSE2.getAllContents());
	}
	
	
	
	
}
