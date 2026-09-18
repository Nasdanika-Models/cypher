/**
 */
package org.nasdanika.models.cypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CREATE. A created object goes into the resource contents unless something in the
 * same statement contains it, which is how the Draw.io loader already behaves and
 * how an EMF resource already works. Because the pipeline is lazy, attachment
 * happens at commit rather than at creation: created objects are pending until the
 * statement completes, so a failed statement leaves nothing behind and the recorded
 * change is one coherent change rather than a create followed by a move.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.CreateClause#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getCreateClause()
 * @model
 * @generated
 */
public interface CreateClause extends Clause {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference.
	 * @see #setPattern(Pattern)
	 * @see org.nasdanika.models.cypher.CypherPackage#getCreateClause_Pattern()
	 * @model containment="true"
	 * @generated
	 */
	Pattern getPattern();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.CreateClause#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(Pattern value);

} // CreateClause
