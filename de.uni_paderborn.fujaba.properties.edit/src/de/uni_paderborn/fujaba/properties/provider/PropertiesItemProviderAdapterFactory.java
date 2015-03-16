/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.properties.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import de.uni_paderborn.fujaba.properties.util.PropertiesAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertiesItemProviderAdapterFactory extends PropertiesAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.properties.PropertyGenerator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyGeneratorItemProvider propertyGeneratorItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.properties.PropertyGenerator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyGeneratorAdapter() {
		if (propertyGeneratorItemProvider == null) {
			propertyGeneratorItemProvider = new PropertyGeneratorItemProvider(this);
		}

		return propertyGeneratorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.properties.Reconciler} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconcilerItemProvider reconcilerItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.properties.Reconciler}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReconcilerAdapter() {
		if (reconcilerItemProvider == null) {
			reconcilerItemProvider = new ReconcilerItemProvider(this);
		}

		return reconcilerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.properties.CustomTransformation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomTransformationItemProvider customTransformationItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.properties.CustomTransformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCustomTransformationAdapter() {
		if (customTransformationItemProvider == null) {
			customTransformationItemProvider = new CustomTransformationItemProvider(this);
		}

		return customTransformationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.properties.Plugin} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PluginItemProvider pluginItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.properties.Plugin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPluginAdapter() {
		if (pluginItemProvider == null) {
			pluginItemProvider = new PluginItemProvider(this);
		}

		return pluginItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.properties.PropertyTab} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyTabItemProvider propertyTabItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.properties.PropertyTab}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyTabAdapter() {
		if (propertyTabItemProvider == null) {
			propertyTabItemProvider = new PropertyTabItemProvider(this);
		}

		return propertyTabItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.properties.Package} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageItemProvider packageItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.properties.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPackageAdapter() {
		if (packageItemProvider == null) {
			packageItemProvider = new PackageItemProvider(this);
		}

		return packageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.properties.Class} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassItemProvider classItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.properties.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassAdapter() {
		if (classItemProvider == null) {
			classItemProvider = new ClassItemProvider(this);
		}

		return classItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.properties.BaseInsertPoint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseInsertPointItemProvider baseInsertPointItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.properties.BaseInsertPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBaseInsertPointAdapter() {
		if (baseInsertPointItemProvider == null) {
			baseInsertPointItemProvider = new BaseInsertPointItemProvider(this);
		}

		return baseInsertPointItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.properties.PropertyCategory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyCategoryItemProvider propertyCategoryItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.properties.PropertyCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyCategoryAdapter() {
		if (propertyCategoryItemProvider == null) {
			propertyCategoryItemProvider = new PropertyCategoryItemProvider(this);
		}

		return propertyCategoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.properties.Property} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyItemProvider propertyItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.properties.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyAdapter() {
		if (propertyItemProvider == null) {
			propertyItemProvider = new PropertyItemProvider(this);
		}

		return propertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.properties.TextPropertyEditor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextPropertyEditorItemProvider textPropertyEditorItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.properties.TextPropertyEditor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextPropertyEditorAdapter() {
		if (textPropertyEditorItemProvider == null) {
			textPropertyEditorItemProvider = new TextPropertyEditorItemProvider(this);
		}

		return textPropertyEditorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.properties.SpinnerPropertyEditor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpinnerPropertyEditorItemProvider spinnerPropertyEditorItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.properties.SpinnerPropertyEditor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSpinnerPropertyEditorAdapter() {
		if (spinnerPropertyEditorItemProvider == null) {
			spinnerPropertyEditorItemProvider = new SpinnerPropertyEditorItemProvider(this);
		}

		return spinnerPropertyEditorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.properties.ComboBoxPropertyEditor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComboBoxPropertyEditorItemProvider comboBoxPropertyEditorItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.properties.ComboBoxPropertyEditor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComboBoxPropertyEditorAdapter() {
		if (comboBoxPropertyEditorItemProvider == null) {
			comboBoxPropertyEditorItemProvider = new ComboBoxPropertyEditorItemProvider(this);
		}

		return comboBoxPropertyEditorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.properties.CheckboxPropertyEditor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckboxPropertyEditorItemProvider checkboxPropertyEditorItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.properties.CheckboxPropertyEditor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCheckboxPropertyEditorAdapter() {
		if (checkboxPropertyEditorItemProvider == null) {
			checkboxPropertyEditorItemProvider = new CheckboxPropertyEditorItemProvider(this);
		}

		return checkboxPropertyEditorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.properties.RadioPropertyEditor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RadioPropertyEditorItemProvider radioPropertyEditorItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.properties.RadioPropertyEditor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRadioPropertyEditorAdapter() {
		if (radioPropertyEditorItemProvider == null) {
			radioPropertyEditorItemProvider = new RadioPropertyEditorItemProvider(this);
		}

		return radioPropertyEditorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.properties.ListPropertyEditor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListPropertyEditorItemProvider listPropertyEditorItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.properties.ListPropertyEditor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createListPropertyEditorAdapter() {
		if (listPropertyEditorItemProvider == null) {
			listPropertyEditorItemProvider = new ListPropertyEditorItemProvider(this);
		}

		return listPropertyEditorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.properties.FlattenedListPropertyEditor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlattenedListPropertyEditorItemProvider flattenedListPropertyEditorItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.properties.FlattenedListPropertyEditor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFlattenedListPropertyEditorAdapter() {
		if (flattenedListPropertyEditorItemProvider == null) {
			flattenedListPropertyEditorItemProvider = new FlattenedListPropertyEditorItemProvider(this);
		}

		return flattenedListPropertyEditorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.properties.ObjectPropertyEditor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectPropertyEditorItemProvider objectPropertyEditorItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.properties.ObjectPropertyEditor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObjectPropertyEditorAdapter() {
		if (objectPropertyEditorItemProvider == null) {
			objectPropertyEditorItemProvider = new ObjectPropertyEditorItemProvider(this);
		}

		return objectPropertyEditorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.properties.OCLPropertyEditor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCLPropertyEditorItemProvider oclPropertyEditorItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.properties.OCLPropertyEditor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOCLPropertyEditorAdapter() {
		if (oclPropertyEditorItemProvider == null) {
			oclPropertyEditorItemProvider = new OCLPropertyEditorItemProvider(this);
		}

		return oclPropertyEditorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.properties.CustomPropertyEditor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomPropertyEditorItemProvider customPropertyEditorItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.properties.CustomPropertyEditor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCustomPropertyEditorAdapter() {
		if (customPropertyEditorItemProvider == null) {
			customPropertyEditorItemProvider = new CustomPropertyEditorItemProvider(this);
		}

		return customPropertyEditorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.properties.OCLFilter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCLFilterItemProvider oclFilterItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.properties.OCLFilter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOCLFilterAdapter() {
		if (oclFilterItemProvider == null) {
			oclFilterItemProvider = new OCLFilterItemProvider(this);
		}

		return oclFilterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.properties.CreationConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreationConstraintItemProvider creationConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.properties.CreationConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCreationConstraintAdapter() {
		if (creationConstraintItemProvider == null) {
			creationConstraintItemProvider = new CreationConstraintItemProvider(this);
		}

		return creationConstraintItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (propertyGeneratorItemProvider != null) propertyGeneratorItemProvider.dispose();
		if (reconcilerItemProvider != null) reconcilerItemProvider.dispose();
		if (customTransformationItemProvider != null) customTransformationItemProvider.dispose();
		if (pluginItemProvider != null) pluginItemProvider.dispose();
		if (propertyTabItemProvider != null) propertyTabItemProvider.dispose();
		if (packageItemProvider != null) packageItemProvider.dispose();
		if (classItemProvider != null) classItemProvider.dispose();
		if (baseInsertPointItemProvider != null) baseInsertPointItemProvider.dispose();
		if (propertyItemProvider != null) propertyItemProvider.dispose();
		if (textPropertyEditorItemProvider != null) textPropertyEditorItemProvider.dispose();
		if (spinnerPropertyEditorItemProvider != null) spinnerPropertyEditorItemProvider.dispose();
		if (comboBoxPropertyEditorItemProvider != null) comboBoxPropertyEditorItemProvider.dispose();
		if (checkboxPropertyEditorItemProvider != null) checkboxPropertyEditorItemProvider.dispose();
		if (radioPropertyEditorItemProvider != null) radioPropertyEditorItemProvider.dispose();
		if (listPropertyEditorItemProvider != null) listPropertyEditorItemProvider.dispose();
		if (flattenedListPropertyEditorItemProvider != null) flattenedListPropertyEditorItemProvider.dispose();
		if (objectPropertyEditorItemProvider != null) objectPropertyEditorItemProvider.dispose();
		if (oclPropertyEditorItemProvider != null) oclPropertyEditorItemProvider.dispose();
		if (customPropertyEditorItemProvider != null) customPropertyEditorItemProvider.dispose();
		if (propertyCategoryItemProvider != null) propertyCategoryItemProvider.dispose();
		if (oclFilterItemProvider != null) oclFilterItemProvider.dispose();
		if (creationConstraintItemProvider != null) creationConstraintItemProvider.dispose();
	}

}
