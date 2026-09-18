/**
 */
package org.nasdanika.models.cypher;

import org.nasdanika.models.nxcore.Marked;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The shared base of every AST node. Marked gives each node the NxCore marker
 * list, which is where line, column and source location live, so diagnostics and
 * generated documentation can point at the character a construct came from.
 * <!-- end-model-doc -->
 *
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getCypherElement()
 * @model abstract="true"
 * @generated
 */
public interface CypherElement extends Marked {
} // CypherElement
