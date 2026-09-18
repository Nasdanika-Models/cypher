/**
 */
package org.nasdanika.models.cypher;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.MapLiteral#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getMapLiteral()
 * @model
 * @generated
 */
public interface MapLiteral extends Literal {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.cypher.MapEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see org.nasdanika.models.cypher.CypherPackage#getMapLiteral_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<MapEntry> getEntries();

} // MapLiteral
