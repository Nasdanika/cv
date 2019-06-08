/**
 */
package org.nasdanika.cv;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.cv.Party#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.cv.Party#getContactMethods <em>Contact Methods</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.cv.cvPackage#getParty()
 * @model abstract="true"
 * @generated
 */
public interface Party extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.cv.cvPackage#getParty_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.cv.Party#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contact Methods</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.cv.ContactMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Party can have zero or more contact methods.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Methods</em>' containment reference list.
	 * @see org.nasdanika.cv.cvPackage#getParty_ContactMethods()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContactMethod> getContactMethods();

} // Party
