/**
 */
package org.nasdanika.cv;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.cv.cvPackage
 * @generated
 */
public interface cvFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	cvFactory eINSTANCE = org.nasdanika.cv.impl.cvFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EMail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMail</em>'.
	 * @generated
	 */
	EMail createEMail();

	/**
	 * Returns a new object of class '<em>Phone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Phone</em>'.
	 * @generated
	 */
	Phone createPhone();

	/**
	 * Returns a new object of class '<em>Postal Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postal Address</em>'.
	 * @generated
	 */
	PostalAddress createPostalAddress();

	/**
	 * Returns a new object of class '<em>Web Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Address</em>'.
	 * @generated
	 */
	WebAddress createWebAddress();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	cvPackage getcvPackage();

} //cvFactory
