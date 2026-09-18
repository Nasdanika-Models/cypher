/**
 */
package org.nasdanika.models.cypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The final projection of a query. What a RETURN produces is a table of values,
 * not a graph: Cypher has no CONSTRUCT clause, which is the most consequential gap
 * when Cypher is used to produce model contents rather than to answer a question.
 * See readme.md for how that is addressed.
 * <!-- end-model-doc -->
 *
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getReturnClause()
 * @model
 * @generated
 */
public interface ReturnClause extends ProjectionClause {
} // ReturnClause
