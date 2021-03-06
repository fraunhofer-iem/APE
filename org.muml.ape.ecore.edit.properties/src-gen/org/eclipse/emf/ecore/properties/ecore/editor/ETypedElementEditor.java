
package org.eclipse.emf.ecore.properties.ecore.editor;

/**
 * @generated
 */
public abstract class ETypedElementEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ETypedElementEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorEAnnotations_tab_documentationTab_Editor(), false);

			addPropertyEditor(createEditorName_tab_defaultTab_Editor(), false);

			addPropertyEditor(createEditorEType_tab_defaultTab_Editor(), false);

			addSubCategory("org.muml.ape.category.Booleans", "Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("org.muml.ape.category.Booleans", createEditorOrdered_tab_defaultTab_Editor(), false);

			addEditorToCategory("org.muml.ape.category.Booleans", createEditorUnique_tab_defaultTab_Editor(), false);

			addSubCategory("org.muml.ape.category.Cardinality", "Cardinality", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("org.muml.ape.category.Cardinality", createEditorLowerBound_tab_defaultTab_Editor(),
					false);

			addEditorToCategory("org.muml.ape.category.Cardinality", createEditorUpperBound_tab_defaultTab_Editor(),
					false);

		} else if ("tab.default".equals(tab)) { // Tab Default

			addPropertyEditor(createEditorName_tab_defaultTab_Editor(), false);

			addPropertyEditor(createEditorEType_tab_defaultTab_Editor(), false);

			addSubCategory("org.muml.ape.category.Booleans", "Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("org.muml.ape.category.Booleans", createEditorOrdered_tab_defaultTab_Editor(), false);

			addEditorToCategory("org.muml.ape.category.Booleans", createEditorUnique_tab_defaultTab_Editor(), false);

			addSubCategory("org.muml.ape.category.Cardinality", "Cardinality", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("org.muml.ape.category.Cardinality", createEditorLowerBound_tab_defaultTab_Editor(),
					false);

			addEditorToCategory("org.muml.ape.category.Cardinality", createEditorUpperBound_tab_defaultTab_Editor(),
					false);

		} else if ("tab.documentation".equals(tab)) { // Tab Documentation

			addPropertyEditor(createEditorEAnnotations_tab_documentationTab_Editor(), false);

		} else if ("tab.ocl".equals(tab)) { // Tab OCL

		} else if ("tab.filter".equals(tab)) { // Tab Filter

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorOrdered_tab_defaultTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorOrdered_tab_defaultTab_Editor() {
		if (this.editorOrdered_tab_defaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getETypedElement_Ordered();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorOrdered_tab_defaultTab = editor;
		}
		return this.editorOrdered_tab_defaultTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorUnique_tab_defaultTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorUnique_tab_defaultTab_Editor() {
		if (this.editorUnique_tab_defaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getETypedElement_Unique();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorUnique_tab_defaultTab = editor;
		}
		return this.editorUnique_tab_defaultTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorUpperBound_tab_defaultTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorUpperBound_tab_defaultTab_Editor() {
		if (this.editorUpperBound_tab_defaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getETypedElement_UpperBound();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.SpinnerPropertyEditor(
					adapterFactory, feature, 0);

			this.editorUpperBound_tab_defaultTab = editor;
		}
		return this.editorUpperBound_tab_defaultTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorLowerBound_tab_defaultTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorLowerBound_tab_defaultTab_Editor() {
		if (this.editorLowerBound_tab_defaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getETypedElement_LowerBound();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.SpinnerPropertyEditor(
					adapterFactory, feature, 0);

			this.editorLowerBound_tab_defaultTab = editor;
		}
		return this.editorLowerBound_tab_defaultTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEType_tab_defaultTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorEType_tab_defaultTab_Editor() {
		if (this.editorEType_tab_defaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getETypedElement_EType();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorEType_tab_defaultTab = editor;
		}
		return this.editorEType_tab_defaultTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorName_tab_defaultTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorName_tab_defaultTab_Editor() {
		if (this.editorName_tab_defaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getENamedElement_Name();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			this.editorName_tab_defaultTab = editor;
		}
		return this.editorName_tab_defaultTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEAnnotations_tab_documentationTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorEAnnotations_tab_documentationTab_Editor() {
		if (this.editorEAnnotations_tab_documentationTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEModelElement_EAnnotations();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.eclipse.emf.ecore.properties.ecore.editor.DocumentationAnnotationPropertyEditor(
					adapterFactory, feature);

			this.editorEAnnotations_tab_documentationTab = editor;
		}
		return this.editorEAnnotations_tab_documentationTab;
	}

}
