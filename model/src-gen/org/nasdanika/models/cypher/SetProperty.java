/**
 */
package org.nasdanika.models.cypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  n.prop = expression
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.SetProperty#getProperty <em>Property</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.SetProperty#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getSetProperty()
 * @model
 * @generated
 */
public interface SetProperty extends SetItem {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference.
	 * @see #setProperty(PropertyAccess)
	 * @see org.nasdanika.models.cypher.CypherPackage#getSetProperty_Property()
	 * @model containment="true"
	 * @generated
	 */
	PropertyAccess getProperty();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.SetProperty#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(PropertyAccess value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Expression)
	 * @see org.nasdanika.models.cypher.CypherPackage#getSetProperty_Value()
	 * @model containment="true"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.SetProperty#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

} // SetProperty
