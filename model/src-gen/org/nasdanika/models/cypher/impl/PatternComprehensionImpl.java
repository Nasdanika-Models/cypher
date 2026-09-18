/**
 */
package org.nasdanika.models.cypher.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.cypher.CypherPackage;
import org.nasdanika.models.cypher.Expression;
import org.nasdanika.models.cypher.PatternComprehension;
import org.nasdanika.models.cypher.PatternElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Comprehension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.impl.PatternComprehensionImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.PatternComprehensionImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.PatternComprehensionImpl#getWhere <em>Where</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.PatternComprehensionImpl#getProjection <em>Projection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternComprehensionImpl extends ExpressionImpl implements PatternComprehension {
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
	protected PatternComprehensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CypherPackage.Literals.PATTERN_COMPREHENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariable() {
		return (String)eDynamicGet(CypherPackage.PATTERN_COMPREHENSION__VARIABLE, CypherPackage.Literals.PATTERN_COMPREHENSION__VARIABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(String newVariable) {
		eDynamicSet(CypherPackage.PATTERN_COMPREHENSION__VARIABLE, CypherPackage.Literals.PATTERN_COMPREHENSION__VARIABLE, newVariable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternElement getPattern() {
		return (PatternElement)eDynamicGet(CypherPackage.PATTERN_COMPREHENSION__PATTERN, CypherPackage.Literals.PATTERN_COMPREHENSION__PATTERN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPattern(PatternElement newPattern, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newPattern, CypherPackage.PATTERN_COMPREHENSION__PATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(PatternElement newPattern) {
		eDynamicSet(CypherPackage.PATTERN_COMPREHENSION__PATTERN, CypherPackage.Literals.PATTERN_COMPREHENSION__PATTERN, newPattern);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getWhere() {
		return (Expression)eDynamicGet(CypherPackage.PATTERN_COMPREHENSION__WHERE, CypherPackage.Literals.PATTERN_COMPREHENSION__WHERE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhere(Expression newWhere, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newWhere, CypherPackage.PATTERN_COMPREHENSION__WHERE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhere(Expression newWhere) {
		eDynamicSet(CypherPackage.PATTERN_COMPREHENSION__WHERE, CypherPackage.Literals.PATTERN_COMPREHENSION__WHERE, newWhere);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getProjection() {
		return (Expression)eDynamicGet(CypherPackage.PATTERN_COMPREHENSION__PROJECTION, CypherPackage.Literals.PATTERN_COMPREHENSION__PROJECTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProjection(Expression newProjection, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newProjection, CypherPackage.PATTERN_COMPREHENSION__PROJECTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjection(Expression newProjection) {
		eDynamicSet(CypherPackage.PATTERN_COMPREHENSION__PROJECTION, CypherPackage.Literals.PATTERN_COMPREHENSION__PROJECTION, newProjection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CypherPackage.PATTERN_COMPREHENSION__PATTERN:
				return basicSetPattern(null, msgs);
			case CypherPackage.PATTERN_COMPREHENSION__WHERE:
				return basicSetWhere(null, msgs);
			case CypherPackage.PATTERN_COMPREHENSION__PROJECTION:
				return basicSetProjection(null, msgs);
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
			case CypherPackage.PATTERN_COMPREHENSION__VARIABLE:
				return getVariable();
			case CypherPackage.PATTERN_COMPREHENSION__PATTERN:
				return getPattern();
			case CypherPackage.PATTERN_COMPREHENSION__WHERE:
				return getWhere();
			case CypherPackage.PATTERN_COMPREHENSION__PROJECTION:
				return getProjection();
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
			case CypherPackage.PATTERN_COMPREHENSION__VARIABLE:
				setVariable((String)newValue);
				return;
			case CypherPackage.PATTERN_COMPREHENSION__PATTERN:
				setPattern((PatternElement)newValue);
				return;
			case CypherPackage.PATTERN_COMPREHENSION__WHERE:
				setWhere((Expression)newValue);
				return;
			case CypherPackage.PATTERN_COMPREHENSION__PROJECTION:
				setProjection((Expression)newValue);
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
			case CypherPackage.PATTERN_COMPREHENSION__VARIABLE:
				setVariable(VARIABLE_EDEFAULT);
				return;
			case CypherPackage.PATTERN_COMPREHENSION__PATTERN:
				setPattern((PatternElement)null);
				return;
			case CypherPackage.PATTERN_COMPREHENSION__WHERE:
				setWhere((Expression)null);
				return;
			case CypherPackage.PATTERN_COMPREHENSION__PROJECTION:
				setProjection((Expression)null);
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
			case CypherPackage.PATTERN_COMPREHENSION__VARIABLE:
				return VARIABLE_EDEFAULT == null ? getVariable() != null : !VARIABLE_EDEFAULT.equals(getVariable());
			case CypherPackage.PATTERN_COMPREHENSION__PATTERN:
				return getPattern() != null;
			case CypherPackage.PATTERN_COMPREHENSION__WHERE:
				return getWhere() != null;
			case CypherPackage.PATTERN_COMPREHENSION__PROJECTION:
				return getProjection() != null;
		}
		return super.eIsSet(featureID);
	}

} //PatternComprehensionImpl
