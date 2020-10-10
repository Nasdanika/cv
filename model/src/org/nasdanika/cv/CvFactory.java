/**
 */
package org.nasdanika.cv;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.cv.CvPackage
 * @generated
 */
public interface CvFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CvFactory eINSTANCE = org.nasdanika.cv.impl.CvFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Curriculum Vitae</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Curriculum Vitae</em>'.
	 * @generated
	 */
	CurriculumVitae createCurriculumVitae();

	/**
	 * Returns a new object of class '<em>Experience</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Experience</em>'.
	 * @generated
	 */
	Experience createExperience();

	/**
	 * Returns a new object of class '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position</em>'.
	 * @generated
	 */
	Position createPosition();

	/**
	 * Returns a new object of class '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment</em>'.
	 * @generated
	 */
	Assignment createAssignment();

	/**
	 * Returns a new object of class '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment</em>'.
	 * @generated
	 */
	Comment createComment();

	/**
	 * Returns a new object of class '<em>Skill Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Skill Level</em>'.
	 * @generated
	 */
	SkillLevel createSkillLevel();

	/**
	 * Returns a new object of class '<em>Skill Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Skill Category</em>'.
	 * @generated
	 */
	SkillCategory createSkillCategory();

	/**
	 * Returns a new object of class '<em>Skill</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Skill</em>'.
	 * @generated
	 */
	Skill createSkill();

	/**
	 * Returns a new object of class '<em>Skill Release</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Skill Release</em>'.
	 * @generated
	 */
	SkillRelease createSkillRelease();

	/**
	 * Returns a new object of class '<em>Accomplishment Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accomplishment Type</em>'.
	 * @generated
	 */
	AccomplishmentType createAccomplishmentType();

	/**
	 * Returns a new object of class '<em>Accomplishment Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accomplishment Category</em>'.
	 * @generated
	 */
	AccomplishmentCategory createAccomplishmentCategory();

	/**
	 * Returns a new object of class '<em>Accomplishment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accomplishment</em>'.
	 * @generated
	 */
	Accomplishment createAccomplishment();

	/**
	 * Returns a new object of class '<em>Resume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resume</em>'.
	 * @generated
	 */
	Resume createResume();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CvPackage getCvPackage();

} //CvFactory
