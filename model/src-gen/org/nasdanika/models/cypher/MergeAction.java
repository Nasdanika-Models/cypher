/**
 */
package org.nasdanika.models.cypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merge Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.MergeAction#getKind <em>Kind</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.MergeAction#getSet <em>Set</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getMergeAction()
 * @model
 * @generated
 */
public interface MergeAction extends CypherElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.cypher.MergeActionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.nasdanika.models.cypher.MergeActionKind
	 * @see #setKind(MergeActionKind)
	 * @see org.nasdanika.models.cypher.CypherPackage#getMergeAction_Kind()
	 * @model unique="false"
	 * @generated
	 */
	MergeActionKind getKind();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.MergeAction#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.nasdanika.models.cypher.MergeActionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(MergeActionKind value);

	/**
	 * Returns the value of the '<em><b>Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set</em>' containment reference.
	 * @see #setSet(SetClause)
	 * @see org.nasdanika.models.cypher.CypherPackage#getMergeAction_Set()
	 * @model containment="true"
	 * @generated
	 */
	SetClause getSet();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.MergeAction#getSet <em>Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set</em>' containment reference.
	 * @see #getSet()
	 * @generated
	 */
	void setSet(SetClause value);

} // MergeAction
