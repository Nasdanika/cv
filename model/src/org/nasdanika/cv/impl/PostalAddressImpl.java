/**
 */
package org.nasdanika.cv.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.cv.PostalAddress;
import org.nasdanika.cv.cvPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postal Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.cv.impl.PostalAddressImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.cv.impl.PostalAddressImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.cv.impl.PostalAddressImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.nasdanika.cv.impl.PostalAddressImpl#getStateProvince <em>State Province</em>}</li>
 *   <li>{@link org.nasdanika.cv.impl.PostalAddressImpl#getCity <em>City</em>}</li>
 *   <li>{@link org.nasdanika.cv.impl.PostalAddressImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.nasdanika.cv.impl.PostalAddressImpl#getLine1 <em>Line1</em>}</li>
 *   <li>{@link org.nasdanika.cv.impl.PostalAddressImpl#getLine2 <em>Line2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostalAddressImpl extends MinimalEObjectImpl.Container implements PostalAddress {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStateProvince() <em>State Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateProvince()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_PROVINCE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTAL_CODE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLine1() <em>Line1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine1()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE1_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLine2() <em>Line2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine2()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE2_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostalAddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cvPackage.Literals.POSTAL_ADDRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(cvPackage.POSTAL_ADDRESS__NAME, cvPackage.Literals.CONTACT_METHOD__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(cvPackage.POSTAL_ADDRESS__NAME, cvPackage.Literals.CONTACT_METHOD__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(cvPackage.POSTAL_ADDRESS__DESCRIPTION, cvPackage.Literals.CONTACT_METHOD__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(cvPackage.POSTAL_ADDRESS__DESCRIPTION, cvPackage.Literals.CONTACT_METHOD__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCountry() {
		return (String)eDynamicGet(cvPackage.POSTAL_ADDRESS__COUNTRY, cvPackage.Literals.POSTAL_ADDRESS__COUNTRY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountry(String newCountry) {
		eDynamicSet(cvPackage.POSTAL_ADDRESS__COUNTRY, cvPackage.Literals.POSTAL_ADDRESS__COUNTRY, newCountry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStateProvince() {
		return (String)eDynamicGet(cvPackage.POSTAL_ADDRESS__STATE_PROVINCE, cvPackage.Literals.POSTAL_ADDRESS__STATE_PROVINCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStateProvince(String newStateProvince) {
		eDynamicSet(cvPackage.POSTAL_ADDRESS__STATE_PROVINCE, cvPackage.Literals.POSTAL_ADDRESS__STATE_PROVINCE, newStateProvince);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCity() {
		return (String)eDynamicGet(cvPackage.POSTAL_ADDRESS__CITY, cvPackage.Literals.POSTAL_ADDRESS__CITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCity(String newCity) {
		eDynamicSet(cvPackage.POSTAL_ADDRESS__CITY, cvPackage.Literals.POSTAL_ADDRESS__CITY, newCity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostalCode() {
		return (String)eDynamicGet(cvPackage.POSTAL_ADDRESS__POSTAL_CODE, cvPackage.Literals.POSTAL_ADDRESS__POSTAL_CODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostalCode(String newPostalCode) {
		eDynamicSet(cvPackage.POSTAL_ADDRESS__POSTAL_CODE, cvPackage.Literals.POSTAL_ADDRESS__POSTAL_CODE, newPostalCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLine1() {
		return (String)eDynamicGet(cvPackage.POSTAL_ADDRESS__LINE1, cvPackage.Literals.POSTAL_ADDRESS__LINE1, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLine1(String newLine1) {
		eDynamicSet(cvPackage.POSTAL_ADDRESS__LINE1, cvPackage.Literals.POSTAL_ADDRESS__LINE1, newLine1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLine2() {
		return (String)eDynamicGet(cvPackage.POSTAL_ADDRESS__LINE2, cvPackage.Literals.POSTAL_ADDRESS__LINE2, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLine2(String newLine2) {
		eDynamicSet(cvPackage.POSTAL_ADDRESS__LINE2, cvPackage.Literals.POSTAL_ADDRESS__LINE2, newLine2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case cvPackage.POSTAL_ADDRESS__NAME:
				return getName();
			case cvPackage.POSTAL_ADDRESS__DESCRIPTION:
				return getDescription();
			case cvPackage.POSTAL_ADDRESS__COUNTRY:
				return getCountry();
			case cvPackage.POSTAL_ADDRESS__STATE_PROVINCE:
				return getStateProvince();
			case cvPackage.POSTAL_ADDRESS__CITY:
				return getCity();
			case cvPackage.POSTAL_ADDRESS__POSTAL_CODE:
				return getPostalCode();
			case cvPackage.POSTAL_ADDRESS__LINE1:
				return getLine1();
			case cvPackage.POSTAL_ADDRESS__LINE2:
				return getLine2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case cvPackage.POSTAL_ADDRESS__NAME:
				setName((String)newValue);
				return;
			case cvPackage.POSTAL_ADDRESS__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case cvPackage.POSTAL_ADDRESS__COUNTRY:
				setCountry((String)newValue);
				return;
			case cvPackage.POSTAL_ADDRESS__STATE_PROVINCE:
				setStateProvince((String)newValue);
				return;
			case cvPackage.POSTAL_ADDRESS__CITY:
				setCity((String)newValue);
				return;
			case cvPackage.POSTAL_ADDRESS__POSTAL_CODE:
				setPostalCode((String)newValue);
				return;
			case cvPackage.POSTAL_ADDRESS__LINE1:
				setLine1((String)newValue);
				return;
			case cvPackage.POSTAL_ADDRESS__LINE2:
				setLine2((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case cvPackage.POSTAL_ADDRESS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case cvPackage.POSTAL_ADDRESS__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case cvPackage.POSTAL_ADDRESS__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case cvPackage.POSTAL_ADDRESS__STATE_PROVINCE:
				setStateProvince(STATE_PROVINCE_EDEFAULT);
				return;
			case cvPackage.POSTAL_ADDRESS__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case cvPackage.POSTAL_ADDRESS__POSTAL_CODE:
				setPostalCode(POSTAL_CODE_EDEFAULT);
				return;
			case cvPackage.POSTAL_ADDRESS__LINE1:
				setLine1(LINE1_EDEFAULT);
				return;
			case cvPackage.POSTAL_ADDRESS__LINE2:
				setLine2(LINE2_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case cvPackage.POSTAL_ADDRESS__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case cvPackage.POSTAL_ADDRESS__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case cvPackage.POSTAL_ADDRESS__COUNTRY:
				return COUNTRY_EDEFAULT == null ? getCountry() != null : !COUNTRY_EDEFAULT.equals(getCountry());
			case cvPackage.POSTAL_ADDRESS__STATE_PROVINCE:
				return STATE_PROVINCE_EDEFAULT == null ? getStateProvince() != null : !STATE_PROVINCE_EDEFAULT.equals(getStateProvince());
			case cvPackage.POSTAL_ADDRESS__CITY:
				return CITY_EDEFAULT == null ? getCity() != null : !CITY_EDEFAULT.equals(getCity());
			case cvPackage.POSTAL_ADDRESS__POSTAL_CODE:
				return POSTAL_CODE_EDEFAULT == null ? getPostalCode() != null : !POSTAL_CODE_EDEFAULT.equals(getPostalCode());
			case cvPackage.POSTAL_ADDRESS__LINE1:
				return LINE1_EDEFAULT == null ? getLine1() != null : !LINE1_EDEFAULT.equals(getLine1());
			case cvPackage.POSTAL_ADDRESS__LINE2:
				return LINE2_EDEFAULT == null ? getLine2() != null : !LINE2_EDEFAULT.equals(getLine2());
		}
		return super.eIsSet(featureID);
	}

} //PostalAddressImpl
