/**
 */
package org.nasdanika.models.cypher.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.cypher.CypherPackage;
import org.nasdanika.models.cypher.Expression;
import org.nasdanika.models.cypher.SetVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.impl.SetVariableImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.SetVariableImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.SetVariableImpl#isMerge <em>Merge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetVariableImpl extends SetItemImpl implements SetVariable {
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
	 * The default value of the '{@link #isMerge() <em>Merge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMerge()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MERGE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CypherPackage.Literals.SET_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariable() {
		return (String)eDynamicGet(CypherPackage.SET_VARIABLE__VARIABLE, CypherPackage.Literals.SET_VARIABLE__VARIABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(String newVariable) {
		eDynamicSet(CypherPackage.SET_VARIABLE__VARIABLE, CypherPackage.Literals.SET_VARIABLE__VARIABLE, newVariable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getValue() {
		return (Expression)eDynamicGet(CypherPackage.SET_VARIABLE__VALUE, CypherPackage.Literals.SET_VARIABLE__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Expression newValue, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newValue, CypherPackage.SET_VARIABLE__VALUE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Expression newValue) {
		eDynamicSet(CypherPackage.SET_VARIABLE__VALUE, CypherPackage.Literals.SET_VARIABLE__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMerge() {
		return (Boolean)eDynamicGet(CypherPackage.SET_VARIABLE__MERGE, CypherPackage.Literals.SET_VARIABLE__MERGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMerge(boolean newMerge) {
		eDynamicSet(CypherPackage.SET_VARIABLE__MERGE, CypherPackage.Literals.SET_VARIABLE__MERGE, newMerge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CypherPackage.SET_VARIABLE__VALUE:
				return basicSetValue(null, msgs);
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
			case CypherPackage.SET_VARIABLE__VARIABLE:
				return getVariable();
			case CypherPackage.SET_VARIABLE__VALUE:
				return getValue();
			case CypherPackage.SET_VARIABLE__MERGE:
				return isMerge();
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
			case CypherPackage.SET_VARIABLE__VARIABLE:
				setVariable((String)newValue);
				return;
			case CypherPackage.SET_VARIABLE__VALUE:
				setValue((Expression)newValue);
				return;
			case CypherPackage.SET_VARIABLE__MERGE:
				setMerge((Boolean)newValue);
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
			case CypherPackage.SET_VARIABLE__VARIABLE:
				setVariable(VARIABLE_EDEFAULT);
				return;
			case CypherPackage.SET_VARIABLE__VALUE:
				setValue((Expression)null);
				return;
			case CypherPackage.SET_VARIABLE__MERGE:
				setMerge(MERGE_EDEFAULT);
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
			case CypherPackage.SET_VARIABLE__VARIABLE:
				return VARIABLE_EDEFAULT == null ? getVariable() != null : !VARIABLE_EDEFAULT.equals(getVariable());
			case CypherPackage.SET_VARIABLE__VALUE:
				return getValue() != null;
			case CypherPackage.SET_VARIABLE__MERGE:
				return isMerge() != MERGE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //SetVariableImpl
