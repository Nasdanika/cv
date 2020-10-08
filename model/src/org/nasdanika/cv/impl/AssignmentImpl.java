/**
 */
package org.nasdanika.cv.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.cv.Assignment;
import org.nasdanika.cv.CvPackage;

import org.nasdanika.ncore.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.cv.impl.AssignmentImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.nasdanika.cv.impl.AssignmentImpl#getEndDate <em>End Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignmentImpl extends ModelElementImpl implements Assignment {
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
	protected AssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CvPackage.Literals.ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartDate() {
		return (Date)eDynamicGet(CvPackage.ASSIGNMENT__START_DATE, CvPackage.Literals.ASSIGNMENT__START_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(Date newStartDate) {
		eDynamicSet(CvPackage.ASSIGNMENT__START_DATE, CvPackage.Literals.ASSIGNMENT__START_DATE, newStartDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEndDate() {
		return (Date)eDynamicGet(CvPackage.ASSIGNMENT__END_DATE, CvPackage.Literals.ASSIGNMENT__END_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndDate(Date newEndDate) {
		eDynamicSet(CvPackage.ASSIGNMENT__END_DATE, CvPackage.Literals.ASSIGNMENT__END_DATE, newEndDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CvPackage.ASSIGNMENT__START_DATE:
				return getStartDate();
			case CvPackage.ASSIGNMENT__END_DATE:
				return getEndDate();
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
			case CvPackage.ASSIGNMENT__START_DATE:
				setStartDate((Date)newValue);
				return;
			case CvPackage.ASSIGNMENT__END_DATE:
				setEndDate((Date)newValue);
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
			case CvPackage.ASSIGNMENT__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case CvPackage.ASSIGNMENT__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
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
			case CvPackage.ASSIGNMENT__START_DATE:
				return START_DATE_EDEFAULT == null ? getStartDate() != null : !START_DATE_EDEFAULT.equals(getStartDate());
			case CvPackage.ASSIGNMENT__END_DATE:
				return END_DATE_EDEFAULT == null ? getEndDate() != null : !END_DATE_EDEFAULT.equals(getEndDate());
		}
		return super.eIsSet(featureID);
	}

} //AssignmentImpl
