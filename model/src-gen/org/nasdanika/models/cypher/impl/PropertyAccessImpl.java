/**
 */
package org.nasdanika.models.cypher.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.cypher.CypherPackage;
import org.nasdanika.models.cypher.Expression;
import org.nasdanika.models.cypher.PropertyAccess;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.impl.PropertyAccessImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.PropertyAccessImpl#getPropertyKey <em>Property Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyAccessImpl extends ExpressionImpl implements PropertyAccess {
	/**
	 * The default value of the '{@link #getPropertyKey() <em>Property Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyKey()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_KEY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CypherPackage.Literals.PROPERTY_ACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getTarget() {
		return (Expression)eDynamicGet(CypherPackage.PROPERTY_ACCESS__TARGET, CypherPackage.Literals.PROPERTY_ACCESS__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Expression newTarget, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTarget, CypherPackage.PROPERTY_ACCESS__TARGET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Expression newTarget) {
		eDynamicSet(CypherPackage.PROPERTY_ACCESS__TARGET, CypherPackage.Literals.PROPERTY_ACCESS__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyKey() {
		return (String)eDynamicGet(CypherPackage.PROPERTY_ACCESS__PROPERTY_KEY, CypherPackage.Literals.PROPERTY_ACCESS__PROPERTY_KEY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyKey(String newPropertyKey) {
		eDynamicSet(CypherPackage.PROPERTY_ACCESS__PROPERTY_KEY, CypherPackage.Literals.PROPERTY_ACCESS__PROPERTY_KEY, newPropertyKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CypherPackage.PROPERTY_ACCESS__TARGET:
				return basicSetTarget(null, msgs);
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
			case CypherPackage.PROPERTY_ACCESS__TARGET:
				return getTarget();
			case CypherPackage.PROPERTY_ACCESS__PROPERTY_KEY:
				return getPropertyKey();
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
			case CypherPackage.PROPERTY_ACCESS__TARGET:
				setTarget((Expression)newValue);
				return;
			case CypherPackage.PROPERTY_ACCESS__PROPERTY_KEY:
				setPropertyKey((String)newValue);
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
			case CypherPackage.PROPERTY_ACCESS__TARGET:
				setTarget((Expression)null);
				return;
			case CypherPackage.PROPERTY_ACCESS__PROPERTY_KEY:
				setPropertyKey(PROPERTY_KEY_EDEFAULT);
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
			case CypherPackage.PROPERTY_ACCESS__TARGET:
				return getTarget() != null;
			case CypherPackage.PROPERTY_ACCESS__PROPERTY_KEY:
				return PROPERTY_KEY_EDEFAULT == null ? getPropertyKey() != null : !PROPERTY_KEY_EDEFAULT.equals(getPropertyKey());
		}
		return super.eIsSet(featureID);
	}

} //PropertyAccessImpl
