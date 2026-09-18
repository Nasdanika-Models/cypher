/**
 */
package org.nasdanika.models.cypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Comprehension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  [x IN list WHERE predicate | projection]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.ListComprehension#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.ListComprehension#getList <em>List</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.ListComprehension#getWhere <em>Where</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.ListComprehension#getProjection <em>Projection</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getListComprehension()
 * @model
 * @generated
 */
public interface ListComprehension extends Expression {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see org.nasdanika.models.cypher.CypherPackage#getListComprehension_Variable()
	 * @model unique="false"
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.ListComprehension#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' containment reference.
	 * @see #setList(Expression)
	 * @see org.nasdanika.models.cypher.CypherPackage#getListComprehension_List()
	 * @model containment="true"
	 * @generated
	 */
	Expression getList();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.ListComprehension#getList <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' containment reference.
	 * @see #getList()
	 * @generated
	 */
	void setList(Expression value);

	/**
	 * Returns the value of the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' containment reference.
	 * @see #setWhere(Expression)
	 * @see org.nasdanika.models.cypher.CypherPackage#getListComprehension_Where()
	 * @model containment="true"
	 * @generated
	 */
	Expression getWhere();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.ListComprehension#getWhere <em>Where</em>}' containment reference.
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
	 * @see org.nasdanika.models.cypher.CypherPackage#getListComprehension_Projection()
	 * @model containment="true"
	 * @generated
	 */
	Expression getProjection();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.ListComprehension#getProjection <em>Projection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projection</em>' containment reference.
	 * @see #getProjection()
	 * @generated
	 */
	void setProjection(Expression value);

} // ListComprehension
