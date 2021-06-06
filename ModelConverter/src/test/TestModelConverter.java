package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.nio.file.Files;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import main.model.Generators;
import test.utilities.ModelCheck;

class TestModelConverter {
	
	private static final String destiny = "testResult";
	private static final String source = "testFiles";
	
	@BeforeAll
	static void removeFilesInResult() {
		File[] files = (new File(destiny)).listFiles();
		if(files != null) {
			for (File file : files) {
				file.delete();
			}
		}
	}
	
	@Test
	void testP01() {
		Generators.chooseGeneratorBySourceFile(source + "/P01.use", destiny);
		assertTrue(ModelCheck.checkModelsAreEquivalentMDMD(source + "/P01.uml", destiny + "/modelConverter_ModelP01.uml"));
	}

}
