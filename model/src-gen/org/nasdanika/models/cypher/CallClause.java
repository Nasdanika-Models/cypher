/**
 */
package org.nasdanika.models.cypher;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CALL, in both of its forms: a procedure call with YIELD, and (an extension
 * beyond openCypher 9) a subquery. A procedure call is the extension point where
 * an engine exposes host capabilities to a query, which for a Nasdanika engine is
 * how a query reaches capabilities, evaluators and loaded resources.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.CallClause#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.CallClause#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.CallClause#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.CallClause#getYieldItems <em>Yield Items</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.CallClause#getWhere <em>Where</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.CallClause#getSubquery <em>Subquery</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getCallClause()
 * @model
 * @generated
 */
public interface CallClause extends Clause {
	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The dotted namespace of a procedure, e.g. db, apoc, nasdanika.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute list.
	 * @see org.nasdanika.models.cypher.CypherPackage#getCallClause_Namespace()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getNamespace();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.cypher.CypherPackage#getCallClause_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.CallClause#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.cypher.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see org.nasdanika.models.cypher.CypherPackage#getCallClause_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getArguments();

	/**
	 * Returns the value of the '<em><b>Yield Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.cypher.ProjectionItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yield Items</em>' containment reference list.
	 * @see org.nasdanika.models.cypher.CypherPackage#getCallClause_YieldItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProjectionItem> getYieldItems();

	/**
	 * Returns the value of the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' containment reference.
	 * @see #setWhere(Expression)
	 * @see org.nasdanika.models.cypher.CypherPackage#getCallClause_Where()
	 * @model containment="true"
	 * @generated
	 */
	Expression getWhere();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.CallClause#getWhere <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where</em>' containment reference.
	 * @see #getWhere()
	 * @generated
	 */
	void setWhere(Expression value);

	/**
	 * Returns the value of the '<em><b>Subquery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  CALL { ... }: post openCypher 9.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subquery</em>' containment reference.
	 * @see #setSubquery(Query)
	 * @see org.nasdanika.models.cypher.CypherPackage#getCallClause_Subquery()
	 * @model containment="true"
	 * @generated
	 */
	Query getSubquery();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.CallClause#getSubquery <em>Subquery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subquery</em>' containment reference.
	 * @see #getSubquery()
	 * @generated
	 */
	void setSubquery(Query value);

} // CallClause
