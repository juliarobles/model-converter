/*
 * generated by Xtext 2.25.0
 */
package modelConverter.use_language.ui.tests;

import com.google.inject.Injector;
import modelConverter.use_language.ui.internal.Use_languageActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class USEUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return Use_languageActivator.getInstance().getInjector("modelConverter.use_language.USE");
	}

}
