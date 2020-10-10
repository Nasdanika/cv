/**
 */
package org.nasdanika.cv;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accomplishment Category Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for model elements which can be contained by skill category - skills and sub-categories.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.cv.AccomplishmentCategoryElement#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.cv.CvPackage#getAccomplishmentCategoryElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AccomplishmentCategoryElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.cv.AccomplishmentCategoryElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Skills in the category or skill specializations. E.g. skill Java may have a sub-skill "Spring"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.nasdanika.cv.CvPackage#getAccomplishmentCategoryElement_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<AccomplishmentCategoryElement> getElements();

} // AccomplishmentCategoryElement