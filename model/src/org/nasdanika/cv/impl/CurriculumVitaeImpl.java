/**
 */
package org.nasdanika.cv.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.cv.AccomplishmentCategoryElement;
import org.nasdanika.cv.AccomplishmentType;
import org.nasdanika.cv.CurriculumVitae;
import org.nasdanika.cv.CvPackage;

import org.nasdanika.cv.Experience;
import org.nasdanika.cv.Resume;
import org.nasdanika.cv.SkillCategoryElement;
import org.nasdanika.cv.SkillLevel;
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
 *   <li>{@link org.nasdanika.cv.impl.CurriculumVitaeImpl#getSkillLevels <em>Skill Levels</em>}</li>
 *   <li>{@link org.nasdanika.cv.impl.CurriculumVitaeImpl#getSkills <em>Skills</em>}</li>
 *   <li>{@link org.nasdanika.cv.impl.CurriculumVitaeImpl#getAccomplishments <em>Accomplishments</em>}</li>
 *   <li>{@link org.nasdanika.cv.impl.CurriculumVitaeImpl#getAccomplishmentTypes <em>Accomplishment Types</em>}</li>
 *   <li>{@link org.nasdanika.cv.impl.CurriculumVitaeImpl#getResumes <em>Resumes</em>}</li>
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<SkillLevel> getSkillLevels() {
		return (EList<SkillLevel>)eDynamicGet(CvPackage.CURRICULUM_VITAE__SKILL_LEVELS, CvPackage.Literals.CURRICULUM_VITAE__SKILL_LEVELS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<SkillCategoryElement> getSkills() {
		return (EList<SkillCategoryElement>)eDynamicGet(CvPackage.CURRICULUM_VITAE__SKILLS, CvPackage.Literals.CURRICULUM_VITAE__SKILLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AccomplishmentCategoryElement> getAccomplishments() {
		return (EList<AccomplishmentCategoryElement>)eDynamicGet(CvPackage.CURRICULUM_VITAE__ACCOMPLISHMENTS, CvPackage.Literals.CURRICULUM_VITAE__ACCOMPLISHMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AccomplishmentType> getAccomplishmentTypes() {
		return (EList<AccomplishmentType>)eDynamicGet(CvPackage.CURRICULUM_VITAE__ACCOMPLISHMENT_TYPES, CvPackage.Literals.CURRICULUM_VITAE__ACCOMPLISHMENT_TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Resume> getResumes() {
		return (EList<Resume>)eDynamicGet(CvPackage.CURRICULUM_VITAE__RESUMES, CvPackage.Literals.CURRICULUM_VITAE__RESUMES, true, true);
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
			case CvPackage.CURRICULUM_VITAE__SKILL_LEVELS:
				return ((InternalEList<?>)getSkillLevels()).basicRemove(otherEnd, msgs);
			case CvPackage.CURRICULUM_VITAE__SKILLS:
				return ((InternalEList<?>)getSkills()).basicRemove(otherEnd, msgs);
			case CvPackage.CURRICULUM_VITAE__ACCOMPLISHMENTS:
				return ((InternalEList<?>)getAccomplishments()).basicRemove(otherEnd, msgs);
			case CvPackage.CURRICULUM_VITAE__ACCOMPLISHMENT_TYPES:
				return ((InternalEList<?>)getAccomplishmentTypes()).basicRemove(otherEnd, msgs);
			case CvPackage.CURRICULUM_VITAE__RESUMES:
				return ((InternalEList<?>)getResumes()).basicRemove(otherEnd, msgs);
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
			case CvPackage.CURRICULUM_VITAE__SKILL_LEVELS:
				return getSkillLevels();
			case CvPackage.CURRICULUM_VITAE__SKILLS:
				return getSkills();
			case CvPackage.CURRICULUM_VITAE__ACCOMPLISHMENTS:
				return getAccomplishments();
			case CvPackage.CURRICULUM_VITAE__ACCOMPLISHMENT_TYPES:
				return getAccomplishmentTypes();
			case CvPackage.CURRICULUM_VITAE__RESUMES:
				return getResumes();
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
			case CvPackage.CURRICULUM_VITAE__SKILL_LEVELS:
				getSkillLevels().clear();
				getSkillLevels().addAll((Collection<? extends SkillLevel>)newValue);
				return;
			case CvPackage.CURRICULUM_VITAE__SKILLS:
				getSkills().clear();
				getSkills().addAll((Collection<? extends SkillCategoryElement>)newValue);
				return;
			case CvPackage.CURRICULUM_VITAE__ACCOMPLISHMENTS:
				getAccomplishments().clear();
				getAccomplishments().addAll((Collection<? extends AccomplishmentCategoryElement>)newValue);
				return;
			case CvPackage.CURRICULUM_VITAE__ACCOMPLISHMENT_TYPES:
				getAccomplishmentTypes().clear();
				getAccomplishmentTypes().addAll((Collection<? extends AccomplishmentType>)newValue);
				return;
			case CvPackage.CURRICULUM_VITAE__RESUMES:
				getResumes().clear();
				getResumes().addAll((Collection<? extends Resume>)newValue);
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
			case CvPackage.CURRICULUM_VITAE__SKILL_LEVELS:
				getSkillLevels().clear();
				return;
			case CvPackage.CURRICULUM_VITAE__SKILLS:
				getSkills().clear();
				return;
			case CvPackage.CURRICULUM_VITAE__ACCOMPLISHMENTS:
				getAccomplishments().clear();
				return;
			case CvPackage.CURRICULUM_VITAE__ACCOMPLISHMENT_TYPES:
				getAccomplishmentTypes().clear();
				return;
			case CvPackage.CURRICULUM_VITAE__RESUMES:
				getResumes().clear();
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
			case CvPackage.CURRICULUM_VITAE__SKILL_LEVELS:
				return !getSkillLevels().isEmpty();
			case CvPackage.CURRICULUM_VITAE__SKILLS:
				return !getSkills().isEmpty();
			case CvPackage.CURRICULUM_VITAE__ACCOMPLISHMENTS:
				return !getAccomplishments().isEmpty();
			case CvPackage.CURRICULUM_VITAE__ACCOMPLISHMENT_TYPES:
				return !getAccomplishmentTypes().isEmpty();
			case CvPackage.CURRICULUM_VITAE__RESUMES:
				return !getResumes().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CurriculumVitaeImpl
