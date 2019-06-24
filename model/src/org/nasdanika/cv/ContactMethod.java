/**
 */
package org.nasdanika.cv;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contact method interface.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.cv.ContactMethod#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.cv.ContactMethod#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.cv.cvPackage#getContactMethod()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ContactMethod extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.cv.cvPackage#getContactMethod_Name()
	 * @model annotation="urn:org.nasdanika label_ru='\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.cv.ContactMethod#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.cv.cvPackage#getContactMethod_Description()
	 * @model annotation="urn:org.nasdanika label_ru='\u041e\u043f\u0438\u0441\u0430\u043d\u0438\u0435'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.cv.ContactMethod#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // ContactMethod
