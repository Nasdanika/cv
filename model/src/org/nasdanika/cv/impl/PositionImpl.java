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

import org.nasdanika.cv.Assignment;
import org.nasdanika.cv.CvPackage;
import org.nasdanika.cv.Position;

import org.nasdanika.cv.Skill;
import org.nasdanika.ncore.impl.ModelElementImpl;

import org.nasdanika.party.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.cv.impl.PositionImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.nasdanika.cv.impl.PositionImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link org.nasdanika.cv.impl.PositionImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.nasdanika.cv.impl.PositionImpl#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link org.nasdanika.cv.impl.PositionImpl#getSkills <em>Skills</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionImpl extends ModelElementImpl implements Position {
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
	protected PositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CvPackage.Literals.POSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartDate() {
		return (Date)eDynamicGet(CvPackage.POSITION__START_DATE, CvPackage.Literals.POSITION__START_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(Date newStartDate) {
		eDynamicSet(CvPackage.POSITION__START_DATE, CvPackage.Literals.POSITION__START_DATE, newStartDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEndDate() {
		return (Date)eDynamicGet(CvPackage.POSITION__END_DATE, CvPackage.Literals.POSITION__END_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndDate(Date newEndDate) {
		eDynamicSet(CvPackage.POSITION__END_DATE, CvPackage.Literals.POSITION__END_DATE, newEndDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role getRole() {
		return (Role)eDynamicGet(CvPackage.POSITION__ROLE, CvPackage.Literals.POSITION__ROLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRole() {
		return (Role)eDynamicGet(CvPackage.POSITION__ROLE, CvPackage.Literals.POSITION__ROLE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(Role newRole) {
		eDynamicSet(CvPackage.POSITION__ROLE, CvPackage.Literals.POSITION__ROLE, newRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Assignment> getAssignments() {
		return (EList<Assignment>)eDynamicGet(CvPackage.POSITION__ASSIGNMENTS, CvPackage.Literals.POSITION__ASSIGNMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Skill> getSkills() {
		return (EList<Skill>)eDynamicGet(CvPackage.POSITION__SKILLS, CvPackage.Literals.POSITION__SKILLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CvPackage.POSITION__ASSIGNMENTS:
				return ((InternalEList<?>)getAssignments()).basicRemove(otherEnd, msgs);
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
			case CvPackage.POSITION__START_DATE:
				return getStartDate();
			case CvPackage.POSITION__END_DATE:
				return getEndDate();
			case CvPackage.POSITION__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case CvPackage.POSITION__ASSIGNMENTS:
				return getAssignments();
			case CvPackage.POSITION__SKILLS:
				return getSkills();
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
			case CvPackage.POSITION__START_DATE:
				setStartDate((Date)newValue);
				return;
			case CvPackage.POSITION__END_DATE:
				setEndDate((Date)newValue);
				return;
			case CvPackage.POSITION__ROLE:
				setRole((Role)newValue);
				return;
			case CvPackage.POSITION__ASSIGNMENTS:
				getAssignments().clear();
				getAssignments().addAll((Collection<? extends Assignment>)newValue);
				return;
			case CvPackage.POSITION__SKILLS:
				getSkills().clear();
				getSkills().addAll((Collection<? extends Skill>)newValue);
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
			case CvPackage.POSITION__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case CvPackage.POSITION__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case CvPackage.POSITION__ROLE:
				setRole((Role)null);
				return;
			case CvPackage.POSITION__ASSIGNMENTS:
				getAssignments().clear();
				return;
			case CvPackage.POSITION__SKILLS:
				getSkills().clear();
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
			case CvPackage.POSITION__START_DATE:
				return START_DATE_EDEFAULT == null ? getStartDate() != null : !START_DATE_EDEFAULT.equals(getStartDate());
			case CvPackage.POSITION__END_DATE:
				return END_DATE_EDEFAULT == null ? getEndDate() != null : !END_DATE_EDEFAULT.equals(getEndDate());
			case CvPackage.POSITION__ROLE:
				return basicGetRole() != null;
			case CvPackage.POSITION__ASSIGNMENTS:
				return !getAssignments().isEmpty();
			case CvPackage.POSITION__SKILLS:
				return !getSkills().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PositionImpl
