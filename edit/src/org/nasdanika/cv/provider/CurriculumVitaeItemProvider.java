/**
 */
package org.nasdanika.cv.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.nasdanika.cv.CurriculumVitae;
import org.nasdanika.cv.CvFactory;
import org.nasdanika.cv.CvPackage;
import org.nasdanika.emf.edit.EReferenceItemProvider;
import org.nasdanika.party.PartyFactory;
import org.nasdanika.party.provider.PersonItemProvider;

/**
 * This is the item provider adapter for a {@link org.nasdanika.cv.CurriculumVitae} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CurriculumVitaeItemProvider extends PersonItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurriculumVitaeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}
	
	/**
	 * Called from getChildren(), adds EReferenceItemProvider children.
	 * @param children
	 */
	protected void addEReferenceItemProviderChildren(Object object, Collection<EReferenceItemProvider> children) {
		super.addEReferenceItemProviderChildren(object, children);
		children.add(new EReferenceItemProvider(this, (EObject) object, CvPackage.Literals.CURRICULUM_VITAE__EXPERIENCES));		
		children.add(new EReferenceItemProvider(this, (EObject) object, CvPackage.Literals.CURRICULUM_VITAE__DIRECTORY));		
		children.add(new EReferenceItemProvider(this, (EObject) object, CvPackage.Literals.CURRICULUM_VITAE__SKILL_LEVELS));		
		children.add(new EReferenceItemProvider(this, (EObject) object, CvPackage.Literals.CURRICULUM_VITAE__SKILLS));		
		children.add(new EReferenceItemProvider(this, (EObject) object, CvPackage.Literals.CURRICULUM_VITAE__ACCOMPLISHMENTS));		
		children.add(new EReferenceItemProvider(this, (EObject) object, CvPackage.Literals.CURRICULUM_VITAE__ACCOMPLISHMENT_TYPES));		
		children.add(new EReferenceItemProvider(this, (EObject) object, CvPackage.Literals.CURRICULUM_VITAE__RESUMES));		
	}	

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
//			childrenFeatures.add(CvPackage.Literals.CURRICULUM_VITAE__EXPERIENCES);
//			childrenFeatures.add(CvPackage.Literals.CURRICULUM_VITAE__DIRECTORY);
//			childrenFeatures.add(CvPackage.Literals.CURRICULUM_VITAE__SKILL_LEVELS);
//			childrenFeatures.add(CvPackage.Literals.CURRICULUM_VITAE__SKILLS);
//			childrenFeatures.add(CvPackage.Literals.CURRICULUM_VITAE__ACCOMPLISHMENTS);
//			childrenFeatures.add(CvPackage.Literals.CURRICULUM_VITAE__ACCOMPLISHMENT_TYPES);
//			childrenFeatures.add(CvPackage.Literals.CURRICULUM_VITAE__AUTHORITIES);
//			childrenFeatures.add(CvPackage.Literals.CURRICULUM_VITAE__RESUMES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns CurriculumVitae.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CurriculumVitae.png"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((CurriculumVitae)object).getTitle();
		return label == null || label.length() == 0 ? getString("_UI_CurriculumVitae_type") : label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(CurriculumVitae.class)) {
			case CvPackage.CURRICULUM_VITAE__EXPERIENCES:
			case CvPackage.CURRICULUM_VITAE__DIRECTORY:
			case CvPackage.CURRICULUM_VITAE__SKILL_LEVELS:
			case CvPackage.CURRICULUM_VITAE__SKILLS:
			case CvPackage.CURRICULUM_VITAE__ACCOMPLISHMENTS:
			case CvPackage.CURRICULUM_VITAE__ACCOMPLISHMENT_TYPES:
			case CvPackage.CURRICULUM_VITAE__RESUMES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(CvPackage.Literals.CURRICULUM_VITAE__EXPERIENCES,
				 CvFactory.eINSTANCE.createExperience()));

		newChildDescriptors.add
			(createChildParameter
				(CvPackage.Literals.CURRICULUM_VITAE__DIRECTORY,
				 CvFactory.eINSTANCE.createCurriculumVitae()));

		newChildDescriptors.add
			(createChildParameter
				(CvPackage.Literals.CURRICULUM_VITAE__DIRECTORY,
				 CvFactory.eINSTANCE.createExperience()));

		newChildDescriptors.add
			(createChildParameter
				(CvPackage.Literals.CURRICULUM_VITAE__DIRECTORY,
				 PartyFactory.eINSTANCE.createDirectory()));

		newChildDescriptors.add
			(createChildParameter
				(CvPackage.Literals.CURRICULUM_VITAE__DIRECTORY,
				 PartyFactory.eINSTANCE.createOrganizationalUnit()));

		newChildDescriptors.add
			(createChildParameter
				(CvPackage.Literals.CURRICULUM_VITAE__DIRECTORY,
				 PartyFactory.eINSTANCE.createOrganization()));

		newChildDescriptors.add
			(createChildParameter
				(CvPackage.Literals.CURRICULUM_VITAE__DIRECTORY,
				 PartyFactory.eINSTANCE.createPerson()));

		newChildDescriptors.add
			(createChildParameter
				(CvPackage.Literals.CURRICULUM_VITAE__SKILL_LEVELS,
				 CvFactory.eINSTANCE.createSkillLevel()));

		newChildDescriptors.add
			(createChildParameter
				(CvPackage.Literals.CURRICULUM_VITAE__SKILLS,
				 CvFactory.eINSTANCE.createSkillCategory()));

		newChildDescriptors.add
			(createChildParameter
				(CvPackage.Literals.CURRICULUM_VITAE__SKILLS,
				 CvFactory.eINSTANCE.createSkill()));

		newChildDescriptors.add
			(createChildParameter
				(CvPackage.Literals.CURRICULUM_VITAE__SKILLS,
				 CvFactory.eINSTANCE.createSkillRelease()));

		newChildDescriptors.add
			(createChildParameter
				(CvPackage.Literals.CURRICULUM_VITAE__ACCOMPLISHMENTS,
				 CvFactory.eINSTANCE.createAccomplishmentCategory()));

		newChildDescriptors.add
			(createChildParameter
				(CvPackage.Literals.CURRICULUM_VITAE__ACCOMPLISHMENTS,
				 CvFactory.eINSTANCE.createAccomplishment()));

		newChildDescriptors.add
			(createChildParameter
				(CvPackage.Literals.CURRICULUM_VITAE__ACCOMPLISHMENT_TYPES,
				 CvFactory.eINSTANCE.createAccomplishmentType()));

		newChildDescriptors.add
			(createChildParameter
				(CvPackage.Literals.CURRICULUM_VITAE__RESUMES,
				 CvFactory.eINSTANCE.createResume()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == CvPackage.Literals.CURRICULUM_VITAE__EXPERIENCES ||
			childFeature == CvPackage.Literals.CURRICULUM_VITAE__DIRECTORY;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CvEditPlugin.INSTANCE;
	}

}
