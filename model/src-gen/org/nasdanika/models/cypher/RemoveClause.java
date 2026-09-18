/**
 */
package org.nasdanika.models.cypher;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * REMOVE: the inverse of the additive half of SET.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.RemoveClause#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getRemoveClause()
 * @model
 * @generated
 */
public interface RemoveClause extends Clause {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.cypher.RemoveItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see org.nasdanika.models.cypher.CypherPackage#getRemoveClause_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<RemoveItem> getItems();

} // RemoveClause
