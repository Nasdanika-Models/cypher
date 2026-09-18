/**
 */
package org.nasdanika.models.cypher.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.cypher.Clause;
import org.nasdanika.models.cypher.CypherPackage;
import org.nasdanika.models.cypher.Expression;
import org.nasdanika.models.cypher.ForeachClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreach Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.impl.ForeachClauseImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.ForeachClauseImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.ForeachClauseImpl#getClauses <em>Clauses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForeachClauseImpl extends ClauseImpl implements ForeachClause {
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
	protected ForeachClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CypherPackage.Literals.FOREACH_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariable() {
		return (String)eDynamicGet(CypherPackage.FOREACH_CLAUSE__VARIABLE, CypherPackage.Literals.FOREACH_CLAUSE__VARIABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(String newVariable) {
		eDynamicSet(CypherPackage.FOREACH_CLAUSE__VARIABLE, CypherPackage.Literals.FOREACH_CLAUSE__VARIABLE, newVariable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		return (Expression)eDynamicGet(CypherPackage.FOREACH_CLAUSE__EXPRESSION, CypherPackage.Literals.FOREACH_CLAUSE__EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newExpression, CypherPackage.FOREACH_CLAUSE__EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		eDynamicSet(CypherPackage.FOREACH_CLAUSE__EXPRESSION, CypherPackage.Literals.FOREACH_CLAUSE__EXPRESSION, newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Clause> getClauses() {
		return (EList<Clause>)eDynamicGet(CypherPackage.FOREACH_CLAUSE__CLAUSES, CypherPackage.Literals.FOREACH_CLAUSE__CLAUSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CypherPackage.FOREACH_CLAUSE__EXPRESSION:
				return basicSetExpression(null, msgs);
			case CypherPackage.FOREACH_CLAUSE__CLAUSES:
				return ((InternalEList<?>)getClauses()).basicRemove(otherEnd, msgs);
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
			case CypherPackage.FOREACH_CLAUSE__VARIABLE:
				return getVariable();
			case CypherPackage.FOREACH_CLAUSE__EXPRESSION:
				return getExpression();
			case CypherPackage.FOREACH_CLAUSE__CLAUSES:
				return getClauses();
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
			case CypherPackage.FOREACH_CLAUSE__VARIABLE:
				setVariable((String)newValue);
				return;
			case CypherPackage.FOREACH_CLAUSE__EXPRESSION:
				setExpression((Expression)newValue);
				return;
			case CypherPackage.FOREACH_CLAUSE__CLAUSES:
				getClauses().clear();
				getClauses().addAll((Collection<? extends Clause>)newValue);
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
			case CypherPackage.FOREACH_CLAUSE__VARIABLE:
				setVariable(VARIABLE_EDEFAULT);
				return;
			case CypherPackage.FOREACH_CLAUSE__EXPRESSION:
				setExpression((Expression)null);
				return;
			case CypherPackage.FOREACH_CLAUSE__CLAUSES:
				getClauses().clear();
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
			case CypherPackage.FOREACH_CLAUSE__VARIABLE:
				return VARIABLE_EDEFAULT == null ? getVariable() != null : !VARIABLE_EDEFAULT.equals(getVariable());
			case CypherPackage.FOREACH_CLAUSE__EXPRESSION:
				return getExpression() != null;
			case CypherPackage.FOREACH_CLAUSE__CLAUSES:
				return !getClauses().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ForeachClauseImpl
