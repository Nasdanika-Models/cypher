/**
 */
package org.nasdanika.models.cypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Chain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A pattern element extended by one relationship and one node: (left)-[rel]->(right).
 * Left-nested so that a chain of any length has one shape.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.RelationshipChain#getLeft <em>Left</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.RelationshipChain#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.RelationshipChain#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getRelationshipChain()
 * @model
 * @generated
 */
public interface RelationshipChain extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(PatternElement)
	 * @see org.nasdanika.models.cypher.CypherPackage#getRelationshipChain_Left()
	 * @model containment="true"
	 * @generated
	 */
	PatternElement getLeft();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.RelationshipChain#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(PatternElement value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference.
	 * @see #setRelationship(RelationshipPattern)
	 * @see org.nasdanika.models.cypher.CypherPackage#getRelationshipChain_Relationship()
	 * @model containment="true"
	 * @generated
	 */
	RelationshipPattern getRelationship();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.RelationshipChain#getRelationship <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' containment reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(RelationshipPattern value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(NodePattern)
	 * @see org.nasdanika.models.cypher.CypherPackage#getRelationshipChain_Right()
	 * @model containment="true"
	 * @generated
	 */
	NodePattern getRight();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.RelationshipChain#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(NodePattern value);

} // RelationshipChain
