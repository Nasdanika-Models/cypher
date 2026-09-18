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
import org.nasdanika.models.cypher.FunctionInvocation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.impl.FunctionInvocationImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.FunctionInvocationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.FunctionInvocationImpl#isDistinct <em>Distinct</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.FunctionInvocationImpl#isStar <em>Star</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.FunctionInvocationImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionInvocationImpl extends ExpressionImpl implements FunctionInvocation {
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
	 * The default value of the '{@link #isDistinct() <em>Distinct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDistinct()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISTINCT_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isStar() <em>Star</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStar()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STAR_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionInvocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CypherPackage.Literals.FUNCTION_INVOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getNamespace() {
		return (EList<String>)eDynamicGet(CypherPackage.FUNCTION_INVOCATION__NAMESPACE, CypherPackage.Literals.FUNCTION_INVOCATION__NAMESPACE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(CypherPackage.FUNCTION_INVOCATION__NAME, CypherPackage.Literals.FUNCTION_INVOCATION__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(CypherPackage.FUNCTION_INVOCATION__NAME, CypherPackage.Literals.FUNCTION_INVOCATION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDistinct() {
		return (Boolean)eDynamicGet(CypherPackage.FUNCTION_INVOCATION__DISTINCT, CypherPackage.Literals.FUNCTION_INVOCATION__DISTINCT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistinct(boolean newDistinct) {
		eDynamicSet(CypherPackage.FUNCTION_INVOCATION__DISTINCT, CypherPackage.Literals.FUNCTION_INVOCATION__DISTINCT, newDistinct);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStar() {
		return (Boolean)eDynamicGet(CypherPackage.FUNCTION_INVOCATION__STAR, CypherPackage.Literals.FUNCTION_INVOCATION__STAR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStar(boolean newStar) {
		eDynamicSet(CypherPackage.FUNCTION_INVOCATION__STAR, CypherPackage.Literals.FUNCTION_INVOCATION__STAR, newStar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Expression> getArguments() {
		return (EList<Expression>)eDynamicGet(CypherPackage.FUNCTION_INVOCATION__ARGUMENTS, CypherPackage.Literals.FUNCTION_INVOCATION__ARGUMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CypherPackage.FUNCTION_INVOCATION__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
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
			case CypherPackage.FUNCTION_INVOCATION__NAMESPACE:
				return getNamespace();
			case CypherPackage.FUNCTION_INVOCATION__NAME:
				return getName();
			case CypherPackage.FUNCTION_INVOCATION__DISTINCT:
				return isDistinct();
			case CypherPackage.FUNCTION_INVOCATION__STAR:
				return isStar();
			case CypherPackage.FUNCTION_INVOCATION__ARGUMENTS:
				return getArguments();
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
			case CypherPackage.FUNCTION_INVOCATION__NAMESPACE:
				getNamespace().clear();
				getNamespace().addAll((Collection<? extends String>)newValue);
				return;
			case CypherPackage.FUNCTION_INVOCATION__NAME:
				setName((String)newValue);
				return;
			case CypherPackage.FUNCTION_INVOCATION__DISTINCT:
				setDistinct((Boolean)newValue);
				return;
			case CypherPackage.FUNCTION_INVOCATION__STAR:
				setStar((Boolean)newValue);
				return;
			case CypherPackage.FUNCTION_INVOCATION__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Expression>)newValue);
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
			case CypherPackage.FUNCTION_INVOCATION__NAMESPACE:
				getNamespace().clear();
				return;
			case CypherPackage.FUNCTION_INVOCATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CypherPackage.FUNCTION_INVOCATION__DISTINCT:
				setDistinct(DISTINCT_EDEFAULT);
				return;
			case CypherPackage.FUNCTION_INVOCATION__STAR:
				setStar(STAR_EDEFAULT);
				return;
			case CypherPackage.FUNCTION_INVOCATION__ARGUMENTS:
				getArguments().clear();
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
			case CypherPackage.FUNCTION_INVOCATION__NAMESPACE:
				return !getNamespace().isEmpty();
			case CypherPackage.FUNCTION_INVOCATION__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case CypherPackage.FUNCTION_INVOCATION__DISTINCT:
				return isDistinct() != DISTINCT_EDEFAULT;
			case CypherPackage.FUNCTION_INVOCATION__STAR:
				return isStar() != STAR_EDEFAULT;
			case CypherPackage.FUNCTION_INVOCATION__ARGUMENTS:
				return !getArguments().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionInvocationImpl
