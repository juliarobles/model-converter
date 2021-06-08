package modelConverter.use_language.generator;

import static org.eclipse.xtext.generator.IFileSystemAccess.DEFAULT_OUTPUT;

import java.io.File;
import java.util.Map;

import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;

public class FileNameCheck {

	private FileNameCheck() {}
	
	public static String getFileNameAvailable(IFileSystemAccess2 fsa, String fileName, String suffix) {
		if(fsa instanceof JavaIoFileSystemAccess) {
			Map<String, OutputConfiguration> outputs = ((JavaIoFileSystemAccess)fsa).getOutputConfigurations();
			if(outputs != null && outputs.containsKey(DEFAULT_OUTPUT)) {
				String destination = outputs.get(DEFAULT_OUTPUT).getOutputDirectory();
				if(destination != null) {
					int num = 1; 
					File file = new File(destination, fileName + suffix);
					
					while(file.exists()) {
					    file = new File(destination, fileName + "(" + num + ")" + suffix);
					    num++;
					}
					
					return file.getName();
				}
			}
		}
		return fileName + suffix;
	}
}
