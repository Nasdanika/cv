/**
 */
package org.nasdanika.cv.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.cv.*;

import org.nasdanika.ncore.Entity;
import org.nasdanika.ncore.ModelElement;

import org.nasdanika.party.AbstractOrganizationalUnit;
import org.nasdanika.party.DirectoryElement;
import org.nasdanika.party.Organization;
import org.nasdanika.party.OrganizationalUnit;
import org.nasdanika.party.Party;
import org.nasdanika.party.Person;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.cv.CvPackage
 * @generated
 */
public class CvSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CvPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CvSwitch() {
		if (modelPackage == null) {
			modelPackage = CvPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CvPackage.CURRICULUM_VITAE: {
				CurriculumVitae curriculumVitae = (CurriculumVitae)theEObject;
				T result = caseCurriculumVitae(curriculumVitae);
				if (result == null) result = casePerson(curriculumVitae);
				if (result == null) result = caseParty(curriculumVitae);
				if (result == null) result = caseDirectoryElement(curriculumVitae);
				if (result == null) result = caseEntity(curriculumVitae);
				if (result == null) result = caseModelElement(curriculumVitae);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvPackage.EXPERIENCE: {
				Experience experience = (Experience)theEObject;
				T result = caseExperience(experience);
				if (result == null) result = caseOrganization(experience);
				if (result == null) result = caseOrganizationalUnit(experience);
				if (result == null) result = caseParty(experience);
				if (result == null) result = caseAbstractOrganizationalUnit(experience);
				if (result == null) result = caseDirectoryElement(experience);
				if (result == null) result = caseEntity(experience);
				if (result == null) result = caseModelElement(experience);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvPackage.POSITION: {
				Position position = (Position)theEObject;
				T result = casePosition(position);
				if (result == null) result = caseModelElement(position);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvPackage.ASSIGNMENT: {
				Assignment assignment = (Assignment)theEObject;
				T result = caseAssignment(assignment);
				if (result == null) result = caseModelElement(assignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvPackage.COMMENT: {
				Comment comment = (Comment)theEObject;
				T result = caseComment(comment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvPackage.SKILL_LEVEL: {
				SkillLevel skillLevel = (SkillLevel)theEObject;
				T result = caseSkillLevel(skillLevel);
				if (result == null) result = caseModelElement(skillLevel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvPackage.SKILL_CATEGORY_ELEMENT: {
				SkillCategoryElement skillCategoryElement = (SkillCategoryElement)theEObject;
				T result = caseSkillCategoryElement(skillCategoryElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvPackage.SKILL_CATEGORY: {
				SkillCategory skillCategory = (SkillCategory)theEObject;
				T result = caseSkillCategory(skillCategory);
				if (result == null) result = caseModelElement(skillCategory);
				if (result == null) result = caseSkillCategoryElement(skillCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvPackage.SKILL: {
				Skill skill = (Skill)theEObject;
				T result = caseSkill(skill);
				if (result == null) result = caseEntity(skill);
				if (result == null) result = caseSkillCategoryElement(skill);
				if (result == null) result = caseModelElement(skill);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvPackage.SKILL_RELEASE: {
				SkillRelease skillRelease = (SkillRelease)theEObject;
				T result = caseSkillRelease(skillRelease);
				if (result == null) result = caseSkill(skillRelease);
				if (result == null) result = caseEntity(skillRelease);
				if (result == null) result = caseSkillCategoryElement(skillRelease);
				if (result == null) result = caseModelElement(skillRelease);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvPackage.ACCOMPLISHMENT_TYPE: {
				AccomplishmentType accomplishmentType = (AccomplishmentType)theEObject;
				T result = caseAccomplishmentType(accomplishmentType);
				if (result == null) result = caseModelElement(accomplishmentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvPackage.ACCOMPLISHMENT_CATEGORY_ELEMENT: {
				AccomplishmentCategoryElement accomplishmentCategoryElement = (AccomplishmentCategoryElement)theEObject;
				T result = caseAccomplishmentCategoryElement(accomplishmentCategoryElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvPackage.ACCOMPLISHMENT_CATEGORY: {
				AccomplishmentCategory accomplishmentCategory = (AccomplishmentCategory)theEObject;
				T result = caseAccomplishmentCategory(accomplishmentCategory);
				if (result == null) result = caseModelElement(accomplishmentCategory);
				if (result == null) result = caseAccomplishmentCategoryElement(accomplishmentCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvPackage.ACCOMPLISHMENT: {
				Accomplishment accomplishment = (Accomplishment)theEObject;
				T result = caseAccomplishment(accomplishment);
				if (result == null) result = caseEntity(accomplishment);
				if (result == null) result = caseAccomplishmentCategoryElement(accomplishment);
				if (result == null) result = caseModelElement(accomplishment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvPackage.RESUME: {
				Resume resume = (Resume)theEObject;
				T result = caseResume(resume);
				if (result == null) result = caseEntity(resume);
				if (result == null) result = caseModelElement(resume);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curriculum Vitae</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curriculum Vitae</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurriculumVitae(CurriculumVitae object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experience</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experience</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperience(Experience object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePosition(Position object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignment(Assignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment(Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skill Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skill Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkillLevel(SkillLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skill Category Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skill Category Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkillCategoryElement(SkillCategoryElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skill Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skill Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkillCategory(SkillCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skill</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skill</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkill(Skill object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skill Release</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skill Release</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkillRelease(SkillRelease object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accomplishment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accomplishment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccomplishmentType(AccomplishmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accomplishment Category Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accomplishment Category Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccomplishmentCategoryElement(AccomplishmentCategoryElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accomplishment Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accomplishment Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccomplishmentCategory(AccomplishmentCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accomplishment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accomplishment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccomplishment(Accomplishment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resume</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resume</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResume(Resume object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directory Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directory Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectoryElement(DirectoryElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Party</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Party</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParty(Party object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Organizational Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Organizational Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractOrganizationalUnit(AbstractOrganizationalUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organizational Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organizational Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizationalUnit(OrganizationalUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganization(Organization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CvSwitch
