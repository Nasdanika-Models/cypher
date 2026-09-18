/**
 */
package org.nasdanika.models.cypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The relationship half of a pattern. Against an EMF graph a relationship type is
 * an EReference name. EReferenceConnection carries the reference and its index and
 * is Comparable, so matches come back in model order by default and r.index is
 * available for a query that wants to say so; a property graph has neither.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.RelationshipPattern#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.RelationshipPattern#getTypeExpression <em>Type Expression</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.RelationshipPattern#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.RelationshipPattern#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.RelationshipPattern#isVariableLength <em>Variable Length</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.RelationshipPattern#getMinHops <em>Min Hops</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.RelationshipPattern#getMaxHops <em>Max Hops</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getRelationshipPattern()
 * @model
 * @generated
 */
public interface RelationshipPattern extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see org.nasdanika.models.cypher.CypherPackage#getRelationshipPattern_Variable()
	 * @model unique="false"
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.RelationshipPattern#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

	/**
	 * Returns the value of the '<em><b>Type Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Null matches any type. openCypher 9's [:knows|:follows] loads as a Disjunction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Expression</em>' containment reference.
	 * @see #setTypeExpression(LabelExpression)
	 * @see org.nasdanika.models.cypher.CypherPackage#getRelationshipPattern_TypeExpression()
	 * @model containment="true"
	 * @generated
	 */
	LabelExpression getTypeExpression();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.RelationshipPattern#getTypeExpression <em>Type Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Expression</em>' containment reference.
	 * @see #getTypeExpression()
	 * @generated
	 */
	void setTypeExpression(LabelExpression value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.cypher.Direction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.nasdanika.models.cypher.Direction
	 * @see #setDirection(Direction)
	 * @see org.nasdanika.models.cypher.CypherPackage#getRelationshipPattern_Direction()
	 * @model unique="false"
	 * @generated
	 */
	Direction getDirection();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.RelationshipPattern#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.nasdanika.models.cypher.Direction
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Direction value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(Expression)
	 * @see org.nasdanika.models.cypher.CypherPackage#getRelationshipPattern_Properties()
	 * @model containment="true"
	 * @generated
	 */
	Expression getProperties();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.RelationshipPattern#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(Expression value);

	/**
	 * Returns the value of the '<em><b>Variable Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  True for *, *2, *1..5 and friends.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable Length</em>' attribute.
	 * @see #setVariableLength(boolean)
	 * @see org.nasdanika.models.cypher.CypherPackage#getRelationshipPattern_VariableLength()
	 * @model unique="false"
	 * @generated
	 */
	boolean isVariableLength();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.RelationshipPattern#isVariableLength <em>Variable Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Length</em>' attribute.
	 * @see #isVariableLength()
	 * @generated
	 */
	void setVariableLength(boolean value);

	/**
	 * Returns the value of the '<em><b>Min Hops</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Lower bound of a variable length pattern, -1 when unspecified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Hops</em>' attribute.
	 * @see #setMinHops(int)
	 * @see org.nasdanika.models.cypher.CypherPackage#getRelationshipPattern_MinHops()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getMinHops();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.RelationshipPattern#getMinHops <em>Min Hops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Hops</em>' attribute.
	 * @see #getMinHops()
	 * @generated
	 */
	void setMinHops(int value);

	/**
	 * Returns the value of the '<em><b>Max Hops</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Upper bound of a variable length pattern, -1 when unbounded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Hops</em>' attribute.
	 * @see #setMaxHops(int)
	 * @see org.nasdanika.models.cypher.CypherPackage#getRelationshipPattern_MaxHops()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getMaxHops();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.RelationshipPattern#getMaxHops <em>Max Hops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Hops</em>' attribute.
	 * @see #getMaxHops()
	 * @generated
	 */
	void setMaxHops(int value);

} // RelationshipPattern
