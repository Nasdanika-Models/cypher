/**
 */
package org.nasdanika.models.cypher;

import org.nasdanika.models.nxcore.SourceEvaluator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ===========================================================================
 * EVALUATOR
 * ===========================================================================
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.CypherEvaluator#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.CypherEvaluator#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.CypherEvaluator#getRowLimit <em>Row Limit</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.CypherEvaluator#getTimeout <em>Timeout</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getCypherEvaluator()
 * @model
 * @generated
 */
public interface CypherEvaluator extends SourceEvaluator {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The parsed statement. Derived from the inherited source when not set directly.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference.
	 * @see #setStatement(Statement)
	 * @see org.nasdanika.models.cypher.CypherPackage#getCypherEvaluator_Statement()
	 * @model containment="true"
	 * @generated
	 */
	Statement getStatement();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.CypherEvaluator#getStatement <em>Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' containment reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(Statement value);

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When true the engine rejects CREATE, MERGE, SET, REMOVE, DELETE and any
	 * procedure not declared read-only. This is the flag a data pack loader checks,
	 * and the default is the safe one.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(boolean)
	 * @see org.nasdanika.models.cypher.CypherPackage#getCypherEvaluator_ReadOnly()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.CypherEvaluator#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Row Limit</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum number of rows the engine will produce before failing. A guard rather
	 * than a tuning knob: an unconstrained join in a generated query is a hang, and
	 * a hang in a documentation build is indistinguishable from a broken build.
	 * -1 means the engine's default.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Row Limit</em>' attribute.
	 * @see #setRowLimit(int)
	 * @see org.nasdanika.models.cypher.CypherPackage#getCypherEvaluator_RowLimit()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getRowLimit();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.CypherEvaluator#getRowLimit <em>Row Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Limit</em>' attribute.
	 * @see #getRowLimit()
	 * @generated
	 */
	void setRowLimit(int value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Evaluation timeout in milliseconds, -1 for the engine's default.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(int)
	 * @see org.nasdanika.models.cypher.CypherPackage#getCypherEvaluator_Timeout()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getTimeout();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.CypherEvaluator#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(int value);

} // CypherEvaluator
