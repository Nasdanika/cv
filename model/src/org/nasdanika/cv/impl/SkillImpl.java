/**
 */
package org.nasdanika.cv.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.cv.CvPackage;
import org.nasdanika.cv.Skill;
import org.nasdanika.cv.SkillCategoryElement;

import org.nasdanika.cv.SkillLevel;
import org.nasdanika.ncore.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.cv.impl.SkillImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.nasdanika.cv.impl.SkillImpl#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkillImpl extends EntityImpl implements Skill {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SkillImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CvPackage.Literals.SKILL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<SkillCategoryElement> getElements() {
		return (EList<SkillCategoryElement>)eDynamicGet(CvPackage.SKILL__ELEMENTS, CvPackage.Literals.SKILL_CATEGORY_ELEMENT__ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkillLevel getLevel() {
		return (SkillLevel)eDynamicGet(CvPackage.SKILL__LEVEL, CvPackage.Literals.SKILL__LEVEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkillLevel basicGetLevel() {
		return (SkillLevel)eDynamicGet(CvPackage.SKILL__LEVEL, CvPackage.Literals.SKILL__LEVEL, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevel(SkillLevel newLevel) {
		eDynamicSet(CvPackage.SKILL__LEVEL, CvPackage.Literals.SKILL__LEVEL, newLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CvPackage.SKILL__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CvPackage.SKILL__ELEMENTS:
				return getElements();
			case CvPackage.SKILL__LEVEL:
				if (resolve) return getLevel();
				return basicGetLevel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CvPackage.SKILL__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends SkillCategoryElement>)newValue);
				return;
			case CvPackage.SKILL__LEVEL:
				setLevel((SkillLevel)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CvPackage.SKILL__ELEMENTS:
				getElements().clear();
				return;
			case CvPackage.SKILL__LEVEL:
				setLevel((SkillLevel)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CvPackage.SKILL__ELEMENTS:
				return !getElements().isEmpty();
			case CvPackage.SKILL__LEVEL:
				return basicGetLevel() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SkillCategoryElement.class) {
			switch (derivedFeatureID) {
				case CvPackage.SKILL__ELEMENTS: return CvPackage.SKILL_CATEGORY_ELEMENT__ELEMENTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SkillCategoryElement.class) {
			switch (baseFeatureID) {
				case CvPackage.SKILL_CATEGORY_ELEMENT__ELEMENTS: return CvPackage.SKILL__ELEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SkillImpl
