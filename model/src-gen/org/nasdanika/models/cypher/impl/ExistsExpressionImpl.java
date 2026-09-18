/**
 */
package org.nasdanika.models.cypher.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.cypher.CypherPackage;
import org.nasdanika.models.cypher.ExistsExpression;
import org.nasdanika.models.cypher.PatternElement;
import org.nasdanika.models.cypher.Query;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exists Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.impl.ExistsExpressionImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.ExistsExpressionImpl#getSubquery <em>Subquery</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExistsExpressionImpl extends ExpressionImpl implements ExistsExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExistsExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CypherPackage.Literals.EXISTS_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternElement getPattern() {
		return (PatternElement)eDynamicGet(CypherPackage.EXISTS_EXPRESSION__PATTERN, CypherPackage.Literals.EXISTS_EXPRESSION__PATTERN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPattern(PatternElement newPattern, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newPattern, CypherPackage.EXISTS_EXPRESSION__PATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(PatternElement newPattern) {
		eDynamicSet(CypherPackage.EXISTS_EXPRESSION__PATTERN, CypherPackage.Literals.EXISTS_EXPRESSION__PATTERN, newPattern);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query getSubquery() {
		return (Query)eDynamicGet(CypherPackage.EXISTS_EXPRESSION__SUBQUERY, CypherPackage.Literals.EXISTS_EXPRESSION__SUBQUERY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubquery(Query newSubquery, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSubquery, CypherPackage.EXISTS_EXPRESSION__SUBQUERY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubquery(Query newSubquery) {
		eDynamicSet(CypherPackage.EXISTS_EXPRESSION__SUBQUERY, CypherPackage.Literals.EXISTS_EXPRESSION__SUBQUERY, newSubquery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CypherPackage.EXISTS_EXPRESSION__PATTERN:
				return basicSetPattern(null, msgs);
			case CypherPackage.EXISTS_EXPRESSION__SUBQUERY:
				return basicSetSubquery(null, msgs);
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
			case CypherPackage.EXISTS_EXPRESSION__PATTERN:
				return getPattern();
			case CypherPackage.EXISTS_EXPRESSION__SUBQUERY:
				return getSubquery();
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
			case CypherPackage.EXISTS_EXPRESSION__PATTERN:
				setPattern((PatternElement)newValue);
				return;
			case CypherPackage.EXISTS_EXPRESSION__SUBQUERY:
				setSubquery((Query)newValue);
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
			case CypherPackage.EXISTS_EXPRESSION__PATTERN:
				setPattern((PatternElement)null);
				return;
			case CypherPackage.EXISTS_EXPRESSION__SUBQUERY:
				setSubquery((Query)null);
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
			case CypherPackage.EXISTS_EXPRESSION__PATTERN:
				return getPattern() != null;
			case CypherPackage.EXISTS_EXPRESSION__SUBQUERY:
				return getSubquery() != null;
		}
		return super.eIsSet(featureID);
	}

} //ExistsExpressionImpl
