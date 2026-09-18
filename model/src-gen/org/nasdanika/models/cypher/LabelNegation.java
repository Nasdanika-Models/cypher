/**
 */
package org.nasdanika.models.cypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Negation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  :!A
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.LabelNegation#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getLabelNegation()
 * @model
 * @generated
 */
public interface LabelNegation extends LabelExpression {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference.
	 * @see #setOperand(LabelExpression)
	 * @see org.nasdanika.models.cypher.CypherPackage#getLabelNegation_Operand()
	 * @model containment="true"
	 * @generated
	 */
	LabelExpression getOperand();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.LabelNegation#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(LabelExpression value);

} // LabelNegation
