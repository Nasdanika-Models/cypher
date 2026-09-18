/**
 */
package org.nasdanika.models.cypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * n:Label, as a predicate rather than as part of a pattern.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.LabelCheck#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.LabelCheck#getLabelExpression <em>Label Expression</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getLabelCheck()
 * @model
 * @generated
 */
public interface LabelCheck extends Expression {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Expression)
	 * @see org.nasdanika.models.cypher.CypherPackage#getLabelCheck_Target()
	 * @model containment="true"
	 * @generated
	 */
	Expression getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.LabelCheck#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Expression value);

	/**
	 * Returns the value of the '<em><b>Label Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Expression</em>' containment reference.
	 * @see #setLabelExpression(LabelExpression)
	 * @see org.nasdanika.models.cypher.CypherPackage#getLabelCheck_LabelExpression()
	 * @model containment="true"
	 * @generated
	 */
	LabelExpression getLabelExpression();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.LabelCheck#getLabelExpression <em>Label Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Expression</em>' containment reference.
	 * @see #getLabelExpression()
	 * @generated
	 */
	void setLabelExpression(LabelExpression value);

} // LabelCheck
