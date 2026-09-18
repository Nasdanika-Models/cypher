/**
 */
package org.nasdanika.models.cypher.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.cypher.CypherPackage;
import org.nasdanika.models.cypher.PathSelector;
import org.nasdanika.models.cypher.PatternElement;
import org.nasdanika.models.cypher.PatternPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.impl.PatternPartImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.PatternPartImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.PatternPartImpl#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternPartImpl extends CypherElementImpl implements PatternPart {
	/**
	 * The default value of the '{@link #getVariable() <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSelector() <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelector()
	 * @generated
	 * @ordered
	 */
	protected static final PathSelector SELECTOR_EDEFAULT = PathSelector.NONE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CypherPackage.Literals.PATTERN_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariable() {
		return (String)eDynamicGet(CypherPackage.PATTERN_PART__VARIABLE, CypherPackage.Literals.PATTERN_PART__VARIABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(String newVariable) {
		eDynamicSet(CypherPackage.PATTERN_PART__VARIABLE, CypherPackage.Literals.PATTERN_PART__VARIABLE, newVariable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathSelector getSelector() {
		return (PathSelector)eDynamicGet(CypherPackage.PATTERN_PART__SELECTOR, CypherPackage.Literals.PATTERN_PART__SELECTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelector(PathSelector newSelector) {
		eDynamicSet(CypherPackage.PATTERN_PART__SELECTOR, CypherPackage.Literals.PATTERN_PART__SELECTOR, newSelector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternElement getElement() {
		return (PatternElement)eDynamicGet(CypherPackage.PATTERN_PART__ELEMENT, CypherPackage.Literals.PATTERN_PART__ELEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(PatternElement newElement, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newElement, CypherPackage.PATTERN_PART__ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(PatternElement newElement) {
		eDynamicSet(CypherPackage.PATTERN_PART__ELEMENT, CypherPackage.Literals.PATTERN_PART__ELEMENT, newElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CypherPackage.PATTERN_PART__ELEMENT:
				return basicSetElement(null, msgs);
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
			case CypherPackage.PATTERN_PART__VARIABLE:
				return getVariable();
			case CypherPackage.PATTERN_PART__SELECTOR:
				return getSelector();
			case CypherPackage.PATTERN_PART__ELEMENT:
				return getElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CypherPackage.PATTERN_PART__VARIABLE:
				setVariable((String)newValue);
				return;
			case CypherPackage.PATTERN_PART__SELECTOR:
				setSelector((PathSelector)newValue);
				return;
			case CypherPackage.PATTERN_PART__ELEMENT:
				setElement((PatternElement)newValue);
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
			case CypherPackage.PATTERN_PART__VARIABLE:
				setVariable(VARIABLE_EDEFAULT);
				return;
			case CypherPackage.PATTERN_PART__SELECTOR:
				setSelector(SELECTOR_EDEFAULT);
				return;
			case CypherPackage.PATTERN_PART__ELEMENT:
				setElement((PatternElement)null);
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
			case CypherPackage.PATTERN_PART__VARIABLE:
				return VARIABLE_EDEFAULT == null ? getVariable() != null : !VARIABLE_EDEFAULT.equals(getVariable());
			case CypherPackage.PATTERN_PART__SELECTOR:
				return getSelector() != SELECTOR_EDEFAULT;
			case CypherPackage.PATTERN_PART__ELEMENT:
				return getElement() != null;
		}
		return super.eIsSet(featureID);
	}

} //PatternPartImpl
