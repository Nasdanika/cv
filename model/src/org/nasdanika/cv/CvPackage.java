/**
 */
package org.nasdanika.cv;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.party.PartyPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Nasdanika curriculum vitae model provides elements for documenting someone's life work in a detailed and cross-referenced fashion, e.g. assignments may reference skills and co-workers.
 * If used for job hunting, the model may serve as a data source for resumes which include a subset of model elements. 
 * The goal is to have a single potentially very detailed model and be able to produce multiple representations of that model with different level of details and formatting, e.g. a web site or a single page.
 * 
 * The model also provides element for tracking job search execution.
 * 
 * <!-- end-model-doc -->
 * @see org.nasdanika.cv.CvFactory
 * @model kind="package"
 * @generated
 */
public interface CvPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cv";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.cv";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.cv";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CvPackage eINSTANCE = org.nasdanika.cv.impl.CvPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.cv.impl.CurriculumVitaeImpl <em>Curriculum Vitae</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.cv.impl.CurriculumVitaeImpl
	 * @see org.nasdanika.cv.impl.CvPackageImpl#getCurriculumVitae()
	 * @generated
	 */
	int CURRICULUM_VITAE = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRICULUM_VITAE__TITLE = PartyPackage.PERSON__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRICULUM_VITAE__DESCRIPTION = PartyPackage.PERSON__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRICULUM_VITAE__ID = PartyPackage.PERSON__ID;

	/**
	 * The feature id for the '<em><b>Contact Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRICULUM_VITAE__CONTACT_METHODS = PartyPackage.PERSON__CONTACT_METHODS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRICULUM_VITAE__RESOURCES = PartyPackage.PERSON__RESOURCES;

	/**
	 * The feature id for the '<em><b>Experiences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRICULUM_VITAE__EXPERIENCES = PartyPackage.PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Directory</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRICULUM_VITAE__DIRECTORY = PartyPackage.PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Curriculum Vitae</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRICULUM_VITAE_FEATURE_COUNT = PartyPackage.PERSON_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Curriculum Vitae</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRICULUM_VITAE_OPERATION_COUNT = PartyPackage.PERSON_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.cv.impl.ExperienceImpl <em>Experience</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.cv.impl.ExperienceImpl
	 * @see org.nasdanika.cv.impl.CvPackageImpl#getExperience()
	 * @generated
	 */
	int EXPERIENCE = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE__TITLE = PartyPackage.ORGANIZATION__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE__DESCRIPTION = PartyPackage.ORGANIZATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE__ID = PartyPackage.ORGANIZATION__ID;

	/**
	 * The feature id for the '<em><b>Contact Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE__CONTACT_METHODS = PartyPackage.ORGANIZATION__CONTACT_METHODS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE__RESOURCES = PartyPackage.ORGANIZATION__RESOURCES;

	/**
	 * The feature id for the '<em><b>Organizational Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE__ORGANIZATIONAL_UNITS = PartyPackage.ORGANIZATION__ORGANIZATIONAL_UNITS;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE__ROLES = PartyPackage.ORGANIZATION__ROLES;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE__MEMBERS = PartyPackage.ORGANIZATION__MEMBERS;

	/**
	 * The feature id for the '<em><b>Directory</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE__DIRECTORY = PartyPackage.ORGANIZATION__DIRECTORY;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE__START_DATE = PartyPackage.ORGANIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE__END_DATE = PartyPackage.ORGANIZATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Positions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE__POSITIONS = PartyPackage.ORGANIZATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Experience</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE_FEATURE_COUNT = PartyPackage.ORGANIZATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Experience</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE_OPERATION_COUNT = PartyPackage.ORGANIZATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.cv.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.cv.impl.PositionImpl
	 * @see org.nasdanika.cv.impl.CvPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__TITLE = NcorePackage.MODEL_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__DESCRIPTION = NcorePackage.MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__START_DATE = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__END_DATE = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__ROLE = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__ASSIGNMENTS = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = NcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.cv.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.cv.impl.AssignmentImpl
	 * @see org.nasdanika.cv.impl.CvPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__TITLE = NcorePackage.MODEL_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__DESCRIPTION = NcorePackage.MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__START_DATE = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__END_DATE = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION_COUNT = NcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.cv.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.cv.impl.CommentImpl
	 * @see org.nasdanika.cv.impl.CvPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 4;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__DATE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.cv.CurriculumVitae <em>Curriculum Vitae</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Curriculum Vitae</em>'.
	 * @see org.nasdanika.cv.CurriculumVitae
	 * @generated
	 */
	EClass getCurriculumVitae();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.cv.CurriculumVitae#getExperiences <em>Experiences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Experiences</em>'.
	 * @see org.nasdanika.cv.CurriculumVitae#getExperiences()
	 * @see #getCurriculumVitae()
	 * @generated
	 */
	EReference getCurriculumVitae_Experiences();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.cv.CurriculumVitae#getDirectory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Directory</em>'.
	 * @see org.nasdanika.cv.CurriculumVitae#getDirectory()
	 * @see #getCurriculumVitae()
	 * @generated
	 */
	EReference getCurriculumVitae_Directory();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.cv.Experience <em>Experience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experience</em>'.
	 * @see org.nasdanika.cv.Experience
	 * @generated
	 */
	EClass getExperience();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.cv.Experience#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see org.nasdanika.cv.Experience#getStartDate()
	 * @see #getExperience()
	 * @generated
	 */
	EAttribute getExperience_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.cv.Experience#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see org.nasdanika.cv.Experience#getEndDate()
	 * @see #getExperience()
	 * @generated
	 */
	EAttribute getExperience_EndDate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.cv.Experience#getPositions <em>Positions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Positions</em>'.
	 * @see org.nasdanika.cv.Experience#getPositions()
	 * @see #getExperience()
	 * @generated
	 */
	EReference getExperience_Positions();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.cv.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see org.nasdanika.cv.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.cv.Position#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see org.nasdanika.cv.Position#getStartDate()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.cv.Position#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see org.nasdanika.cv.Position#getEndDate()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_EndDate();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.cv.Position#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see org.nasdanika.cv.Position#getRole()
	 * @see #getPosition()
	 * @generated
	 */
	EReference getPosition_Role();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.cv.Position#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignments</em>'.
	 * @see org.nasdanika.cv.Position#getAssignments()
	 * @see #getPosition()
	 * @generated
	 */
	EReference getPosition_Assignments();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.cv.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see org.nasdanika.cv.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.cv.Assignment#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see org.nasdanika.cv.Assignment#getStartDate()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.cv.Assignment#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see org.nasdanika.cv.Assignment#getEndDate()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_EndDate();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.cv.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see org.nasdanika.cv.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.cv.Comment#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.nasdanika.cv.Comment#getDate()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.cv.Comment#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.cv.Comment#getDescription()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CvFactory getCvFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.cv.impl.CurriculumVitaeImpl <em>Curriculum Vitae</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.cv.impl.CurriculumVitaeImpl
		 * @see org.nasdanika.cv.impl.CvPackageImpl#getCurriculumVitae()
		 * @generated
		 */
		EClass CURRICULUM_VITAE = eINSTANCE.getCurriculumVitae();
		/**
		 * The meta object literal for the '<em><b>Experiences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRICULUM_VITAE__EXPERIENCES = eINSTANCE.getCurriculumVitae_Experiences();
		/**
		 * The meta object literal for the '<em><b>Directory</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRICULUM_VITAE__DIRECTORY = eINSTANCE.getCurriculumVitae_Directory();
		/**
		 * The meta object literal for the '{@link org.nasdanika.cv.impl.ExperienceImpl <em>Experience</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.cv.impl.ExperienceImpl
		 * @see org.nasdanika.cv.impl.CvPackageImpl#getExperience()
		 * @generated
		 */
		EClass EXPERIENCE = eINSTANCE.getExperience();
		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIENCE__START_DATE = eINSTANCE.getExperience_StartDate();
		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIENCE__END_DATE = eINSTANCE.getExperience_EndDate();
		/**
		 * The meta object literal for the '<em><b>Positions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIENCE__POSITIONS = eINSTANCE.getExperience_Positions();
		/**
		 * The meta object literal for the '{@link org.nasdanika.cv.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.cv.impl.PositionImpl
		 * @see org.nasdanika.cv.impl.CvPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();
		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__START_DATE = eINSTANCE.getPosition_StartDate();
		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__END_DATE = eINSTANCE.getPosition_EndDate();
		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION__ROLE = eINSTANCE.getPosition_Role();
		/**
		 * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION__ASSIGNMENTS = eINSTANCE.getPosition_Assignments();
		/**
		 * The meta object literal for the '{@link org.nasdanika.cv.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.cv.impl.AssignmentImpl
		 * @see org.nasdanika.cv.impl.CvPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();
		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__START_DATE = eINSTANCE.getAssignment_StartDate();
		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__END_DATE = eINSTANCE.getAssignment_EndDate();
		/**
		 * The meta object literal for the '{@link org.nasdanika.cv.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.cv.impl.CommentImpl
		 * @see org.nasdanika.cv.impl.CvPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();
		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__DATE = eINSTANCE.getComment_Date();
		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__DESCRIPTION = eINSTANCE.getComment_Description();

	}

} //CvPackage
