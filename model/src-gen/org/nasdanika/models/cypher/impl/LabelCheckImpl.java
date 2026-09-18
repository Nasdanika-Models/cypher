/**
 */
package org.nasdanika.models.cypher.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.cypher.CypherPackage;
import org.nasdanika.models.cypher.Expression;
import org.nasdanika.models.cypher.LabelCheck;
import org.nasdanika.models.cypher.LabelExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.impl.LabelCheckImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.LabelCheckImpl#getLabelExpression <em>Label Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelCheckImpl extends ExpressionImpl implements LabelCheck {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelCheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CypherPackage.Literals.LABEL_CHECK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getTarget() {
		return (Expression)eDynamicGet(CypherPackage.LABEL_CHECK__TARGET, CypherPackage.Literals.LABEL_CHECK__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Expression newTarget, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTarget, CypherPackage.LABEL_CHECK__TARGET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Expression newTarget) {
		eDynamicSet(CypherPackage.LABEL_CHECK__TARGET, CypherPackage.Literals.LABEL_CHECK__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelExpression getLabelExpression() {
		return (LabelExpression)eDynamicGet(CypherPackage.LABEL_CHECK__LABEL_EXPRESSION, CypherPackage.Literals.LABEL_CHECK__LABEL_EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelExpression(LabelExpression newLabelExpression, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLabelExpression, CypherPackage.LABEL_CHECK__LABEL_EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelExpression(LabelExpression newLabelExpression) {
		eDynamicSet(CypherPackage.LABEL_CHECK__LABEL_EXPRESSION, CypherPackage.Literals.LABEL_CHECK__LABEL_EXPRESSION, newLabelExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CypherPackage.LABEL_CHECK__TARGET:
				return basicSetTarget(null, msgs);
			case CypherPackage.LABEL_CHECK__LABEL_EXPRESSION:
				return basicSetLabelExpression(null, msgs);
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
			case CypherPackage.LABEL_CHECK__TARGET:
				return getTarget();
			case CypherPackage.LABEL_CHECK__LABEL_EXPRESSION:
				return getLabelExpression();
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
			case CypherPackage.LABEL_CHECK__TARGET:
				setTarget((Expression)newValue);
				return;
			case CypherPackage.LABEL_CHECK__LABEL_EXPRESSION:
				setLabelExpression((LabelExpression)newValue);
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
			case CypherPackage.LABEL_CHECK__TARGET:
				setTarget((Expression)null);
				return;
			case CypherPackage.LABEL_CHECK__LABEL_EXPRESSION:
				setLabelExpression((LabelExpression)null);
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
			case CypherPackage.LABEL_CHECK__TARGET:
				return getTarget() != null;
			case CypherPackage.LABEL_CHECK__LABEL_EXPRESSION:
				return getLabelExpression() != null;
		}
		return super.eIsSet(featureID);
	}

} //LabelCheckImpl
