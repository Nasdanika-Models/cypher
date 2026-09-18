/**
 */
package org.nasdanika.models.cypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A query: either a single linear sequence of clauses or a union of them.
 * EXPLAIN and PROFILE are recorded as flags rather than as wrapper statements,
 * since they change how a query is executed and not what it means.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.Query#isExplain <em>Explain</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.Query#isProfile <em>Profile</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getQuery()
 * @model abstract="true"
 * @generated
 */
public interface Query extends Statement {
	/**
	 * Returns the value of the '<em><b>Explain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explain</em>' attribute.
	 * @see #setExplain(boolean)
	 * @see org.nasdanika.models.cypher.CypherPackage#getQuery_Explain()
	 * @model unique="false"
	 * @generated
	 */
	boolean isExplain();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.Query#isExplain <em>Explain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explain</em>' attribute.
	 * @see #isExplain()
	 * @generated
	 */
	void setExplain(boolean value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile</em>' attribute.
	 * @see #setProfile(boolean)
	 * @see org.nasdanika.models.cypher.CypherPackage#getQuery_Profile()
	 * @model unique="false"
	 * @generated
	 */
	boolean isProfile();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.Query#isProfile <em>Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' attribute.
	 * @see #isProfile()
	 * @generated
	 */
	void setProfile(boolean value);

} // Query
