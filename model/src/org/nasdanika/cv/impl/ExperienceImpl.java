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

import org.nasdanika.cv.CvPackage;
import org.nasdanika.cv.Experience;
import org.nasdanika.cv.Position;

import org.nasdanika.party.impl.OrganizationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Experience</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.cv.impl.ExperienceImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.nasdanika.cv.impl.ExperienceImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link org.nasdanika.cv.impl.ExperienceImpl#getPositions <em>Positions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExperienceImpl extends OrganizationImpl implements Experience {
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
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperienceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CvPackage.Literals.EXPERIENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartDate() {
		return (Date)eDynamicGet(CvPackage.EXPERIENCE__START_DATE, CvPackage.Literals.EXPERIENCE__START_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(Date newStartDate) {
		eDynamicSet(CvPackage.EXPERIENCE__START_DATE, CvPackage.Literals.EXPERIENCE__START_DATE, newStartDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEndDate() {
		return (Date)eDynamicGet(CvPackage.EXPERIENCE__END_DATE, CvPackage.Literals.EXPERIENCE__END_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndDate(Date newEndDate) {
		eDynamicSet(CvPackage.EXPERIENCE__END_DATE, CvPackage.Literals.EXPERIENCE__END_DATE, newEndDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Position> getPositions() {
		return (EList<Position>)eDynamicGet(CvPackage.EXPERIENCE__POSITIONS, CvPackage.Literals.EXPERIENCE__POSITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CvPackage.EXPERIENCE__POSITIONS:
				return ((InternalEList<?>)getPositions()).basicRemove(otherEnd, msgs);
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
			case CvPackage.EXPERIENCE__START_DATE:
				return getStartDate();
			case CvPackage.EXPERIENCE__END_DATE:
				return getEndDate();
			case CvPackage.EXPERIENCE__POSITIONS:
				return getPositions();
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
			case CvPackage.EXPERIENCE__START_DATE:
				setStartDate((Date)newValue);
				return;
			case CvPackage.EXPERIENCE__END_DATE:
				setEndDate((Date)newValue);
				return;
			case CvPackage.EXPERIENCE__POSITIONS:
				getPositions().clear();
				getPositions().addAll((Collection<? extends Position>)newValue);
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
			case CvPackage.EXPERIENCE__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case CvPackage.EXPERIENCE__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case CvPackage.EXPERIENCE__POSITIONS:
				getPositions().clear();
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
			case CvPackage.EXPERIENCE__START_DATE:
				return START_DATE_EDEFAULT == null ? getStartDate() != null : !START_DATE_EDEFAULT.equals(getStartDate());
			case CvPackage.EXPERIENCE__END_DATE:
				return END_DATE_EDEFAULT == null ? getEndDate() != null : !END_DATE_EDEFAULT.equals(getEndDate());
			case CvPackage.EXPERIENCE__POSITIONS:
				return !getPositions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExperienceImpl
