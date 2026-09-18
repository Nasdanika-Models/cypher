/**
 */
package org.nasdanika.models.cypher.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.cypher.CypherPackage;
import org.nasdanika.models.cypher.Expression;
import org.nasdanika.models.cypher.QuantifiedExpression;
import org.nasdanika.models.cypher.Quantifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantified Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.impl.QuantifiedExpressionImpl#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.QuantifiedExpressionImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.QuantifiedExpressionImpl#getList <em>List</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.QuantifiedExpressionImpl#getWhere <em>Where</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuantifiedExpressionImpl extends ExpressionImpl implements QuantifiedExpression {
	/**
	 * The default value of the '{@link #getQuantifier() <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantifier()
	 * @generated
	 * @ordered
	 */
	protected static final Quantifier QUANTIFIER_EDEFAULT = Quantifier.ALL;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantifiedExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CypherPackage.Literals.QUANTIFIED_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantifier getQuantifier() {
		return (Quantifier)eDynamicGet(CypherPackage.QUANTIFIED_EXPRESSION__QUANTIFIER, CypherPackage.Literals.QUANTIFIED_EXPRESSION__QUANTIFIER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantifier(Quantifier newQuantifier) {
		eDynamicSet(CypherPackage.QUANTIFIED_EXPRESSION__QUANTIFIER, CypherPackage.Literals.QUANTIFIED_EXPRESSION__QUANTIFIER, newQuantifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariable() {
		return (String)eDynamicGet(CypherPackage.QUANTIFIED_EXPRESSION__VARIABLE, CypherPackage.Literals.QUANTIFIED_EXPRESSION__VARIABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(String newVariable) {
		eDynamicSet(CypherPackage.QUANTIFIED_EXPRESSION__VARIABLE, CypherPackage.Literals.QUANTIFIED_EXPRESSION__VARIABLE, newVariable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getList() {
		return (Expression)eDynamicGet(CypherPackage.QUANTIFIED_EXPRESSION__LIST, CypherPackage.Literals.QUANTIFIED_EXPRESSION__LIST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetList(Expression newList, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newList, CypherPackage.QUANTIFIED_EXPRESSION__LIST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setList(Expression newList) {
		eDynamicSet(CypherPackage.QUANTIFIED_EXPRESSION__LIST, CypherPackage.Literals.QUANTIFIED_EXPRESSION__LIST, newList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getWhere() {
		return (Expression)eDynamicGet(CypherPackage.QUANTIFIED_EXPRESSION__WHERE, CypherPackage.Literals.QUANTIFIED_EXPRESSION__WHERE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhere(Expression newWhere, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newWhere, CypherPackage.QUANTIFIED_EXPRESSION__WHERE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhere(Expression newWhere) {
		eDynamicSet(CypherPackage.QUANTIFIED_EXPRESSION__WHERE, CypherPackage.Literals.QUANTIFIED_EXPRESSION__WHERE, newWhere);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CypherPackage.QUANTIFIED_EXPRESSION__LIST:
				return basicSetList(null, msgs);
			case CypherPackage.QUANTIFIED_EXPRESSION__WHERE:
				return basicSetWhere(null, msgs);
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
			case CypherPackage.QUANTIFIED_EXPRESSION__QUANTIFIER:
				return getQuantifier();
			case CypherPackage.QUANTIFIED_EXPRESSION__VARIABLE:
				return getVariable();
			case CypherPackage.QUANTIFIED_EXPRESSION__LIST:
				return getList();
			case CypherPackage.QUANTIFIED_EXPRESSION__WHERE:
				return getWhere();
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
			case CypherPackage.QUANTIFIED_EXPRESSION__QUANTIFIER:
				setQuantifier((Quantifier)newValue);
				return;
			case CypherPackage.QUANTIFIED_EXPRESSION__VARIABLE:
				setVariable((String)newValue);
				return;
			case CypherPackage.QUANTIFIED_EXPRESSION__LIST:
				setList((Expression)newValue);
				return;
			case CypherPackage.QUANTIFIED_EXPRESSION__WHERE:
				setWhere((Expression)newValue);
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
			case CypherPackage.QUANTIFIED_EXPRESSION__QUANTIFIER:
				setQuantifier(QUANTIFIER_EDEFAULT);
				return;
			case CypherPackage.QUANTIFIED_EXPRESSION__VARIABLE:
				setVariable(VARIABLE_EDEFAULT);
				return;
			case CypherPackage.QUANTIFIED_EXPRESSION__LIST:
				setList((Expression)null);
				return;
			case CypherPackage.QUANTIFIED_EXPRESSION__WHERE:
				setWhere((Expression)null);
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
			case CypherPackage.QUANTIFIED_EXPRESSION__QUANTIFIER:
				return getQuantifier() != QUANTIFIER_EDEFAULT;
			case CypherPackage.QUANTIFIED_EXPRESSION__VARIABLE:
				return VARIABLE_EDEFAULT == null ? getVariable() != null : !VARIABLE_EDEFAULT.equals(getVariable());
			case CypherPackage.QUANTIFIED_EXPRESSION__LIST:
				return getList() != null;
			case CypherPackage.QUANTIFIED_EXPRESSION__WHERE:
				return getWhere() != null;
		}
		return super.eIsSet(featureID);
	}

} //QuantifiedExpressionImpl
