/**
 */
package org.nasdanika.models.cypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * How a pattern selects labels or relationship types.
 * 
 * openCypher 9 needs almost none of this: a node pattern carries a conjunction of
 * label names and a relationship pattern carries a disjunction of type names, which
 * two string lists would have expressed. The tree is here anyway because it is the
 * one part of the language where the direction of travel is known to be
 * non-additive. openCypher 2024.2 introduced label expressions with &, |, ! and %,
 * and GQL has them, so a String[] would have to be replaced rather than extended,
 * and label matching appears in every query ever written against this model.
 * 
 * Everything else the 2024 series added is additive (quantified path patterns are
 * one new PatternElement subclass, SHORTEST is one more PathSelector literal) and is
 * deliberately left for when it is needed.
 * <!-- end-model-doc -->
 *
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getLabelExpression()
 * @model abstract="true"
 * @generated
 */
public interface LabelExpression extends CypherElement {
} // LabelExpression
