/**
 */
package org.nasdanika.models.cypher.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.cypher.CaseAlternative;
import org.nasdanika.models.cypher.CypherPackage;
import org.nasdanika.models.cypher.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Alternative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.impl.CaseAlternativeImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.CaseAlternativeImpl#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CaseAlternativeImpl extends CypherElementImpl implements CaseAlternative {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseAlternativeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CypherPackage.Literals.CASE_ALTERNATIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCondition() {
		return (Expression)eDynamicGet(CypherPackage.CASE_ALTERNATIVE__CONDITION, CypherPackage.Literals.CASE_ALTERNATIVE__CONDITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newCondition, CypherPackage.CASE_ALTERNATIVE__CONDITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Expression newCondition) {
		eDynamicSet(CypherPackage.CASE_ALTERNATIVE__CONDITION, CypherPackage.Literals.CASE_ALTERNATIVE__CONDITION, newCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getResult() {
		return (Expression)eDynamicGet(CypherPackage.CASE_ALTERNATIVE__RESULT, CypherPackage.Literals.CASE_ALTERNATIVE__RESULT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResult(Expression newResult, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newResult, CypherPackage.CASE_ALTERNATIVE__RESULT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(Expression newResult) {
		eDynamicSet(CypherPackage.CASE_ALTERNATIVE__RESULT, CypherPackage.Literals.CASE_ALTERNATIVE__RESULT, newResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CypherPackage.CASE_ALTERNATIVE__CONDITION:
				return basicSetCondition(null, msgs);
			case CypherPackage.CASE_ALTERNATIVE__RESULT:
				return basicSetResult(null, msgs);
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
			case CypherPackage.CASE_ALTERNATIVE__CONDITION:
				return getCondition();
			case CypherPackage.CASE_ALTERNATIVE__RESULT:
				return getResult();
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
			case CypherPackage.CASE_ALTERNATIVE__CONDITION:
				setCondition((Expression)newValue);
				return;
			case CypherPackage.CASE_ALTERNATIVE__RESULT:
				setResult((Expression)newValue);
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
			case CypherPackage.CASE_ALTERNATIVE__CONDITION:
				setCondition((Expression)null);
				return;
			case CypherPackage.CASE_ALTERNATIVE__RESULT:
				setResult((Expression)null);
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
			case CypherPackage.CASE_ALTERNATIVE__CONDITION:
				return getCondition() != null;
			case CypherPackage.CASE_ALTERNATIVE__RESULT:
				return getResult() != null;
		}
		return super.eIsSet(featureID);
	}

} //CaseAlternativeImpl
