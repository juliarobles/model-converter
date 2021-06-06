package main.model.umltouse;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;

import main.model.Auxiliary;

public class General {
	
	static String nameModel = "";
	static List<String> namesUsedGeneral;
	static Map<String, List<String>> namesUsedRoles;
	static Map<String, String> allconstraints;
	
	private General () {}
	
	public static void generateUSE(String source, String destination) throws IOException {
		Package packet = loadAndInitialize(source);
		
		StringBuilder sBuilder = new StringBuilder();
		U9_CountUnnamed countUnnamed = new U9_CountUnnamed();
		
		nameModel = packet.getModel().getName();
		sBuilder.append("model " + nameModel + "\n\n");
		
		U0_Enumeration.getAll(packet, sBuilder, countUnnamed);
		U1_Class.getAll(packet, sBuilder, countUnnamed);
		U2_AssociationClass.getAll(packet, sBuilder, countUnnamed);
		U3_Association.getAll(packet, sBuilder);
		U5_Constraint.printAllConstraints(sBuilder, allconstraints);
		
		Auxiliary.stringToFileNew(destination, "modelConverter_" + nameModel, ".use", sBuilder.toString());
	}

	private static Package loadAndInitialize(String path) throws WrappedException, RuntimeException {
		Package packet = (Package) EcoreUtil.getObjectByType(load(path).getContents(), UMLPackage.Literals.PACKAGE);
		namesUsedGeneral = new ArrayList<>();
		namesUsedRoles = new HashMap<>();
		allconstraints = new HashMap<>();
		return packet;
	}
	
	private static Resource load(String path) throws WrappedException, RuntimeException {
		//A collection of related persistent documents.
		ResourceSet set = new ResourceSetImpl();
		
		//Register the UML Package
		set.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		set.getResourceFactoryRegistry().getExtensionToFactoryMap()
		   .put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		//Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
		   //.put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		set.getResourceFactoryRegistry().getExtensionToFactoryMap()
			.put(UMLResource.PROFILE_FILE_EXTENSION, UMLResource.Factory.INSTANCE );
 
		//Extraer la url del UML2 independiente al path de mi pc
		//https://www.eclipse.org/forums/index.php/t/151576/
		final String profile = "profiles/UML2.profile.uml";
		URL url = General.class.getClassLoader().getResource(profile);
		
		if (url == null)
		{
			throw new RuntimeException("Error getting UML2.profile.uml");
		}
		
		String urlString = url.toString();
		if (!urlString.endsWith(profile))
		{
			throw new RuntimeException("Error getting UML2.profile.uml. Got: " + urlString);
		}
		urlString = urlString.substring(0, urlString.length() - profile.length());
		
		//Añadir las librerias porque en standalone sino no funciona
		//https://www.eclipse.org/forums/index.php/t/457622/
		Map<URI, URI> uriMap = set.getURIConverter().getURIMap();
		URI uri = URI.createURI(urlString); // for example
		uriMap.put(URI.createURI(UMLResource.LIBRARIES_PATHMAP), uri.appendSegment("libraries").appendSegment(""));
		uriMap.put(URI.createURI(UMLResource.METAMODELS_PATHMAP), uri.appendSegment("metamodels").appendSegment(""));
		uriMap.put(URI.createURI(UMLResource.PROFILES_PATHMAP), uri.appendSegment("profiles").appendSegment(""));
		//uriMap.put(URI.createURI(UMLResource.STANDARD_PROFILE_URI), uri.appendSegment("standard").appendSegment(""));
		
		Resource res = set.getResource(URI.createFileURI(path), true);
		return res;
	}
}
