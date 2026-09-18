/**
 */
package org.nasdanika.models.cypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * n.property, and also map.key. Held as its own class rather than as a binary
 * operator because property access is the thing static analysis most wants to
 * enumerate: which properties does this statement read, and which does it write.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.PropertyAccess#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.PropertyAccess#getPropertyKey <em>Property Key</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getPropertyAccess()
 * @model
 * @generated
 */
public interface PropertyAccess extends Expression {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Expression)
	 * @see org.nasdanika.models.cypher.CypherPackage#getPropertyAccess_Target()
	 * @model containment="true"
	 * @generated
	 */
	Expression getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.PropertyAccess#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Expression value);

	/**
	 * Returns the value of the '<em><b>Property Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Key</em>' attribute.
	 * @see #setPropertyKey(String)
	 * @see org.nasdanika.models.cypher.CypherPackage#getPropertyAccess_PropertyKey()
	 * @model unique="false"
	 * @generated
	 */
	String getPropertyKey();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.PropertyAccess#getPropertyKey <em>Property Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Key</em>' attribute.
	 * @see #getPropertyKey()
	 * @generated
	 */
	void setPropertyKey(String value);

} // PropertyAccess
