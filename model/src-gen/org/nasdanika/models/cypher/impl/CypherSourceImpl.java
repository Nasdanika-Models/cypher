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
import org.nasdanika.models.cypher.CypherSource;
import org.nasdanika.models.cypher.Dialect;
import org.nasdanika.models.cypher.Statement;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.impl.CypherSourceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.CypherSourceImpl#isParsed <em>Parsed</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.CypherSourceImpl#getDialect <em>Dialect</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.CypherSourceImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CypherSourceImpl extends ModelElementImpl implements CypherSource {
	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isParsed() <em>Parsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParsed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARSED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getDialect() <em>Dialect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDialect()
	 * @generated
	 * @ordered
	 */
	protected static final Dialect DIALECT_EDEFAULT = Dialect.OPEN_CYPHER_9;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CypherSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CypherPackage.Literals.CYPHER_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return (String)eDynamicGet(CypherPackage.CYPHER_SOURCE__SOURCE, CypherPackage.Literals.CYPHER_SOURCE__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		eDynamicSet(CypherPackage.CYPHER_SOURCE__SOURCE, CypherPackage.Literals.CYPHER_SOURCE__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isParsed() {
		return (Boolean)eDynamicGet(CypherPackage.CYPHER_SOURCE__PARSED, CypherPackage.Literals.CYPHER_SOURCE__PARSED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParsed(boolean newParsed) {
		eDynamicSet(CypherPackage.CYPHER_SOURCE__PARSED, CypherPackage.Literals.CYPHER_SOURCE__PARSED, newParsed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dialect getDialect() {
		return (Dialect)eDynamicGet(CypherPackage.CYPHER_SOURCE__DIALECT, CypherPackage.Literals.CYPHER_SOURCE__DIALECT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDialect(Dialect newDialect) {
		eDynamicSet(CypherPackage.CYPHER_SOURCE__DIALECT, CypherPackage.Literals.CYPHER_SOURCE__DIALECT, newDialect);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Statement> getStatements() {
		return (EList<Statement>)eDynamicGet(CypherPackage.CYPHER_SOURCE__STATEMENTS, CypherPackage.Literals.CYPHER_SOURCE__STATEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CypherPackage.CYPHER_SOURCE__STATEMENTS:
				return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
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
			case CypherPackage.CYPHER_SOURCE__SOURCE:
				return getSource();
			case CypherPackage.CYPHER_SOURCE__PARSED:
				return isParsed();
			case CypherPackage.CYPHER_SOURCE__DIALECT:
				return getDialect();
			case CypherPackage.CYPHER_SOURCE__STATEMENTS:
				return getStatements();
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
			case CypherPackage.CYPHER_SOURCE__SOURCE:
				setSource((String)newValue);
				return;
			case CypherPackage.CYPHER_SOURCE__PARSED:
				setParsed((Boolean)newValue);
				return;
			case CypherPackage.CYPHER_SOURCE__DIALECT:
				setDialect((Dialect)newValue);
				return;
			case CypherPackage.CYPHER_SOURCE__STATEMENTS:
				getStatements().clear();
				getStatements().addAll((Collection<? extends Statement>)newValue);
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
			case CypherPackage.CYPHER_SOURCE__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case CypherPackage.CYPHER_SOURCE__PARSED:
				setParsed(PARSED_EDEFAULT);
				return;
			case CypherPackage.CYPHER_SOURCE__DIALECT:
				setDialect(DIALECT_EDEFAULT);
				return;
			case CypherPackage.CYPHER_SOURCE__STATEMENTS:
				getStatements().clear();
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
			case CypherPackage.CYPHER_SOURCE__SOURCE:
				return SOURCE_EDEFAULT == null ? getSource() != null : !SOURCE_EDEFAULT.equals(getSource());
			case CypherPackage.CYPHER_SOURCE__PARSED:
				return isParsed() != PARSED_EDEFAULT;
			case CypherPackage.CYPHER_SOURCE__DIALECT:
				return getDialect() != DIALECT_EDEFAULT;
			case CypherPackage.CYPHER_SOURCE__STATEMENTS:
				return !getStatements().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CypherSourceImpl
