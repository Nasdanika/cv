/**
 */
package org.nasdanika.cv;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.ncore.Entity;

import org.nasdanika.party.Party;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accomplishment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Personas have needs which may be satisfied by organization offerings. Needs can be organized into a hierarchy and assigned weights either manually or using decision analysis techniques. Needs may be satisfied by offerings via scenarios explaining how a need is satisfied.
 * 
 * Must have, need to have, delighter - here or at the offering level?
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.cv.Accomplishment#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.cv.Accomplishment#getAuthority <em>Authority</em>}</li>
 *   <li>{@link org.nasdanika.cv.Accomplishment#getSkills <em>Skills</em>}</li>
 *   <li>{@link org.nasdanika.cv.Accomplishment#getAccomplishmentId <em>Accomplishment Id</em>}</li>
 *   <li>{@link org.nasdanika.cv.Accomplishment#getUrl <em>Url</em>}</li>
 *   <li>{@link org.nasdanika.cv.Accomplishment#getDate <em>Date</em>}</li>
 *   <li>{@link org.nasdanika.cv.Accomplishment#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.nasdanika.cv.Accomplishment#getExpires <em>Expires</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.cv.CvPackage#getAccomplishment()
 * @model
 * @generated
 */
public interface Accomplishment extends Entity, AccomplishmentCategoryElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Accomplishment type. E.g. education, certification, training, book.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(AccomplishmentType)
	 * @see org.nasdanika.cv.CvPackage#getAccomplishment_Type()
	 * @model
	 * @generated
	 */
	AccomplishmentType getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.cv.Accomplishment#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(AccomplishmentType value);

	/**
	 * Returns the value of the '<em><b>Authority</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authority</em>' reference.
	 * @see #setAuthority(Party)
	 * @see org.nasdanika.cv.CvPackage#getAccomplishment_Authority()
	 * @model
	 * @generated
	 */
	Party getAuthority();

	/**
	 * Sets the value of the '{@link org.nasdanika.cv.Accomplishment#getAuthority <em>Authority</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authority</em>' reference.
	 * @see #getAuthority()
	 * @generated
	 */
	void setAuthority(Party value);

	/**
	 * Returns the value of the '<em><b>Skills</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.cv.Skill}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Skills associated with this accomplishment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Skills</em>' reference list.
	 * @see org.nasdanika.cv.CvPackage#getAccomplishment_Skills()
	 * @model
	 * @generated
	 */
	EList<Skill> getSkills();

	/**
	 * Returns the value of the '<em><b>Accomplishment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Accomplishment ID which can be used for verification, e.g. certificate number or ISBN number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accomplishment Id</em>' attribute.
	 * @see #setAccomplishmentId(String)
	 * @see org.nasdanika.cv.CvPackage#getAccomplishment_AccomplishmentId()
	 * @model
	 * @generated
	 */
	String getAccomplishmentId();

	/**
	 * Sets the value of the '{@link org.nasdanika.cv.Accomplishment#getAccomplishmentId <em>Accomplishment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accomplishment Id</em>' attribute.
	 * @see #getAccomplishmentId()
	 * @generated
	 */
	void setAccomplishmentId(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Accomplishment URL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.nasdanika.cv.CvPackage#getAccomplishment_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.cv.Accomplishment#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date of accomplishment, e.g. date of graduation or certification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see org.nasdanika.cv.CvPackage#getAccomplishment_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.cv.Accomplishment#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional start date of an accomplishment, e.g. start of training.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see org.nasdanika.cv.CvPackage#getAccomplishment_StartDate()
	 * @model
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.cv.Accomplishment#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Expires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional accomplishment expiration date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expires</em>' attribute.
	 * @see #setExpires(Date)
	 * @see org.nasdanika.cv.CvPackage#getAccomplishment_Expires()
	 * @model
	 * @generated
	 */
	Date getExpires();

	/**
	 * Sets the value of the '{@link org.nasdanika.cv.Accomplishment#getExpires <em>Expires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expires</em>' attribute.
	 * @see #getExpires()
	 * @generated
	 */
	void setExpires(Date value);

} // Accomplishment
