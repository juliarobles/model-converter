package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.MethodName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import main.model.Generators;
import test.utilities.ModelCheck;

@TestMethodOrder(MethodName.class)
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
	void test1_CheckModelsAreEquivalent() {
		assertTrue(ModelCheck.checkModelsAreEquivalentUSEUML(source + "/P01.use", source + "/P01.uml"));
		//assertTrue(ModelCheck.checkModelsAreEquivalentUSEUML(source + "/P02.use", source + "/P02.uml"));
		
	}
	
	@Test
	void test2_BothPathNameAreInvalid() {
		PrintStream originalErr = System.err;
		ByteArrayOutputStream errContent = new ByteArrayOutputStream();
		System.setErr(new PrintStream(errContent));
		
		Generators.chooseGeneratorBySourceFile(null, "");
		assertEquals("ERROR: Both fields must be completed.".strip(), errContent.toString().strip());
		
		System.setErr(originalErr);
		
	}
	
	@Test
	void test2_InvalidSourcePath() {
		PrintStream originalErr = System.err;
		ByteArrayOutputStream errContent = new ByteArrayOutputStream();
		System.setErr(new PrintStream(errContent));
		
		Generators.chooseGeneratorBySourceFile("aaaa", "aaaa");
		assertEquals("ERROR: Invalid source path.".strip(), errContent.toString().strip());
		
		System.setErr(originalErr);
	}
	
	@Test
	void test2_InvalidDestinationPath() {
		PrintStream originalErr = System.err;
		ByteArrayOutputStream errContent = new ByteArrayOutputStream();
		System.setErr(new PrintStream(errContent));
		
		Generators.chooseGeneratorBySourceFile(source + "/P01.use", "aaaa");
		assertEquals("ERROR: Invalid destination path.".strip(), errContent.toString().strip());
		
		System.setErr(originalErr);
	}
	
	@Test
	void test2_InvalidFileSuffix() {
		PrintStream originalErr = System.err;
		ByteArrayOutputStream errContent = new ByteArrayOutputStream();
		System.setErr(new PrintStream(errContent));
		
		Generators.chooseGeneratorBySourceFile(source + "/fail.txt", destiny);
		assertEquals("ERROR: Please enter a valid .use or .uml file.".strip(), errContent.toString().strip());
		
		System.setErr(originalErr);
	}
	
	@Test
	void testP01A_USEToUML() {
		Generators.chooseGeneratorBySourceFile(source + "/P01.use", destiny);
		assertTrue(ModelCheck.checkModelsAreEquivalentUSEUML(source + "/P01.use", destiny + "/modelConverter_ModelP01.uml"));
		assertTrue(ModelCheck.checkModelsAreEquivalentUMLUML(source + "/P01.uml", destiny + "/modelConverter_ModelP01.uml"));
	}
	
	@Test
	void testP01A_UMLToUSE() {
		Generators.chooseGeneratorBySourceFile(source + "/P01.uml", destiny);
		assertTrue(ModelCheck.checkModelsAreEquivalentUSEUML(destiny + "/modelConverter_ModelP01.use", source + "/P01.uml"));
		assertTrue(ModelCheck.checkModelsAreEquivalentUSEUSE(source + "/P01.use", destiny + "/modelConverter_ModelP01.use"));
	}
	
	@Test
	void testP01B_USEToUMLToUSE() {
		Generators.chooseGeneratorBySourceFile(destiny + "/modelConverter_ModelP01.uml", destiny);
		assertTrue(ModelCheck.checkModelsAreEquivalentUSEUSE(source + "/P01.use", destiny + "/modelConverter_ModelP01(1).use"));
	}
	
	@Test
	void testP01B_UMLToUSEToUML() {
		Generators.chooseGeneratorBySourceFile(destiny + "/modelConverter_ModelP01.use", destiny);
		assertTrue(ModelCheck.checkModelsAreEquivalentUMLUML(source + "/P01.uml", destiny + "/modelConverter_ModelP01(1).uml"));
	}

	/*
	@Test
	void testP02A_USEToUML() {
		Generators.chooseGeneratorBySourceFile(source + "/P02.use", destiny);
		assertTrue(ModelCheck.checkModelsAreEquivalentUSEUML(source + "/P02.use", destiny + "/modelConverter_ModelP02.uml"));
		assertTrue(ModelCheck.checkModelsAreEquivalentUMLUML(source + "/P02.uml", destiny + "/modelConverter_ModelP02.uml"));
	}
	
	@Test
	void testP02A_UMLToUSE() {
		Generators.chooseGeneratorBySourceFile(source + "/P02.uml", destiny);
		assertTrue(ModelCheck.checkModelsAreEquivalentUSEUML(destiny + "/modelConverter_ModelP02.use", source + "/P02.uml"));
		assertTrue(ModelCheck.checkModelsAreEquivalentUSEUSE(source + "/P02.use", destiny + "/modelConverter_ModelP02.use"));
	}
	
	@Test
	void testP02B_USEToUMLToUSE() {
		Generators.chooseGeneratorBySourceFile(destiny + "/modelConverter_ModelP02.uml", destiny);
		assertTrue(ModelCheck.checkModelsAreEquivalentUSEUSE(source + "/P02.use", destiny + "/modelConverter_ModelP02(1).use"));
	}
	
	@Test
	void testP02B_UMLToUSEToUML() {
		Generators.chooseGeneratorBySourceFile(destiny + "/modelConverter_ModelP02.use", destiny);
		assertTrue(ModelCheck.checkModelsAreEquivalentUMLUML(source + "/P02.uml", destiny + "/modelConverter_ModelP02(1).uml"));
	}*/
	
}
