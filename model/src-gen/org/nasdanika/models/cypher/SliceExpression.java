/**
 */
package org.nasdanika.models.cypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slice Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  list[from..to], either bound optional.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.SliceExpression#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.SliceExpression#getFrom <em>From</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.SliceExpression#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getSliceExpression()
 * @model
 * @generated
 */
public interface SliceExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Expression)
	 * @see org.nasdanika.models.cypher.CypherPackage#getSliceExpression_Target()
	 * @model containment="true"
	 * @generated
	 */
	Expression getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.SliceExpression#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Expression value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(Expression)
	 * @see org.nasdanika.models.cypher.CypherPackage#getSliceExpression_From()
	 * @model containment="true"
	 * @generated
	 */
	Expression getFrom();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.SliceExpression#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Expression value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(Expression)
	 * @see org.nasdanika.models.cypher.CypherPackage#getSliceExpression_To()
	 * @model containment="true"
	 * @generated
	 */
	Expression getTo();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.SliceExpression#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Expression value);

} // SliceExpression
