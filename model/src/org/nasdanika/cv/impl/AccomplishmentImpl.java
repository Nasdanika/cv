/**
 */
package org.nasdanika.cv.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.cv.Accomplishment;
import org.nasdanika.cv.AccomplishmentCategoryElement;
import org.nasdanika.cv.AccomplishmentType;
import org.nasdanika.cv.CvPackage;
import org.nasdanika.cv.Skill;

import org.nasdanika.ncore.impl.EntityImpl;

import org.nasdanika.party.Party;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accomplishment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.cv.impl.AccomplishmentImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.nasdanika.cv.impl.AccomplishmentImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.cv.impl.AccomplishmentImpl#getAuthority <em>Authority</em>}</li>
 *   <li>{@link org.nasdanika.cv.impl.AccomplishmentImpl#getSkills <em>Skills</em>}</li>
 *   <li>{@link org.nasdanika.cv.impl.AccomplishmentImpl#getAccomplishmentId <em>Accomplishment Id</em>}</li>
 *   <li>{@link org.nasdanika.cv.impl.AccomplishmentImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.nasdanika.cv.impl.AccomplishmentImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.nasdanika.cv.impl.AccomplishmentImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.nasdanika.cv.impl.AccomplishmentImpl#getExpires <em>Expires</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AccomplishmentImpl extends EntityImpl implements Accomplishment {
	/**
	 * The default value of the '{@link #getAccomplishmentId() <em>Accomplishment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccomplishmentId()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOMPLISHMENT_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getExpires() <em>Expires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpires()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXPIRES_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccomplishmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CvPackage.Literals.ACCOMPLISHMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AccomplishmentCategoryElement> getElements() {
		return (EList<AccomplishmentCategoryElement>)eDynamicGet(CvPackage.ACCOMPLISHMENT__ELEMENTS, CvPackage.Literals.ACCOMPLISHMENT_CATEGORY_ELEMENT__ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccomplishmentType getType() {
		return (AccomplishmentType)eDynamicGet(CvPackage.ACCOMPLISHMENT__TYPE, CvPackage.Literals.ACCOMPLISHMENT__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccomplishmentType basicGetType() {
		return (AccomplishmentType)eDynamicGet(CvPackage.ACCOMPLISHMENT__TYPE, CvPackage.Literals.ACCOMPLISHMENT__TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(AccomplishmentType newType) {
		eDynamicSet(CvPackage.ACCOMPLISHMENT__TYPE, CvPackage.Literals.ACCOMPLISHMENT__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getAuthority() {
		return (Party)eDynamicGet(CvPackage.ACCOMPLISHMENT__AUTHORITY, CvPackage.Literals.ACCOMPLISHMENT__AUTHORITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetAuthority() {
		return (Party)eDynamicGet(CvPackage.ACCOMPLISHMENT__AUTHORITY, CvPackage.Literals.ACCOMPLISHMENT__AUTHORITY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthority(Party newAuthority) {
		eDynamicSet(CvPackage.ACCOMPLISHMENT__AUTHORITY, CvPackage.Literals.ACCOMPLISHMENT__AUTHORITY, newAuthority);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Skill> getSkills() {
		return (EList<Skill>)eDynamicGet(CvPackage.ACCOMPLISHMENT__SKILLS, CvPackage.Literals.ACCOMPLISHMENT__SKILLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccomplishmentId() {
		return (String)eDynamicGet(CvPackage.ACCOMPLISHMENT__ACCOMPLISHMENT_ID, CvPackage.Literals.ACCOMPLISHMENT__ACCOMPLISHMENT_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccomplishmentId(String newAccomplishmentId) {
		eDynamicSet(CvPackage.ACCOMPLISHMENT__ACCOMPLISHMENT_ID, CvPackage.Literals.ACCOMPLISHMENT__ACCOMPLISHMENT_ID, newAccomplishmentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return (String)eDynamicGet(CvPackage.ACCOMPLISHMENT__URL, CvPackage.Literals.ACCOMPLISHMENT__URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		eDynamicSet(CvPackage.ACCOMPLISHMENT__URL, CvPackage.Literals.ACCOMPLISHMENT__URL, newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate() {
		return (Date)eDynamicGet(CvPackage.ACCOMPLISHMENT__DATE, CvPackage.Literals.ACCOMPLISHMENT__DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(Date newDate) {
		eDynamicSet(CvPackage.ACCOMPLISHMENT__DATE, CvPackage.Literals.ACCOMPLISHMENT__DATE, newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartDate() {
		return (Date)eDynamicGet(CvPackage.ACCOMPLISHMENT__START_DATE, CvPackage.Literals.ACCOMPLISHMENT__START_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(Date newStartDate) {
		eDynamicSet(CvPackage.ACCOMPLISHMENT__START_DATE, CvPackage.Literals.ACCOMPLISHMENT__START_DATE, newStartDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getExpires() {
		return (Date)eDynamicGet(CvPackage.ACCOMPLISHMENT__EXPIRES, CvPackage.Literals.ACCOMPLISHMENT__EXPIRES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpires(Date newExpires) {
		eDynamicSet(CvPackage.ACCOMPLISHMENT__EXPIRES, CvPackage.Literals.ACCOMPLISHMENT__EXPIRES, newExpires);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CvPackage.ACCOMPLISHMENT__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CvPackage.ACCOMPLISHMENT__ELEMENTS:
				return getElements();
			case CvPackage.ACCOMPLISHMENT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case CvPackage.ACCOMPLISHMENT__AUTHORITY:
				if (resolve) return getAuthority();
				return basicGetAuthority();
			case CvPackage.ACCOMPLISHMENT__SKILLS:
				return getSkills();
			case CvPackage.ACCOMPLISHMENT__ACCOMPLISHMENT_ID:
				return getAccomplishmentId();
			case CvPackage.ACCOMPLISHMENT__URL:
				return getUrl();
			case CvPackage.ACCOMPLISHMENT__DATE:
				return getDate();
			case CvPackage.ACCOMPLISHMENT__START_DATE:
				return getStartDate();
			case CvPackage.ACCOMPLISHMENT__EXPIRES:
				return getExpires();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CvPackage.ACCOMPLISHMENT__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends AccomplishmentCategoryElement>)newValue);
				return;
			case CvPackage.ACCOMPLISHMENT__TYPE:
				setType((AccomplishmentType)newValue);
				return;
			case CvPackage.ACCOMPLISHMENT__AUTHORITY:
				setAuthority((Party)newValue);
				return;
			case CvPackage.ACCOMPLISHMENT__SKILLS:
				getSkills().clear();
				getSkills().addAll((Collection<? extends Skill>)newValue);
				return;
			case CvPackage.ACCOMPLISHMENT__ACCOMPLISHMENT_ID:
				setAccomplishmentId((String)newValue);
				return;
			case CvPackage.ACCOMPLISHMENT__URL:
				setUrl((String)newValue);
				return;
			case CvPackage.ACCOMPLISHMENT__DATE:
				setDate((Date)newValue);
				return;
			case CvPackage.ACCOMPLISHMENT__START_DATE:
				setStartDate((Date)newValue);
				return;
			case CvPackage.ACCOMPLISHMENT__EXPIRES:
				setExpires((Date)newValue);
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
			case CvPackage.ACCOMPLISHMENT__ELEMENTS:
				getElements().clear();
				return;
			case CvPackage.ACCOMPLISHMENT__TYPE:
				setType((AccomplishmentType)null);
				return;
			case CvPackage.ACCOMPLISHMENT__AUTHORITY:
				setAuthority((Party)null);
				return;
			case CvPackage.ACCOMPLISHMENT__SKILLS:
				getSkills().clear();
				return;
			case CvPackage.ACCOMPLISHMENT__ACCOMPLISHMENT_ID:
				setAccomplishmentId(ACCOMPLISHMENT_ID_EDEFAULT);
				return;
			case CvPackage.ACCOMPLISHMENT__URL:
				setUrl(URL_EDEFAULT);
				return;
			case CvPackage.ACCOMPLISHMENT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case CvPackage.ACCOMPLISHMENT__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case CvPackage.ACCOMPLISHMENT__EXPIRES:
				setExpires(EXPIRES_EDEFAULT);
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
			case CvPackage.ACCOMPLISHMENT__ELEMENTS:
				return !getElements().isEmpty();
			case CvPackage.ACCOMPLISHMENT__TYPE:
				return basicGetType() != null;
			case CvPackage.ACCOMPLISHMENT__AUTHORITY:
				return basicGetAuthority() != null;
			case CvPackage.ACCOMPLISHMENT__SKILLS:
				return !getSkills().isEmpty();
			case CvPackage.ACCOMPLISHMENT__ACCOMPLISHMENT_ID:
				return ACCOMPLISHMENT_ID_EDEFAULT == null ? getAccomplishmentId() != null : !ACCOMPLISHMENT_ID_EDEFAULT.equals(getAccomplishmentId());
			case CvPackage.ACCOMPLISHMENT__URL:
				return URL_EDEFAULT == null ? getUrl() != null : !URL_EDEFAULT.equals(getUrl());
			case CvPackage.ACCOMPLISHMENT__DATE:
				return DATE_EDEFAULT == null ? getDate() != null : !DATE_EDEFAULT.equals(getDate());
			case CvPackage.ACCOMPLISHMENT__START_DATE:
				return START_DATE_EDEFAULT == null ? getStartDate() != null : !START_DATE_EDEFAULT.equals(getStartDate());
			case CvPackage.ACCOMPLISHMENT__EXPIRES:
				return EXPIRES_EDEFAULT == null ? getExpires() != null : !EXPIRES_EDEFAULT.equals(getExpires());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AccomplishmentCategoryElement.class) {
			switch (derivedFeatureID) {
				case CvPackage.ACCOMPLISHMENT__ELEMENTS: return CvPackage.ACCOMPLISHMENT_CATEGORY_ELEMENT__ELEMENTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AccomplishmentCategoryElement.class) {
			switch (baseFeatureID) {
				case CvPackage.ACCOMPLISHMENT_CATEGORY_ELEMENT__ELEMENTS: return CvPackage.ACCOMPLISHMENT__ELEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AccomplishmentImpl
