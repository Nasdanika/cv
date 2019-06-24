/**
 */
package org.nasdanika.cv;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postal Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.cv.PostalAddress#getCountry <em>Country</em>}</li>
 *   <li>{@link org.nasdanika.cv.PostalAddress#getStateProvince <em>State Province</em>}</li>
 *   <li>{@link org.nasdanika.cv.PostalAddress#getCity <em>City</em>}</li>
 *   <li>{@link org.nasdanika.cv.PostalAddress#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.nasdanika.cv.PostalAddress#getLine1 <em>Line1</em>}</li>
 *   <li>{@link org.nasdanika.cv.PostalAddress#getLine2 <em>Line2</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.cv.cvPackage#getPostalAddress()
 * @model annotation="urn:org.nasdanika label_ru='\u041f\u043e\u0447\u0442\u043e\u0432\u044b\u0439 \u0430\u0434\u0440\u0435\u0441'"
 * @generated
 */
public interface PostalAddress extends ContactMethod {
	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see org.nasdanika.cv.cvPackage#getPostalAddress_Country()
	 * @model annotation="urn:org.nasdanika label_ru='\u0421\u0442\u0440\u0430\u043d\u0430'"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link org.nasdanika.cv.PostalAddress#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>State Province</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Province</em>' attribute.
	 * @see #setStateProvince(String)
	 * @see org.nasdanika.cv.cvPackage#getPostalAddress_StateProvince()
	 * @model annotation="urn:org.nasdanika label_ru='\u0428\u0442\u0430\u0442/\u043f\u0440\u043e\u0432\u0438\u043d\u0446\u0438\u044f/\u0440\u0435\u0433\u0438\u043e\u043d'"
	 * @generated
	 */
	String getStateProvince();

	/**
	 * Sets the value of the '{@link org.nasdanika.cv.PostalAddress#getStateProvince <em>State Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Province</em>' attribute.
	 * @see #getStateProvince()
	 * @generated
	 */
	void setStateProvince(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see org.nasdanika.cv.cvPackage#getPostalAddress_City()
	 * @model annotation="urn:org.nasdanika label_ru='\u0413\u043e\u0440\u043e\u0434'"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link org.nasdanika.cv.PostalAddress#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Code</em>' attribute.
	 * @see #setPostalCode(String)
	 * @see org.nasdanika.cv.cvPackage#getPostalAddress_PostalCode()
	 * @model annotation="urn:org.nasdanika label_ru='\u0418\u043d\u0434\u0435\u043a\u0441'"
	 * @generated
	 */
	String getPostalCode();

	/**
	 * Sets the value of the '{@link org.nasdanika.cv.PostalAddress#getPostalCode <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' attribute.
	 * @see #getPostalCode()
	 * @generated
	 */
	void setPostalCode(String value);

	/**
	 * Returns the value of the '<em><b>Line1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line1</em>' attribute.
	 * @see #setLine1(String)
	 * @see org.nasdanika.cv.cvPackage#getPostalAddress_Line1()
	 * @model annotation="urn:org.nasdanika label_ru='\u0421\u0442\u0440\u043e\u043a\u0430 1'"
	 * @generated
	 */
	String getLine1();

	/**
	 * Sets the value of the '{@link org.nasdanika.cv.PostalAddress#getLine1 <em>Line1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line1</em>' attribute.
	 * @see #getLine1()
	 * @generated
	 */
	void setLine1(String value);

	/**
	 * Returns the value of the '<em><b>Line2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line2</em>' attribute.
	 * @see #setLine2(String)
	 * @see org.nasdanika.cv.cvPackage#getPostalAddress_Line2()
	 * @model annotation="urn:org.nasdanika label_ru='\u0421\u0442\u0440\u043e\u043a\u0430 2'"
	 * @generated
	 */
	String getLine2();

	/**
	 * Sets the value of the '{@link org.nasdanika.cv.PostalAddress#getLine2 <em>Line2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line2</em>' attribute.
	 * @see #getLine2()
	 * @generated
	 */
	void setLine2(String value);

} // PostalAddress
