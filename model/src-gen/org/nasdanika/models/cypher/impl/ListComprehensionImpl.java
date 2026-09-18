/**
 */
package org.nasdanika.models.cypher.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.cypher.CypherPackage;
import org.nasdanika.models.cypher.Expression;
import org.nasdanika.models.cypher.ListComprehension;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Comprehension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.impl.ListComprehensionImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.ListComprehensionImpl#getList <em>List</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.ListComprehensionImpl#getWhere <em>Where</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.ListComprehensionImpl#getProjection <em>Projection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListComprehensionImpl extends ExpressionImpl implements ListComprehension {
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
	protected ListComprehensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CypherPackage.Literals.LIST_COMPREHENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariable() {
		return (String)eDynamicGet(CypherPackage.LIST_COMPREHENSION__VARIABLE, CypherPackage.Literals.LIST_COMPREHENSION__VARIABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(String newVariable) {
		eDynamicSet(CypherPackage.LIST_COMPREHENSION__VARIABLE, CypherPackage.Literals.LIST_COMPREHENSION__VARIABLE, newVariable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getList() {
		return (Expression)eDynamicGet(CypherPackage.LIST_COMPREHENSION__LIST, CypherPackage.Literals.LIST_COMPREHENSION__LIST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetList(Expression newList, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newList, CypherPackage.LIST_COMPREHENSION__LIST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setList(Expression newList) {
		eDynamicSet(CypherPackage.LIST_COMPREHENSION__LIST, CypherPackage.Literals.LIST_COMPREHENSION__LIST, newList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getWhere() {
		return (Expression)eDynamicGet(CypherPackage.LIST_COMPREHENSION__WHERE, CypherPackage.Literals.LIST_COMPREHENSION__WHERE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhere(Expression newWhere, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newWhere, CypherPackage.LIST_COMPREHENSION__WHERE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhere(Expression newWhere) {
		eDynamicSet(CypherPackage.LIST_COMPREHENSION__WHERE, CypherPackage.Literals.LIST_COMPREHENSION__WHERE, newWhere);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getProjection() {
		return (Expression)eDynamicGet(CypherPackage.LIST_COMPREHENSION__PROJECTION, CypherPackage.Literals.LIST_COMPREHENSION__PROJECTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProjection(Expression newProjection, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newProjection, CypherPackage.LIST_COMPREHENSION__PROJECTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjection(Expression newProjection) {
		eDynamicSet(CypherPackage.LIST_COMPREHENSION__PROJECTION, CypherPackage.Literals.LIST_COMPREHENSION__PROJECTION, newProjection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CypherPackage.LIST_COMPREHENSION__LIST:
				return basicSetList(null, msgs);
			case CypherPackage.LIST_COMPREHENSION__WHERE:
				return basicSetWhere(null, msgs);
			case CypherPackage.LIST_COMPREHENSION__PROJECTION:
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
			case CypherPackage.LIST_COMPREHENSION__VARIABLE:
				return getVariable();
			case CypherPackage.LIST_COMPREHENSION__LIST:
				return getList();
			case CypherPackage.LIST_COMPREHENSION__WHERE:
				return getWhere();
			case CypherPackage.LIST_COMPREHENSION__PROJECTION:
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
			case CypherPackage.LIST_COMPREHENSION__VARIABLE:
				setVariable((String)newValue);
				return;
			case CypherPackage.LIST_COMPREHENSION__LIST:
				setList((Expression)newValue);
				return;
			case CypherPackage.LIST_COMPREHENSION__WHERE:
				setWhere((Expression)newValue);
				return;
			case CypherPackage.LIST_COMPREHENSION__PROJECTION:
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
			case CypherPackage.LIST_COMPREHENSION__VARIABLE:
				setVariable(VARIABLE_EDEFAULT);
				return;
			case CypherPackage.LIST_COMPREHENSION__LIST:
				setList((Expression)null);
				return;
			case CypherPackage.LIST_COMPREHENSION__WHERE:
				setWhere((Expression)null);
				return;
			case CypherPackage.LIST_COMPREHENSION__PROJECTION:
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
			case CypherPackage.LIST_COMPREHENSION__VARIABLE:
				return VARIABLE_EDEFAULT == null ? getVariable() != null : !VARIABLE_EDEFAULT.equals(getVariable());
			case CypherPackage.LIST_COMPREHENSION__LIST:
				return getList() != null;
			case CypherPackage.LIST_COMPREHENSION__WHERE:
				return getWhere() != null;
			case CypherPackage.LIST_COMPREHENSION__PROJECTION:
				return getProjection() != null;
		}
		return super.eIsSet(featureID);
	}

} //ListComprehensionImpl
