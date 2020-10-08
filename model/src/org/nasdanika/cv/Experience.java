/**
 */
package org.nasdanika.cv;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.party.Organization;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experience</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Work experience, for example employment. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.cv.Experience#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.nasdanika.cv.Experience#getEndDate <em>End Date</em>}</li>
 *   <li>{@link org.nasdanika.cv.Experience#getPositions <em>Positions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.cv.CvPackage#getExperience()
 * @model
 * @generated
 */
public interface Experience extends Organization {
	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see org.nasdanika.cv.CvPackage#getExperience_StartDate()
	 * @model
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.cv.Experience#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * End date. Blank means present.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see org.nasdanika.cv.CvPackage#getExperience_EndDate()
	 * @model
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.cv.Experience#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Positions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.cv.Position}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positions</em>' containment reference list.
	 * @see org.nasdanika.cv.CvPackage#getExperience_Positions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Position> getPositions();

} // Experience
