
package org.muml.ape.properties.ape.editor;

/**
 * @generated
 */
public class SpinnerPropertyEditorEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public SpinnerPropertyEditorEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorDigits_org_muml_ape_tab_generalTab_Editor(), false);

		} else if ("org.muml.ape.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorDigits_org_muml_ape_tab_generalTab_Editor(), false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorDigits_org_muml_ape_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorDigits_org_muml_ape_tab_generalTab_Editor() {
		if (this.editorDigits_org_muml_ape_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.ape.PropertiesPackage.eINSTANCE
					.getSpinnerPropertyEditor_Digits();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.SpinnerPropertyEditor(
					adapterFactory, feature, 0);

			this.editorDigits_org_muml_ape_tab_generalTab = editor;
		}
		return this.editorDigits_org_muml_ape_tab_generalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public SpinnerPropertyEditorEditor(String tab) {
		this(tab, org.muml.ape.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.ape.PropertiesPackage.eINSTANCE.getSpinnerPropertyEditor());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new SpinnerPropertyEditorEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"org.muml.ape.tab.general"}).contains(tab);
		}
	}

}
