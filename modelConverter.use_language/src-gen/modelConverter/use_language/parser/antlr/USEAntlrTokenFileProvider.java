/*
 * generated by Xtext 2.25.0
 */
package modelConverter.use_language.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class USEAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("modelConverter/use_language/parser/antlr/internal/InternalUSE.tokens");
	}
}
