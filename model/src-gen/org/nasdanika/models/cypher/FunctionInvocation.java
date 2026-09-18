/**
 */
package org.nasdanika.models.cypher;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A function call, including aggregating functions. Whether a function aggregates
 * is a property of the function rather than of the syntax, which is why there is
 * no separate aggregation class: the engine's function registry decides, and that
 * registry is the other extension point besides procedures.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.FunctionInvocation#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.FunctionInvocation#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.FunctionInvocation#isDistinct <em>Distinct</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.FunctionInvocation#isStar <em>Star</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.FunctionInvocation#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getFunctionInvocation()
 * @model
 * @generated
 */
public interface FunctionInvocation extends Expression {
	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute list.
	 * @see org.nasdanika.models.cypher.CypherPackage#getFunctionInvocation_Namespace()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getNamespace();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.cypher.CypherPackage#getFunctionInvocation_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.FunctionInvocation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Distinct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  count(DISTINCT x)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Distinct</em>' attribute.
	 * @see #setDistinct(boolean)
	 * @see org.nasdanika.models.cypher.CypherPackage#getFunctionInvocation_Distinct()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDistinct();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.FunctionInvocation#isDistinct <em>Distinct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distinct</em>' attribute.
	 * @see #isDistinct()
	 * @generated
	 */
	void setDistinct(boolean value);

	/**
	 * Returns the value of the '<em><b>Star</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  count(*)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Star</em>' attribute.
	 * @see #setStar(boolean)
	 * @see org.nasdanika.models.cypher.CypherPackage#getFunctionInvocation_Star()
	 * @model unique="false"
	 * @generated
	 */
	boolean isStar();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.FunctionInvocation#isStar <em>Star</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Star</em>' attribute.
	 * @see #isStar()
	 * @generated
	 */
	void setStar(boolean value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.cypher.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see org.nasdanika.models.cypher.CypherPackage#getFunctionInvocation_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getArguments();

} // FunctionInvocation
