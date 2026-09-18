/**
 */
package org.nasdanika.models.cypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exists Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EXISTS. The pattern form is openCypher 9; the subquery form is an extension.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.ExistsExpression#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.ExistsExpression#getSubquery <em>Subquery</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getExistsExpression()
 * @model
 * @generated
 */
public interface ExistsExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference.
	 * @see #setPattern(PatternElement)
	 * @see org.nasdanika.models.cypher.CypherPackage#getExistsExpression_Pattern()
	 * @model containment="true"
	 * @generated
	 */
	PatternElement getPattern();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.ExistsExpression#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(PatternElement value);

	/**
	 * Returns the value of the '<em><b>Subquery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subquery</em>' containment reference.
	 * @see #setSubquery(Query)
	 * @see org.nasdanika.models.cypher.CypherPackage#getExistsExpression_Subquery()
	 * @model containment="true"
	 * @generated
	 */
	Query getSubquery();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.ExistsExpression#getSubquery <em>Subquery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subquery</em>' containment reference.
	 * @see #getSubquery()
	 * @generated
	 */
	void setSubquery(Query value);

} // ExistsExpression
