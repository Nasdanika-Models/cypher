/**
 */
package org.nasdanika.models.cypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>With Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An intermediate projection which also opens a new scope. WITH is where a Cypher
 * query is segmented, and the optional WHERE after it is the only way to filter on
 * an aggregate.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.WithClause#getWhere <em>Where</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getWithClause()
 * @model
 * @generated
 */
public interface WithClause extends ProjectionClause {
	/**
	 * Returns the value of the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' containment reference.
	 * @see #setWhere(Expression)
	 * @see org.nasdanika.models.cypher.CypherPackage#getWithClause_Where()
	 * @model containment="true"
	 * @generated
	 */
	Expression getWhere();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.WithClause#getWhere <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where</em>' containment reference.
	 * @see #getWhere()
	 * @generated
	 */
	void setWhere(Expression value);

} // WithClause
