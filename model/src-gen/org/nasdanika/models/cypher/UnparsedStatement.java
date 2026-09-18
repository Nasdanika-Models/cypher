/**
 */
package org.nasdanika.models.cypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unparsed Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A statement the parser could not handle. Keeping the text and the error is what
 * makes per-statement tolerance work: one unusual construct costs one statement,
 * not the whole file.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.UnparsedStatement#getText <em>Text</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.UnparsedStatement#getError <em>Error</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getUnparsedStatement()
 * @model
 * @generated
 */
public interface UnparsedStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.nasdanika.models.cypher.CypherPackage#getUnparsedStatement_Text()
	 * @model unique="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.UnparsedStatement#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' attribute.
	 * @see #setError(String)
	 * @see org.nasdanika.models.cypher.CypherPackage#getUnparsedStatement_Error()
	 * @model unique="false"
	 * @generated
	 */
	String getError();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.UnparsedStatement#getError <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error</em>' attribute.
	 * @see #getError()
	 * @generated
	 */
	void setError(String value);

} // UnparsedStatement
