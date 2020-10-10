/**
 */
package org.nasdanika.cv;

import org.nasdanika.ncore.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skill</b></em>'.
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
 *   <li>{@link org.nasdanika.cv.Skill#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.cv.CvPackage#getSkill()
 * @model
 * @generated
 */
public interface Skill extends Entity, SkillCategoryElement {

	/**
	 * Returns the value of the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' reference.
	 * @see #setLevel(SkillLevel)
	 * @see org.nasdanika.cv.CvPackage#getSkill_Level()
	 * @model
	 * @generated
	 */
	SkillLevel getLevel();

	/**
	 * Sets the value of the '{@link org.nasdanika.cv.Skill#getLevel <em>Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' reference.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(SkillLevel value);
} // Skill
