/**
 */
package org.nasdanika.models.cypher.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.cypher.CypherPackage;
import org.nasdanika.models.cypher.Direction;
import org.nasdanika.models.cypher.Expression;
import org.nasdanika.models.cypher.LabelExpression;
import org.nasdanika.models.cypher.RelationshipPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.impl.RelationshipPatternImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.RelationshipPatternImpl#getTypeExpression <em>Type Expression</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.RelationshipPatternImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.RelationshipPatternImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.RelationshipPatternImpl#isVariableLength <em>Variable Length</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.RelationshipPatternImpl#getMinHops <em>Min Hops</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.RelationshipPatternImpl#getMaxHops <em>Max Hops</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipPatternImpl extends PatternElementImpl implements RelationshipPattern {
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
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final Direction DIRECTION_EDEFAULT = Direction.OUTGOING;

	/**
	 * The default value of the '{@link #isVariableLength() <em>Variable Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVariableLength()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VARIABLE_LENGTH_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getMinHops() <em>Min Hops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinHops()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_HOPS_EDEFAULT = -1;

	/**
	 * The default value of the '{@link #getMaxHops() <em>Max Hops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHops()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_HOPS_EDEFAULT = -1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CypherPackage.Literals.RELATIONSHIP_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariable() {
		return (String)eDynamicGet(CypherPackage.RELATIONSHIP_PATTERN__VARIABLE, CypherPackage.Literals.RELATIONSHIP_PATTERN__VARIABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(String newVariable) {
		eDynamicSet(CypherPackage.RELATIONSHIP_PATTERN__VARIABLE, CypherPackage.Literals.RELATIONSHIP_PATTERN__VARIABLE, newVariable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelExpression getTypeExpression() {
		return (LabelExpression)eDynamicGet(CypherPackage.RELATIONSHIP_PATTERN__TYPE_EXPRESSION, CypherPackage.Literals.RELATIONSHIP_PATTERN__TYPE_EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeExpression(LabelExpression newTypeExpression, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTypeExpression, CypherPackage.RELATIONSHIP_PATTERN__TYPE_EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeExpression(LabelExpression newTypeExpression) {
		eDynamicSet(CypherPackage.RELATIONSHIP_PATTERN__TYPE_EXPRESSION, CypherPackage.Literals.RELATIONSHIP_PATTERN__TYPE_EXPRESSION, newTypeExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction getDirection() {
		return (Direction)eDynamicGet(CypherPackage.RELATIONSHIP_PATTERN__DIRECTION, CypherPackage.Literals.RELATIONSHIP_PATTERN__DIRECTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(Direction newDirection) {
		eDynamicSet(CypherPackage.RELATIONSHIP_PATTERN__DIRECTION, CypherPackage.Literals.RELATIONSHIP_PATTERN__DIRECTION, newDirection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getProperties() {
		return (Expression)eDynamicGet(CypherPackage.RELATIONSHIP_PATTERN__PROPERTIES, CypherPackage.Literals.RELATIONSHIP_PATTERN__PROPERTIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(Expression newProperties, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newProperties, CypherPackage.RELATIONSHIP_PATTERN__PROPERTIES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperties(Expression newProperties) {
		eDynamicSet(CypherPackage.RELATIONSHIP_PATTERN__PROPERTIES, CypherPackage.Literals.RELATIONSHIP_PATTERN__PROPERTIES, newProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVariableLength() {
		return (Boolean)eDynamicGet(CypherPackage.RELATIONSHIP_PATTERN__VARIABLE_LENGTH, CypherPackage.Literals.RELATIONSHIP_PATTERN__VARIABLE_LENGTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableLength(boolean newVariableLength) {
		eDynamicSet(CypherPackage.RELATIONSHIP_PATTERN__VARIABLE_LENGTH, CypherPackage.Literals.RELATIONSHIP_PATTERN__VARIABLE_LENGTH, newVariableLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinHops() {
		return (Integer)eDynamicGet(CypherPackage.RELATIONSHIP_PATTERN__MIN_HOPS, CypherPackage.Literals.RELATIONSHIP_PATTERN__MIN_HOPS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinHops(int newMinHops) {
		eDynamicSet(CypherPackage.RELATIONSHIP_PATTERN__MIN_HOPS, CypherPackage.Literals.RELATIONSHIP_PATTERN__MIN_HOPS, newMinHops);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxHops() {
		return (Integer)eDynamicGet(CypherPackage.RELATIONSHIP_PATTERN__MAX_HOPS, CypherPackage.Literals.RELATIONSHIP_PATTERN__MAX_HOPS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxHops(int newMaxHops) {
		eDynamicSet(CypherPackage.RELATIONSHIP_PATTERN__MAX_HOPS, CypherPackage.Literals.RELATIONSHIP_PATTERN__MAX_HOPS, newMaxHops);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CypherPackage.RELATIONSHIP_PATTERN__TYPE_EXPRESSION:
				return basicSetTypeExpression(null, msgs);
			case CypherPackage.RELATIONSHIP_PATTERN__PROPERTIES:
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
			case CypherPackage.RELATIONSHIP_PATTERN__VARIABLE:
				return getVariable();
			case CypherPackage.RELATIONSHIP_PATTERN__TYPE_EXPRESSION:
				return getTypeExpression();
			case CypherPackage.RELATIONSHIP_PATTERN__DIRECTION:
				return getDirection();
			case CypherPackage.RELATIONSHIP_PATTERN__PROPERTIES:
				return getProperties();
			case CypherPackage.RELATIONSHIP_PATTERN__VARIABLE_LENGTH:
				return isVariableLength();
			case CypherPackage.RELATIONSHIP_PATTERN__MIN_HOPS:
				return getMinHops();
			case CypherPackage.RELATIONSHIP_PATTERN__MAX_HOPS:
				return getMaxHops();
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
			case CypherPackage.RELATIONSHIP_PATTERN__VARIABLE:
				setVariable((String)newValue);
				return;
			case CypherPackage.RELATIONSHIP_PATTERN__TYPE_EXPRESSION:
				setTypeExpression((LabelExpression)newValue);
				return;
			case CypherPackage.RELATIONSHIP_PATTERN__DIRECTION:
				setDirection((Direction)newValue);
				return;
			case CypherPackage.RELATIONSHIP_PATTERN__PROPERTIES:
				setProperties((Expression)newValue);
				return;
			case CypherPackage.RELATIONSHIP_PATTERN__VARIABLE_LENGTH:
				setVariableLength((Boolean)newValue);
				return;
			case CypherPackage.RELATIONSHIP_PATTERN__MIN_HOPS:
				setMinHops((Integer)newValue);
				return;
			case CypherPackage.RELATIONSHIP_PATTERN__MAX_HOPS:
				setMaxHops((Integer)newValue);
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
			case CypherPackage.RELATIONSHIP_PATTERN__VARIABLE:
				setVariable(VARIABLE_EDEFAULT);
				return;
			case CypherPackage.RELATIONSHIP_PATTERN__TYPE_EXPRESSION:
				setTypeExpression((LabelExpression)null);
				return;
			case CypherPackage.RELATIONSHIP_PATTERN__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case CypherPackage.RELATIONSHIP_PATTERN__PROPERTIES:
				setProperties((Expression)null);
				return;
			case CypherPackage.RELATIONSHIP_PATTERN__VARIABLE_LENGTH:
				setVariableLength(VARIABLE_LENGTH_EDEFAULT);
				return;
			case CypherPackage.RELATIONSHIP_PATTERN__MIN_HOPS:
				setMinHops(MIN_HOPS_EDEFAULT);
				return;
			case CypherPackage.RELATIONSHIP_PATTERN__MAX_HOPS:
				setMaxHops(MAX_HOPS_EDEFAULT);
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
			case CypherPackage.RELATIONSHIP_PATTERN__VARIABLE:
				return VARIABLE_EDEFAULT == null ? getVariable() != null : !VARIABLE_EDEFAULT.equals(getVariable());
			case CypherPackage.RELATIONSHIP_PATTERN__TYPE_EXPRESSION:
				return getTypeExpression() != null;
			case CypherPackage.RELATIONSHIP_PATTERN__DIRECTION:
				return getDirection() != DIRECTION_EDEFAULT;
			case CypherPackage.RELATIONSHIP_PATTERN__PROPERTIES:
				return getProperties() != null;
			case CypherPackage.RELATIONSHIP_PATTERN__VARIABLE_LENGTH:
				return isVariableLength() != VARIABLE_LENGTH_EDEFAULT;
			case CypherPackage.RELATIONSHIP_PATTERN__MIN_HOPS:
				return getMinHops() != MIN_HOPS_EDEFAULT;
			case CypherPackage.RELATIONSHIP_PATTERN__MAX_HOPS:
				return getMaxHops() != MAX_HOPS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //RelationshipPatternImpl
