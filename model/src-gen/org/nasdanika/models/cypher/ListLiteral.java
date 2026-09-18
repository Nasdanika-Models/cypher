/**
 */
package org.nasdanika.models.cypher;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.ListLiteral#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getListLiteral()
 * @model
 * @generated
 */
public interface ListLiteral extends Literal {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.cypher.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.nasdanika.models.cypher.CypherPackage#getListLiteral_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getElements();

} // ListLiteral
