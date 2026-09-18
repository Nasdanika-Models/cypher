/**
 */
package org.nasdanika.models.cypher.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.cypher.CypherPackage;
import org.nasdanika.models.cypher.Expression;
import org.nasdanika.models.cypher.MatchClause;
import org.nasdanika.models.cypher.Pattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.impl.MatchClauseImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.MatchClauseImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.MatchClauseImpl#getWhere <em>Where</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchClauseImpl extends ClauseImpl implements MatchClause {
	/**
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CypherPackage.Literals.MATCH_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptional() {
		return (Boolean)eDynamicGet(CypherPackage.MATCH_CLAUSE__OPTIONAL, CypherPackage.Literals.MATCH_CLAUSE__OPTIONAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional(boolean newOptional) {
		eDynamicSet(CypherPackage.MATCH_CLAUSE__OPTIONAL, CypherPackage.Literals.MATCH_CLAUSE__OPTIONAL, newOptional);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern getPattern() {
		return (Pattern)eDynamicGet(CypherPackage.MATCH_CLAUSE__PATTERN, CypherPackage.Literals.MATCH_CLAUSE__PATTERN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPattern(Pattern newPattern, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newPattern, CypherPackage.MATCH_CLAUSE__PATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(Pattern newPattern) {
		eDynamicSet(CypherPackage.MATCH_CLAUSE__PATTERN, CypherPackage.Literals.MATCH_CLAUSE__PATTERN, newPattern);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getWhere() {
		return (Expression)eDynamicGet(CypherPackage.MATCH_CLAUSE__WHERE, CypherPackage.Literals.MATCH_CLAUSE__WHERE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhere(Expression newWhere, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newWhere, CypherPackage.MATCH_CLAUSE__WHERE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhere(Expression newWhere) {
		eDynamicSet(CypherPackage.MATCH_CLAUSE__WHERE, CypherPackage.Literals.MATCH_CLAUSE__WHERE, newWhere);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CypherPackage.MATCH_CLAUSE__PATTERN:
				return basicSetPattern(null, msgs);
			case CypherPackage.MATCH_CLAUSE__WHERE:
				return basicSetWhere(null, msgs);
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
			case CypherPackage.MATCH_CLAUSE__OPTIONAL:
				return isOptional();
			case CypherPackage.MATCH_CLAUSE__PATTERN:
				return getPattern();
			case CypherPackage.MATCH_CLAUSE__WHERE:
				return getWhere();
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
			case CypherPackage.MATCH_CLAUSE__OPTIONAL:
				setOptional((Boolean)newValue);
				return;
			case CypherPackage.MATCH_CLAUSE__PATTERN:
				setPattern((Pattern)newValue);
				return;
			case CypherPackage.MATCH_CLAUSE__WHERE:
				setWhere((Expression)newValue);
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
			case CypherPackage.MATCH_CLAUSE__OPTIONAL:
				setOptional(OPTIONAL_EDEFAULT);
				return;
			case CypherPackage.MATCH_CLAUSE__PATTERN:
				setPattern((Pattern)null);
				return;
			case CypherPackage.MATCH_CLAUSE__WHERE:
				setWhere((Expression)null);
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
			case CypherPackage.MATCH_CLAUSE__OPTIONAL:
				return isOptional() != OPTIONAL_EDEFAULT;
			case CypherPackage.MATCH_CLAUSE__PATTERN:
				return getPattern() != null;
			case CypherPackage.MATCH_CLAUSE__WHERE:
				return getWhere() != null;
		}
		return super.eIsSet(featureID);
	}

} //MatchClauseImpl
