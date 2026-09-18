/**
 */
package org.nasdanika.models.cypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * (variable:Label {property: value}). Against an EMF graph, labels are the EClass
 * name and the names of all of its supertypes, so a pattern can match at any level
 * of the type hierarchy without the query knowing the hierarchy.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.NodePattern#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.NodePattern#getLabelExpression <em>Label Expression</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.NodePattern#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getNodePattern()
 * @model
 * @generated
 */
public interface NodePattern extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see org.nasdanika.models.cypher.CypherPackage#getNodePattern_Variable()
	 * @model unique="false"
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.NodePattern#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

	/**
	 * Returns the value of the '<em><b>Label Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Null matches any label. openCypher 9's :A:B loads as a Conjunction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label Expression</em>' containment reference.
	 * @see #setLabelExpression(LabelExpression)
	 * @see org.nasdanika.models.cypher.CypherPackage#getNodePattern_LabelExpression()
	 * @model containment="true"
	 * @generated
	 */
	LabelExpression getLabelExpression();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.NodePattern#getLabelExpression <em>Label Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Expression</em>' containment reference.
	 * @see #getLabelExpression()
	 * @generated
	 */
	void setLabelExpression(LabelExpression value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  A MapLiteral or a Parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(Expression)
	 * @see org.nasdanika.models.cypher.CypherPackage#getNodePattern_Properties()
	 * @model containment="true"
	 * @generated
	 */
	Expression getProperties();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.NodePattern#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(Expression value);

} // NodePattern
