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
		assertTrue(ModelCheck.checkModelsAreEquivalentUSEUML(source + "/P02.use", source + "/P02.uml"));
		assertTrue(ModelCheck.checkModelsAreEquivalentUSEUML(source + "/P03.use", source + "/P03.uml"));
		assertTrue(ModelCheck.checkModelsAreEquivalentUSEUML(source + "/P04.use", source + "/P04.uml"));
		assertTrue(ModelCheck.checkModelsAreEquivalentUSEUML(source + "/P05.use", source + "/P05.uml"));
	}
	
	@Test
	void test2_BothPathNameAreInvalid1() {
		PrintStream originalErr = System.err;
		ByteArrayOutputStream errContent = new ByteArrayOutputStream();
		System.setErr(new PrintStream(errContent));
		
		Generators.chooseGeneratorBySourceFile(null, "");
		assertEquals("ERROR: Both fields must be completed.".strip(), errContent.toString().strip());
		
		System.setErr(originalErr);
		
	}
	
	@Test
	void test2_BothPathNameAreInvalid2() {
		PrintStream originalErr = System.err;
		ByteArrayOutputStream errContent = new ByteArrayOutputStream();
		System.setErr(new PrintStream(errContent));
		
		Generators.chooseGeneratorBySourceFile(source + "/P01.use", "");
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
	void test3_GrammarMistakesUSEFile() {
		Generators.chooseGeneratorBySourceFile(source + "/P10.use", destiny);
	}
	
	@Test
	void test3_GrammarMistakesUMLFile() {
		Generators.chooseGeneratorBySourceFile(source + "/P10.uml", destiny);
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
	}
	
	@Test
	void testP03A_USEToUML() {
		Generators.chooseGeneratorBySourceFile(source + "/P03.use", destiny);
		assertTrue(ModelCheck.checkModelsAreEquivalentUSEUML(source + "/P03.use", destiny + "/modelConverter_ModelP03.uml"));
		assertTrue(ModelCheck.checkModelsAreEquivalentUMLUML(source + "/P03.uml", destiny + "/modelConverter_ModelP03.uml"));
	}
	
	@Test
	void testP03A_UMLToUSE() {
		Generators.chooseGeneratorBySourceFile(source + "/P03.uml", destiny);
		assertTrue(ModelCheck.checkModelsAreEquivalentUSEUML(destiny + "/modelConverter_ModelP03.use", source + "/P03.uml"));
		assertTrue(ModelCheck.checkModelsAreEquivalentUSEUSE(source + "/P03.use", destiny + "/modelConverter_ModelP03.use"));
	}
	
	@Test
	void testP03B_USEToUMLToUSE() {
		Generators.chooseGeneratorBySourceFile(destiny + "/modelConverter_ModelP03.uml", destiny);
		assertTrue(ModelCheck.checkModelsAreEquivalentUSEUSE(source + "/P03.use", destiny + "/modelConverter_ModelP03(1).use"));
	}
	
	@Test
	void testP03B_UMLToUSEToUML() {
		Generators.chooseGeneratorBySourceFile(destiny + "/modelConverter_ModelP03.use", destiny);
		assertTrue(ModelCheck.checkModelsAreEquivalentUMLUML(source + "/P03.uml", destiny + "/modelConverter_ModelP03(1).uml"));
	}
	
	@Test
	void testP04A_USEToUML() {
		Generators.chooseGeneratorBySourceFile(source + "/P04.use", destiny);
		assertTrue(ModelCheck.checkModelsAreEquivalentUSEUML(source + "/P04.use", destiny + "/modelConverter_ModelP04.uml"));
		assertTrue(ModelCheck.checkModelsAreEquivalentUMLUML(source + "/P04.uml", destiny + "/modelConverter_ModelP04.uml"));
	}
	
	@Test
	void testP04A_UMLToUSE() {
		Generators.chooseGeneratorBySourceFile(source + "/P04.uml", destiny);
		assertTrue(ModelCheck.checkModelsAreEquivalentUSEUML(destiny + "/modelConverter_ModelP04.use", source + "/P04.uml"));
		assertTrue(ModelCheck.checkModelsAreEquivalentUSEUSE(source + "/P04.use", destiny + "/modelConverter_ModelP04.use"));
	}
	
	@Test
	void testP04B_USEToUMLToUSE() {
		Generators.chooseGeneratorBySourceFile(destiny + "/modelConverter_ModelP04.uml", destiny);
		assertTrue(ModelCheck.checkModelsAreEquivalentUSEUSE(source + "/P04.use", destiny + "/modelConverter_ModelP04(1).use"));
	}
	
	@Test
	void testP04B_UMLToUSEToUML() {
		Generators.chooseGeneratorBySourceFile(destiny + "/modelConverter_ModelP04.use", destiny);
		assertTrue(ModelCheck.checkModelsAreEquivalentUMLUML(source + "/P04.uml", destiny + "/modelConverter_ModelP04(1).uml"));
	}
	
	@Test
	void testP05A_USEToUML() {
		Generators.chooseGeneratorBySourceFile(source + "/P05.use", destiny);
		assertTrue(ModelCheck.checkModelsAreEquivalentUSEUML(source + "/P05.use", destiny + "/modelConverter_ModelP05.uml"));
		assertTrue(ModelCheck.checkModelsAreEquivalentUMLUML(source + "/P05.uml", destiny + "/modelConverter_ModelP05.uml"));
	}
	
	@Test
	void testP05A_UMLToUSE() {
		Generators.chooseGeneratorBySourceFile(source + "/P05.uml", destiny);
		assertTrue(ModelCheck.checkModelsAreEquivalentUSEUML(destiny + "/modelConverter_ModelP05.use", source + "/P05.uml"));
		assertTrue(ModelCheck.checkModelsAreEquivalentUSEUSE(source + "/P05.use", destiny + "/modelConverter_ModelP05.use"));
	}
	
	@Test
	void testP05B_USEToUMLToUSE() {
		Generators.chooseGeneratorBySourceFile(destiny + "/modelConverter_ModelP05.uml", destiny);
		assertTrue(ModelCheck.checkModelsAreEquivalentUSEUSE(source + "/P05.use", destiny + "/modelConverter_ModelP05(1).use"));
	}
	
	@Test
	void testP05B_UMLToUSEToUML() {
		Generators.chooseGeneratorBySourceFile(destiny + "/modelConverter_ModelP05.use", destiny);
		assertTrue(ModelCheck.checkModelsAreEquivalentUMLUML(source + "/P05.uml", destiny + "/modelConverter_ModelP05(1).uml"));
	}
	
	@Test
	void testP06_USEToUMLToUSEToUML() {
		Generators.chooseGeneratorBySourceFile(source + "/P06.use", destiny);
		Generators.chooseGeneratorBySourceFile(destiny + "/modelConverter_ModelP06.uml", destiny);
		Generators.chooseGeneratorBySourceFile(destiny + "/modelConverter_ModelP06.use", destiny);
		assertTrue(ModelCheck.checkModelsAreEquivalentUMLUML(destiny + "/modelConverter_ModelP06.uml", destiny + "/modelConverter_ModelP06(1).uml"));
	}
	
	@Test
	void testP07_USEToUMLToUSEToUML() {
		Generators.chooseGeneratorBySourceFile(source + "/P07.use", destiny);
		Generators.chooseGeneratorBySourceFile(destiny + "/modelConverter_ModelP07.uml", destiny);
		Generators.chooseGeneratorBySourceFile(destiny + "/modelConverter_ModelP07.use", destiny);
		assertTrue(ModelCheck.checkModelsAreEquivalentUMLUML(destiny + "/modelConverter_ModelP07.uml", destiny + "/modelConverter_ModelP07(1).uml"));
	}
	
	@Test
	void testP08_USEToUMLToUSEToUML() {
		Generators.chooseGeneratorBySourceFile(source + "/P08.use", destiny);
		Generators.chooseGeneratorBySourceFile(destiny + "/modelConverter_ModelP08.uml", destiny);
		Generators.chooseGeneratorBySourceFile(destiny + "/modelConverter_ModelP08.use", destiny);
		assertTrue(ModelCheck.checkModelsAreEquivalentUMLUML(destiny + "/modelConverter_ModelP08.uml", destiny + "/modelConverter_ModelP08(1).uml"));
	}
	
	@Test
	void testP09_USEToUMLToUSEToUML() {
		Generators.chooseGeneratorBySourceFile(source + "/P09.use", destiny);
		Generators.chooseGeneratorBySourceFile(destiny + "/modelConverter_ModelP09.uml", destiny);
		Generators.chooseGeneratorBySourceFile(destiny + "/modelConverter_ModelP09.use", destiny);
		assertTrue(ModelCheck.checkModelsAreEquivalentUMLUML(destiny + "/modelConverter_ModelP09.uml", destiny + "/modelConverter_ModelP09(1).uml"));
	}
}
