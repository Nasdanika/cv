/**
 */
package org.nasdanika.cv.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.cv.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CvFactoryImpl extends EFactoryImpl implements CvFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CvFactory init() {
		try {
			CvFactory theCvFactory = (CvFactory)EPackage.Registry.INSTANCE.getEFactory(CvPackage.eNS_URI);
			if (theCvFactory != null) {
				return theCvFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CvFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CvFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CvPackage.CURRICULUM_VITAE: return createCurriculumVitae();
			case CvPackage.EXPERIENCE: return createExperience();
			case CvPackage.POSITION: return createPosition();
			case CvPackage.ASSIGNMENT: return createAssignment();
			case CvPackage.COMMENT: return createComment();
			case CvPackage.SKILL_LEVEL: return createSkillLevel();
			case CvPackage.SKILL_CATEGORY: return createSkillCategory();
			case CvPackage.SKILL: return createSkill();
			case CvPackage.SKILL_RELEASE: return createSkillRelease();
			case CvPackage.ACCOMPLISHMENT_TYPE: return createAccomplishmentType();
			case CvPackage.ACCOMPLISHMENT_CATEGORY: return createAccomplishmentCategory();
			case CvPackage.RESUME: return createResume();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurriculumVitae createCurriculumVitae() {
		CurriculumVitaeImpl curriculumVitae = new CurriculumVitaeImpl();
		return curriculumVitae;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Experience createExperience() {
		ExperienceImpl experience = new ExperienceImpl();
		return experience;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position createPosition() {
		PositionImpl position = new PositionImpl();
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkillLevel createSkillLevel() {
		SkillLevelImpl skillLevel = new SkillLevelImpl();
		return skillLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkillCategory createSkillCategory() {
		SkillCategoryImpl skillCategory = new SkillCategoryImpl();
		return skillCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Skill createSkill() {
		SkillImpl skill = new SkillImpl();
		return skill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkillRelease createSkillRelease() {
		SkillReleaseImpl skillRelease = new SkillReleaseImpl();
		return skillRelease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccomplishmentType createAccomplishmentType() {
		AccomplishmentTypeImpl accomplishmentType = new AccomplishmentTypeImpl();
		return accomplishmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccomplishmentCategory createAccomplishmentCategory() {
		AccomplishmentCategoryImpl accomplishmentCategory = new AccomplishmentCategoryImpl();
		return accomplishmentCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resume createResume() {
		ResumeImpl resume = new ResumeImpl();
		return resume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CvPackage getCvPackage() {
		return (CvPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CvPackage getPackage() {
		return CvPackage.eINSTANCE;
	}

} //CvFactoryImpl
