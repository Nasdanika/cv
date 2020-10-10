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
	 * The feature id for the '<em><b>Skill Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRICULUM_VITAE__SKILL_LEVELS = PartyPackage.PERSON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRICULUM_VITAE__SKILLS = PartyPackage.PERSON_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Accomplishments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRICULUM_VITAE__ACCOMPLISHMENTS = PartyPackage.PERSON_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Accomplishment Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRICULUM_VITAE__ACCOMPLISHMENT_TYPES = PartyPackage.PERSON_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Resumes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRICULUM_VITAE__RESUMES = PartyPackage.PERSON_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Curriculum Vitae</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRICULUM_VITAE_FEATURE_COUNT = PartyPackage.PERSON_FEATURE_COUNT + 7;

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
	 * The feature id for the '<em><b>Skills</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__SKILLS = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

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
	 * The feature id for the '<em><b>Skills</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__SKILLS = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

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
	 * The meta object id for the '{@link org.nasdanika.cv.impl.SkillLevelImpl <em>Skill Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.cv.impl.SkillLevelImpl
	 * @see org.nasdanika.cv.impl.CvPackageImpl#getSkillLevel()
	 * @generated
	 */
	int SKILL_LEVEL = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_LEVEL__TITLE = NcorePackage.MODEL_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_LEVEL__DESCRIPTION = NcorePackage.MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Skill Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_LEVEL_FEATURE_COUNT = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Skill Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_LEVEL_OPERATION_COUNT = NcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.cv.SkillCategoryElement <em>Skill Category Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.cv.SkillCategoryElement
	 * @see org.nasdanika.cv.impl.CvPackageImpl#getSkillCategoryElement()
	 * @generated
	 */
	int SKILL_CATEGORY_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_CATEGORY_ELEMENT__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Skill Category Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_CATEGORY_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Skill Category Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_CATEGORY_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.cv.impl.SkillCategoryImpl <em>Skill Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.cv.impl.SkillCategoryImpl
	 * @see org.nasdanika.cv.impl.CvPackageImpl#getSkillCategory()
	 * @generated
	 */
	int SKILL_CATEGORY = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_CATEGORY__TITLE = NcorePackage.MODEL_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_CATEGORY__DESCRIPTION = NcorePackage.MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_CATEGORY__ELEMENTS = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Skill Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_CATEGORY_FEATURE_COUNT = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Skill Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_CATEGORY_OPERATION_COUNT = NcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.cv.impl.SkillImpl <em>Skill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.cv.impl.SkillImpl
	 * @see org.nasdanika.cv.impl.CvPackageImpl#getSkill()
	 * @generated
	 */
	int SKILL = 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__TITLE = NcorePackage.ENTITY__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__DESCRIPTION = NcorePackage.ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__ID = NcorePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__ELEMENTS = NcorePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__LEVEL = NcorePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_FEATURE_COUNT = NcorePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_OPERATION_COUNT = NcorePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.cv.impl.SkillReleaseImpl <em>Skill Release</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.cv.impl.SkillReleaseImpl
	 * @see org.nasdanika.cv.impl.CvPackageImpl#getSkillRelease()
	 * @generated
	 */
	int SKILL_RELEASE = 9;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_RELEASE__TITLE = SKILL__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_RELEASE__DESCRIPTION = SKILL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_RELEASE__ID = SKILL__ID;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_RELEASE__ELEMENTS = SKILL__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_RELEASE__LEVEL = SKILL__LEVEL;

	/**
	 * The number of structural features of the '<em>Skill Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_RELEASE_FEATURE_COUNT = SKILL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Skill Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_RELEASE_OPERATION_COUNT = SKILL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.cv.impl.AccomplishmentTypeImpl <em>Accomplishment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.cv.impl.AccomplishmentTypeImpl
	 * @see org.nasdanika.cv.impl.CvPackageImpl#getAccomplishmentType()
	 * @generated
	 */
	int ACCOMPLISHMENT_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMPLISHMENT_TYPE__TITLE = NcorePackage.MODEL_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMPLISHMENT_TYPE__DESCRIPTION = NcorePackage.MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Accomplishment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMPLISHMENT_TYPE_FEATURE_COUNT = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Accomplishment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMPLISHMENT_TYPE_OPERATION_COUNT = NcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.cv.AccomplishmentCategoryElement <em>Accomplishment Category Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.cv.AccomplishmentCategoryElement
	 * @see org.nasdanika.cv.impl.CvPackageImpl#getAccomplishmentCategoryElement()
	 * @generated
	 */
	int ACCOMPLISHMENT_CATEGORY_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMPLISHMENT_CATEGORY_ELEMENT__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Accomplishment Category Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMPLISHMENT_CATEGORY_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Accomplishment Category Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMPLISHMENT_CATEGORY_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.cv.impl.AccomplishmentCategoryImpl <em>Accomplishment Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.cv.impl.AccomplishmentCategoryImpl
	 * @see org.nasdanika.cv.impl.CvPackageImpl#getAccomplishmentCategory()
	 * @generated
	 */
	int ACCOMPLISHMENT_CATEGORY = 12;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMPLISHMENT_CATEGORY__TITLE = NcorePackage.MODEL_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMPLISHMENT_CATEGORY__DESCRIPTION = NcorePackage.MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMPLISHMENT_CATEGORY__ELEMENTS = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Accomplishment Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMPLISHMENT_CATEGORY_FEATURE_COUNT = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Accomplishment Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMPLISHMENT_CATEGORY_OPERATION_COUNT = NcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.cv.impl.AccomplishmentImpl <em>Accomplishment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.cv.impl.AccomplishmentImpl
	 * @see org.nasdanika.cv.impl.CvPackageImpl#getAccomplishment()
	 * @generated
	 */
	int ACCOMPLISHMENT = 13;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMPLISHMENT__TITLE = NcorePackage.ENTITY__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMPLISHMENT__DESCRIPTION = NcorePackage.ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMPLISHMENT__ID = NcorePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMPLISHMENT__ELEMENTS = NcorePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMPLISHMENT__TYPE = NcorePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Authority</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMPLISHMENT__AUTHORITY = NcorePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMPLISHMENT__SKILLS = NcorePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Accomplishment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMPLISHMENT__ACCOMPLISHMENT_ID = NcorePackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMPLISHMENT__URL = NcorePackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMPLISHMENT__DATE = NcorePackage.ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMPLISHMENT__START_DATE = NcorePackage.ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Expires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMPLISHMENT__EXPIRES = NcorePackage.ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Accomplishment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMPLISHMENT_FEATURE_COUNT = NcorePackage.ENTITY_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Accomplishment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMPLISHMENT_OPERATION_COUNT = NcorePackage.ENTITY_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.cv.impl.ResumeImpl <em>Resume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.cv.impl.ResumeImpl
	 * @see org.nasdanika.cv.impl.CvPackageImpl#getResume()
	 * @generated
	 */
	int RESUME = 14;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__TITLE = NcorePackage.ENTITY__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__DESCRIPTION = NcorePackage.ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__ID = NcorePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__ELEMENTS = NcorePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__SKILLS = NcorePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME_FEATURE_COUNT = NcorePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Resume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME_OPERATION_COUNT = NcorePackage.ENTITY_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.cv.CurriculumVitae#getSkillLevels <em>Skill Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Skill Levels</em>'.
	 * @see org.nasdanika.cv.CurriculumVitae#getSkillLevels()
	 * @see #getCurriculumVitae()
	 * @generated
	 */
	EReference getCurriculumVitae_SkillLevels();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.cv.CurriculumVitae#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Skills</em>'.
	 * @see org.nasdanika.cv.CurriculumVitae#getSkills()
	 * @see #getCurriculumVitae()
	 * @generated
	 */
	EReference getCurriculumVitae_Skills();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.cv.CurriculumVitae#getAccomplishments <em>Accomplishments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accomplishments</em>'.
	 * @see org.nasdanika.cv.CurriculumVitae#getAccomplishments()
	 * @see #getCurriculumVitae()
	 * @generated
	 */
	EReference getCurriculumVitae_Accomplishments();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.cv.CurriculumVitae#getAccomplishmentTypes <em>Accomplishment Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accomplishment Types</em>'.
	 * @see org.nasdanika.cv.CurriculumVitae#getAccomplishmentTypes()
	 * @see #getCurriculumVitae()
	 * @generated
	 */
	EReference getCurriculumVitae_AccomplishmentTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.cv.CurriculumVitae#getResumes <em>Resumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resumes</em>'.
	 * @see org.nasdanika.cv.CurriculumVitae#getResumes()
	 * @see #getCurriculumVitae()
	 * @generated
	 */
	EReference getCurriculumVitae_Resumes();

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
	 * Returns the meta object for the reference list '{@link org.nasdanika.cv.Position#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Skills</em>'.
	 * @see org.nasdanika.cv.Position#getSkills()
	 * @see #getPosition()
	 * @generated
	 */
	EReference getPosition_Skills();

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
	 * Returns the meta object for the reference list '{@link org.nasdanika.cv.Assignment#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Skills</em>'.
	 * @see org.nasdanika.cv.Assignment#getSkills()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Skills();

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
	 * Returns the meta object for class '{@link org.nasdanika.cv.SkillLevel <em>Skill Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skill Level</em>'.
	 * @see org.nasdanika.cv.SkillLevel
	 * @generated
	 */
	EClass getSkillLevel();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.cv.SkillCategoryElement <em>Skill Category Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skill Category Element</em>'.
	 * @see org.nasdanika.cv.SkillCategoryElement
	 * @generated
	 */
	EClass getSkillCategoryElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.cv.SkillCategoryElement#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.nasdanika.cv.SkillCategoryElement#getElements()
	 * @see #getSkillCategoryElement()
	 * @generated
	 */
	EReference getSkillCategoryElement_Elements();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.cv.SkillCategory <em>Skill Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skill Category</em>'.
	 * @see org.nasdanika.cv.SkillCategory
	 * @generated
	 */
	EClass getSkillCategory();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.cv.Skill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skill</em>'.
	 * @see org.nasdanika.cv.Skill
	 * @generated
	 */
	EClass getSkill();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.cv.Skill#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level</em>'.
	 * @see org.nasdanika.cv.Skill#getLevel()
	 * @see #getSkill()
	 * @generated
	 */
	EReference getSkill_Level();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.cv.SkillRelease <em>Skill Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skill Release</em>'.
	 * @see org.nasdanika.cv.SkillRelease
	 * @generated
	 */
	EClass getSkillRelease();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.cv.AccomplishmentType <em>Accomplishment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accomplishment Type</em>'.
	 * @see org.nasdanika.cv.AccomplishmentType
	 * @generated
	 */
	EClass getAccomplishmentType();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.cv.AccomplishmentCategoryElement <em>Accomplishment Category Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accomplishment Category Element</em>'.
	 * @see org.nasdanika.cv.AccomplishmentCategoryElement
	 * @generated
	 */
	EClass getAccomplishmentCategoryElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.cv.AccomplishmentCategoryElement#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.nasdanika.cv.AccomplishmentCategoryElement#getElements()
	 * @see #getAccomplishmentCategoryElement()
	 * @generated
	 */
	EReference getAccomplishmentCategoryElement_Elements();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.cv.AccomplishmentCategory <em>Accomplishment Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accomplishment Category</em>'.
	 * @see org.nasdanika.cv.AccomplishmentCategory
	 * @generated
	 */
	EClass getAccomplishmentCategory();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.cv.Accomplishment <em>Accomplishment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accomplishment</em>'.
	 * @see org.nasdanika.cv.Accomplishment
	 * @generated
	 */
	EClass getAccomplishment();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.cv.Accomplishment#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.nasdanika.cv.Accomplishment#getType()
	 * @see #getAccomplishment()
	 * @generated
	 */
	EReference getAccomplishment_Type();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.cv.Accomplishment#getAuthority <em>Authority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Authority</em>'.
	 * @see org.nasdanika.cv.Accomplishment#getAuthority()
	 * @see #getAccomplishment()
	 * @generated
	 */
	EReference getAccomplishment_Authority();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.cv.Accomplishment#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Skills</em>'.
	 * @see org.nasdanika.cv.Accomplishment#getSkills()
	 * @see #getAccomplishment()
	 * @generated
	 */
	EReference getAccomplishment_Skills();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.cv.Accomplishment#getAccomplishmentId <em>Accomplishment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accomplishment Id</em>'.
	 * @see org.nasdanika.cv.Accomplishment#getAccomplishmentId()
	 * @see #getAccomplishment()
	 * @generated
	 */
	EAttribute getAccomplishment_AccomplishmentId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.cv.Accomplishment#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.nasdanika.cv.Accomplishment#getUrl()
	 * @see #getAccomplishment()
	 * @generated
	 */
	EAttribute getAccomplishment_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.cv.Accomplishment#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.nasdanika.cv.Accomplishment#getDate()
	 * @see #getAccomplishment()
	 * @generated
	 */
	EAttribute getAccomplishment_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.cv.Accomplishment#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see org.nasdanika.cv.Accomplishment#getStartDate()
	 * @see #getAccomplishment()
	 * @generated
	 */
	EAttribute getAccomplishment_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.cv.Accomplishment#getExpires <em>Expires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expires</em>'.
	 * @see org.nasdanika.cv.Accomplishment#getExpires()
	 * @see #getAccomplishment()
	 * @generated
	 */
	EAttribute getAccomplishment_Expires();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.cv.Resume <em>Resume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resume</em>'.
	 * @see org.nasdanika.cv.Resume
	 * @generated
	 */
	EClass getResume();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.cv.Resume#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see org.nasdanika.cv.Resume#getElements()
	 * @see #getResume()
	 * @generated
	 */
	EReference getResume_Elements();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.cv.Resume#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Skills</em>'.
	 * @see org.nasdanika.cv.Resume#getSkills()
	 * @see #getResume()
	 * @generated
	 */
	EReference getResume_Skills();

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
		 * The meta object literal for the '<em><b>Skill Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRICULUM_VITAE__SKILL_LEVELS = eINSTANCE.getCurriculumVitae_SkillLevels();
		/**
		 * The meta object literal for the '<em><b>Skills</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRICULUM_VITAE__SKILLS = eINSTANCE.getCurriculumVitae_Skills();
		/**
		 * The meta object literal for the '<em><b>Accomplishments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRICULUM_VITAE__ACCOMPLISHMENTS = eINSTANCE.getCurriculumVitae_Accomplishments();
		/**
		 * The meta object literal for the '<em><b>Accomplishment Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRICULUM_VITAE__ACCOMPLISHMENT_TYPES = eINSTANCE.getCurriculumVitae_AccomplishmentTypes();
		/**
		 * The meta object literal for the '<em><b>Resumes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRICULUM_VITAE__RESUMES = eINSTANCE.getCurriculumVitae_Resumes();
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
		 * The meta object literal for the '<em><b>Skills</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION__SKILLS = eINSTANCE.getPosition_Skills();
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
		 * The meta object literal for the '<em><b>Skills</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__SKILLS = eINSTANCE.getAssignment_Skills();
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
		/**
		 * The meta object literal for the '{@link org.nasdanika.cv.impl.SkillLevelImpl <em>Skill Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.cv.impl.SkillLevelImpl
		 * @see org.nasdanika.cv.impl.CvPackageImpl#getSkillLevel()
		 * @generated
		 */
		EClass SKILL_LEVEL = eINSTANCE.getSkillLevel();
		/**
		 * The meta object literal for the '{@link org.nasdanika.cv.SkillCategoryElement <em>Skill Category Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.cv.SkillCategoryElement
		 * @see org.nasdanika.cv.impl.CvPackageImpl#getSkillCategoryElement()
		 * @generated
		 */
		EClass SKILL_CATEGORY_ELEMENT = eINSTANCE.getSkillCategoryElement();
		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKILL_CATEGORY_ELEMENT__ELEMENTS = eINSTANCE.getSkillCategoryElement_Elements();
		/**
		 * The meta object literal for the '{@link org.nasdanika.cv.impl.SkillCategoryImpl <em>Skill Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.cv.impl.SkillCategoryImpl
		 * @see org.nasdanika.cv.impl.CvPackageImpl#getSkillCategory()
		 * @generated
		 */
		EClass SKILL_CATEGORY = eINSTANCE.getSkillCategory();
		/**
		 * The meta object literal for the '{@link org.nasdanika.cv.impl.SkillImpl <em>Skill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.cv.impl.SkillImpl
		 * @see org.nasdanika.cv.impl.CvPackageImpl#getSkill()
		 * @generated
		 */
		EClass SKILL = eINSTANCE.getSkill();
		/**
		 * The meta object literal for the '<em><b>Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKILL__LEVEL = eINSTANCE.getSkill_Level();
		/**
		 * The meta object literal for the '{@link org.nasdanika.cv.impl.SkillReleaseImpl <em>Skill Release</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.cv.impl.SkillReleaseImpl
		 * @see org.nasdanika.cv.impl.CvPackageImpl#getSkillRelease()
		 * @generated
		 */
		EClass SKILL_RELEASE = eINSTANCE.getSkillRelease();
		/**
		 * The meta object literal for the '{@link org.nasdanika.cv.impl.AccomplishmentTypeImpl <em>Accomplishment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.cv.impl.AccomplishmentTypeImpl
		 * @see org.nasdanika.cv.impl.CvPackageImpl#getAccomplishmentType()
		 * @generated
		 */
		EClass ACCOMPLISHMENT_TYPE = eINSTANCE.getAccomplishmentType();
		/**
		 * The meta object literal for the '{@link org.nasdanika.cv.AccomplishmentCategoryElement <em>Accomplishment Category Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.cv.AccomplishmentCategoryElement
		 * @see org.nasdanika.cv.impl.CvPackageImpl#getAccomplishmentCategoryElement()
		 * @generated
		 */
		EClass ACCOMPLISHMENT_CATEGORY_ELEMENT = eINSTANCE.getAccomplishmentCategoryElement();
		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOMPLISHMENT_CATEGORY_ELEMENT__ELEMENTS = eINSTANCE.getAccomplishmentCategoryElement_Elements();
		/**
		 * The meta object literal for the '{@link org.nasdanika.cv.impl.AccomplishmentCategoryImpl <em>Accomplishment Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.cv.impl.AccomplishmentCategoryImpl
		 * @see org.nasdanika.cv.impl.CvPackageImpl#getAccomplishmentCategory()
		 * @generated
		 */
		EClass ACCOMPLISHMENT_CATEGORY = eINSTANCE.getAccomplishmentCategory();
		/**
		 * The meta object literal for the '{@link org.nasdanika.cv.impl.AccomplishmentImpl <em>Accomplishment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.cv.impl.AccomplishmentImpl
		 * @see org.nasdanika.cv.impl.CvPackageImpl#getAccomplishment()
		 * @generated
		 */
		EClass ACCOMPLISHMENT = eINSTANCE.getAccomplishment();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOMPLISHMENT__TYPE = eINSTANCE.getAccomplishment_Type();
		/**
		 * The meta object literal for the '<em><b>Authority</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOMPLISHMENT__AUTHORITY = eINSTANCE.getAccomplishment_Authority();
		/**
		 * The meta object literal for the '<em><b>Skills</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOMPLISHMENT__SKILLS = eINSTANCE.getAccomplishment_Skills();
		/**
		 * The meta object literal for the '<em><b>Accomplishment Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOMPLISHMENT__ACCOMPLISHMENT_ID = eINSTANCE.getAccomplishment_AccomplishmentId();
		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOMPLISHMENT__URL = eINSTANCE.getAccomplishment_Url();
		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOMPLISHMENT__DATE = eINSTANCE.getAccomplishment_Date();
		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOMPLISHMENT__START_DATE = eINSTANCE.getAccomplishment_StartDate();
		/**
		 * The meta object literal for the '<em><b>Expires</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOMPLISHMENT__EXPIRES = eINSTANCE.getAccomplishment_Expires();
		/**
		 * The meta object literal for the '{@link org.nasdanika.cv.impl.ResumeImpl <em>Resume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.cv.impl.ResumeImpl
		 * @see org.nasdanika.cv.impl.CvPackageImpl#getResume()
		 * @generated
		 */
		EClass RESUME = eINSTANCE.getResume();
		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESUME__ELEMENTS = eINSTANCE.getResume_Elements();
		/**
		 * The meta object literal for the '<em><b>Skills</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESUME__SKILLS = eINSTANCE.getResume_Skills();

	}

} //CvPackage
