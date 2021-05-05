package model.umltouse;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.AssociationClass;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;

public class General {
	
	static String nameModel = "";
	static Package packet;
	static List<String> namesUsedGeneral;
	static Map<String, List<String>> namesUsedRoles;
	static Map<String, String> allconstraints;
	
	private General () {}
	
	public static String generateUSE(String source, String destination) throws IOException {
		loadAndInitialize(source);
		
		StringBuilder sBuilder = new StringBuilder();
		StringBuilder warnings = new StringBuilder();
		int countUnnamed = 0;
		
		nameModel = packet.getModel().getName();
		sBuilder.append("model " + nameModel + "\n\n");
		
		U0_Enumeration.getAll(sBuilder, warnings);
		U1_Class.getAll(sBuilder, warnings, countUnnamed);
		U2_AssociationClass.getAll(sBuilder, warnings, countUnnamed);
		U3_Association.getAll(sBuilder, warnings);
		U5_Constraint.printAllConstraints(sBuilder, allconstraints);
		
		stringToFile(destination, sBuilder.toString());
		
		return warnings.toString();
	}
	
	private static void stringToFile(String destination, String string) throws IOException {
		File file = new File(destination);
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
		    writer.write(string);
		}
	}

	private static void loadAndInitialize(String path) throws WrappedException, RuntimeException {
		packet = (Package) EcoreUtil.getObjectByType(load(path).getContents(), UMLPackage.Literals.PACKAGE);
		namesUsedGeneral = new ArrayList<>();
		namesUsedRoles = new HashMap<>();
		allconstraints = new HashMap<>();
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
		
		Resource res = set.getResource(URI.createURI(path), true);
		return res;
	}
}
