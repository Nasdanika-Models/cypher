/**
 */
package org.nasdanika.models.cypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.RemoveProperty#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getRemoveProperty()
 * @model
 * @generated
 */
public interface RemoveProperty extends RemoveItem {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference.
	 * @see #setProperty(PropertyAccess)
	 * @see org.nasdanika.models.cypher.CypherPackage#getRemoveProperty_Property()
	 * @model containment="true"
	 * @generated
	 */
	PropertyAccess getProperty();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.RemoveProperty#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(PropertyAccess value);

} // RemoveProperty
