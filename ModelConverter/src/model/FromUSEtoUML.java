package model;

import com.google.inject.Injector;
import java.io.IOException;
import java.net.URL;
import java.util.Map;

import modelConverter.use_language.USEStandaloneSetup;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.xtext.resource.XtextResourceSet;

public class FromUSEtoUML {
	
	// https://www.eclipse.org/forums/index.php/t/560599/
	public static void exportUML(String inputURI) {
		Injector injector = new USEStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);

		resourceSet.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION,
				UMLResource.Factory.INSTANCE);
		// Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
		// .put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.PROFILE_FILE_EXTENSION,
				UMLResource.Factory.INSTANCE);

		final String profile = "profiles/UML2.profile.uml";
		URL url = FromUSEtoUML.class.getClassLoader().getResource(profile);

		if (url == null) {
			throw new RuntimeException("Error getting UML2.profile.uml");
		}

		String urlString = url.toString();
		if (!urlString.endsWith(profile)) {
			throw new RuntimeException("Error getting UML2.profile.uml. Got: " + urlString);
		}
		urlString = urlString.substring(0, urlString.length() - profile.length());

		// Añadir las librerias porque en standalone sino no funciona
		// https://www.eclipse.org/forums/index.php/t/457622/
		Map<URI, URI> uriMap = resourceSet.getURIConverter().getURIMap();
		URI uri = URI.createURI(urlString); // for example
		uriMap.put(URI.createURI(UMLResource.LIBRARIES_PATHMAP), uri.appendSegment("libraries").appendSegment(""));
		uriMap.put(URI.createURI(UMLResource.METAMODELS_PATHMAP), uri.appendSegment("metamodels").appendSegment(""));
		uriMap.put(URI.createURI(UMLResource.PROFILES_PATHMAP), uri.appendSegment("profiles").appendSegment(""));

		// Resource xtextResource = resourceSet.createResource(uri);
		Resource xtextResource = resourceSet.getResource(URI.createURI(inputURI), true);

		EcoreUtil.resolveAll(xtextResource);

		Resource xmiResource = resourceSet.createResource(URI.createURI("test.uml"));
		xmiResource.getContents().add(xtextResource.getContents().get(0));
		try {
			xmiResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
