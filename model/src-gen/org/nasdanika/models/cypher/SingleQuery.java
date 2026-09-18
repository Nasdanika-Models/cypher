/**
 */
package org.nasdanika.models.cypher;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A linear query: clauses applied in order, each consuming the rows the previous
 * one produced. That ordering is the whole execution model of Cypher and is why
 * the clause list is ordered containment rather than a set of features.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.SingleQuery#getClauses <em>Clauses</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getSingleQuery()
 * @model
 * @generated
 */
public interface SingleQuery extends Query {
	/**
	 * Returns the value of the '<em><b>Clauses</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.cypher.Clause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clauses</em>' containment reference list.
	 * @see org.nasdanika.models.cypher.CypherPackage#getSingleQuery_Clauses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Clause> getClauses();

} // SingleQuery
