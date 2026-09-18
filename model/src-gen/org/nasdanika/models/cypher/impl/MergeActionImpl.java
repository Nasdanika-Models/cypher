/**
 */
package org.nasdanika.models.cypher.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.cypher.CypherPackage;
import org.nasdanika.models.cypher.MergeAction;
import org.nasdanika.models.cypher.MergeActionKind;
import org.nasdanika.models.cypher.SetClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merge Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.impl.MergeActionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.MergeActionImpl#getSet <em>Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MergeActionImpl extends CypherElementImpl implements MergeAction {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final MergeActionKind KIND_EDEFAULT = MergeActionKind.ON_CREATE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MergeActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CypherPackage.Literals.MERGE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeActionKind getKind() {
		return (MergeActionKind)eDynamicGet(CypherPackage.MERGE_ACTION__KIND, CypherPackage.Literals.MERGE_ACTION__KIND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(MergeActionKind newKind) {
		eDynamicSet(CypherPackage.MERGE_ACTION__KIND, CypherPackage.Literals.MERGE_ACTION__KIND, newKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetClause getSet() {
		return (SetClause)eDynamicGet(CypherPackage.MERGE_ACTION__SET, CypherPackage.Literals.MERGE_ACTION__SET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSet(SetClause newSet, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSet, CypherPackage.MERGE_ACTION__SET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSet(SetClause newSet) {
		eDynamicSet(CypherPackage.MERGE_ACTION__SET, CypherPackage.Literals.MERGE_ACTION__SET, newSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CypherPackage.MERGE_ACTION__SET:
				return basicSetSet(null, msgs);
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
			case CypherPackage.MERGE_ACTION__KIND:
				return getKind();
			case CypherPackage.MERGE_ACTION__SET:
				return getSet();
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
			case CypherPackage.MERGE_ACTION__KIND:
				setKind((MergeActionKind)newValue);
				return;
			case CypherPackage.MERGE_ACTION__SET:
				setSet((SetClause)newValue);
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
			case CypherPackage.MERGE_ACTION__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case CypherPackage.MERGE_ACTION__SET:
				setSet((SetClause)null);
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
			case CypherPackage.MERGE_ACTION__KIND:
				return getKind() != KIND_EDEFAULT;
			case CypherPackage.MERGE_ACTION__SET:
				return getSet() != null;
		}
		return super.eIsSet(featureID);
	}

} //MergeActionImpl
