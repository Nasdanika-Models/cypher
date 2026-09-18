/**
 */
package org.nasdanika.models.cypher;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Conjunction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  :A:B in openCypher 9, :A&B in 2024.2 and later.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.LabelConjunction#getOperands <em>Operands</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getLabelConjunction()
 * @model
 * @generated
 */
public interface LabelConjunction extends LabelExpression {
	/**
	 * Returns the value of the '<em><b>Operands</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.cypher.LabelExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operands</em>' containment reference list.
	 * @see org.nasdanika.models.cypher.CypherPackage#getLabelConjunction_Operands()
	 * @model containment="true"
	 * @generated
	 */
	EList<LabelExpression> getOperands();

} // LabelConjunction
