/**
 */
package org.nasdanika.models.cypher;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Disjunction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  :A|B
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.LabelDisjunction#getOperands <em>Operands</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getLabelDisjunction()
 * @model
 * @generated
 */
public interface LabelDisjunction extends LabelExpression {
	/**
	 * Returns the value of the '<em><b>Operands</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.cypher.LabelExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operands</em>' containment reference list.
	 * @see org.nasdanika.models.cypher.CypherPackage#getLabelDisjunction_Operands()
	 * @model containment="true"
	 * @generated
	 */
	EList<LabelExpression> getOperands();

} // LabelDisjunction
