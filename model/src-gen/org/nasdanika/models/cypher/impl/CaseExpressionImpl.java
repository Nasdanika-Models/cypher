/**
 */
package org.nasdanika.models.cypher.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.cypher.CaseAlternative;
import org.nasdanika.models.cypher.CaseExpression;
import org.nasdanika.models.cypher.CypherPackage;
import org.nasdanika.models.cypher.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.impl.CaseExpressionImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.CaseExpressionImpl#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.CaseExpressionImpl#getElseExpression <em>Else Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CaseExpressionImpl extends ExpressionImpl implements CaseExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CypherPackage.Literals.CASE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getSubject() {
		return (Expression)eDynamicGet(CypherPackage.CASE_EXPRESSION__SUBJECT, CypherPackage.Literals.CASE_EXPRESSION__SUBJECT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Expression newSubject, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSubject, CypherPackage.CASE_EXPRESSION__SUBJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Expression newSubject) {
		eDynamicSet(CypherPackage.CASE_EXPRESSION__SUBJECT, CypherPackage.Literals.CASE_EXPRESSION__SUBJECT, newSubject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CaseAlternative> getAlternatives() {
		return (EList<CaseAlternative>)eDynamicGet(CypherPackage.CASE_EXPRESSION__ALTERNATIVES, CypherPackage.Literals.CASE_EXPRESSION__ALTERNATIVES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getElseExpression() {
		return (Expression)eDynamicGet(CypherPackage.CASE_EXPRESSION__ELSE_EXPRESSION, CypherPackage.Literals.CASE_EXPRESSION__ELSE_EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseExpression(Expression newElseExpression, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newElseExpression, CypherPackage.CASE_EXPRESSION__ELSE_EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseExpression(Expression newElseExpression) {
		eDynamicSet(CypherPackage.CASE_EXPRESSION__ELSE_EXPRESSION, CypherPackage.Literals.CASE_EXPRESSION__ELSE_EXPRESSION, newElseExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CypherPackage.CASE_EXPRESSION__SUBJECT:
				return basicSetSubject(null, msgs);
			case CypherPackage.CASE_EXPRESSION__ALTERNATIVES:
				return ((InternalEList<?>)getAlternatives()).basicRemove(otherEnd, msgs);
			case CypherPackage.CASE_EXPRESSION__ELSE_EXPRESSION:
				return basicSetElseExpression(null, msgs);
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
			case CypherPackage.CASE_EXPRESSION__SUBJECT:
				return getSubject();
			case CypherPackage.CASE_EXPRESSION__ALTERNATIVES:
				return getAlternatives();
			case CypherPackage.CASE_EXPRESSION__ELSE_EXPRESSION:
				return getElseExpression();
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
			case CypherPackage.CASE_EXPRESSION__SUBJECT:
				setSubject((Expression)newValue);
				return;
			case CypherPackage.CASE_EXPRESSION__ALTERNATIVES:
				getAlternatives().clear();
				getAlternatives().addAll((Collection<? extends CaseAlternative>)newValue);
				return;
			case CypherPackage.CASE_EXPRESSION__ELSE_EXPRESSION:
				setElseExpression((Expression)newValue);
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
			case CypherPackage.CASE_EXPRESSION__SUBJECT:
				setSubject((Expression)null);
				return;
			case CypherPackage.CASE_EXPRESSION__ALTERNATIVES:
				getAlternatives().clear();
				return;
			case CypherPackage.CASE_EXPRESSION__ELSE_EXPRESSION:
				setElseExpression((Expression)null);
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
			case CypherPackage.CASE_EXPRESSION__SUBJECT:
				return getSubject() != null;
			case CypherPackage.CASE_EXPRESSION__ALTERNATIVES:
				return !getAlternatives().isEmpty();
			case CypherPackage.CASE_EXPRESSION__ELSE_EXPRESSION:
				return getElseExpression() != null;
		}
		return super.eIsSet(featureID);
	}

} //CaseExpressionImpl
