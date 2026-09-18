/**
 */
package org.nasdanika.models.cypher;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The contents of a .cypher resource: an ordered list of statements plus the text
 * they were parsed from. The text is kept so that a resource which was only
 * partly understood can still be saved unchanged, and so that a statement can be
 * shown to a reader exactly as its author wrote it.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.CypherSource#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.CypherSource#isParsed <em>Parsed</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.CypherSource#getDialect <em>Dialect</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.CypherSource#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.cypher.CypherPackage#getCypherSource()
 * @model
 * @generated
 */
public interface CypherSource extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The verbatim source, retained for lossless save and for display.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.nasdanika.models.cypher.CypherPackage#getCypherSource_Source()
	 * @model unique="false"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.CypherSource#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Parsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  False when at least one statement is an UnparsedStatement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parsed</em>' attribute.
	 * @see #setParsed(boolean)
	 * @see org.nasdanika.models.cypher.CypherPackage#getCypherSource_Parsed()
	 * @model unique="false"
	 * @generated
	 */
	boolean isParsed();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.CypherSource#isParsed <em>Parsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parsed</em>' attribute.
	 * @see #isParsed()
	 * @generated
	 */
	void setParsed(boolean value);

	/**
	 * Returns the value of the '<em><b>Dialect</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.cypher.Dialect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dialect</em>' attribute.
	 * @see org.nasdanika.models.cypher.Dialect
	 * @see #setDialect(Dialect)
	 * @see org.nasdanika.models.cypher.CypherPackage#getCypherSource_Dialect()
	 * @model unique="false"
	 * @generated
	 */
	Dialect getDialect();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.cypher.CypherSource#getDialect <em>Dialect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dialect</em>' attribute.
	 * @see org.nasdanika.models.cypher.Dialect
	 * @see #getDialect()
	 * @generated
	 */
	void setDialect(Dialect value);

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.cypher.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see org.nasdanika.models.cypher.CypherPackage#getCypherSource_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

} // CypherSource
