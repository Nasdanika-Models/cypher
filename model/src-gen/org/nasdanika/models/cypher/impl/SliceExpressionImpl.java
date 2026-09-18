/**
 */
package org.nasdanika.models.cypher.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.cypher.CypherPackage;
import org.nasdanika.models.cypher.Expression;
import org.nasdanika.models.cypher.SliceExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slice Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.impl.SliceExpressionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.SliceExpressionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.SliceExpressionImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SliceExpressionImpl extends ExpressionImpl implements SliceExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SliceExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CypherPackage.Literals.SLICE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getTarget() {
		return (Expression)eDynamicGet(CypherPackage.SLICE_EXPRESSION__TARGET, CypherPackage.Literals.SLICE_EXPRESSION__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Expression newTarget, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTarget, CypherPackage.SLICE_EXPRESSION__TARGET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Expression newTarget) {
		eDynamicSet(CypherPackage.SLICE_EXPRESSION__TARGET, CypherPackage.Literals.SLICE_EXPRESSION__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getFrom() {
		return (Expression)eDynamicGet(CypherPackage.SLICE_EXPRESSION__FROM, CypherPackage.Literals.SLICE_EXPRESSION__FROM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(Expression newFrom, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newFrom, CypherPackage.SLICE_EXPRESSION__FROM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Expression newFrom) {
		eDynamicSet(CypherPackage.SLICE_EXPRESSION__FROM, CypherPackage.Literals.SLICE_EXPRESSION__FROM, newFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getTo() {
		return (Expression)eDynamicGet(CypherPackage.SLICE_EXPRESSION__TO, CypherPackage.Literals.SLICE_EXPRESSION__TO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(Expression newTo, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTo, CypherPackage.SLICE_EXPRESSION__TO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Expression newTo) {
		eDynamicSet(CypherPackage.SLICE_EXPRESSION__TO, CypherPackage.Literals.SLICE_EXPRESSION__TO, newTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CypherPackage.SLICE_EXPRESSION__TARGET:
				return basicSetTarget(null, msgs);
			case CypherPackage.SLICE_EXPRESSION__FROM:
				return basicSetFrom(null, msgs);
			case CypherPackage.SLICE_EXPRESSION__TO:
				return basicSetTo(null, msgs);
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
			case CypherPackage.SLICE_EXPRESSION__TARGET:
				return getTarget();
			case CypherPackage.SLICE_EXPRESSION__FROM:
				return getFrom();
			case CypherPackage.SLICE_EXPRESSION__TO:
				return getTo();
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
			case CypherPackage.SLICE_EXPRESSION__TARGET:
				setTarget((Expression)newValue);
				return;
			case CypherPackage.SLICE_EXPRESSION__FROM:
				setFrom((Expression)newValue);
				return;
			case CypherPackage.SLICE_EXPRESSION__TO:
				setTo((Expression)newValue);
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
			case CypherPackage.SLICE_EXPRESSION__TARGET:
				setTarget((Expression)null);
				return;
			case CypherPackage.SLICE_EXPRESSION__FROM:
				setFrom((Expression)null);
				return;
			case CypherPackage.SLICE_EXPRESSION__TO:
				setTo((Expression)null);
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
			case CypherPackage.SLICE_EXPRESSION__TARGET:
				return getTarget() != null;
			case CypherPackage.SLICE_EXPRESSION__FROM:
				return getFrom() != null;
			case CypherPackage.SLICE_EXPRESSION__TO:
				return getTo() != null;
		}
		return super.eIsSet(featureID);
	}

} //SliceExpressionImpl
