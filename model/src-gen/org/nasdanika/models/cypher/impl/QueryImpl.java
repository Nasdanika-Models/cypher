/**
 */
package org.nasdanika.models.cypher.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.cypher.CypherPackage;
import org.nasdanika.models.cypher.Query;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.impl.QueryImpl#isExplain <em>Explain</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.QueryImpl#isProfile <em>Profile</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class QueryImpl extends StatementImpl implements Query {
	/**
	 * The default value of the '{@link #isExplain() <em>Explain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExplain()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPLAIN_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isProfile() <em>Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProfile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROFILE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CypherPackage.Literals.QUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExplain() {
		return (Boolean)eDynamicGet(CypherPackage.QUERY__EXPLAIN, CypherPackage.Literals.QUERY__EXPLAIN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExplain(boolean newExplain) {
		eDynamicSet(CypherPackage.QUERY__EXPLAIN, CypherPackage.Literals.QUERY__EXPLAIN, newExplain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProfile() {
		return (Boolean)eDynamicGet(CypherPackage.QUERY__PROFILE, CypherPackage.Literals.QUERY__PROFILE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfile(boolean newProfile) {
		eDynamicSet(CypherPackage.QUERY__PROFILE, CypherPackage.Literals.QUERY__PROFILE, newProfile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CypherPackage.QUERY__EXPLAIN:
				return isExplain();
			case CypherPackage.QUERY__PROFILE:
				return isProfile();
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
			case CypherPackage.QUERY__EXPLAIN:
				setExplain((Boolean)newValue);
				return;
			case CypherPackage.QUERY__PROFILE:
				setProfile((Boolean)newValue);
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
			case CypherPackage.QUERY__EXPLAIN:
				setExplain(EXPLAIN_EDEFAULT);
				return;
			case CypherPackage.QUERY__PROFILE:
				setProfile(PROFILE_EDEFAULT);
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
			case CypherPackage.QUERY__EXPLAIN:
				return isExplain() != EXPLAIN_EDEFAULT;
			case CypherPackage.QUERY__PROFILE:
				return isProfile() != PROFILE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //QueryImpl
