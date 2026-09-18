/**
 */
package org.nasdanika.models.cypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One pattern, optionally bound to a path variable and optionally wrapped in a
 * shortest-path selector.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.PatternPart#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.PatternPart#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.PatternPart#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getPatternPart()
 * @model
 * @generated
 */
public interface PatternPart extends CypherElement {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  p in p = (a)-[:knows]->(b)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see org.nasdanika.models.cypher.CypherPackage#getPatternPart_Variable()
	 * @model unique="false"
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.PatternPart#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

	/**
	 * Returns the value of the '<em><b>Selector</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.cypher.PathSelector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector</em>' attribute.
	 * @see org.nasdanika.models.cypher.PathSelector
	 * @see #setSelector(PathSelector)
	 * @see org.nasdanika.models.cypher.CypherPackage#getPatternPart_Selector()
	 * @model unique="false"
	 * @generated
	 */
	PathSelector getSelector();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.PatternPart#getSelector <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' attribute.
	 * @see org.nasdanika.models.cypher.PathSelector
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(PathSelector value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(PatternElement)
	 * @see org.nasdanika.models.cypher.CypherPackage#getPatternPart_Element()
	 * @model containment="true"
	 * @generated
	 */
	PatternElement getElement();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.PatternPart#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(PatternElement value);

} // PatternPart
