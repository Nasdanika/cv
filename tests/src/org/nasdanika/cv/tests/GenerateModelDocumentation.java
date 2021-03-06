package org.nasdanika.cv.tests;

import java.io.File;
import java.io.InputStream;
import java.util.function.BiFunction;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EcorePackage;
import org.junit.Test;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.ResourceLocator;
import org.nasdanika.common.resources.Container;
import org.nasdanika.common.resources.FileSystemContainer;
import org.nasdanika.emf.EModelElementAnnotationResourceLocator;
import org.nasdanika.emf.FunctionAdapterFactory;
import org.nasdanika.html.ecore.EcoreDocumentationGenerator;
import org.nasdanika.html.ecore.EcoreViewActionAdapterFactory;
import org.nasdanika.html.ecore.localization.RussianResourceLocator;
import org.nasdanika.html.ecore.localization.UI;

public class GenerateModelDocumentation {

	private static final String MODEL_URI = "urn:org.nasdanika.cv";
	private static BiFunction<org.nasdanika.common.resources.File<InputStream>, Object, InputStream> encoder = (file, contents) -> {
		InputStream ret = DefaultConverter.INSTANCE.convert(contents, InputStream.class);
		if (ret == null) {
			// toString() conversion
			ret = DefaultConverter.INSTANCE.convert(String.valueOf(contents), InputStream.class);
		}
		return ret;
	};	
	
	/**
	 * Generates Ecore model documentation.
	 * @throws Exception
	 */
	@Test
	public void testEcoreDocumentation() {		
		EcoreDocumentationGenerator generator = new EcoreDocumentationGenerator("Nasdanika CV Model", null, null);
		generator.loadGenModel(MODEL_URI);
		Container<InputStream> fsc = new FileSystemContainer(new File("target/model-doc"));
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		generator.generate(fsc.adapt(null, encoder, null), progressMonitor);		
	}

	/**
	 * Generates Ecore model documentation for ``ru`` locale by utilizing {@link EModelElementAnnotationResourceLocator}.
	 * @throws Exception
	 */
	@Test
	public void testRussianEcoreDocumentation() {		
		EcoreDocumentationGenerator generator = new EcoreDocumentationGenerator(
				"Модель Жизнеописания Насданики", 
				"",
				UI.RU) {
						
			@Override
			protected EcoreViewActionAdapterFactory createAdapterFactory() {
				EcoreViewActionAdapterFactory adapterFactory = super.createAdapterFactory();
				
				adapterFactory.registerAdapterFactory(
						new FunctionAdapterFactory<ResourceLocator, EModelElement>(
								EcorePackage.Literals.EMODEL_ELEMENT, 
								ResourceLocator.class, 
								this.getClass().getClassLoader(), 
								RussianResourceLocator::new));
				
				return adapterFactory;
			}
			
		};
		generator.loadGenModel(MODEL_URI);
		Container<InputStream> fsc = new FileSystemContainer(new File("target/ru/model-doc"));
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		generator.generate(fsc.adapt(null, encoder, null), progressMonitor);		
	}	
	
}
