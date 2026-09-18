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
import org.nasdanika.models.cypher.Expression;
import org.nasdanika.models.cypher.ProjectionClause;
import org.nasdanika.models.cypher.ProjectionItem;
import org.nasdanika.models.cypher.SortItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Projection Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.impl.ProjectionClauseImpl#isDistinct <em>Distinct</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.ProjectionClauseImpl#isAll <em>All</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.ProjectionClauseImpl#getItems <em>Items</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.ProjectionClauseImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.ProjectionClauseImpl#getSkip <em>Skip</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.ProjectionClauseImpl#getLimit <em>Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ProjectionClauseImpl extends ClauseImpl implements ProjectionClause {
	/**
	 * The default value of the '{@link #isDistinct() <em>Distinct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDistinct()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISTINCT_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isAll() <em>All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAll()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALL_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectionClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CypherPackage.Literals.PROJECTION_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDistinct() {
		return (Boolean)eDynamicGet(CypherPackage.PROJECTION_CLAUSE__DISTINCT, CypherPackage.Literals.PROJECTION_CLAUSE__DISTINCT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistinct(boolean newDistinct) {
		eDynamicSet(CypherPackage.PROJECTION_CLAUSE__DISTINCT, CypherPackage.Literals.PROJECTION_CLAUSE__DISTINCT, newDistinct);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAll() {
		return (Boolean)eDynamicGet(CypherPackage.PROJECTION_CLAUSE__ALL, CypherPackage.Literals.PROJECTION_CLAUSE__ALL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAll(boolean newAll) {
		eDynamicSet(CypherPackage.PROJECTION_CLAUSE__ALL, CypherPackage.Literals.PROJECTION_CLAUSE__ALL, newAll);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ProjectionItem> getItems() {
		return (EList<ProjectionItem>)eDynamicGet(CypherPackage.PROJECTION_CLAUSE__ITEMS, CypherPackage.Literals.PROJECTION_CLAUSE__ITEMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SortItem> getOrder() {
		return (EList<SortItem>)eDynamicGet(CypherPackage.PROJECTION_CLAUSE__ORDER, CypherPackage.Literals.PROJECTION_CLAUSE__ORDER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getSkip() {
		return (Expression)eDynamicGet(CypherPackage.PROJECTION_CLAUSE__SKIP, CypherPackage.Literals.PROJECTION_CLAUSE__SKIP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSkip(Expression newSkip, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSkip, CypherPackage.PROJECTION_CLAUSE__SKIP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkip(Expression newSkip) {
		eDynamicSet(CypherPackage.PROJECTION_CLAUSE__SKIP, CypherPackage.Literals.PROJECTION_CLAUSE__SKIP, newSkip);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLimit() {
		return (Expression)eDynamicGet(CypherPackage.PROJECTION_CLAUSE__LIMIT, CypherPackage.Literals.PROJECTION_CLAUSE__LIMIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLimit(Expression newLimit, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLimit, CypherPackage.PROJECTION_CLAUSE__LIMIT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimit(Expression newLimit) {
		eDynamicSet(CypherPackage.PROJECTION_CLAUSE__LIMIT, CypherPackage.Literals.PROJECTION_CLAUSE__LIMIT, newLimit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CypherPackage.PROJECTION_CLAUSE__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
			case CypherPackage.PROJECTION_CLAUSE__ORDER:
				return ((InternalEList<?>)getOrder()).basicRemove(otherEnd, msgs);
			case CypherPackage.PROJECTION_CLAUSE__SKIP:
				return basicSetSkip(null, msgs);
			case CypherPackage.PROJECTION_CLAUSE__LIMIT:
				return basicSetLimit(null, msgs);
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
			case CypherPackage.PROJECTION_CLAUSE__DISTINCT:
				return isDistinct();
			case CypherPackage.PROJECTION_CLAUSE__ALL:
				return isAll();
			case CypherPackage.PROJECTION_CLAUSE__ITEMS:
				return getItems();
			case CypherPackage.PROJECTION_CLAUSE__ORDER:
				return getOrder();
			case CypherPackage.PROJECTION_CLAUSE__SKIP:
				return getSkip();
			case CypherPackage.PROJECTION_CLAUSE__LIMIT:
				return getLimit();
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
			case CypherPackage.PROJECTION_CLAUSE__DISTINCT:
				setDistinct((Boolean)newValue);
				return;
			case CypherPackage.PROJECTION_CLAUSE__ALL:
				setAll((Boolean)newValue);
				return;
			case CypherPackage.PROJECTION_CLAUSE__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends ProjectionItem>)newValue);
				return;
			case CypherPackage.PROJECTION_CLAUSE__ORDER:
				getOrder().clear();
				getOrder().addAll((Collection<? extends SortItem>)newValue);
				return;
			case CypherPackage.PROJECTION_CLAUSE__SKIP:
				setSkip((Expression)newValue);
				return;
			case CypherPackage.PROJECTION_CLAUSE__LIMIT:
				setLimit((Expression)newValue);
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
			case CypherPackage.PROJECTION_CLAUSE__DISTINCT:
				setDistinct(DISTINCT_EDEFAULT);
				return;
			case CypherPackage.PROJECTION_CLAUSE__ALL:
				setAll(ALL_EDEFAULT);
				return;
			case CypherPackage.PROJECTION_CLAUSE__ITEMS:
				getItems().clear();
				return;
			case CypherPackage.PROJECTION_CLAUSE__ORDER:
				getOrder().clear();
				return;
			case CypherPackage.PROJECTION_CLAUSE__SKIP:
				setSkip((Expression)null);
				return;
			case CypherPackage.PROJECTION_CLAUSE__LIMIT:
				setLimit((Expression)null);
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
			case CypherPackage.PROJECTION_CLAUSE__DISTINCT:
				return isDistinct() != DISTINCT_EDEFAULT;
			case CypherPackage.PROJECTION_CLAUSE__ALL:
				return isAll() != ALL_EDEFAULT;
			case CypherPackage.PROJECTION_CLAUSE__ITEMS:
				return !getItems().isEmpty();
			case CypherPackage.PROJECTION_CLAUSE__ORDER:
				return !getOrder().isEmpty();
			case CypherPackage.PROJECTION_CLAUSE__SKIP:
				return getSkip() != null;
			case CypherPackage.PROJECTION_CLAUSE__LIMIT:
				return getLimit() != null;
		}
		return super.eIsSet(featureID);
	}

} //ProjectionClauseImpl
