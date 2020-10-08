/**
 */
package org.nasdanika.cv.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.cv.Assignment;
import org.nasdanika.cv.Comment;
import org.nasdanika.cv.CurriculumVitae;
import org.nasdanika.cv.CvFactory;
import org.nasdanika.cv.CvPackage;

import org.nasdanika.cv.Experience;
import org.nasdanika.cv.Position;
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

		experienceEClass = createEClass(EXPERIENCE);
		createEAttribute(experienceEClass, EXPERIENCE__START_DATE);
		createEAttribute(experienceEClass, EXPERIENCE__END_DATE);
		createEReference(experienceEClass, EXPERIENCE__POSITIONS);

		positionEClass = createEClass(POSITION);
		createEAttribute(positionEClass, POSITION__START_DATE);
		createEAttribute(positionEClass, POSITION__END_DATE);
		createEReference(positionEClass, POSITION__ROLE);
		createEReference(positionEClass, POSITION__ASSIGNMENTS);

		assignmentEClass = createEClass(ASSIGNMENT);
		createEAttribute(assignmentEClass, ASSIGNMENT__START_DATE);
		createEAttribute(assignmentEClass, ASSIGNMENT__END_DATE);

		commentEClass = createEClass(COMMENT);
		createEAttribute(commentEClass, COMMENT__DATE);
		createEAttribute(commentEClass, COMMENT__DESCRIPTION);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(curriculumVitaeEClass, CurriculumVitae.class, "CurriculumVitae", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCurriculumVitae_Experiences(), this.getExperience(), null, "experiences", null, 0, -1, CurriculumVitae.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurriculumVitae_Directory(), thePartyPackage.getDirectoryElement(), null, "directory", null, 0, -1, CurriculumVitae.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(experienceEClass, Experience.class, "Experience", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExperience_StartDate(), ecorePackage.getEDate(), "startDate", null, 0, 1, Experience.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperience_EndDate(), ecorePackage.getEDate(), "endDate", null, 0, 1, Experience.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperience_Positions(), this.getPosition(), null, "positions", null, 0, -1, Experience.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPosition_StartDate(), ecorePackage.getEDate(), "startDate", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_EndDate(), ecorePackage.getEDate(), "endDate", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPosition_Role(), thePartyPackage.getRole(), null, "role", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPosition_Assignments(), this.getAssignment(), null, "assignments", null, 0, -1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssignment_StartDate(), ecorePackage.getEDate(), "startDate", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssignment_EndDate(), ecorePackage.getEDate(), "endDate", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComment_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComment_Description(), ecorePackage.getEString(), "description", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			   "documentation", "Nasdanika curriculum vitae model provides elements for documenting someone\'s life work in a detailed and cross-referenced fashion, e.g. assignments may reference skills and co-workers.\nIf used for job hunting, the model may serve as a data source for resumes which include a subset of model elements. \nThe goal is to have a single potentially very detailed model and be able to produce multiple representations of that model with different level of details and formatting, e.g. a web site or a single page.\n\nThe model also provides element for tracking job search execution.\n"
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
	}

} //CvPackageImpl
