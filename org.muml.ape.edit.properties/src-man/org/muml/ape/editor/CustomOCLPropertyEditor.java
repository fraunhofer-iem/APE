package org.muml.ape.editor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.ape.runtime.editors.OCLPropertyEditor;

public class CustomOCLPropertyEditor extends OCLPropertyEditor {

	public CustomOCLPropertyEditor(AdapterFactory adapterFactory,
			EStructuralFeature feature) {
		super(adapterFactory, feature);
	}

	// Find Class object by running up the containment hierarchy and use it as context element
	protected void updateContext() {
		EObject object = element;
		
		while (object != null && false == object instanceof org.muml.ape.Class) {
			object = object.eContainer();
		}
		if (object != null) {
			org.muml.ape.Class clazz = (org.muml.ape.Class) object;
			updateContext(clazz.getGenClass().getEcoreClassifier());
		}
	}

}
