/**
 */
package org.nasdanika.models.cypher;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Union</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UNION and UNION ALL over two or more operands. Flattened rather than nested to
 * the left, because Cypher's union is associative and a flat list is what both
 * readers and planners want.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.Union#isAll <em>All</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.Union#getOperands <em>Operands</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getUnion()
 * @model
 * @generated
 */
public interface Union extends Query {
	/**
	 * Returns the value of the '<em><b>All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  UNION ALL when true, UNION (distinct) when false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All</em>' attribute.
	 * @see #setAll(boolean)
	 * @see org.nasdanika.models.cypher.CypherPackage#getUnion_All()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAll();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.Union#isAll <em>All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All</em>' attribute.
	 * @see #isAll()
	 * @generated
	 */
	void setAll(boolean value);

	/**
	 * Returns the value of the '<em><b>Operands</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.cypher.Query}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operands</em>' containment reference list.
	 * @see org.nasdanika.models.cypher.CypherPackage#getUnion_Operands()
	 * @model containment="true"
	 * @generated
	 */
	EList<Query> getOperands();

} // Union
