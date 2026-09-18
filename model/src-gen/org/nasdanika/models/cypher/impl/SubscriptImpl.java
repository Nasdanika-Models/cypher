/**
 */
package org.nasdanika.models.cypher.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.cypher.CypherPackage;
import org.nasdanika.models.cypher.Expression;
import org.nasdanika.models.cypher.Subscript;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscript</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.impl.SubscriptImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.SubscriptImpl#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscriptImpl extends ExpressionImpl implements Subscript {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CypherPackage.Literals.SUBSCRIPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getTarget() {
		return (Expression)eDynamicGet(CypherPackage.SUBSCRIPT__TARGET, CypherPackage.Literals.SUBSCRIPT__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Expression newTarget, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTarget, CypherPackage.SUBSCRIPT__TARGET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Expression newTarget) {
		eDynamicSet(CypherPackage.SUBSCRIPT__TARGET, CypherPackage.Literals.SUBSCRIPT__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getIndex() {
		return (Expression)eDynamicGet(CypherPackage.SUBSCRIPT__INDEX, CypherPackage.Literals.SUBSCRIPT__INDEX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndex(Expression newIndex, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newIndex, CypherPackage.SUBSCRIPT__INDEX, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(Expression newIndex) {
		eDynamicSet(CypherPackage.SUBSCRIPT__INDEX, CypherPackage.Literals.SUBSCRIPT__INDEX, newIndex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CypherPackage.SUBSCRIPT__TARGET:
				return basicSetTarget(null, msgs);
			case CypherPackage.SUBSCRIPT__INDEX:
				return basicSetIndex(null, msgs);
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
			case CypherPackage.SUBSCRIPT__TARGET:
				return getTarget();
			case CypherPackage.SUBSCRIPT__INDEX:
				return getIndex();
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
			case CypherPackage.SUBSCRIPT__TARGET:
				setTarget((Expression)newValue);
				return;
			case CypherPackage.SUBSCRIPT__INDEX:
				setIndex((Expression)newValue);
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
			case CypherPackage.SUBSCRIPT__TARGET:
				setTarget((Expression)null);
				return;
			case CypherPackage.SUBSCRIPT__INDEX:
				setIndex((Expression)null);
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
			case CypherPackage.SUBSCRIPT__TARGET:
				return getTarget() != null;
			case CypherPackage.SUBSCRIPT__INDEX:
				return getIndex() != null;
		}
		return super.eIsSet(featureID);
	}

} //SubscriptImpl
