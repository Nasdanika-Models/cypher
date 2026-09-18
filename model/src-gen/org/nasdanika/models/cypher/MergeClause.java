/**
 */
package org.nasdanika.models.cypher;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merge Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * MERGE: match the pattern or create it, with actions that fire on whichever
 * happened. Against a model whose identity is the NxCore URI scheme this is the
 * natural idempotent upsert, and it is what makes repeated application of the same
 * authored statement safe.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.MergeClause#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.MergeClause#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getMergeClause()
 * @model
 * @generated
 */
public interface MergeClause extends Clause {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference.
	 * @see #setPattern(PatternPart)
	 * @see org.nasdanika.models.cypher.CypherPackage#getMergeClause_Pattern()
	 * @model containment="true"
	 * @generated
	 */
	PatternPart getPattern();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.MergeClause#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(PatternPart value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.cypher.MergeAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.nasdanika.models.cypher.CypherPackage#getMergeClause_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<MergeAction> getActions();

} // MergeClause
