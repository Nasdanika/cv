package org.nasdanika.cv.tests;

import java.io.File;

import org.junit.Test;
import org.nasdanika.html.ecore.EcoreDocumentationGenerator;

public class GenerateModelDocumentation {
	
	/**
	 * Generates Ecore model documentation.
	 * @throws Exception
	 */
	@Test
	public void generateModelDocumentation() {		
		EcoreDocumentationGenerator generator = new EcoreDocumentationGenerator("Nasdanika CV Model", null);
		generator.loadGenModel("urn:org.nasdanika.cv");
		generator.generate(new File("target/model-doc"));		
	}
	
}
