/**
 */
package org.nasdanika.models.cypher;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Dialect</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 *  ===========================================================================
 * ROOT AND STATEMENTS
 * ===========================================================================
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.cypher.CypherPackage#getDialect()
 * @model
 * @generated
 */
public enum Dialect implements Enumerator {
	/**
	 * The '<em><b>OPEN CYPHER 9</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  openCypher 9, the baseline this model tracks and the one the TCK tests.
	 * <!-- end-model-doc -->
	 * @see #OPEN_CYPHER_9_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN_CYPHER_9(0, "OPEN_CYPHER_9", "OPEN_CYPHER_9"),

	/**
	 * The '<em><b>OPEN CYPHER 2024</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The openCypher 2024 series, which added label expressions, quantified path
	 * patterns and SHORTEST while aligning with GQL. The grammar's on-ramp to the
	 * standard, and the reason label matching is an expression tree here.
	 * <!-- end-model-doc -->
	 * @see #OPEN_CYPHER_2024_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN_CYPHER_2024(0, "OPEN_CYPHER_2024", "OPEN_CYPHER_2024"),

	/**
	 * The '<em><b>NEO4J</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Neo4j's own Cypher, which has diverged since openCypher 9.
	 * <!-- end-model-doc -->
	 * @see #NEO4J_VALUE
	 * @generated
	 * @ordered
	 */
	NEO4J(0, "NEO4J", "NEO4J"),

	/**
	 * The '<em><b>GQL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  ISO/IEC 39075 GQL.
	 * <!-- end-model-doc -->
	 * @see #GQL_VALUE
	 * @generated
	 * @ordered
	 */
	GQL(0, "GQL", "GQL"),

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Memgraph, Apache AGE, Neptune openCypher and everything else.
	 * <!-- end-model-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(0, "OTHER", "OTHER");

	/**
	 * The '<em><b>OPEN CYPHER 9</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  openCypher 9, the baseline this model tracks and the one the TCK tests.
	 * <!-- end-model-doc -->
	 * @see #OPEN_CYPHER_9
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_CYPHER_9_VALUE = 0;

	/**
	 * The '<em><b>OPEN CYPHER 2024</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The openCypher 2024 series, which added label expressions, quantified path
	 * patterns and SHORTEST while aligning with GQL. The grammar's on-ramp to the
	 * standard, and the reason label matching is an expression tree here.
	 * <!-- end-model-doc -->
	 * @see #OPEN_CYPHER_2024
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_CYPHER_2024_VALUE = 0;

	/**
	 * The '<em><b>NEO4J</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Neo4j's own Cypher, which has diverged since openCypher 9.
	 * <!-- end-model-doc -->
	 * @see #NEO4J
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEO4J_VALUE = 0;

	/**
	 * The '<em><b>GQL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  ISO/IEC 39075 GQL.
	 * <!-- end-model-doc -->
	 * @see #GQL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GQL_VALUE = 0;

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Memgraph, Apache AGE, Neptune openCypher and everything else.
	 * <!-- end-model-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 0;

	/**
	 * An array of all the '<em><b>Dialect</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Dialect[] VALUES_ARRAY =
		new Dialect[] {
			OPEN_CYPHER_9,
			OPEN_CYPHER_2024,
			NEO4J,
			GQL,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Dialect</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Dialect> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Dialect</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Dialect get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Dialect result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dialect</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Dialect getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Dialect result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dialect</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Dialect get(int value) {
		switch (value) {
			case OPEN_CYPHER_9_VALUE: return OPEN_CYPHER_9;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Dialect(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Dialect
