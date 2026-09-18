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
import org.nasdanika.models.cypher.DeleteClause;
import org.nasdanika.models.cypher.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delete Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.impl.DeleteClauseImpl#isDetach <em>Detach</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.DeleteClauseImpl#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeleteClauseImpl extends ClauseImpl implements DeleteClause {
	/**
	 * The default value of the '{@link #isDetach() <em>Detach</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDetach()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DETACH_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeleteClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CypherPackage.Literals.DELETE_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDetach() {
		return (Boolean)eDynamicGet(CypherPackage.DELETE_CLAUSE__DETACH, CypherPackage.Literals.DELETE_CLAUSE__DETACH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetach(boolean newDetach) {
		eDynamicSet(CypherPackage.DELETE_CLAUSE__DETACH, CypherPackage.Literals.DELETE_CLAUSE__DETACH, newDetach);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Expression> getExpressions() {
		return (EList<Expression>)eDynamicGet(CypherPackage.DELETE_CLAUSE__EXPRESSIONS, CypherPackage.Literals.DELETE_CLAUSE__EXPRESSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CypherPackage.DELETE_CLAUSE__EXPRESSIONS:
				return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
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
			case CypherPackage.DELETE_CLAUSE__DETACH:
				return isDetach();
			case CypherPackage.DELETE_CLAUSE__EXPRESSIONS:
				return getExpressions();
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
			case CypherPackage.DELETE_CLAUSE__DETACH:
				setDetach((Boolean)newValue);
				return;
			case CypherPackage.DELETE_CLAUSE__EXPRESSIONS:
				getExpressions().clear();
				getExpressions().addAll((Collection<? extends Expression>)newValue);
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
			case CypherPackage.DELETE_CLAUSE__DETACH:
				setDetach(DETACH_EDEFAULT);
				return;
			case CypherPackage.DELETE_CLAUSE__EXPRESSIONS:
				getExpressions().clear();
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
			case CypherPackage.DELETE_CLAUSE__DETACH:
				return isDetach() != DETACH_EDEFAULT;
			case CypherPackage.DELETE_CLAUSE__EXPRESSIONS:
				return !getExpressions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeleteClauseImpl
