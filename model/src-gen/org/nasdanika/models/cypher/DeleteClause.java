/**
 */
package org.nasdanika.models.cypher;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DELETE and DETACH DELETE. The distinction maps cleanly onto EMF: plain DELETE
 * refuses to strand references, DETACH DELETE is EcoreUtil.delete with cross
 * references cleaned up.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.DeleteClause#isDetach <em>Detach</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.DeleteClause#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getDeleteClause()
 * @model
 * @generated
 */
public interface DeleteClause extends Clause {
	/**
	 * Returns the value of the '<em><b>Detach</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detach</em>' attribute.
	 * @see #setDetach(boolean)
	 * @see org.nasdanika.models.cypher.CypherPackage#getDeleteClause_Detach()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDetach();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.DeleteClause#isDetach <em>Detach</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detach</em>' attribute.
	 * @see #isDetach()
	 * @generated
	 */
	void setDetach(boolean value);

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.cypher.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see org.nasdanika.models.cypher.CypherPackage#getDeleteClause_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpressions();

} // DeleteClause
