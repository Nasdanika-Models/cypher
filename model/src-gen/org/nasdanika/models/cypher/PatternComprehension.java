/**
 */
package org.nasdanika.models.cypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Comprehension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  [(a)-[:knows]->(b) WHERE ... | b.name]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.PatternComprehension#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.PatternComprehension#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.PatternComprehension#getWhere <em>Where</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.PatternComprehension#getProjection <em>Projection</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getPatternComprehension()
 * @model
 * @generated
 */
public interface PatternComprehension extends Expression {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see org.nasdanika.models.cypher.CypherPackage#getPatternComprehension_Variable()
	 * @model unique="false"
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.PatternComprehension#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference.
	 * @see #setPattern(PatternElement)
	 * @see org.nasdanika.models.cypher.CypherPackage#getPatternComprehension_Pattern()
	 * @model containment="true"
	 * @generated
	 */
	PatternElement getPattern();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.PatternComprehension#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(PatternElement value);

	/**
	 * Returns the value of the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' containment reference.
	 * @see #setWhere(Expression)
	 * @see org.nasdanika.models.cypher.CypherPackage#getPatternComprehension_Where()
	 * @model containment="true"
	 * @generated
	 */
	Expression getWhere();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.PatternComprehension#getWhere <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where</em>' containment reference.
	 * @see #getWhere()
	 * @generated
	 */
	void setWhere(Expression value);

	/**
	 * Returns the value of the '<em><b>Projection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projection</em>' containment reference.
	 * @see #setProjection(Expression)
	 * @see org.nasdanika.models.cypher.CypherPackage#getPatternComprehension_Projection()
	 * @model containment="true"
	 * @generated
	 */
	Expression getProjection();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.PatternComprehension#getProjection <em>Projection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projection</em>' containment reference.
	 * @see #getProjection()
	 * @generated
	 */
	void setProjection(Expression value);

} // PatternComprehension
