/**
 */
package org.nasdanika.models.cypher.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.cypher.CypherPackage;
import org.nasdanika.models.cypher.UnparsedStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unparsed Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.impl.UnparsedStatementImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.UnparsedStatementImpl#getError <em>Error</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnparsedStatementImpl extends StatementImpl implements UnparsedStatement {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getError() <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnparsedStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CypherPackage.Literals.UNPARSED_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return (String)eDynamicGet(CypherPackage.UNPARSED_STATEMENT__TEXT, CypherPackage.Literals.UNPARSED_STATEMENT__TEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		eDynamicSet(CypherPackage.UNPARSED_STATEMENT__TEXT, CypherPackage.Literals.UNPARSED_STATEMENT__TEXT, newText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getError() {
		return (String)eDynamicGet(CypherPackage.UNPARSED_STATEMENT__ERROR, CypherPackage.Literals.UNPARSED_STATEMENT__ERROR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setError(String newError) {
		eDynamicSet(CypherPackage.UNPARSED_STATEMENT__ERROR, CypherPackage.Literals.UNPARSED_STATEMENT__ERROR, newError);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CypherPackage.UNPARSED_STATEMENT__TEXT:
				return getText();
			case CypherPackage.UNPARSED_STATEMENT__ERROR:
				return getError();
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
			case CypherPackage.UNPARSED_STATEMENT__TEXT:
				setText((String)newValue);
				return;
			case CypherPackage.UNPARSED_STATEMENT__ERROR:
				setError((String)newValue);
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
			case CypherPackage.UNPARSED_STATEMENT__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case CypherPackage.UNPARSED_STATEMENT__ERROR:
				setError(ERROR_EDEFAULT);
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
			case CypherPackage.UNPARSED_STATEMENT__TEXT:
				return TEXT_EDEFAULT == null ? getText() != null : !TEXT_EDEFAULT.equals(getText());
			case CypherPackage.UNPARSED_STATEMENT__ERROR:
				return ERROR_EDEFAULT == null ? getError() != null : !ERROR_EDEFAULT.equals(getError());
		}
		return super.eIsSet(featureID);
	}

} //UnparsedStatementImpl
