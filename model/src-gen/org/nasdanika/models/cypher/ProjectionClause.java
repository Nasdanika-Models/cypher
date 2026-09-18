/**
 */
package org.nasdanika.models.cypher;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Projection Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The shared shape of RETURN and WITH: a projection, optionally distinct,
 * optionally ordered, skipped and limited. Keeping them one class makes the
 * evaluator's projection code single-sourced, which matters because this is where
 * aggregation is detected and where the pipeline breaks.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.ProjectionClause#isDistinct <em>Distinct</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.ProjectionClause#isAll <em>All</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.ProjectionClause#getItems <em>Items</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.ProjectionClause#getOrder <em>Order</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.ProjectionClause#getSkip <em>Skip</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.ProjectionClause#getLimit <em>Limit</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getProjectionClause()
 * @model abstract="true"
 * @generated
 */
public interface ProjectionClause extends Clause {
	/**
	 * Returns the value of the '<em><b>Distinct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distinct</em>' attribute.
	 * @see #setDistinct(boolean)
	 * @see org.nasdanika.models.cypher.CypherPackage#getProjectionClause_Distinct()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDistinct();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.ProjectionClause#isDistinct <em>Distinct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distinct</em>' attribute.
	 * @see #isDistinct()
	 * @generated
	 */
	void setDistinct(boolean value);

	/**
	 * Returns the value of the '<em><b>All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  RETURN * and WITH *: project everything currently in scope.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All</em>' attribute.
	 * @see #setAll(boolean)
	 * @see org.nasdanika.models.cypher.CypherPackage#getProjectionClause_All()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAll();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.ProjectionClause#isAll <em>All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All</em>' attribute.
	 * @see #isAll()
	 * @generated
	 */
	void setAll(boolean value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.cypher.ProjectionItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see org.nasdanika.models.cypher.CypherPackage#getProjectionClause_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProjectionItem> getItems();

	/**
	 * Returns the value of the '<em><b>Order</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.cypher.SortItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' containment reference list.
	 * @see org.nasdanika.models.cypher.CypherPackage#getProjectionClause_Order()
	 * @model containment="true"
	 * @generated
	 */
	EList<SortItem> getOrder();

	/**
	 * Returns the value of the '<em><b>Skip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skip</em>' containment reference.
	 * @see #setSkip(Expression)
	 * @see org.nasdanika.models.cypher.CypherPackage#getProjectionClause_Skip()
	 * @model containment="true"
	 * @generated
	 */
	Expression getSkip();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.ProjectionClause#getSkip <em>Skip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skip</em>' containment reference.
	 * @see #getSkip()
	 * @generated
	 */
	void setSkip(Expression value);

	/**
	 * Returns the value of the '<em><b>Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit</em>' containment reference.
	 * @see #setLimit(Expression)
	 * @see org.nasdanika.models.cypher.CypherPackage#getProjectionClause_Limit()
	 * @model containment="true"
	 * @generated
	 */
	Expression getLimit();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.ProjectionClause#getLimit <em>Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit</em>' containment reference.
	 * @see #getLimit()
	 * @generated
	 */
	void setLimit(Expression value);

} // ProjectionClause
