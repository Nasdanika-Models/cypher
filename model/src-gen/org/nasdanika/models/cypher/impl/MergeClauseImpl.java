/**
 */
package org.nasdanika.models.cypher.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.cypher.CypherPackage;
import org.nasdanika.models.cypher.MergeAction;
import org.nasdanika.models.cypher.MergeClause;
import org.nasdanika.models.cypher.PatternPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merge Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.impl.MergeClauseImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.MergeClauseImpl#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MergeClauseImpl extends ClauseImpl implements MergeClause {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MergeClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CypherPackage.Literals.MERGE_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternPart getPattern() {
		return (PatternPart)eDynamicGet(CypherPackage.MERGE_CLAUSE__PATTERN, CypherPackage.Literals.MERGE_CLAUSE__PATTERN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPattern(PatternPart newPattern, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newPattern, CypherPackage.MERGE_CLAUSE__PATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(PatternPart newPattern) {
		eDynamicSet(CypherPackage.MERGE_CLAUSE__PATTERN, CypherPackage.Literals.MERGE_CLAUSE__PATTERN, newPattern);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<MergeAction> getActions() {
		return (EList<MergeAction>)eDynamicGet(CypherPackage.MERGE_CLAUSE__ACTIONS, CypherPackage.Literals.MERGE_CLAUSE__ACTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CypherPackage.MERGE_CLAUSE__PATTERN:
				return basicSetPattern(null, msgs);
			case CypherPackage.MERGE_CLAUSE__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
			case CypherPackage.MERGE_CLAUSE__PATTERN:
				return getPattern();
			case CypherPackage.MERGE_CLAUSE__ACTIONS:
				return getActions();
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
			case CypherPackage.MERGE_CLAUSE__PATTERN:
				setPattern((PatternPart)newValue);
				return;
			case CypherPackage.MERGE_CLAUSE__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends MergeAction>)newValue);
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
			case CypherPackage.MERGE_CLAUSE__PATTERN:
				setPattern((PatternPart)null);
				return;
			case CypherPackage.MERGE_CLAUSE__ACTIONS:
				getActions().clear();
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
			case CypherPackage.MERGE_CLAUSE__PATTERN:
				return getPattern() != null;
			case CypherPackage.MERGE_CLAUSE__ACTIONS:
				return !getActions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MergeClauseImpl
