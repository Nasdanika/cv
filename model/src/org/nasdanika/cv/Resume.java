/**
 */
package org.nasdanika.cv;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.nasdanika.ncore.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Resume is a view/representation of the CV. It may contain all CV elements  or a subset of them. It also defines skill highlights and publishing configuration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.cv.Resume#getElements <em>Elements</em>}</li>
 *   <li>{@link org.nasdanika.cv.Resume#getSkills <em>Skills</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.cv.CvPackage#getResume()
 * @model
 * @generated
 */
public interface Resume extends Entity {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elements to include to the resume.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see org.nasdanika.cv.CvPackage#getResume_Elements()
	 * @model
	 * @generated
	 */
	EList<EObject> getElements();

	/**
	 * Returns the value of the '<em><b>Skills</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.cv.Skill}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Skill highlights.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Skills</em>' reference list.
	 * @see org.nasdanika.cv.CvPackage#getResume_Skills()
	 * @model
	 * @generated
	 */
	EList<Skill> getSkills();

} // Resume
