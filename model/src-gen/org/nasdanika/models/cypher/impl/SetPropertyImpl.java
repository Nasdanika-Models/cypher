/**
 */
package org.nasdanika.models.cypher.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.cypher.CypherPackage;
import org.nasdanika.models.cypher.Expression;
import org.nasdanika.models.cypher.PropertyAccess;
import org.nasdanika.models.cypher.SetProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.impl.SetPropertyImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.SetPropertyImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetPropertyImpl extends SetItemImpl implements SetProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CypherPackage.Literals.SET_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyAccess getProperty() {
		return (PropertyAccess)eDynamicGet(CypherPackage.SET_PROPERTY__PROPERTY, CypherPackage.Literals.SET_PROPERTY__PROPERTY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(PropertyAccess newProperty, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newProperty, CypherPackage.SET_PROPERTY__PROPERTY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(PropertyAccess newProperty) {
		eDynamicSet(CypherPackage.SET_PROPERTY__PROPERTY, CypherPackage.Literals.SET_PROPERTY__PROPERTY, newProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getValue() {
		return (Expression)eDynamicGet(CypherPackage.SET_PROPERTY__VALUE, CypherPackage.Literals.SET_PROPERTY__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Expression newValue, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newValue, CypherPackage.SET_PROPERTY__VALUE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Expression newValue) {
		eDynamicSet(CypherPackage.SET_PROPERTY__VALUE, CypherPackage.Literals.SET_PROPERTY__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CypherPackage.SET_PROPERTY__PROPERTY:
				return basicSetProperty(null, msgs);
			case CypherPackage.SET_PROPERTY__VALUE:
				return basicSetValue(null, msgs);
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
			case CypherPackage.SET_PROPERTY__PROPERTY:
				return getProperty();
			case CypherPackage.SET_PROPERTY__VALUE:
				return getValue();
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
			case CypherPackage.SET_PROPERTY__PROPERTY:
				setProperty((PropertyAccess)newValue);
				return;
			case CypherPackage.SET_PROPERTY__VALUE:
				setValue((Expression)newValue);
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
			case CypherPackage.SET_PROPERTY__PROPERTY:
				setProperty((PropertyAccess)null);
				return;
			case CypherPackage.SET_PROPERTY__VALUE:
				setValue((Expression)null);
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
			case CypherPackage.SET_PROPERTY__PROPERTY:
				return getProperty() != null;
			case CypherPackage.SET_PROPERTY__VALUE:
				return getValue() != null;
		}
		return super.eIsSet(featureID);
	}

} //SetPropertyImpl
