/**
 */
package org.nasdanika.models.cypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantified Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  all(x IN list WHERE predicate) and its siblings.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.QuantifiedExpression#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.QuantifiedExpression#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.QuantifiedExpression#getList <em>List</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.QuantifiedExpression#getWhere <em>Where</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getQuantifiedExpression()
 * @model
 * @generated
 */
public interface QuantifiedExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Quantifier</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.cypher.Quantifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantifier</em>' attribute.
	 * @see org.nasdanika.models.cypher.Quantifier
	 * @see #setQuantifier(Quantifier)
	 * @see org.nasdanika.models.cypher.CypherPackage#getQuantifiedExpression_Quantifier()
	 * @model unique="false"
	 * @generated
	 */
	Quantifier getQuantifier();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.QuantifiedExpression#getQuantifier <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantifier</em>' attribute.
	 * @see org.nasdanika.models.cypher.Quantifier
	 * @see #getQuantifier()
	 * @generated
	 */
	void setQuantifier(Quantifier value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see org.nasdanika.models.cypher.CypherPackage#getQuantifiedExpression_Variable()
	 * @model unique="false"
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.QuantifiedExpression#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' containment reference.
	 * @see #setList(Expression)
	 * @see org.nasdanika.models.cypher.CypherPackage#getQuantifiedExpression_List()
	 * @model containment="true"
	 * @generated
	 */
	Expression getList();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.QuantifiedExpression#getList <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' containment reference.
	 * @see #getList()
	 * @generated
	 */
	void setList(Expression value);

	/**
	 * Returns the value of the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' containment reference.
	 * @see #setWhere(Expression)
	 * @see org.nasdanika.models.cypher.CypherPackage#getQuantifiedExpression_Where()
	 * @model containment="true"
	 * @generated
	 */
	Expression getWhere();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.QuantifiedExpression#getWhere <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where</em>' containment reference.
	 * @see #getWhere()
	 * @generated
	 */
	void setWhere(Expression value);

} // QuantifiedExpression
