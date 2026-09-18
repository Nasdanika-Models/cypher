/**
 */
package org.nasdanika.models.cypher.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.cypher.CypherEvaluator;
import org.nasdanika.models.cypher.CypherPackage;
import org.nasdanika.models.cypher.Statement;

import org.nasdanika.models.nxcore.impl.SourceEvaluatorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.impl.CypherEvaluatorImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.CypherEvaluatorImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.CypherEvaluatorImpl#getRowLimit <em>Row Limit</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.CypherEvaluatorImpl#getTimeout <em>Timeout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CypherEvaluatorImpl extends SourceEvaluatorImpl implements CypherEvaluator {
	/**
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = true;

	/**
	 * The default value of the '{@link #getRowLimit() <em>Row Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int ROW_LIMIT_EDEFAULT = -1;

	/**
	 * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int TIMEOUT_EDEFAULT = -1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CypherEvaluatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CypherPackage.Literals.CYPHER_EVALUATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getStatement() {
		return (Statement)eDynamicGet(CypherPackage.CYPHER_EVALUATOR__STATEMENT, CypherPackage.Literals.CYPHER_EVALUATOR__STATEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatement(Statement newStatement, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStatement, CypherPackage.CYPHER_EVALUATOR__STATEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatement(Statement newStatement) {
		eDynamicSet(CypherPackage.CYPHER_EVALUATOR__STATEMENT, CypherPackage.Literals.CYPHER_EVALUATOR__STATEMENT, newStatement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadOnly() {
		return (Boolean)eDynamicGet(CypherPackage.CYPHER_EVALUATOR__READ_ONLY, CypherPackage.Literals.CYPHER_EVALUATOR__READ_ONLY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnly(boolean newReadOnly) {
		eDynamicSet(CypherPackage.CYPHER_EVALUATOR__READ_ONLY, CypherPackage.Literals.CYPHER_EVALUATOR__READ_ONLY, newReadOnly);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRowLimit() {
		return (Integer)eDynamicGet(CypherPackage.CYPHER_EVALUATOR__ROW_LIMIT, CypherPackage.Literals.CYPHER_EVALUATOR__ROW_LIMIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowLimit(int newRowLimit) {
		eDynamicSet(CypherPackage.CYPHER_EVALUATOR__ROW_LIMIT, CypherPackage.Literals.CYPHER_EVALUATOR__ROW_LIMIT, newRowLimit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimeout() {
		return (Integer)eDynamicGet(CypherPackage.CYPHER_EVALUATOR__TIMEOUT, CypherPackage.Literals.CYPHER_EVALUATOR__TIMEOUT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeout(int newTimeout) {
		eDynamicSet(CypherPackage.CYPHER_EVALUATOR__TIMEOUT, CypherPackage.Literals.CYPHER_EVALUATOR__TIMEOUT, newTimeout);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CypherPackage.CYPHER_EVALUATOR__STATEMENT:
				return basicSetStatement(null, msgs);
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
			case CypherPackage.CYPHER_EVALUATOR__STATEMENT:
				return getStatement();
			case CypherPackage.CYPHER_EVALUATOR__READ_ONLY:
				return isReadOnly();
			case CypherPackage.CYPHER_EVALUATOR__ROW_LIMIT:
				return getRowLimit();
			case CypherPackage.CYPHER_EVALUATOR__TIMEOUT:
				return getTimeout();
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
			case CypherPackage.CYPHER_EVALUATOR__STATEMENT:
				setStatement((Statement)newValue);
				return;
			case CypherPackage.CYPHER_EVALUATOR__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
			case CypherPackage.CYPHER_EVALUATOR__ROW_LIMIT:
				setRowLimit((Integer)newValue);
				return;
			case CypherPackage.CYPHER_EVALUATOR__TIMEOUT:
				setTimeout((Integer)newValue);
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
			case CypherPackage.CYPHER_EVALUATOR__STATEMENT:
				setStatement((Statement)null);
				return;
			case CypherPackage.CYPHER_EVALUATOR__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case CypherPackage.CYPHER_EVALUATOR__ROW_LIMIT:
				setRowLimit(ROW_LIMIT_EDEFAULT);
				return;
			case CypherPackage.CYPHER_EVALUATOR__TIMEOUT:
				setTimeout(TIMEOUT_EDEFAULT);
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
			case CypherPackage.CYPHER_EVALUATOR__STATEMENT:
				return getStatement() != null;
			case CypherPackage.CYPHER_EVALUATOR__READ_ONLY:
				return isReadOnly() != READ_ONLY_EDEFAULT;
			case CypherPackage.CYPHER_EVALUATOR__ROW_LIMIT:
				return getRowLimit() != ROW_LIMIT_EDEFAULT;
			case CypherPackage.CYPHER_EVALUATOR__TIMEOUT:
				return getTimeout() != TIMEOUT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //CypherEvaluatorImpl
