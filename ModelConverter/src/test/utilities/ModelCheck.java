package test.utilities;

public class ModelCheck {
	
	public static boolean checkModelsAreEquivalentUSEMD(String modelUSE, String modelMD) {
		TModel tModelUSE = getModelFromFileUSE(modelUSE);
		TModel tModelMD = MDtoTModel.getModelFromFileMD(modelMD);
		return tModelMD.equals(tModelUSE);
	}

	public static boolean checkModelsAreEquivalentMDMD(String modelMD1, String modelMD2) {
		TModel tModelMD1 = MDtoTModel.getModelFromFileMD(modelMD1);
		TModel tModelMD2 = MDtoTModel.getModelFromFileMD(modelMD2);
		return tModelMD1.equals(tModelMD2);
	}
	
	public static boolean checkModelsAreEquivalentUSEUSE(String modelUSE1, String modelUSE2) {
		TModel tModelUSE1 = getModelFromFileUSE(modelUSE1);
		TModel tModelUSE2 = MDtoTModel.getModelFromFileMD(modelUSE2);
		return tModelUSE1.equals(tModelUSE2);
	}
	
	private static TModel getModelFromFileUSE(String modelUSE) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
