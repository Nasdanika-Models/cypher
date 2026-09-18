/**
 */
package org.nasdanika.models.cypher;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.CaseExpression#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.CaseExpression#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.CaseExpression#getElseExpression <em>Else Expression</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getCaseExpression()
 * @model
 * @generated
 */
public interface CaseExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The simple form's subject: CASE x WHEN ... . Null for the generic form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Expression)
	 * @see org.nasdanika.models.cypher.CypherPackage#getCaseExpression_Subject()
	 * @model containment="true"
	 * @generated
	 */
	Expression getSubject();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.CaseExpression#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Expression value);

	/**
	 * Returns the value of the '<em><b>Alternatives</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.cypher.CaseAlternative}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternatives</em>' containment reference list.
	 * @see org.nasdanika.models.cypher.CypherPackage#getCaseExpression_Alternatives()
	 * @model containment="true"
	 * @generated
	 */
	EList<CaseAlternative> getAlternatives();

	/**
	 * Returns the value of the '<em><b>Else Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Expression</em>' containment reference.
	 * @see #setElseExpression(Expression)
	 * @see org.nasdanika.models.cypher.CypherPackage#getCaseExpression_ElseExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getElseExpression();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.CaseExpression#getElseExpression <em>Else Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Expression</em>' containment reference.
	 * @see #getElseExpression()
	 * @generated
	 */
	void setElseExpression(Expression value);

} // CaseExpression
