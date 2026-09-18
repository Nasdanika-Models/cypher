/**
 */
package org.nasdanika.models.cypher.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.cypher.CypherPackage;
import org.nasdanika.models.cypher.Expression;
import org.nasdanika.models.cypher.LabelExpression;
import org.nasdanika.models.cypher.NodePattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.impl.NodePatternImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.NodePatternImpl#getLabelExpression <em>Label Expression</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.NodePatternImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodePatternImpl extends PatternElementImpl implements NodePattern {
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
	protected NodePatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CypherPackage.Literals.NODE_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariable() {
		return (String)eDynamicGet(CypherPackage.NODE_PATTERN__VARIABLE, CypherPackage.Literals.NODE_PATTERN__VARIABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(String newVariable) {
		eDynamicSet(CypherPackage.NODE_PATTERN__VARIABLE, CypherPackage.Literals.NODE_PATTERN__VARIABLE, newVariable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelExpression getLabelExpression() {
		return (LabelExpression)eDynamicGet(CypherPackage.NODE_PATTERN__LABEL_EXPRESSION, CypherPackage.Literals.NODE_PATTERN__LABEL_EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelExpression(LabelExpression newLabelExpression, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLabelExpression, CypherPackage.NODE_PATTERN__LABEL_EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelExpression(LabelExpression newLabelExpression) {
		eDynamicSet(CypherPackage.NODE_PATTERN__LABEL_EXPRESSION, CypherPackage.Literals.NODE_PATTERN__LABEL_EXPRESSION, newLabelExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getProperties() {
		return (Expression)eDynamicGet(CypherPackage.NODE_PATTERN__PROPERTIES, CypherPackage.Literals.NODE_PATTERN__PROPERTIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(Expression newProperties, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newProperties, CypherPackage.NODE_PATTERN__PROPERTIES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperties(Expression newProperties) {
		eDynamicSet(CypherPackage.NODE_PATTERN__PROPERTIES, CypherPackage.Literals.NODE_PATTERN__PROPERTIES, newProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CypherPackage.NODE_PATTERN__LABEL_EXPRESSION:
				return basicSetLabelExpression(null, msgs);
			case CypherPackage.NODE_PATTERN__PROPERTIES:
				return basicSetProperties(null, msgs);
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
			case CypherPackage.NODE_PATTERN__VARIABLE:
				return getVariable();
			case CypherPackage.NODE_PATTERN__LABEL_EXPRESSION:
				return getLabelExpression();
			case CypherPackage.NODE_PATTERN__PROPERTIES:
				return getProperties();
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
			case CypherPackage.NODE_PATTERN__VARIABLE:
				setVariable((String)newValue);
				return;
			case CypherPackage.NODE_PATTERN__LABEL_EXPRESSION:
				setLabelExpression((LabelExpression)newValue);
				return;
			case CypherPackage.NODE_PATTERN__PROPERTIES:
				setProperties((Expression)newValue);
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
			case CypherPackage.NODE_PATTERN__VARIABLE:
				setVariable(VARIABLE_EDEFAULT);
				return;
			case CypherPackage.NODE_PATTERN__LABEL_EXPRESSION:
				setLabelExpression((LabelExpression)null);
				return;
			case CypherPackage.NODE_PATTERN__PROPERTIES:
				setProperties((Expression)null);
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
			case CypherPackage.NODE_PATTERN__VARIABLE:
				return VARIABLE_EDEFAULT == null ? getVariable() != null : !VARIABLE_EDEFAULT.equals(getVariable());
			case CypherPackage.NODE_PATTERN__LABEL_EXPRESSION:
				return getLabelExpression() != null;
			case CypherPackage.NODE_PATTERN__PROPERTIES:
				return getProperties() != null;
		}
		return super.eIsSet(featureID);
	}

} //NodePatternImpl
