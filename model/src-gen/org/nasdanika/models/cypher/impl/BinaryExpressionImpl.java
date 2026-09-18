/**
 */
package org.nasdanika.models.cypher.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.cypher.BinaryExpression;
import org.nasdanika.models.cypher.BinaryOperator;
import org.nasdanika.models.cypher.CypherPackage;
import org.nasdanika.models.cypher.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.impl.BinaryExpressionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.BinaryExpressionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.BinaryExpressionImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryExpressionImpl extends ExpressionImpl implements BinaryExpression {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final BinaryOperator OPERATOR_EDEFAULT = BinaryOperator.PLUS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CypherPackage.Literals.BINARY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperator getOperator() {
		return (BinaryOperator)eDynamicGet(CypherPackage.BINARY_EXPRESSION__OPERATOR, CypherPackage.Literals.BINARY_EXPRESSION__OPERATOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(BinaryOperator newOperator) {
		eDynamicSet(CypherPackage.BINARY_EXPRESSION__OPERATOR, CypherPackage.Literals.BINARY_EXPRESSION__OPERATOR, newOperator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLeft() {
		return (Expression)eDynamicGet(CypherPackage.BINARY_EXPRESSION__LEFT, CypherPackage.Literals.BINARY_EXPRESSION__LEFT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(Expression newLeft, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLeft, CypherPackage.BINARY_EXPRESSION__LEFT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(Expression newLeft) {
		eDynamicSet(CypherPackage.BINARY_EXPRESSION__LEFT, CypherPackage.Literals.BINARY_EXPRESSION__LEFT, newLeft);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getRight() {
		return (Expression)eDynamicGet(CypherPackage.BINARY_EXPRESSION__RIGHT, CypherPackage.Literals.BINARY_EXPRESSION__RIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRight(Expression newRight, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newRight, CypherPackage.BINARY_EXPRESSION__RIGHT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(Expression newRight) {
		eDynamicSet(CypherPackage.BINARY_EXPRESSION__RIGHT, CypherPackage.Literals.BINARY_EXPRESSION__RIGHT, newRight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CypherPackage.BINARY_EXPRESSION__LEFT:
				return basicSetLeft(null, msgs);
			case CypherPackage.BINARY_EXPRESSION__RIGHT:
				return basicSetRight(null, msgs);
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
			case CypherPackage.BINARY_EXPRESSION__OPERATOR:
				return getOperator();
			case CypherPackage.BINARY_EXPRESSION__LEFT:
				return getLeft();
			case CypherPackage.BINARY_EXPRESSION__RIGHT:
				return getRight();
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
			case CypherPackage.BINARY_EXPRESSION__OPERATOR:
				setOperator((BinaryOperator)newValue);
				return;
			case CypherPackage.BINARY_EXPRESSION__LEFT:
				setLeft((Expression)newValue);
				return;
			case CypherPackage.BINARY_EXPRESSION__RIGHT:
				setRight((Expression)newValue);
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
			case CypherPackage.BINARY_EXPRESSION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case CypherPackage.BINARY_EXPRESSION__LEFT:
				setLeft((Expression)null);
				return;
			case CypherPackage.BINARY_EXPRESSION__RIGHT:
				setRight((Expression)null);
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
			case CypherPackage.BINARY_EXPRESSION__OPERATOR:
				return getOperator() != OPERATOR_EDEFAULT;
			case CypherPackage.BINARY_EXPRESSION__LEFT:
				return getLeft() != null;
			case CypherPackage.BINARY_EXPRESSION__RIGHT:
				return getRight() != null;
		}
		return super.eIsSet(featureID);
	}

} //BinaryExpressionImpl
