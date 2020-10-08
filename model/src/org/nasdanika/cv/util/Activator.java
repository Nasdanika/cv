package org.nasdanika.cv.util;

import org.nasdanika.cv.CvPackage;
import org.nasdanika.emf.Palette;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Registers party palette.
 * 
 * @author Pavel
 *
 */
public class Activator implements BundleActivator {

	public static final Palette CV_PALETTE = Palette.Registry.INSTANCE.create(
			"org.nasdanika.cv",
			"Curriculum Vitae",
			"Curriculum Vitae elements", 
			true);

	@Override
	public void start(BundleContext context) throws Exception {
		CV_PALETTE.add(CvPackage.Literals.CURRICULUM_VITAE);	
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// NOP

	}

}
