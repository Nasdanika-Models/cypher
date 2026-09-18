/**
 */
package org.nasdanika.models.cypher;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SET: assign properties, replace or merge property maps, add labels.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.SetClause#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getSetClause()
 * @model
 * @generated
 */
public interface SetClause extends Clause {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.cypher.SetItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see org.nasdanika.models.cypher.CypherPackage#getSetClause_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<SetItem> getItems();

} // SetClause
