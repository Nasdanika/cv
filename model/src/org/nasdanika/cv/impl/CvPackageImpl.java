/**
 */
package org.nasdanika.cv.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.cv.Accomplishment;
import org.nasdanika.cv.AccomplishmentCategory;
import org.nasdanika.cv.AccomplishmentCategoryElement;
import org.nasdanika.cv.AccomplishmentType;
import org.nasdanika.cv.Assignment;
import org.nasdanika.cv.Comment;
import org.nasdanika.cv.CurriculumVitae;
import org.nasdanika.cv.CvFactory;
import org.nasdanika.cv.CvPackage;

import org.nasdanika.cv.Experience;
import org.nasdanika.cv.Position;
import org.nasdanika.cv.Resume;
import org.nasdanika.cv.Skill;
import org.nasdanika.cv.SkillCategory;
import org.nasdanika.cv.SkillCategoryElement;
import org.nasdanika.cv.SkillLevel;
import org.nasdanika.cv.SkillRelease;
import org.nasdanika.ncore.NcorePackage;

import org.nasdanika.party.PartyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CvPackageImpl extends EPackageImpl implements CvPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass curriculumVitaeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experienceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skillLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skillCategoryElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skillCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skillEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skillReleaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accomplishmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accomplishmentCategoryElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accomplishmentCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accomplishmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resumeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.cv.CvPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CvPackageImpl() {
		super(eNS_URI, CvFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CvPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CvPackage init() {
		if (isInited) return (CvPackage)EPackage.Registry.INSTANCE.getEPackage(CvPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCvPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CvPackageImpl theCvPackage = registeredCvPackage instanceof CvPackageImpl ? (CvPackageImpl)registeredCvPackage : new CvPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		NcorePackage.eINSTANCE.eClass();
		PartyPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCvPackage.createPackageContents();

		// Initialize created meta-data
		theCvPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCvPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CvPackage.eNS_URI, theCvPackage);
		return theCvPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCurriculumVitae() {
		return curriculumVitaeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCurriculumVitae_Experiences() {
		return (EReference)curriculumVitaeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCurriculumVitae_Directory() {
		return (EReference)curriculumVitaeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCurriculumVitae_SkillLevels() {
		return (EReference)curriculumVitaeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCurriculumVitae_Skills() {
		return (EReference)curriculumVitaeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCurriculumVitae_Accomplishments() {
		return (EReference)curriculumVitaeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCurriculumVitae_AccomplishmentTypes() {
		return (EReference)curriculumVitaeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCurriculumVitae_Resumes() {
		return (EReference)curriculumVitaeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExperience() {
		return experienceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExperience_StartDate() {
		return (EAttribute)experienceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExperience_EndDate() {
		return (EAttribute)experienceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExperience_Positions() {
		return (EReference)experienceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPosition() {
		return positionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_StartDate() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_EndDate() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPosition_Role() {
		return (EReference)positionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPosition_Assignments() {
		return (EReference)positionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPosition_Skills() {
		return (EReference)positionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssignment() {
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssignment_StartDate() {
		return (EAttribute)assignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssignment_EndDate() {
		return (EAttribute)assignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssignment_Skills() {
		return (EReference)assignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComment_Date() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComment_Description() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSkillLevel() {
		return skillLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSkillCategoryElement() {
		return skillCategoryElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSkillCategoryElement_Elements() {
		return (EReference)skillCategoryElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSkillCategory() {
		return skillCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSkill() {
		return skillEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSkill_Level() {
		return (EReference)skillEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSkillRelease() {
		return skillReleaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccomplishmentType() {
		return accomplishmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccomplishmentCategoryElement() {
		return accomplishmentCategoryElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccomplishmentCategoryElement_Elements() {
		return (EReference)accomplishmentCategoryElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccomplishmentCategory() {
		return accomplishmentCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccomplishment() {
		return accomplishmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccomplishment_Type() {
		return (EReference)accomplishmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccomplishment_Authority() {
		return (EReference)accomplishmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccomplishment_Skills() {
		return (EReference)accomplishmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccomplishment_AccomplishmentId() {
		return (EAttribute)accomplishmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccomplishment_Url() {
		return (EAttribute)accomplishmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccomplishment_Date() {
		return (EAttribute)accomplishmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccomplishment_StartDate() {
		return (EAttribute)accomplishmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccomplishment_Expires() {
		return (EAttribute)accomplishmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResume() {
		return resumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResume_Elements() {
		return (EReference)resumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResume_Skills() {
		return (EReference)resumeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CvFactory getCvFactory() {
		return (CvFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		curriculumVitaeEClass = createEClass(CURRICULUM_VITAE);
		createEReference(curriculumVitaeEClass, CURRICULUM_VITAE__EXPERIENCES);
		createEReference(curriculumVitaeEClass, CURRICULUM_VITAE__DIRECTORY);
		createEReference(curriculumVitaeEClass, CURRICULUM_VITAE__SKILL_LEVELS);
		createEReference(curriculumVitaeEClass, CURRICULUM_VITAE__SKILLS);
		createEReference(curriculumVitaeEClass, CURRICULUM_VITAE__ACCOMPLISHMENTS);
		createEReference(curriculumVitaeEClass, CURRICULUM_VITAE__ACCOMPLISHMENT_TYPES);
		createEReference(curriculumVitaeEClass, CURRICULUM_VITAE__RESUMES);

		experienceEClass = createEClass(EXPERIENCE);
		createEAttribute(experienceEClass, EXPERIENCE__START_DATE);
		createEAttribute(experienceEClass, EXPERIENCE__END_DATE);
		createEReference(experienceEClass, EXPERIENCE__POSITIONS);

		positionEClass = createEClass(POSITION);
		createEAttribute(positionEClass, POSITION__START_DATE);
		createEAttribute(positionEClass, POSITION__END_DATE);
		createEReference(positionEClass, POSITION__ROLE);
		createEReference(positionEClass, POSITION__ASSIGNMENTS);
		createEReference(positionEClass, POSITION__SKILLS);

		assignmentEClass = createEClass(ASSIGNMENT);
		createEAttribute(assignmentEClass, ASSIGNMENT__START_DATE);
		createEAttribute(assignmentEClass, ASSIGNMENT__END_DATE);
		createEReference(assignmentEClass, ASSIGNMENT__SKILLS);

		commentEClass = createEClass(COMMENT);
		createEAttribute(commentEClass, COMMENT__DATE);
		createEAttribute(commentEClass, COMMENT__DESCRIPTION);

		skillLevelEClass = createEClass(SKILL_LEVEL);

		skillCategoryElementEClass = createEClass(SKILL_CATEGORY_ELEMENT);
		createEReference(skillCategoryElementEClass, SKILL_CATEGORY_ELEMENT__ELEMENTS);

		skillCategoryEClass = createEClass(SKILL_CATEGORY);

		skillEClass = createEClass(SKILL);
		createEReference(skillEClass, SKILL__LEVEL);

		skillReleaseEClass = createEClass(SKILL_RELEASE);

		accomplishmentTypeEClass = createEClass(ACCOMPLISHMENT_TYPE);

		accomplishmentCategoryElementEClass = createEClass(ACCOMPLISHMENT_CATEGORY_ELEMENT);
		createEReference(accomplishmentCategoryElementEClass, ACCOMPLISHMENT_CATEGORY_ELEMENT__ELEMENTS);

		accomplishmentCategoryEClass = createEClass(ACCOMPLISHMENT_CATEGORY);

		accomplishmentEClass = createEClass(ACCOMPLISHMENT);
		createEReference(accomplishmentEClass, ACCOMPLISHMENT__TYPE);
		createEReference(accomplishmentEClass, ACCOMPLISHMENT__AUTHORITY);
		createEReference(accomplishmentEClass, ACCOMPLISHMENT__SKILLS);
		createEAttribute(accomplishmentEClass, ACCOMPLISHMENT__ACCOMPLISHMENT_ID);
		createEAttribute(accomplishmentEClass, ACCOMPLISHMENT__URL);
		createEAttribute(accomplishmentEClass, ACCOMPLISHMENT__DATE);
		createEAttribute(accomplishmentEClass, ACCOMPLISHMENT__START_DATE);
		createEAttribute(accomplishmentEClass, ACCOMPLISHMENT__EXPIRES);

		resumeEClass = createEClass(RESUME);
		createEReference(resumeEClass, RESUME__ELEMENTS);
		createEReference(resumeEClass, RESUME__SKILLS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PartyPackage thePartyPackage = (PartyPackage)EPackage.Registry.INSTANCE.getEPackage(PartyPackage.eNS_URI);
		NcorePackage theNcorePackage = (NcorePackage)EPackage.Registry.INSTANCE.getEPackage(NcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		curriculumVitaeEClass.getESuperTypes().add(thePartyPackage.getPerson());
		experienceEClass.getESuperTypes().add(thePartyPackage.getOrganization());
		positionEClass.getESuperTypes().add(theNcorePackage.getModelElement());
		assignmentEClass.getESuperTypes().add(theNcorePackage.getModelElement());
		skillLevelEClass.getESuperTypes().add(theNcorePackage.getModelElement());
		skillCategoryEClass.getESuperTypes().add(theNcorePackage.getModelElement());
		skillCategoryEClass.getESuperTypes().add(this.getSkillCategoryElement());
		skillEClass.getESuperTypes().add(theNcorePackage.getEntity());
		skillEClass.getESuperTypes().add(this.getSkillCategoryElement());
		skillReleaseEClass.getESuperTypes().add(this.getSkill());
		accomplishmentTypeEClass.getESuperTypes().add(theNcorePackage.getModelElement());
		accomplishmentCategoryEClass.getESuperTypes().add(theNcorePackage.getModelElement());
		accomplishmentCategoryEClass.getESuperTypes().add(this.getAccomplishmentCategoryElement());
		accomplishmentEClass.getESuperTypes().add(theNcorePackage.getEntity());
		accomplishmentEClass.getESuperTypes().add(this.getAccomplishmentCategoryElement());
		resumeEClass.getESuperTypes().add(theNcorePackage.getEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(curriculumVitaeEClass, CurriculumVitae.class, "CurriculumVitae", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCurriculumVitae_Experiences(), this.getExperience(), null, "experiences", null, 0, -1, CurriculumVitae.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurriculumVitae_Directory(), thePartyPackage.getDirectoryElement(), null, "directory", null, 0, -1, CurriculumVitae.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurriculumVitae_SkillLevels(), this.getSkillLevel(), null, "skillLevels", null, 0, -1, CurriculumVitae.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurriculumVitae_Skills(), this.getSkillCategoryElement(), null, "skills", null, 0, -1, CurriculumVitae.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurriculumVitae_Accomplishments(), this.getAccomplishmentCategoryElement(), null, "accomplishments", null, 0, -1, CurriculumVitae.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurriculumVitae_AccomplishmentTypes(), this.getAccomplishmentType(), null, "accomplishmentTypes", null, 0, -1, CurriculumVitae.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurriculumVitae_Resumes(), this.getResume(), null, "resumes", null, 0, -1, CurriculumVitae.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(experienceEClass, Experience.class, "Experience", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExperience_StartDate(), ecorePackage.getEDate(), "startDate", null, 0, 1, Experience.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperience_EndDate(), ecorePackage.getEDate(), "endDate", null, 0, 1, Experience.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperience_Positions(), this.getPosition(), null, "positions", null, 0, -1, Experience.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPosition_StartDate(), ecorePackage.getEDate(), "startDate", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_EndDate(), ecorePackage.getEDate(), "endDate", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPosition_Role(), thePartyPackage.getRole(), null, "role", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPosition_Assignments(), this.getAssignment(), null, "assignments", null, 0, -1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPosition_Skills(), this.getSkill(), null, "skills", null, 0, -1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssignment_StartDate(), ecorePackage.getEDate(), "startDate", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssignment_EndDate(), ecorePackage.getEDate(), "endDate", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignment_Skills(), this.getSkill(), null, "skills", null, 0, -1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComment_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComment_Description(), ecorePackage.getEString(), "description", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skillLevelEClass, SkillLevel.class, "SkillLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(skillCategoryElementEClass, SkillCategoryElement.class, "SkillCategoryElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSkillCategoryElement_Elements(), this.getSkillCategoryElement(), null, "elements", null, 0, -1, SkillCategoryElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skillCategoryEClass, SkillCategory.class, "SkillCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(skillEClass, Skill.class, "Skill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSkill_Level(), this.getSkillLevel(), null, "level", null, 0, 1, Skill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skillReleaseEClass, SkillRelease.class, "SkillRelease", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accomplishmentTypeEClass, AccomplishmentType.class, "AccomplishmentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accomplishmentCategoryElementEClass, AccomplishmentCategoryElement.class, "AccomplishmentCategoryElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccomplishmentCategoryElement_Elements(), this.getAccomplishmentCategoryElement(), null, "elements", null, 0, -1, AccomplishmentCategoryElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accomplishmentCategoryEClass, AccomplishmentCategory.class, "AccomplishmentCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accomplishmentEClass, Accomplishment.class, "Accomplishment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccomplishment_Type(), this.getAccomplishmentType(), null, "type", null, 0, 1, Accomplishment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccomplishment_Authority(), thePartyPackage.getParty(), null, "authority", null, 0, 1, Accomplishment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccomplishment_Skills(), this.getSkill(), null, "skills", null, 0, -1, Accomplishment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccomplishment_AccomplishmentId(), ecorePackage.getEString(), "accomplishmentId", null, 0, 1, Accomplishment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccomplishment_Url(), ecorePackage.getEString(), "url", null, 0, 1, Accomplishment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccomplishment_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Accomplishment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccomplishment_StartDate(), ecorePackage.getEDate(), "startDate", null, 0, 1, Accomplishment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccomplishment_Expires(), ecorePackage.getEDate(), "expires", null, 0, 1, Accomplishment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resumeEClass, Resume.class, "Resume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResume_Elements(), ecorePackage.getEObject(), null, "elements", null, 0, -1, Resume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResume_Skills(), this.getSkill(), null, "skills", null, 0, -1, Resume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "documentation", "Nasdanika curriculum vitae model provides elements for documenting someone\'s life work in a detailed and cross-referenced fashion, e.g. assignments may reference skills and co-workers.\nIf used for job hunting, the model may serve as a data source for resumes which include a subset of model elements. \nThe goal is to have a single potentially very detailed model and be able to produce multiple representations of that model with different level of details and formatting, e.g. a web site or a single page.\n\n"
		   });
		addAnnotation
		  (curriculumVitaeEClass,
		   source,
		   new String[] {
			   "documentation", "The root of CV model. Because CV is for a Person this class extends party.Person."
		   });
		addAnnotation
		  (getCurriculumVitae_Directory(),
		   source,
		   new String[] {
			   "documentation", "Directory of parties referenced in the CV. Experience-specific parties may be referenced at the experience level."
		   });
		addAnnotation
		  (getCurriculumVitae_Skills(),
		   source,
		   new String[] {
			   "documentation", "Directory of skills"
		   });
		addAnnotation
		  (getCurriculumVitae_Accomplishments(),
		   source,
		   new String[] {
			   "documentation", "Directory of skills"
		   });
		addAnnotation
		  (experienceEClass,
		   source,
		   new String[] {
			   "documentation", "Work experience, for example employment. "
		   });
		addAnnotation
		  (getExperience_StartDate(),
		   source,
		   new String[] {
			   "documentation", "Start date."
		   });
		addAnnotation
		  (getExperience_EndDate(),
		   source,
		   new String[] {
			   "documentation", "End date. Blank means present."
		   });
		addAnnotation
		  (positionEClass,
		   source,
		   new String[] {
			   "documentation", "Position within experience. For example, over a course of employment a person may hold a number of positions."
		   });
		addAnnotation
		  (getPosition_StartDate(),
		   source,
		   new String[] {
			   "documentation", "Start date."
		   });
		addAnnotation
		  (getPosition_EndDate(),
		   source,
		   new String[] {
			   "documentation", "End date. Blank means present."
		   });
		addAnnotation
		  (getPosition_Role(),
		   source,
		   new String[] {
			   "documentation", "Reference to a role in the organization."
		   });
		addAnnotation
		  (getPosition_Skills(),
		   source,
		   new String[] {
			   "documentation", "Skills associated with this accomplishment."
		   });
		addAnnotation
		  (assignmentEClass,
		   source,
		   new String[] {
			   "documentation", "Assignment within position. For example, over a course of holding a particular position a person may participate in multiple projects."
		   });
		addAnnotation
		  (getAssignment_StartDate(),
		   source,
		   new String[] {
			   "documentation", "Start date."
		   });
		addAnnotation
		  (getAssignment_EndDate(),
		   source,
		   new String[] {
			   "documentation", "End date. Blank means present."
		   });
		addAnnotation
		  (getAssignment_Skills(),
		   source,
		   new String[] {
			   "documentation", "Skills associated with this accomplishment."
		   });
		addAnnotation
		  (commentEClass,
		   source,
		   new String[] {
			   "documentation", "Comment."
		   });
		addAnnotation
		  (getComment_Date(),
		   source,
		   new String[] {
			   "documentation", "Start date."
		   });
		addAnnotation
		  (getComment_Description(),
		   source,
		   new String[] {
			   "documentation", "Comment in markdown."
		   });
		addAnnotation
		  (skillCategoryElementEClass,
		   source,
		   new String[] {
			   "documentation", "Base class for model elements which can be contained by skill category - skills and sub-categories."
		   });
		addAnnotation
		  (getSkillCategoryElement_Elements(),
		   source,
		   new String[] {
			   "documentation", "Skills in the category or skill specializations. E.g. skill Java may have a sub-skill \"Spring\""
		   });
		addAnnotation
		  (skillCategoryEClass,
		   source,
		   new String[] {
			   "documentation", "Grouping of persona needs."
		   });
		addAnnotation
		  (skillEClass,
		   source,
		   new String[] {
			   "documentation", "Personas have needs which may be satisfied by organization offerings. Needs can be organized into a hierarchy and assigned weights either manually or using decision analysis techniques. Needs may be satisfied by offerings via scenarios explaining how a need is satisfied.\n\nMust have, need to have, delighter - here or at the offering level?"
		   });
		addAnnotation
		  (skillReleaseEClass,
		   source,
		   new String[] {
			   "documentation", "Release of a skill. For example, Java 11."
		   });
		addAnnotation
		  (accomplishmentCategoryElementEClass,
		   source,
		   new String[] {
			   "documentation", "Base class for model elements which can be contained by skill category - skills and sub-categories."
		   });
		addAnnotation
		  (getAccomplishmentCategoryElement_Elements(),
		   source,
		   new String[] {
			   "documentation", "Skills in the category or skill specializations. E.g. skill Java may have a sub-skill \"Spring\""
		   });
		addAnnotation
		  (accomplishmentCategoryEClass,
		   source,
		   new String[] {
			   "documentation", "Grouping of persona needs."
		   });
		addAnnotation
		  (accomplishmentEClass,
		   source,
		   new String[] {
			   "documentation", "Personas have needs which may be satisfied by organization offerings. Needs can be organized into a hierarchy and assigned weights either manually or using decision analysis techniques. Needs may be satisfied by offerings via scenarios explaining how a need is satisfied.\n\nMust have, need to have, delighter - here or at the offering level?"
		   });
		addAnnotation
		  (getAccomplishment_Type(),
		   source,
		   new String[] {
			   "documentation", "Accomplishment type. E.g. education, certification, training, book."
		   });
		addAnnotation
		  (getAccomplishment_Skills(),
		   source,
		   new String[] {
			   "documentation", "Skills associated with this accomplishment."
		   });
		addAnnotation
		  (getAccomplishment_AccomplishmentId(),
		   source,
		   new String[] {
			   "documentation", "Accomplishment ID which can be used for verification, e.g. certificate number or ISBN number."
		   });
		addAnnotation
		  (getAccomplishment_Url(),
		   source,
		   new String[] {
			   "documentation", "Accomplishment URL."
		   });
		addAnnotation
		  (getAccomplishment_Date(),
		   source,
		   new String[] {
			   "documentation", "Date of accomplishment, e.g. date of graduation or certification."
		   });
		addAnnotation
		  (getAccomplishment_StartDate(),
		   source,
		   new String[] {
			   "documentation", "Optional start date of an accomplishment, e.g. start of training."
		   });
		addAnnotation
		  (getAccomplishment_Expires(),
		   source,
		   new String[] {
			   "documentation", "Optional accomplishment expiration date."
		   });
		addAnnotation
		  (resumeEClass,
		   source,
		   new String[] {
			   "documentation", "Resume is a view/representation of the CV. It may contain all CV elements  or a subset of them. It also defines skill highlights and publishing configuration."
		   });
		addAnnotation
		  (getResume_Elements(),
		   source,
		   new String[] {
			   "documentation", "Elements to include to the resume."
		   });
		addAnnotation
		  (getResume_Skills(),
		   source,
		   new String[] {
			   "documentation", "Skill highlights."
		   });
	}

} //CvPackageImpl
