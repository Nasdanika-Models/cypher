/**
 */
package org.nasdanika.models.cypher.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.cypher.CypherPackage;
import org.nasdanika.models.cypher.ReturnClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ReturnClauseImpl extends ProjectionClauseImpl implements ReturnClause {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CypherPackage.Literals.RETURN_CLAUSE;
	}

} //ReturnClauseImpl
