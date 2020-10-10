/**
 */
package org.nasdanika.cv;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.party.DirectoryElement;
import org.nasdanika.party.Person;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curriculum Vitae</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The root of CV model. Because CV is for a Person this class extends party.Person.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.cv.CurriculumVitae#getExperiences <em>Experiences</em>}</li>
 *   <li>{@link org.nasdanika.cv.CurriculumVitae#getDirectory <em>Directory</em>}</li>
 *   <li>{@link org.nasdanika.cv.CurriculumVitae#getSkillLevels <em>Skill Levels</em>}</li>
 *   <li>{@link org.nasdanika.cv.CurriculumVitae#getSkills <em>Skills</em>}</li>
 *   <li>{@link org.nasdanika.cv.CurriculumVitae#getAccomplishments <em>Accomplishments</em>}</li>
 *   <li>{@link org.nasdanika.cv.CurriculumVitae#getAccomplishmentTypes <em>Accomplishment Types</em>}</li>
 *   <li>{@link org.nasdanika.cv.CurriculumVitae#getResumes <em>Resumes</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.cv.CvPackage#getCurriculumVitae()
 * @model
 * @generated
 */
public interface CurriculumVitae extends Person {

	/**
	 * Returns the value of the '<em><b>Experiences</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.cv.Experience}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experiences</em>' containment reference list.
	 * @see org.nasdanika.cv.CvPackage#getCurriculumVitae_Experiences()
	 * @model containment="true"
	 * @generated
	 */
	EList<Experience> getExperiences();

	/**
	 * Returns the value of the '<em><b>Directory</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.party.DirectoryElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Directory of parties referenced in the CV. Experience-specific parties may be referenced at the experience level.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Directory</em>' containment reference list.
	 * @see org.nasdanika.cv.CvPackage#getCurriculumVitae_Directory()
	 * @model containment="true"
	 * @generated
	 */
	EList<DirectoryElement> getDirectory();

	/**
	 * Returns the value of the '<em><b>Skill Levels</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.cv.SkillLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skill Levels</em>' containment reference list.
	 * @see org.nasdanika.cv.CvPackage#getCurriculumVitae_SkillLevels()
	 * @model containment="true"
	 * @generated
	 */
	EList<SkillLevel> getSkillLevels();

	/**
	 * Returns the value of the '<em><b>Skills</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.cv.SkillCategoryElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Directory of skills
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Skills</em>' containment reference list.
	 * @see org.nasdanika.cv.CvPackage#getCurriculumVitae_Skills()
	 * @model containment="true"
	 * @generated
	 */
	EList<SkillCategoryElement> getSkills();

	/**
	 * Returns the value of the '<em><b>Accomplishments</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.cv.AccomplishmentCategoryElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Directory of skills
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accomplishments</em>' containment reference list.
	 * @see org.nasdanika.cv.CvPackage#getCurriculumVitae_Accomplishments()
	 * @model containment="true"
	 * @generated
	 */
	EList<AccomplishmentCategoryElement> getAccomplishments();

	/**
	 * Returns the value of the '<em><b>Accomplishment Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.cv.AccomplishmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accomplishment Types</em>' containment reference list.
	 * @see org.nasdanika.cv.CvPackage#getCurriculumVitae_AccomplishmentTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AccomplishmentType> getAccomplishmentTypes();

	/**
	 * Returns the value of the '<em><b>Resumes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.cv.Resume}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resumes</em>' containment reference list.
	 * @see org.nasdanika.cv.CvPackage#getCurriculumVitae_Resumes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resume> getResumes();
} // CurriculumVitae
