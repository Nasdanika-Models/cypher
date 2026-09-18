/**
 */
package org.nasdanika.models.cypher.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.cypher.CallClause;
import org.nasdanika.models.cypher.CypherPackage;
import org.nasdanika.models.cypher.Expression;
import org.nasdanika.models.cypher.ProjectionItem;
import org.nasdanika.models.cypher.Query;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.impl.CallClauseImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.CallClauseImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.CallClauseImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.CallClauseImpl#getYieldItems <em>Yield Items</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.CallClauseImpl#getWhere <em>Where</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.CallClauseImpl#getSubquery <em>Subquery</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallClauseImpl extends ClauseImpl implements CallClause {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CypherPackage.Literals.CALL_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getNamespace() {
		return (EList<String>)eDynamicGet(CypherPackage.CALL_CLAUSE__NAMESPACE, CypherPackage.Literals.CALL_CLAUSE__NAMESPACE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(CypherPackage.CALL_CLAUSE__NAME, CypherPackage.Literals.CALL_CLAUSE__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(CypherPackage.CALL_CLAUSE__NAME, CypherPackage.Literals.CALL_CLAUSE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Expression> getArguments() {
		return (EList<Expression>)eDynamicGet(CypherPackage.CALL_CLAUSE__ARGUMENTS, CypherPackage.Literals.CALL_CLAUSE__ARGUMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ProjectionItem> getYieldItems() {
		return (EList<ProjectionItem>)eDynamicGet(CypherPackage.CALL_CLAUSE__YIELD_ITEMS, CypherPackage.Literals.CALL_CLAUSE__YIELD_ITEMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getWhere() {
		return (Expression)eDynamicGet(CypherPackage.CALL_CLAUSE__WHERE, CypherPackage.Literals.CALL_CLAUSE__WHERE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhere(Expression newWhere, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newWhere, CypherPackage.CALL_CLAUSE__WHERE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhere(Expression newWhere) {
		eDynamicSet(CypherPackage.CALL_CLAUSE__WHERE, CypherPackage.Literals.CALL_CLAUSE__WHERE, newWhere);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query getSubquery() {
		return (Query)eDynamicGet(CypherPackage.CALL_CLAUSE__SUBQUERY, CypherPackage.Literals.CALL_CLAUSE__SUBQUERY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubquery(Query newSubquery, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSubquery, CypherPackage.CALL_CLAUSE__SUBQUERY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubquery(Query newSubquery) {
		eDynamicSet(CypherPackage.CALL_CLAUSE__SUBQUERY, CypherPackage.Literals.CALL_CLAUSE__SUBQUERY, newSubquery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CypherPackage.CALL_CLAUSE__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
			case CypherPackage.CALL_CLAUSE__YIELD_ITEMS:
				return ((InternalEList<?>)getYieldItems()).basicRemove(otherEnd, msgs);
			case CypherPackage.CALL_CLAUSE__WHERE:
				return basicSetWhere(null, msgs);
			case CypherPackage.CALL_CLAUSE__SUBQUERY:
				return basicSetSubquery(null, msgs);
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
			case CypherPackage.CALL_CLAUSE__NAMESPACE:
				return getNamespace();
			case CypherPackage.CALL_CLAUSE__NAME:
				return getName();
			case CypherPackage.CALL_CLAUSE__ARGUMENTS:
				return getArguments();
			case CypherPackage.CALL_CLAUSE__YIELD_ITEMS:
				return getYieldItems();
			case CypherPackage.CALL_CLAUSE__WHERE:
				return getWhere();
			case CypherPackage.CALL_CLAUSE__SUBQUERY:
				return getSubquery();
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
			case CypherPackage.CALL_CLAUSE__NAMESPACE:
				getNamespace().clear();
				getNamespace().addAll((Collection<? extends String>)newValue);
				return;
			case CypherPackage.CALL_CLAUSE__NAME:
				setName((String)newValue);
				return;
			case CypherPackage.CALL_CLAUSE__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Expression>)newValue);
				return;
			case CypherPackage.CALL_CLAUSE__YIELD_ITEMS:
				getYieldItems().clear();
				getYieldItems().addAll((Collection<? extends ProjectionItem>)newValue);
				return;
			case CypherPackage.CALL_CLAUSE__WHERE:
				setWhere((Expression)newValue);
				return;
			case CypherPackage.CALL_CLAUSE__SUBQUERY:
				setSubquery((Query)newValue);
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
			case CypherPackage.CALL_CLAUSE__NAMESPACE:
				getNamespace().clear();
				return;
			case CypherPackage.CALL_CLAUSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CypherPackage.CALL_CLAUSE__ARGUMENTS:
				getArguments().clear();
				return;
			case CypherPackage.CALL_CLAUSE__YIELD_ITEMS:
				getYieldItems().clear();
				return;
			case CypherPackage.CALL_CLAUSE__WHERE:
				setWhere((Expression)null);
				return;
			case CypherPackage.CALL_CLAUSE__SUBQUERY:
				setSubquery((Query)null);
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
			case CypherPackage.CALL_CLAUSE__NAMESPACE:
				return !getNamespace().isEmpty();
			case CypherPackage.CALL_CLAUSE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case CypherPackage.CALL_CLAUSE__ARGUMENTS:
				return !getArguments().isEmpty();
			case CypherPackage.CALL_CLAUSE__YIELD_ITEMS:
				return !getYieldItems().isEmpty();
			case CypherPackage.CALL_CLAUSE__WHERE:
				return getWhere() != null;
			case CypherPackage.CALL_CLAUSE__SUBQUERY:
				return getSubquery() != null;
		}
		return super.eIsSet(featureID);
	}

} //CallClauseImpl
