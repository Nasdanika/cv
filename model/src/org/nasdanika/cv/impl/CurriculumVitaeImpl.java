/**
 */
package org.nasdanika.cv.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.cv.CurriculumVitae;
import org.nasdanika.cv.CvPackage;

import org.nasdanika.cv.Experience;
import org.nasdanika.party.DirectoryElement;
import org.nasdanika.party.impl.PersonImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Curriculum Vitae</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.cv.impl.CurriculumVitaeImpl#getExperiences <em>Experiences</em>}</li>
 *   <li>{@link org.nasdanika.cv.impl.CurriculumVitaeImpl#getDirectory <em>Directory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurriculumVitaeImpl extends PersonImpl implements CurriculumVitae {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurriculumVitaeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CvPackage.Literals.CURRICULUM_VITAE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Experience> getExperiences() {
		return (EList<Experience>)eDynamicGet(CvPackage.CURRICULUM_VITAE__EXPERIENCES, CvPackage.Literals.CURRICULUM_VITAE__EXPERIENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<DirectoryElement> getDirectory() {
		return (EList<DirectoryElement>)eDynamicGet(CvPackage.CURRICULUM_VITAE__DIRECTORY, CvPackage.Literals.CURRICULUM_VITAE__DIRECTORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CvPackage.CURRICULUM_VITAE__EXPERIENCES:
				return ((InternalEList<?>)getExperiences()).basicRemove(otherEnd, msgs);
			case CvPackage.CURRICULUM_VITAE__DIRECTORY:
				return ((InternalEList<?>)getDirectory()).basicRemove(otherEnd, msgs);
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
			case CvPackage.CURRICULUM_VITAE__EXPERIENCES:
				return getExperiences();
			case CvPackage.CURRICULUM_VITAE__DIRECTORY:
				return getDirectory();
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
			case CvPackage.CURRICULUM_VITAE__EXPERIENCES:
				getExperiences().clear();
				getExperiences().addAll((Collection<? extends Experience>)newValue);
				return;
			case CvPackage.CURRICULUM_VITAE__DIRECTORY:
				getDirectory().clear();
				getDirectory().addAll((Collection<? extends DirectoryElement>)newValue);
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
			case CvPackage.CURRICULUM_VITAE__EXPERIENCES:
				getExperiences().clear();
				return;
			case CvPackage.CURRICULUM_VITAE__DIRECTORY:
				getDirectory().clear();
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
			case CvPackage.CURRICULUM_VITAE__EXPERIENCES:
				return !getExperiences().isEmpty();
			case CvPackage.CURRICULUM_VITAE__DIRECTORY:
				return !getDirectory().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CurriculumVitaeImpl
