/**
 */
package org.nasdanika.models.cypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.CaseAlternative#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.CaseAlternative#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getCaseAlternative()
 * @model
 * @generated
 */
public interface CaseAlternative extends CypherElement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see org.nasdanika.models.cypher.CypherPackage#getCaseAlternative_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.CaseAlternative#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(Expression)
	 * @see org.nasdanika.models.cypher.CypherPackage#getCaseAlternative_Result()
	 * @model containment="true"
	 * @generated
	 */
	Expression getResult();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.CaseAlternative#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Expression value);

} // CaseAlternative
