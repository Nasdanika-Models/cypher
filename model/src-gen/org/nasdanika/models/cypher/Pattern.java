/**
 */
package org.nasdanika.models.cypher;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ===========================================================================
 * PATTERNS
 * ===========================================================================
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.Pattern#getParts <em>Parts</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getPattern()
 * @model
 * @generated
 */
public interface Pattern extends CypherElement {
	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.cypher.PatternPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see org.nasdanika.models.cypher.CypherPackage#getPattern_Parts()
	 * @model containment="true"
	 * @generated
	 */
	EList<PatternPart> getParts();

} // Pattern
