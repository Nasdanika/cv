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
} // CurriculumVitae
