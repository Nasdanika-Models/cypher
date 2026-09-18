/**
 */
package org.nasdanika.models.cypher;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.nasdanika.models.nxcore.NxcorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.cypher.CypherFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/model/src-gen' featureDelegation='Dynamic' complianceLevel='25' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.models'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' Nasdanika='urn:org.nasdanika'"
 * @generated
 */
public interface CypherPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cypher";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://cypher.models.nasdanika.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.cypher";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CypherPackage eINSTANCE = org.nasdanika.models.cypher.impl.CypherPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.CypherSourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.CypherSourceImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getCypherSource()
	 * @generated
	 */
	int CYPHER_SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_SOURCE__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_SOURCE__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_SOURCE__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_SOURCE__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_SOURCE__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_SOURCE__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_SOURCE__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_SOURCE__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_SOURCE__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_SOURCE__SOURCE = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_SOURCE__PARSED = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dialect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_SOURCE__DIALECT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_SOURCE__STATEMENTS = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_SOURCE_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_SOURCE___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_SOURCE___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_SOURCE_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.CypherElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.CypherElementImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getCypherElement()
	 * @generated
	 */
	int CYPHER_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_ELEMENT__MARKERS = NxcorePackage.MARKED__MARKERS;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_ELEMENT_FEATURE_COUNT = NxcorePackage.MARKED_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_ELEMENT_OPERATION_COUNT = NxcorePackage.MARKED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.StatementImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 2;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__MARKERS = CYPHER_ELEMENT__MARKERS;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = CYPHER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = CYPHER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.UnparsedStatementImpl <em>Unparsed Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.UnparsedStatementImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getUnparsedStatement()
	 * @generated
	 */
	int UNPARSED_STATEMENT = 3;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPARSED_STATEMENT__MARKERS = STATEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPARSED_STATEMENT__TEXT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPARSED_STATEMENT__ERROR = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unparsed Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPARSED_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unparsed Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPARSED_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.QueryImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 4;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__MARKERS = STATEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Explain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__EXPLAIN = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__PROFILE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.SingleQueryImpl <em>Single Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.SingleQueryImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getSingleQuery()
	 * @generated
	 */
	int SINGLE_QUERY = 5;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_QUERY__MARKERS = QUERY__MARKERS;

	/**
	 * The feature id for the '<em><b>Explain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_QUERY__EXPLAIN = QUERY__EXPLAIN;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_QUERY__PROFILE = QUERY__PROFILE;

	/**
	 * The feature id for the '<em><b>Clauses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_QUERY__CLAUSES = QUERY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_QUERY_FEATURE_COUNT = QUERY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Single Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_QUERY_OPERATION_COUNT = QUERY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.UnionImpl <em>Union</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.UnionImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getUnion()
	 * @generated
	 */
	int UNION = 6;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__MARKERS = QUERY__MARKERS;

	/**
	 * The feature id for the '<em><b>Explain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__EXPLAIN = QUERY__EXPLAIN;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__PROFILE = QUERY__PROFILE;

	/**
	 * The feature id for the '<em><b>All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__ALL = QUERY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__OPERANDS = QUERY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Union</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_FEATURE_COUNT = QUERY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Union</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_OPERATION_COUNT = QUERY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.ClauseImpl <em>Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.ClauseImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getClause()
	 * @generated
	 */
	int CLAUSE = 7;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__MARKERS = CYPHER_ELEMENT__MARKERS;

	/**
	 * The number of structural features of the '<em>Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE_FEATURE_COUNT = CYPHER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE_OPERATION_COUNT = CYPHER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.MatchClauseImpl <em>Match Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.MatchClauseImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getMatchClause()
	 * @generated
	 */
	int MATCH_CLAUSE = 8;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_CLAUSE__MARKERS = CLAUSE__MARKERS;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_CLAUSE__OPTIONAL = CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_CLAUSE__PATTERN = CLAUSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_CLAUSE__WHERE = CLAUSE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Match Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_CLAUSE_FEATURE_COUNT = CLAUSE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Match Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_CLAUSE_OPERATION_COUNT = CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.ProjectionClauseImpl <em>Projection Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.ProjectionClauseImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getProjectionClause()
	 * @generated
	 */
	int PROJECTION_CLAUSE = 9;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_CLAUSE__MARKERS = CLAUSE__MARKERS;

	/**
	 * The feature id for the '<em><b>Distinct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_CLAUSE__DISTINCT = CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_CLAUSE__ALL = CLAUSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_CLAUSE__ITEMS = CLAUSE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Order</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_CLAUSE__ORDER = CLAUSE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Skip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_CLAUSE__SKIP = CLAUSE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_CLAUSE__LIMIT = CLAUSE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Projection Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_CLAUSE_FEATURE_COUNT = CLAUSE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Projection Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_CLAUSE_OPERATION_COUNT = CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.ReturnClauseImpl <em>Return Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.ReturnClauseImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getReturnClause()
	 * @generated
	 */
	int RETURN_CLAUSE = 10;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CLAUSE__MARKERS = PROJECTION_CLAUSE__MARKERS;

	/**
	 * The feature id for the '<em><b>Distinct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CLAUSE__DISTINCT = PROJECTION_CLAUSE__DISTINCT;

	/**
	 * The feature id for the '<em><b>All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CLAUSE__ALL = PROJECTION_CLAUSE__ALL;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CLAUSE__ITEMS = PROJECTION_CLAUSE__ITEMS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CLAUSE__ORDER = PROJECTION_CLAUSE__ORDER;

	/**
	 * The feature id for the '<em><b>Skip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CLAUSE__SKIP = PROJECTION_CLAUSE__SKIP;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CLAUSE__LIMIT = PROJECTION_CLAUSE__LIMIT;

	/**
	 * The number of structural features of the '<em>Return Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CLAUSE_FEATURE_COUNT = PROJECTION_CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Return Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CLAUSE_OPERATION_COUNT = PROJECTION_CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.WithClauseImpl <em>With Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.WithClauseImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getWithClause()
	 * @generated
	 */
	int WITH_CLAUSE = 11;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_CLAUSE__MARKERS = PROJECTION_CLAUSE__MARKERS;

	/**
	 * The feature id for the '<em><b>Distinct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_CLAUSE__DISTINCT = PROJECTION_CLAUSE__DISTINCT;

	/**
	 * The feature id for the '<em><b>All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_CLAUSE__ALL = PROJECTION_CLAUSE__ALL;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_CLAUSE__ITEMS = PROJECTION_CLAUSE__ITEMS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_CLAUSE__ORDER = PROJECTION_CLAUSE__ORDER;

	/**
	 * The feature id for the '<em><b>Skip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_CLAUSE__SKIP = PROJECTION_CLAUSE__SKIP;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_CLAUSE__LIMIT = PROJECTION_CLAUSE__LIMIT;

	/**
	 * The feature id for the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_CLAUSE__WHERE = PROJECTION_CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>With Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_CLAUSE_FEATURE_COUNT = PROJECTION_CLAUSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>With Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_CLAUSE_OPERATION_COUNT = PROJECTION_CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.ProjectionItemImpl <em>Projection Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.ProjectionItemImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getProjectionItem()
	 * @generated
	 */
	int PROJECTION_ITEM = 12;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_ITEM__MARKERS = CYPHER_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_ITEM__EXPRESSION = CYPHER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_ITEM__ALIAS = CYPHER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Projection Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_ITEM_FEATURE_COUNT = CYPHER_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Projection Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_ITEM_OPERATION_COUNT = CYPHER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.SortItemImpl <em>Sort Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.SortItemImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getSortItem()
	 * @generated
	 */
	int SORT_ITEM = 13;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_ITEM__MARKERS = CYPHER_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_ITEM__EXPRESSION = CYPHER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_ITEM__DIRECTION = CYPHER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sort Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_ITEM_FEATURE_COUNT = CYPHER_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sort Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_ITEM_OPERATION_COUNT = CYPHER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.UnwindClauseImpl <em>Unwind Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.UnwindClauseImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getUnwindClause()
	 * @generated
	 */
	int UNWIND_CLAUSE = 14;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNWIND_CLAUSE__MARKERS = CLAUSE__MARKERS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNWIND_CLAUSE__EXPRESSION = CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNWIND_CLAUSE__VARIABLE = CLAUSE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unwind Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNWIND_CLAUSE_FEATURE_COUNT = CLAUSE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unwind Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNWIND_CLAUSE_OPERATION_COUNT = CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.CreateClauseImpl <em>Create Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.CreateClauseImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getCreateClause()
	 * @generated
	 */
	int CREATE_CLAUSE = 15;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CLAUSE__MARKERS = CLAUSE__MARKERS;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CLAUSE__PATTERN = CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Create Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CLAUSE_FEATURE_COUNT = CLAUSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Create Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CLAUSE_OPERATION_COUNT = CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.MergeClauseImpl <em>Merge Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.MergeClauseImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getMergeClause()
	 * @generated
	 */
	int MERGE_CLAUSE = 16;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_CLAUSE__MARKERS = CLAUSE__MARKERS;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_CLAUSE__PATTERN = CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_CLAUSE__ACTIONS = CLAUSE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Merge Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_CLAUSE_FEATURE_COUNT = CLAUSE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Merge Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_CLAUSE_OPERATION_COUNT = CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.MergeActionImpl <em>Merge Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.MergeActionImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getMergeAction()
	 * @generated
	 */
	int MERGE_ACTION = 17;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_ACTION__MARKERS = CYPHER_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_ACTION__KIND = CYPHER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_ACTION__SET = CYPHER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Merge Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_ACTION_FEATURE_COUNT = CYPHER_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Merge Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_ACTION_OPERATION_COUNT = CYPHER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.SetClauseImpl <em>Set Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.SetClauseImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getSetClause()
	 * @generated
	 */
	int SET_CLAUSE = 18;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CLAUSE__MARKERS = CLAUSE__MARKERS;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CLAUSE__ITEMS = CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CLAUSE_FEATURE_COUNT = CLAUSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Set Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CLAUSE_OPERATION_COUNT = CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.SetItemImpl <em>Set Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.SetItemImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getSetItem()
	 * @generated
	 */
	int SET_ITEM = 19;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ITEM__MARKERS = CYPHER_ELEMENT__MARKERS;

	/**
	 * The number of structural features of the '<em>Set Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ITEM_FEATURE_COUNT = CYPHER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Set Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ITEM_OPERATION_COUNT = CYPHER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.SetPropertyImpl <em>Set Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.SetPropertyImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getSetProperty()
	 * @generated
	 */
	int SET_PROPERTY = 20;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PROPERTY__MARKERS = SET_ITEM__MARKERS;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PROPERTY__PROPERTY = SET_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PROPERTY__VALUE = SET_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PROPERTY_FEATURE_COUNT = SET_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Set Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PROPERTY_OPERATION_COUNT = SET_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.SetVariableImpl <em>Set Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.SetVariableImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getSetVariable()
	 * @generated
	 */
	int SET_VARIABLE = 21;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE__MARKERS = SET_ITEM__MARKERS;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE__VARIABLE = SET_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE__VALUE = SET_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Merge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE__MERGE = SET_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Set Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_FEATURE_COUNT = SET_ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Set Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_OPERATION_COUNT = SET_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.SetLabelsImpl <em>Set Labels</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.SetLabelsImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getSetLabels()
	 * @generated
	 */
	int SET_LABELS = 22;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LABELS__MARKERS = SET_ITEM__MARKERS;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LABELS__VARIABLE = SET_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LABELS__LABELS = SET_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Labels</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LABELS_FEATURE_COUNT = SET_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Set Labels</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LABELS_OPERATION_COUNT = SET_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.RemoveClauseImpl <em>Remove Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.RemoveClauseImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getRemoveClause()
	 * @generated
	 */
	int REMOVE_CLAUSE = 23;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_CLAUSE__MARKERS = CLAUSE__MARKERS;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_CLAUSE__ITEMS = CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remove Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_CLAUSE_FEATURE_COUNT = CLAUSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Remove Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_CLAUSE_OPERATION_COUNT = CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.RemoveItemImpl <em>Remove Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.RemoveItemImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getRemoveItem()
	 * @generated
	 */
	int REMOVE_ITEM = 24;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ITEM__MARKERS = CYPHER_ELEMENT__MARKERS;

	/**
	 * The number of structural features of the '<em>Remove Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ITEM_FEATURE_COUNT = CYPHER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Remove Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ITEM_OPERATION_COUNT = CYPHER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.RemovePropertyImpl <em>Remove Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.RemovePropertyImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getRemoveProperty()
	 * @generated
	 */
	int REMOVE_PROPERTY = 25;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_PROPERTY__MARKERS = REMOVE_ITEM__MARKERS;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_PROPERTY__PROPERTY = REMOVE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remove Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_PROPERTY_FEATURE_COUNT = REMOVE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Remove Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_PROPERTY_OPERATION_COUNT = REMOVE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.RemoveLabelsImpl <em>Remove Labels</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.RemoveLabelsImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getRemoveLabels()
	 * @generated
	 */
	int REMOVE_LABELS = 26;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_LABELS__MARKERS = REMOVE_ITEM__MARKERS;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_LABELS__VARIABLE = REMOVE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_LABELS__LABELS = REMOVE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Remove Labels</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_LABELS_FEATURE_COUNT = REMOVE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Remove Labels</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_LABELS_OPERATION_COUNT = REMOVE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.DeleteClauseImpl <em>Delete Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.DeleteClauseImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getDeleteClause()
	 * @generated
	 */
	int DELETE_CLAUSE = 27;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_CLAUSE__MARKERS = CLAUSE__MARKERS;

	/**
	 * The feature id for the '<em><b>Detach</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_CLAUSE__DETACH = CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_CLAUSE__EXPRESSIONS = CLAUSE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Delete Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_CLAUSE_FEATURE_COUNT = CLAUSE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Delete Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_CLAUSE_OPERATION_COUNT = CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.ForeachClauseImpl <em>Foreach Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.ForeachClauseImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getForeachClause()
	 * @generated
	 */
	int FOREACH_CLAUSE = 28;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREACH_CLAUSE__MARKERS = CLAUSE__MARKERS;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREACH_CLAUSE__VARIABLE = CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREACH_CLAUSE__EXPRESSION = CLAUSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Clauses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREACH_CLAUSE__CLAUSES = CLAUSE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Foreach Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREACH_CLAUSE_FEATURE_COUNT = CLAUSE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Foreach Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREACH_CLAUSE_OPERATION_COUNT = CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.CallClauseImpl <em>Call Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.CallClauseImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getCallClause()
	 * @generated
	 */
	int CALL_CLAUSE = 29;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CLAUSE__MARKERS = CLAUSE__MARKERS;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CLAUSE__NAMESPACE = CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CLAUSE__NAME = CLAUSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CLAUSE__ARGUMENTS = CLAUSE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Yield Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CLAUSE__YIELD_ITEMS = CLAUSE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CLAUSE__WHERE = CLAUSE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Subquery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CLAUSE__SUBQUERY = CLAUSE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Call Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CLAUSE_FEATURE_COUNT = CLAUSE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Call Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CLAUSE_OPERATION_COUNT = CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.PatternImpl <em>Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.PatternImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getPattern()
	 * @generated
	 */
	int PATTERN = 30;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__MARKERS = CYPHER_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__PARTS = CYPHER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FEATURE_COUNT = CYPHER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPERATION_COUNT = CYPHER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.PatternPartImpl <em>Pattern Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.PatternPartImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getPatternPart()
	 * @generated
	 */
	int PATTERN_PART = 31;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PART__MARKERS = CYPHER_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PART__VARIABLE = CYPHER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PART__SELECTOR = CYPHER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PART__ELEMENT = CYPHER_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PART_FEATURE_COUNT = CYPHER_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PART_OPERATION_COUNT = CYPHER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.PatternElementImpl <em>Pattern Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.PatternElementImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getPatternElement()
	 * @generated
	 */
	int PATTERN_ELEMENT = 32;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT__MARKERS = CYPHER_ELEMENT__MARKERS;

	/**
	 * The number of structural features of the '<em>Pattern Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT_FEATURE_COUNT = CYPHER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pattern Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT_OPERATION_COUNT = CYPHER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.NodePatternImpl <em>Node Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.NodePatternImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getNodePattern()
	 * @generated
	 */
	int NODE_PATTERN = 33;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PATTERN__MARKERS = PATTERN_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PATTERN__VARIABLE = PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PATTERN__LABEL_EXPRESSION = PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PATTERN__PROPERTIES = PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Node Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PATTERN_FEATURE_COUNT = PATTERN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Node Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PATTERN_OPERATION_COUNT = PATTERN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.LabelExpressionImpl <em>Label Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.LabelExpressionImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getLabelExpression()
	 * @generated
	 */
	int LABEL_EXPRESSION = 34;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_EXPRESSION__MARKERS = CYPHER_ELEMENT__MARKERS;

	/**
	 * The number of structural features of the '<em>Label Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_EXPRESSION_FEATURE_COUNT = CYPHER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Label Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_EXPRESSION_OPERATION_COUNT = CYPHER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.LabelNameImpl <em>Label Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.LabelNameImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getLabelName()
	 * @generated
	 */
	int LABEL_NAME = 35;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_NAME__MARKERS = LABEL_EXPRESSION__MARKERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_NAME__NAME = LABEL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Label Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_NAME_FEATURE_COUNT = LABEL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Label Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_NAME_OPERATION_COUNT = LABEL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.LabelConjunctionImpl <em>Label Conjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.LabelConjunctionImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getLabelConjunction()
	 * @generated
	 */
	int LABEL_CONJUNCTION = 36;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_CONJUNCTION__MARKERS = LABEL_EXPRESSION__MARKERS;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_CONJUNCTION__OPERANDS = LABEL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Label Conjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_CONJUNCTION_FEATURE_COUNT = LABEL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Label Conjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_CONJUNCTION_OPERATION_COUNT = LABEL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.LabelDisjunctionImpl <em>Label Disjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.LabelDisjunctionImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getLabelDisjunction()
	 * @generated
	 */
	int LABEL_DISJUNCTION = 37;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_DISJUNCTION__MARKERS = LABEL_EXPRESSION__MARKERS;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_DISJUNCTION__OPERANDS = LABEL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Label Disjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_DISJUNCTION_FEATURE_COUNT = LABEL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Label Disjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_DISJUNCTION_OPERATION_COUNT = LABEL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.LabelNegationImpl <em>Label Negation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.LabelNegationImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getLabelNegation()
	 * @generated
	 */
	int LABEL_NEGATION = 38;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_NEGATION__MARKERS = LABEL_EXPRESSION__MARKERS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_NEGATION__OPERAND = LABEL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Label Negation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_NEGATION_FEATURE_COUNT = LABEL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Label Negation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_NEGATION_OPERATION_COUNT = LABEL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.LabelWildcardImpl <em>Label Wildcard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.LabelWildcardImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getLabelWildcard()
	 * @generated
	 */
	int LABEL_WILDCARD = 39;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_WILDCARD__MARKERS = LABEL_EXPRESSION__MARKERS;

	/**
	 * The number of structural features of the '<em>Label Wildcard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_WILDCARD_FEATURE_COUNT = LABEL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Label Wildcard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_WILDCARD_OPERATION_COUNT = LABEL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.RelationshipChainImpl <em>Relationship Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.RelationshipChainImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getRelationshipChain()
	 * @generated
	 */
	int RELATIONSHIP_CHAIN = 40;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CHAIN__MARKERS = PATTERN_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CHAIN__LEFT = PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CHAIN__RELATIONSHIP = PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CHAIN__RIGHT = PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relationship Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CHAIN_FEATURE_COUNT = PATTERN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Relationship Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CHAIN_OPERATION_COUNT = PATTERN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.RelationshipPatternImpl <em>Relationship Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.RelationshipPatternImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getRelationshipPattern()
	 * @generated
	 */
	int RELATIONSHIP_PATTERN = 41;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PATTERN__MARKERS = PATTERN_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PATTERN__VARIABLE = PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PATTERN__TYPE_EXPRESSION = PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PATTERN__DIRECTION = PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PATTERN__PROPERTIES = PATTERN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Variable Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PATTERN__VARIABLE_LENGTH = PATTERN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min Hops</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PATTERN__MIN_HOPS = PATTERN_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Max Hops</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PATTERN__MAX_HOPS = PATTERN_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Relationship Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PATTERN_FEATURE_COUNT = PATTERN_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Relationship Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PATTERN_OPERATION_COUNT = PATTERN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.ExpressionImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 42;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__MARKERS = CYPHER_ELEMENT__MARKERS;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = CYPHER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = CYPHER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.VariableImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 43;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__MARKERS = EXPRESSION__MARKERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.ParameterImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 44;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MARKERS = EXPRESSION__MARKERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.LiteralImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 45;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__MARKERS = EXPRESSION__MARKERS;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.StringLiteralImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 46;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__MARKERS = LITERAL__MARKERS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.IntegerLiteralImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getIntegerLiteral()
	 * @generated
	 */
	int INTEGER_LITERAL = 47;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__MARKERS = LITERAL__MARKERS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.FloatLiteralImpl <em>Float Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.FloatLiteralImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getFloatLiteral()
	 * @generated
	 */
	int FLOAT_LITERAL = 48;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_LITERAL__MARKERS = LITERAL__MARKERS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Float Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Float Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.BooleanLiteralImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 49;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__MARKERS = LITERAL__MARKERS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.NullLiteralImpl <em>Null Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.NullLiteralImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getNullLiteral()
	 * @generated
	 */
	int NULL_LITERAL = 50;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL__MARKERS = LITERAL__MARKERS;

	/**
	 * The number of structural features of the '<em>Null Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Null Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.ListLiteralImpl <em>List Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.ListLiteralImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getListLiteral()
	 * @generated
	 */
	int LIST_LITERAL = 51;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL__MARKERS = LITERAL__MARKERS;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL__ELEMENTS = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>List Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.MapLiteralImpl <em>Map Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.MapLiteralImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getMapLiteral()
	 * @generated
	 */
	int MAP_LITERAL = 52;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_LITERAL__MARKERS = LITERAL__MARKERS;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_LITERAL__ENTRIES = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Map Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Map Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.MapEntryImpl <em>Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.MapEntryImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getMapEntry()
	 * @generated
	 */
	int MAP_ENTRY = 53;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ENTRY__MARKERS = CYPHER_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ENTRY__KEY = CYPHER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ENTRY__VALUE = CYPHER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ENTRY_FEATURE_COUNT = CYPHER_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ENTRY_OPERATION_COUNT = CYPHER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.PropertyAccessImpl <em>Property Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.PropertyAccessImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getPropertyAccess()
	 * @generated
	 */
	int PROPERTY_ACCESS = 54;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ACCESS__MARKERS = EXPRESSION__MARKERS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ACCESS__TARGET = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ACCESS__PROPERTY_KEY = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Property Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ACCESS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.LabelCheckImpl <em>Label Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.LabelCheckImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getLabelCheck()
	 * @generated
	 */
	int LABEL_CHECK = 55;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_CHECK__MARKERS = EXPRESSION__MARKERS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_CHECK__TARGET = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_CHECK__LABEL_EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Label Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_CHECK_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Label Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_CHECK_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.BinaryExpressionImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 56;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__MARKERS = EXPRESSION__MARKERS;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.UnaryExpressionImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 57;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__MARKERS = EXPRESSION__MARKERS;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OPERAND = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.FunctionInvocationImpl <em>Function Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.FunctionInvocationImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getFunctionInvocation()
	 * @generated
	 */
	int FUNCTION_INVOCATION = 58;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOCATION__MARKERS = EXPRESSION__MARKERS;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOCATION__NAMESPACE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOCATION__NAME = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Distinct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOCATION__DISTINCT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Star</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOCATION__STAR = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOCATION__ARGUMENTS = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Function Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOCATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Function Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOCATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.CaseExpressionImpl <em>Case Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.CaseExpressionImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getCaseExpression()
	 * @generated
	 */
	int CASE_EXPRESSION = 59;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_EXPRESSION__MARKERS = EXPRESSION__MARKERS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_EXPRESSION__SUBJECT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alternatives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_EXPRESSION__ALTERNATIVES = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_EXPRESSION__ELSE_EXPRESSION = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Case Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Case Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.CaseAlternativeImpl <em>Case Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.CaseAlternativeImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getCaseAlternative()
	 * @generated
	 */
	int CASE_ALTERNATIVE = 60;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_ALTERNATIVE__MARKERS = CYPHER_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_ALTERNATIVE__CONDITION = CYPHER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_ALTERNATIVE__RESULT = CYPHER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Case Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_ALTERNATIVE_FEATURE_COUNT = CYPHER_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Case Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_ALTERNATIVE_OPERATION_COUNT = CYPHER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.ListComprehensionImpl <em>List Comprehension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.ListComprehensionImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getListComprehension()
	 * @generated
	 */
	int LIST_COMPREHENSION = 61;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_COMPREHENSION__MARKERS = EXPRESSION__MARKERS;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_COMPREHENSION__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_COMPREHENSION__LIST = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_COMPREHENSION__WHERE = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Projection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_COMPREHENSION__PROJECTION = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>List Comprehension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_COMPREHENSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>List Comprehension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_COMPREHENSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.PatternComprehensionImpl <em>Pattern Comprehension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.PatternComprehensionImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getPatternComprehension()
	 * @generated
	 */
	int PATTERN_COMPREHENSION = 62;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_COMPREHENSION__MARKERS = EXPRESSION__MARKERS;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_COMPREHENSION__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_COMPREHENSION__PATTERN = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_COMPREHENSION__WHERE = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Projection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_COMPREHENSION__PROJECTION = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Pattern Comprehension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_COMPREHENSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Pattern Comprehension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_COMPREHENSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.QuantifiedExpressionImpl <em>Quantified Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.QuantifiedExpressionImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getQuantifiedExpression()
	 * @generated
	 */
	int QUANTIFIED_EXPRESSION = 63;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_EXPRESSION__MARKERS = EXPRESSION__MARKERS;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_EXPRESSION__QUANTIFIER = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_EXPRESSION__VARIABLE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_EXPRESSION__LIST = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_EXPRESSION__WHERE = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Quantified Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Quantified Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.ExistsExpressionImpl <em>Exists Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.ExistsExpressionImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getExistsExpression()
	 * @generated
	 */
	int EXISTS_EXPRESSION = 64;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_EXPRESSION__MARKERS = EXPRESSION__MARKERS;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_EXPRESSION__PATTERN = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subquery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_EXPRESSION__SUBQUERY = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Exists Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Exists Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.SubscriptImpl <em>Subscript</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.SubscriptImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getSubscript()
	 * @generated
	 */
	int SUBSCRIPT = 65;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPT__MARKERS = EXPRESSION__MARKERS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPT__TARGET = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPT__INDEX = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Subscript</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Subscript</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.SliceExpressionImpl <em>Slice Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.SliceExpressionImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getSliceExpression()
	 * @generated
	 */
	int SLICE_EXPRESSION = 66;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICE_EXPRESSION__MARKERS = EXPRESSION__MARKERS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICE_EXPRESSION__TARGET = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICE_EXPRESSION__FROM = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICE_EXPRESSION__TO = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Slice Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Slice Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICE_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.impl.CypherEvaluatorImpl <em>Evaluator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.impl.CypherEvaluatorImpl
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getCypherEvaluator()
	 * @generated
	 */
	int CYPHER_EVALUATOR = 67;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_EVALUATOR__DOCUMENTATION = NxcorePackage.SOURCE_EVALUATOR__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_EVALUATOR__DOC_REF = NxcorePackage.SOURCE_EVALUATOR__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_EVALUATOR__DOC_FORMAT = NxcorePackage.SOURCE_EVALUATOR__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_EVALUATOR__DOC_CONTENTS = NxcorePackage.SOURCE_EVALUATOR__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_EVALUATOR__DOC_SECTIONS = NxcorePackage.SOURCE_EVALUATOR__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_EVALUATOR__MARKERS = NxcorePackage.SOURCE_EVALUATOR__MARKERS;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_EVALUATOR__SCRIPT = NxcorePackage.SOURCE_EVALUATOR__SCRIPT;

	/**
	 * The feature id for the '<em><b>Script Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_EVALUATOR__SCRIPT_REF = NxcorePackage.SOURCE_EVALUATOR__SCRIPT_REF;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_EVALUATOR__STATEMENT = NxcorePackage.SOURCE_EVALUATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_EVALUATOR__READ_ONLY = NxcorePackage.SOURCE_EVALUATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Row Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_EVALUATOR__ROW_LIMIT = NxcorePackage.SOURCE_EVALUATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_EVALUATOR__TIMEOUT = NxcorePackage.SOURCE_EVALUATOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Evaluator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_EVALUATOR_FEATURE_COUNT = NxcorePackage.SOURCE_EVALUATOR_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_EVALUATOR___EVALUATE__CLASS_MAP = NxcorePackage.SOURCE_EVALUATOR___EVALUATE__CLASS_MAP;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_EVALUATOR___EVALUATE__CLASS = NxcorePackage.SOURCE_EVALUATOR___EVALUATE__CLASS;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_EVALUATOR___EVALUATE__MAP = NxcorePackage.SOURCE_EVALUATOR___EVALUATE__MAP;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_EVALUATOR___EVALUATE = NxcorePackage.SOURCE_EVALUATOR___EVALUATE;

	/**
	 * The number of operations of the '<em>Evaluator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_EVALUATOR_OPERATION_COUNT = NxcorePackage.SOURCE_EVALUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.Dialect <em>Dialect</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.Dialect
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getDialect()
	 * @generated
	 */
	int DIALECT = 68;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.SortDirection <em>Sort Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.SortDirection
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getSortDirection()
	 * @generated
	 */
	int SORT_DIRECTION = 69;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.MergeActionKind <em>Merge Action Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.MergeActionKind
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getMergeActionKind()
	 * @generated
	 */
	int MERGE_ACTION_KIND = 70;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.PathSelector <em>Path Selector</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.PathSelector
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getPathSelector()
	 * @generated
	 */
	int PATH_SELECTOR = 71;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.Direction
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 72;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.BinaryOperator <em>Binary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.BinaryOperator
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getBinaryOperator()
	 * @generated
	 */
	int BINARY_OPERATOR = 73;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.UnaryOperator <em>Unary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.UnaryOperator
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getUnaryOperator()
	 * @generated
	 */
	int UNARY_OPERATOR = 74;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.cypher.Quantifier <em>Quantifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.cypher.Quantifier
	 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getQuantifier()
	 * @generated
	 */
	int QUANTIFIER = 75;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.CypherSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see org.nasdanika.models.cypher.CypherSource
	 * @generated
	 */
	EClass getCypherSource();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.CypherSource#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.nasdanika.models.cypher.CypherSource#getSource()
	 * @see #getCypherSource()
	 * @generated
	 */
	EAttribute getCypherSource_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.CypherSource#isParsed <em>Parsed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parsed</em>'.
	 * @see org.nasdanika.models.cypher.CypherSource#isParsed()
	 * @see #getCypherSource()
	 * @generated
	 */
	EAttribute getCypherSource_Parsed();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.CypherSource#getDialect <em>Dialect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dialect</em>'.
	 * @see org.nasdanika.models.cypher.CypherSource#getDialect()
	 * @see #getCypherSource()
	 * @generated
	 */
	EAttribute getCypherSource_Dialect();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.cypher.CypherSource#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see org.nasdanika.models.cypher.CypherSource#getStatements()
	 * @see #getCypherSource()
	 * @generated
	 */
	EReference getCypherSource_Statements();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.CypherElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.nasdanika.models.cypher.CypherElement
	 * @generated
	 */
	EClass getCypherElement();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see org.nasdanika.models.cypher.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.UnparsedStatement <em>Unparsed Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unparsed Statement</em>'.
	 * @see org.nasdanika.models.cypher.UnparsedStatement
	 * @generated
	 */
	EClass getUnparsedStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.UnparsedStatement#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.nasdanika.models.cypher.UnparsedStatement#getText()
	 * @see #getUnparsedStatement()
	 * @generated
	 */
	EAttribute getUnparsedStatement_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.UnparsedStatement#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error</em>'.
	 * @see org.nasdanika.models.cypher.UnparsedStatement#getError()
	 * @see #getUnparsedStatement()
	 * @generated
	 */
	EAttribute getUnparsedStatement_Error();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see org.nasdanika.models.cypher.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.Query#isExplain <em>Explain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explain</em>'.
	 * @see org.nasdanika.models.cypher.Query#isExplain()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Explain();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.Query#isProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile</em>'.
	 * @see org.nasdanika.models.cypher.Query#isProfile()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Profile();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.SingleQuery <em>Single Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Query</em>'.
	 * @see org.nasdanika.models.cypher.SingleQuery
	 * @generated
	 */
	EClass getSingleQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.cypher.SingleQuery#getClauses <em>Clauses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clauses</em>'.
	 * @see org.nasdanika.models.cypher.SingleQuery#getClauses()
	 * @see #getSingleQuery()
	 * @generated
	 */
	EReference getSingleQuery_Clauses();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.Union <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union</em>'.
	 * @see org.nasdanika.models.cypher.Union
	 * @generated
	 */
	EClass getUnion();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.Union#isAll <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All</em>'.
	 * @see org.nasdanika.models.cypher.Union#isAll()
	 * @see #getUnion()
	 * @generated
	 */
	EAttribute getUnion_All();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.cypher.Union#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see org.nasdanika.models.cypher.Union#getOperands()
	 * @see #getUnion()
	 * @generated
	 */
	EReference getUnion_Operands();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.Clause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clause</em>'.
	 * @see org.nasdanika.models.cypher.Clause
	 * @generated
	 */
	EClass getClause();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.MatchClause <em>Match Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match Clause</em>'.
	 * @see org.nasdanika.models.cypher.MatchClause
	 * @generated
	 */
	EClass getMatchClause();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.MatchClause#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.nasdanika.models.cypher.MatchClause#isOptional()
	 * @see #getMatchClause()
	 * @generated
	 */
	EAttribute getMatchClause_Optional();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.MatchClause#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see org.nasdanika.models.cypher.MatchClause#getPattern()
	 * @see #getMatchClause()
	 * @generated
	 */
	EReference getMatchClause_Pattern();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.MatchClause#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where</em>'.
	 * @see org.nasdanika.models.cypher.MatchClause#getWhere()
	 * @see #getMatchClause()
	 * @generated
	 */
	EReference getMatchClause_Where();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.ProjectionClause <em>Projection Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Projection Clause</em>'.
	 * @see org.nasdanika.models.cypher.ProjectionClause
	 * @generated
	 */
	EClass getProjectionClause();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.ProjectionClause#isDistinct <em>Distinct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distinct</em>'.
	 * @see org.nasdanika.models.cypher.ProjectionClause#isDistinct()
	 * @see #getProjectionClause()
	 * @generated
	 */
	EAttribute getProjectionClause_Distinct();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.ProjectionClause#isAll <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All</em>'.
	 * @see org.nasdanika.models.cypher.ProjectionClause#isAll()
	 * @see #getProjectionClause()
	 * @generated
	 */
	EAttribute getProjectionClause_All();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.cypher.ProjectionClause#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.nasdanika.models.cypher.ProjectionClause#getItems()
	 * @see #getProjectionClause()
	 * @generated
	 */
	EReference getProjectionClause_Items();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.cypher.ProjectionClause#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Order</em>'.
	 * @see org.nasdanika.models.cypher.ProjectionClause#getOrder()
	 * @see #getProjectionClause()
	 * @generated
	 */
	EReference getProjectionClause_Order();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.ProjectionClause#getSkip <em>Skip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Skip</em>'.
	 * @see org.nasdanika.models.cypher.ProjectionClause#getSkip()
	 * @see #getProjectionClause()
	 * @generated
	 */
	EReference getProjectionClause_Skip();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.ProjectionClause#getLimit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Limit</em>'.
	 * @see org.nasdanika.models.cypher.ProjectionClause#getLimit()
	 * @see #getProjectionClause()
	 * @generated
	 */
	EReference getProjectionClause_Limit();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.ReturnClause <em>Return Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Clause</em>'.
	 * @see org.nasdanika.models.cypher.ReturnClause
	 * @generated
	 */
	EClass getReturnClause();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.WithClause <em>With Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>With Clause</em>'.
	 * @see org.nasdanika.models.cypher.WithClause
	 * @generated
	 */
	EClass getWithClause();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.WithClause#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where</em>'.
	 * @see org.nasdanika.models.cypher.WithClause#getWhere()
	 * @see #getWithClause()
	 * @generated
	 */
	EReference getWithClause_Where();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.ProjectionItem <em>Projection Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Projection Item</em>'.
	 * @see org.nasdanika.models.cypher.ProjectionItem
	 * @generated
	 */
	EClass getProjectionItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.ProjectionItem#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.nasdanika.models.cypher.ProjectionItem#getExpression()
	 * @see #getProjectionItem()
	 * @generated
	 */
	EReference getProjectionItem_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.ProjectionItem#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.nasdanika.models.cypher.ProjectionItem#getAlias()
	 * @see #getProjectionItem()
	 * @generated
	 */
	EAttribute getProjectionItem_Alias();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.SortItem <em>Sort Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort Item</em>'.
	 * @see org.nasdanika.models.cypher.SortItem
	 * @generated
	 */
	EClass getSortItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.SortItem#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.nasdanika.models.cypher.SortItem#getExpression()
	 * @see #getSortItem()
	 * @generated
	 */
	EReference getSortItem_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.SortItem#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.nasdanika.models.cypher.SortItem#getDirection()
	 * @see #getSortItem()
	 * @generated
	 */
	EAttribute getSortItem_Direction();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.UnwindClause <em>Unwind Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unwind Clause</em>'.
	 * @see org.nasdanika.models.cypher.UnwindClause
	 * @generated
	 */
	EClass getUnwindClause();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.UnwindClause#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.nasdanika.models.cypher.UnwindClause#getExpression()
	 * @see #getUnwindClause()
	 * @generated
	 */
	EReference getUnwindClause_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.UnwindClause#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.nasdanika.models.cypher.UnwindClause#getVariable()
	 * @see #getUnwindClause()
	 * @generated
	 */
	EAttribute getUnwindClause_Variable();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.CreateClause <em>Create Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Clause</em>'.
	 * @see org.nasdanika.models.cypher.CreateClause
	 * @generated
	 */
	EClass getCreateClause();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.CreateClause#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see org.nasdanika.models.cypher.CreateClause#getPattern()
	 * @see #getCreateClause()
	 * @generated
	 */
	EReference getCreateClause_Pattern();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.MergeClause <em>Merge Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Clause</em>'.
	 * @see org.nasdanika.models.cypher.MergeClause
	 * @generated
	 */
	EClass getMergeClause();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.MergeClause#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see org.nasdanika.models.cypher.MergeClause#getPattern()
	 * @see #getMergeClause()
	 * @generated
	 */
	EReference getMergeClause_Pattern();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.cypher.MergeClause#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.nasdanika.models.cypher.MergeClause#getActions()
	 * @see #getMergeClause()
	 * @generated
	 */
	EReference getMergeClause_Actions();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.MergeAction <em>Merge Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Action</em>'.
	 * @see org.nasdanika.models.cypher.MergeAction
	 * @generated
	 */
	EClass getMergeAction();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.MergeAction#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.nasdanika.models.cypher.MergeAction#getKind()
	 * @see #getMergeAction()
	 * @generated
	 */
	EAttribute getMergeAction_Kind();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.MergeAction#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set</em>'.
	 * @see org.nasdanika.models.cypher.MergeAction#getSet()
	 * @see #getMergeAction()
	 * @generated
	 */
	EReference getMergeAction_Set();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.SetClause <em>Set Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Clause</em>'.
	 * @see org.nasdanika.models.cypher.SetClause
	 * @generated
	 */
	EClass getSetClause();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.cypher.SetClause#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.nasdanika.models.cypher.SetClause#getItems()
	 * @see #getSetClause()
	 * @generated
	 */
	EReference getSetClause_Items();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.SetItem <em>Set Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Item</em>'.
	 * @see org.nasdanika.models.cypher.SetItem
	 * @generated
	 */
	EClass getSetItem();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.SetProperty <em>Set Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Property</em>'.
	 * @see org.nasdanika.models.cypher.SetProperty
	 * @generated
	 */
	EClass getSetProperty();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.SetProperty#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see org.nasdanika.models.cypher.SetProperty#getProperty()
	 * @see #getSetProperty()
	 * @generated
	 */
	EReference getSetProperty_Property();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.SetProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.nasdanika.models.cypher.SetProperty#getValue()
	 * @see #getSetProperty()
	 * @generated
	 */
	EReference getSetProperty_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.SetVariable <em>Set Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Variable</em>'.
	 * @see org.nasdanika.models.cypher.SetVariable
	 * @generated
	 */
	EClass getSetVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.SetVariable#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.nasdanika.models.cypher.SetVariable#getVariable()
	 * @see #getSetVariable()
	 * @generated
	 */
	EAttribute getSetVariable_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.SetVariable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.nasdanika.models.cypher.SetVariable#getValue()
	 * @see #getSetVariable()
	 * @generated
	 */
	EReference getSetVariable_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.SetVariable#isMerge <em>Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merge</em>'.
	 * @see org.nasdanika.models.cypher.SetVariable#isMerge()
	 * @see #getSetVariable()
	 * @generated
	 */
	EAttribute getSetVariable_Merge();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.SetLabels <em>Set Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Labels</em>'.
	 * @see org.nasdanika.models.cypher.SetLabels
	 * @generated
	 */
	EClass getSetLabels();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.SetLabels#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.nasdanika.models.cypher.SetLabels#getVariable()
	 * @see #getSetLabels()
	 * @generated
	 */
	EAttribute getSetLabels_Variable();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.cypher.SetLabels#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Labels</em>'.
	 * @see org.nasdanika.models.cypher.SetLabels#getLabels()
	 * @see #getSetLabels()
	 * @generated
	 */
	EAttribute getSetLabels_Labels();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.RemoveClause <em>Remove Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Clause</em>'.
	 * @see org.nasdanika.models.cypher.RemoveClause
	 * @generated
	 */
	EClass getRemoveClause();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.cypher.RemoveClause#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.nasdanika.models.cypher.RemoveClause#getItems()
	 * @see #getRemoveClause()
	 * @generated
	 */
	EReference getRemoveClause_Items();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.RemoveItem <em>Remove Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Item</em>'.
	 * @see org.nasdanika.models.cypher.RemoveItem
	 * @generated
	 */
	EClass getRemoveItem();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.RemoveProperty <em>Remove Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Property</em>'.
	 * @see org.nasdanika.models.cypher.RemoveProperty
	 * @generated
	 */
	EClass getRemoveProperty();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.RemoveProperty#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see org.nasdanika.models.cypher.RemoveProperty#getProperty()
	 * @see #getRemoveProperty()
	 * @generated
	 */
	EReference getRemoveProperty_Property();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.RemoveLabels <em>Remove Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Labels</em>'.
	 * @see org.nasdanika.models.cypher.RemoveLabels
	 * @generated
	 */
	EClass getRemoveLabels();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.RemoveLabels#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.nasdanika.models.cypher.RemoveLabels#getVariable()
	 * @see #getRemoveLabels()
	 * @generated
	 */
	EAttribute getRemoveLabels_Variable();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.cypher.RemoveLabels#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Labels</em>'.
	 * @see org.nasdanika.models.cypher.RemoveLabels#getLabels()
	 * @see #getRemoveLabels()
	 * @generated
	 */
	EAttribute getRemoveLabels_Labels();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.DeleteClause <em>Delete Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Clause</em>'.
	 * @see org.nasdanika.models.cypher.DeleteClause
	 * @generated
	 */
	EClass getDeleteClause();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.DeleteClause#isDetach <em>Detach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detach</em>'.
	 * @see org.nasdanika.models.cypher.DeleteClause#isDetach()
	 * @see #getDeleteClause()
	 * @generated
	 */
	EAttribute getDeleteClause_Detach();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.cypher.DeleteClause#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see org.nasdanika.models.cypher.DeleteClause#getExpressions()
	 * @see #getDeleteClause()
	 * @generated
	 */
	EReference getDeleteClause_Expressions();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.ForeachClause <em>Foreach Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreach Clause</em>'.
	 * @see org.nasdanika.models.cypher.ForeachClause
	 * @generated
	 */
	EClass getForeachClause();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.ForeachClause#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.nasdanika.models.cypher.ForeachClause#getVariable()
	 * @see #getForeachClause()
	 * @generated
	 */
	EAttribute getForeachClause_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.ForeachClause#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.nasdanika.models.cypher.ForeachClause#getExpression()
	 * @see #getForeachClause()
	 * @generated
	 */
	EReference getForeachClause_Expression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.cypher.ForeachClause#getClauses <em>Clauses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clauses</em>'.
	 * @see org.nasdanika.models.cypher.ForeachClause#getClauses()
	 * @see #getForeachClause()
	 * @generated
	 */
	EReference getForeachClause_Clauses();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.CallClause <em>Call Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Clause</em>'.
	 * @see org.nasdanika.models.cypher.CallClause
	 * @generated
	 */
	EClass getCallClause();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.cypher.CallClause#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Namespace</em>'.
	 * @see org.nasdanika.models.cypher.CallClause#getNamespace()
	 * @see #getCallClause()
	 * @generated
	 */
	EAttribute getCallClause_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.CallClause#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.cypher.CallClause#getName()
	 * @see #getCallClause()
	 * @generated
	 */
	EAttribute getCallClause_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.cypher.CallClause#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see org.nasdanika.models.cypher.CallClause#getArguments()
	 * @see #getCallClause()
	 * @generated
	 */
	EReference getCallClause_Arguments();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.cypher.CallClause#getYieldItems <em>Yield Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Yield Items</em>'.
	 * @see org.nasdanika.models.cypher.CallClause#getYieldItems()
	 * @see #getCallClause()
	 * @generated
	 */
	EReference getCallClause_YieldItems();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.CallClause#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where</em>'.
	 * @see org.nasdanika.models.cypher.CallClause#getWhere()
	 * @see #getCallClause()
	 * @generated
	 */
	EReference getCallClause_Where();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.CallClause#getSubquery <em>Subquery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subquery</em>'.
	 * @see org.nasdanika.models.cypher.CallClause#getSubquery()
	 * @see #getCallClause()
	 * @generated
	 */
	EReference getCallClause_Subquery();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern</em>'.
	 * @see org.nasdanika.models.cypher.Pattern
	 * @generated
	 */
	EClass getPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.cypher.Pattern#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see org.nasdanika.models.cypher.Pattern#getParts()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_Parts();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.PatternPart <em>Pattern Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Part</em>'.
	 * @see org.nasdanika.models.cypher.PatternPart
	 * @generated
	 */
	EClass getPatternPart();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.PatternPart#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.nasdanika.models.cypher.PatternPart#getVariable()
	 * @see #getPatternPart()
	 * @generated
	 */
	EAttribute getPatternPart_Variable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.PatternPart#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selector</em>'.
	 * @see org.nasdanika.models.cypher.PatternPart#getSelector()
	 * @see #getPatternPart()
	 * @generated
	 */
	EAttribute getPatternPart_Selector();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.PatternPart#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see org.nasdanika.models.cypher.PatternPart#getElement()
	 * @see #getPatternPart()
	 * @generated
	 */
	EReference getPatternPart_Element();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.PatternElement <em>Pattern Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Element</em>'.
	 * @see org.nasdanika.models.cypher.PatternElement
	 * @generated
	 */
	EClass getPatternElement();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.NodePattern <em>Node Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Pattern</em>'.
	 * @see org.nasdanika.models.cypher.NodePattern
	 * @generated
	 */
	EClass getNodePattern();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.NodePattern#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.nasdanika.models.cypher.NodePattern#getVariable()
	 * @see #getNodePattern()
	 * @generated
	 */
	EAttribute getNodePattern_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.NodePattern#getLabelExpression <em>Label Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label Expression</em>'.
	 * @see org.nasdanika.models.cypher.NodePattern#getLabelExpression()
	 * @see #getNodePattern()
	 * @generated
	 */
	EReference getNodePattern_LabelExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.NodePattern#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.nasdanika.models.cypher.NodePattern#getProperties()
	 * @see #getNodePattern()
	 * @generated
	 */
	EReference getNodePattern_Properties();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.LabelExpression <em>Label Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Expression</em>'.
	 * @see org.nasdanika.models.cypher.LabelExpression
	 * @generated
	 */
	EClass getLabelExpression();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.LabelName <em>Label Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Name</em>'.
	 * @see org.nasdanika.models.cypher.LabelName
	 * @generated
	 */
	EClass getLabelName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.LabelName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.cypher.LabelName#getName()
	 * @see #getLabelName()
	 * @generated
	 */
	EAttribute getLabelName_Name();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.LabelConjunction <em>Label Conjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Conjunction</em>'.
	 * @see org.nasdanika.models.cypher.LabelConjunction
	 * @generated
	 */
	EClass getLabelConjunction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.cypher.LabelConjunction#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see org.nasdanika.models.cypher.LabelConjunction#getOperands()
	 * @see #getLabelConjunction()
	 * @generated
	 */
	EReference getLabelConjunction_Operands();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.LabelDisjunction <em>Label Disjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Disjunction</em>'.
	 * @see org.nasdanika.models.cypher.LabelDisjunction
	 * @generated
	 */
	EClass getLabelDisjunction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.cypher.LabelDisjunction#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see org.nasdanika.models.cypher.LabelDisjunction#getOperands()
	 * @see #getLabelDisjunction()
	 * @generated
	 */
	EReference getLabelDisjunction_Operands();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.LabelNegation <em>Label Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Negation</em>'.
	 * @see org.nasdanika.models.cypher.LabelNegation
	 * @generated
	 */
	EClass getLabelNegation();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.LabelNegation#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see org.nasdanika.models.cypher.LabelNegation#getOperand()
	 * @see #getLabelNegation()
	 * @generated
	 */
	EReference getLabelNegation_Operand();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.LabelWildcard <em>Label Wildcard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Wildcard</em>'.
	 * @see org.nasdanika.models.cypher.LabelWildcard
	 * @generated
	 */
	EClass getLabelWildcard();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.RelationshipChain <em>Relationship Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Chain</em>'.
	 * @see org.nasdanika.models.cypher.RelationshipChain
	 * @generated
	 */
	EClass getRelationshipChain();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.RelationshipChain#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see org.nasdanika.models.cypher.RelationshipChain#getLeft()
	 * @see #getRelationshipChain()
	 * @generated
	 */
	EReference getRelationshipChain_Left();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.RelationshipChain#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relationship</em>'.
	 * @see org.nasdanika.models.cypher.RelationshipChain#getRelationship()
	 * @see #getRelationshipChain()
	 * @generated
	 */
	EReference getRelationshipChain_Relationship();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.RelationshipChain#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see org.nasdanika.models.cypher.RelationshipChain#getRight()
	 * @see #getRelationshipChain()
	 * @generated
	 */
	EReference getRelationshipChain_Right();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.RelationshipPattern <em>Relationship Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Pattern</em>'.
	 * @see org.nasdanika.models.cypher.RelationshipPattern
	 * @generated
	 */
	EClass getRelationshipPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.RelationshipPattern#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.nasdanika.models.cypher.RelationshipPattern#getVariable()
	 * @see #getRelationshipPattern()
	 * @generated
	 */
	EAttribute getRelationshipPattern_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.RelationshipPattern#getTypeExpression <em>Type Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Expression</em>'.
	 * @see org.nasdanika.models.cypher.RelationshipPattern#getTypeExpression()
	 * @see #getRelationshipPattern()
	 * @generated
	 */
	EReference getRelationshipPattern_TypeExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.RelationshipPattern#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.nasdanika.models.cypher.RelationshipPattern#getDirection()
	 * @see #getRelationshipPattern()
	 * @generated
	 */
	EAttribute getRelationshipPattern_Direction();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.RelationshipPattern#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.nasdanika.models.cypher.RelationshipPattern#getProperties()
	 * @see #getRelationshipPattern()
	 * @generated
	 */
	EReference getRelationshipPattern_Properties();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.RelationshipPattern#isVariableLength <em>Variable Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Length</em>'.
	 * @see org.nasdanika.models.cypher.RelationshipPattern#isVariableLength()
	 * @see #getRelationshipPattern()
	 * @generated
	 */
	EAttribute getRelationshipPattern_VariableLength();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.RelationshipPattern#getMinHops <em>Min Hops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Hops</em>'.
	 * @see org.nasdanika.models.cypher.RelationshipPattern#getMinHops()
	 * @see #getRelationshipPattern()
	 * @generated
	 */
	EAttribute getRelationshipPattern_MinHops();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.RelationshipPattern#getMaxHops <em>Max Hops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Hops</em>'.
	 * @see org.nasdanika.models.cypher.RelationshipPattern#getMaxHops()
	 * @see #getRelationshipPattern()
	 * @generated
	 */
	EAttribute getRelationshipPattern_MaxHops();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.nasdanika.models.cypher.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.nasdanika.models.cypher.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.cypher.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.nasdanika.models.cypher.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.cypher.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see org.nasdanika.models.cypher.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see org.nasdanika.models.cypher.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.StringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.models.cypher.StringLiteral#getValue()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.IntegerLiteral <em>Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Literal</em>'.
	 * @see org.nasdanika.models.cypher.IntegerLiteral
	 * @generated
	 */
	EClass getIntegerLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.IntegerLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.models.cypher.IntegerLiteral#getValue()
	 * @see #getIntegerLiteral()
	 * @generated
	 */
	EAttribute getIntegerLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.FloatLiteral <em>Float Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Literal</em>'.
	 * @see org.nasdanika.models.cypher.FloatLiteral
	 * @generated
	 */
	EClass getFloatLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.FloatLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.models.cypher.FloatLiteral#getValue()
	 * @see #getFloatLiteral()
	 * @generated
	 */
	EAttribute getFloatLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see org.nasdanika.models.cypher.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.BooleanLiteral#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.models.cypher.BooleanLiteral#isValue()
	 * @see #getBooleanLiteral()
	 * @generated
	 */
	EAttribute getBooleanLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.NullLiteral <em>Null Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Literal</em>'.
	 * @see org.nasdanika.models.cypher.NullLiteral
	 * @generated
	 */
	EClass getNullLiteral();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.ListLiteral <em>List Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Literal</em>'.
	 * @see org.nasdanika.models.cypher.ListLiteral
	 * @generated
	 */
	EClass getListLiteral();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.cypher.ListLiteral#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.nasdanika.models.cypher.ListLiteral#getElements()
	 * @see #getListLiteral()
	 * @generated
	 */
	EReference getListLiteral_Elements();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.MapLiteral <em>Map Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Literal</em>'.
	 * @see org.nasdanika.models.cypher.MapLiteral
	 * @generated
	 */
	EClass getMapLiteral();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.cypher.MapLiteral#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.nasdanika.models.cypher.MapLiteral#getEntries()
	 * @see #getMapLiteral()
	 * @generated
	 */
	EReference getMapLiteral_Entries();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.MapEntry <em>Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Entry</em>'.
	 * @see org.nasdanika.models.cypher.MapEntry
	 * @generated
	 */
	EClass getMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.MapEntry#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.nasdanika.models.cypher.MapEntry#getKey()
	 * @see #getMapEntry()
	 * @generated
	 */
	EAttribute getMapEntry_Key();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.MapEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.nasdanika.models.cypher.MapEntry#getValue()
	 * @see #getMapEntry()
	 * @generated
	 */
	EReference getMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.PropertyAccess <em>Property Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Access</em>'.
	 * @see org.nasdanika.models.cypher.PropertyAccess
	 * @generated
	 */
	EClass getPropertyAccess();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.PropertyAccess#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.nasdanika.models.cypher.PropertyAccess#getTarget()
	 * @see #getPropertyAccess()
	 * @generated
	 */
	EReference getPropertyAccess_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.PropertyAccess#getPropertyKey <em>Property Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Key</em>'.
	 * @see org.nasdanika.models.cypher.PropertyAccess#getPropertyKey()
	 * @see #getPropertyAccess()
	 * @generated
	 */
	EAttribute getPropertyAccess_PropertyKey();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.LabelCheck <em>Label Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Check</em>'.
	 * @see org.nasdanika.models.cypher.LabelCheck
	 * @generated
	 */
	EClass getLabelCheck();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.LabelCheck#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.nasdanika.models.cypher.LabelCheck#getTarget()
	 * @see #getLabelCheck()
	 * @generated
	 */
	EReference getLabelCheck_Target();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.LabelCheck#getLabelExpression <em>Label Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label Expression</em>'.
	 * @see org.nasdanika.models.cypher.LabelCheck#getLabelExpression()
	 * @see #getLabelCheck()
	 * @generated
	 */
	EReference getLabelCheck_LabelExpression();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see org.nasdanika.models.cypher.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.BinaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.nasdanika.models.cypher.BinaryExpression#getOperator()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EAttribute getBinaryExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.BinaryExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see org.nasdanika.models.cypher.BinaryExpression#getLeft()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.BinaryExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see org.nasdanika.models.cypher.BinaryExpression#getRight()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Right();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see org.nasdanika.models.cypher.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.UnaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.nasdanika.models.cypher.UnaryExpression#getOperator()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EAttribute getUnaryExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.UnaryExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see org.nasdanika.models.cypher.UnaryExpression#getOperand()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Operand();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.FunctionInvocation <em>Function Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Invocation</em>'.
	 * @see org.nasdanika.models.cypher.FunctionInvocation
	 * @generated
	 */
	EClass getFunctionInvocation();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.cypher.FunctionInvocation#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Namespace</em>'.
	 * @see org.nasdanika.models.cypher.FunctionInvocation#getNamespace()
	 * @see #getFunctionInvocation()
	 * @generated
	 */
	EAttribute getFunctionInvocation_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.FunctionInvocation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.cypher.FunctionInvocation#getName()
	 * @see #getFunctionInvocation()
	 * @generated
	 */
	EAttribute getFunctionInvocation_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.FunctionInvocation#isDistinct <em>Distinct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distinct</em>'.
	 * @see org.nasdanika.models.cypher.FunctionInvocation#isDistinct()
	 * @see #getFunctionInvocation()
	 * @generated
	 */
	EAttribute getFunctionInvocation_Distinct();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.FunctionInvocation#isStar <em>Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Star</em>'.
	 * @see org.nasdanika.models.cypher.FunctionInvocation#isStar()
	 * @see #getFunctionInvocation()
	 * @generated
	 */
	EAttribute getFunctionInvocation_Star();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.cypher.FunctionInvocation#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see org.nasdanika.models.cypher.FunctionInvocation#getArguments()
	 * @see #getFunctionInvocation()
	 * @generated
	 */
	EReference getFunctionInvocation_Arguments();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.CaseExpression <em>Case Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Expression</em>'.
	 * @see org.nasdanika.models.cypher.CaseExpression
	 * @generated
	 */
	EClass getCaseExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.CaseExpression#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see org.nasdanika.models.cypher.CaseExpression#getSubject()
	 * @see #getCaseExpression()
	 * @generated
	 */
	EReference getCaseExpression_Subject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.cypher.CaseExpression#getAlternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternatives</em>'.
	 * @see org.nasdanika.models.cypher.CaseExpression#getAlternatives()
	 * @see #getCaseExpression()
	 * @generated
	 */
	EReference getCaseExpression_Alternatives();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.CaseExpression#getElseExpression <em>Else Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Expression</em>'.
	 * @see org.nasdanika.models.cypher.CaseExpression#getElseExpression()
	 * @see #getCaseExpression()
	 * @generated
	 */
	EReference getCaseExpression_ElseExpression();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.CaseAlternative <em>Case Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Alternative</em>'.
	 * @see org.nasdanika.models.cypher.CaseAlternative
	 * @generated
	 */
	EClass getCaseAlternative();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.CaseAlternative#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.nasdanika.models.cypher.CaseAlternative#getCondition()
	 * @see #getCaseAlternative()
	 * @generated
	 */
	EReference getCaseAlternative_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.CaseAlternative#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see org.nasdanika.models.cypher.CaseAlternative#getResult()
	 * @see #getCaseAlternative()
	 * @generated
	 */
	EReference getCaseAlternative_Result();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.ListComprehension <em>List Comprehension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Comprehension</em>'.
	 * @see org.nasdanika.models.cypher.ListComprehension
	 * @generated
	 */
	EClass getListComprehension();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.ListComprehension#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.nasdanika.models.cypher.ListComprehension#getVariable()
	 * @see #getListComprehension()
	 * @generated
	 */
	EAttribute getListComprehension_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.ListComprehension#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List</em>'.
	 * @see org.nasdanika.models.cypher.ListComprehension#getList()
	 * @see #getListComprehension()
	 * @generated
	 */
	EReference getListComprehension_List();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.ListComprehension#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where</em>'.
	 * @see org.nasdanika.models.cypher.ListComprehension#getWhere()
	 * @see #getListComprehension()
	 * @generated
	 */
	EReference getListComprehension_Where();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.ListComprehension#getProjection <em>Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Projection</em>'.
	 * @see org.nasdanika.models.cypher.ListComprehension#getProjection()
	 * @see #getListComprehension()
	 * @generated
	 */
	EReference getListComprehension_Projection();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.PatternComprehension <em>Pattern Comprehension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Comprehension</em>'.
	 * @see org.nasdanika.models.cypher.PatternComprehension
	 * @generated
	 */
	EClass getPatternComprehension();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.PatternComprehension#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.nasdanika.models.cypher.PatternComprehension#getVariable()
	 * @see #getPatternComprehension()
	 * @generated
	 */
	EAttribute getPatternComprehension_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.PatternComprehension#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see org.nasdanika.models.cypher.PatternComprehension#getPattern()
	 * @see #getPatternComprehension()
	 * @generated
	 */
	EReference getPatternComprehension_Pattern();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.PatternComprehension#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where</em>'.
	 * @see org.nasdanika.models.cypher.PatternComprehension#getWhere()
	 * @see #getPatternComprehension()
	 * @generated
	 */
	EReference getPatternComprehension_Where();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.PatternComprehension#getProjection <em>Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Projection</em>'.
	 * @see org.nasdanika.models.cypher.PatternComprehension#getProjection()
	 * @see #getPatternComprehension()
	 * @generated
	 */
	EReference getPatternComprehension_Projection();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.QuantifiedExpression <em>Quantified Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantified Expression</em>'.
	 * @see org.nasdanika.models.cypher.QuantifiedExpression
	 * @generated
	 */
	EClass getQuantifiedExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.QuantifiedExpression#getQuantifier <em>Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantifier</em>'.
	 * @see org.nasdanika.models.cypher.QuantifiedExpression#getQuantifier()
	 * @see #getQuantifiedExpression()
	 * @generated
	 */
	EAttribute getQuantifiedExpression_Quantifier();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.QuantifiedExpression#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.nasdanika.models.cypher.QuantifiedExpression#getVariable()
	 * @see #getQuantifiedExpression()
	 * @generated
	 */
	EAttribute getQuantifiedExpression_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.QuantifiedExpression#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List</em>'.
	 * @see org.nasdanika.models.cypher.QuantifiedExpression#getList()
	 * @see #getQuantifiedExpression()
	 * @generated
	 */
	EReference getQuantifiedExpression_List();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.QuantifiedExpression#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where</em>'.
	 * @see org.nasdanika.models.cypher.QuantifiedExpression#getWhere()
	 * @see #getQuantifiedExpression()
	 * @generated
	 */
	EReference getQuantifiedExpression_Where();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.ExistsExpression <em>Exists Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exists Expression</em>'.
	 * @see org.nasdanika.models.cypher.ExistsExpression
	 * @generated
	 */
	EClass getExistsExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.ExistsExpression#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see org.nasdanika.models.cypher.ExistsExpression#getPattern()
	 * @see #getExistsExpression()
	 * @generated
	 */
	EReference getExistsExpression_Pattern();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.ExistsExpression#getSubquery <em>Subquery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subquery</em>'.
	 * @see org.nasdanika.models.cypher.ExistsExpression#getSubquery()
	 * @see #getExistsExpression()
	 * @generated
	 */
	EReference getExistsExpression_Subquery();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.Subscript <em>Subscript</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscript</em>'.
	 * @see org.nasdanika.models.cypher.Subscript
	 * @generated
	 */
	EClass getSubscript();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.Subscript#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.nasdanika.models.cypher.Subscript#getTarget()
	 * @see #getSubscript()
	 * @generated
	 */
	EReference getSubscript_Target();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.Subscript#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index</em>'.
	 * @see org.nasdanika.models.cypher.Subscript#getIndex()
	 * @see #getSubscript()
	 * @generated
	 */
	EReference getSubscript_Index();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.SliceExpression <em>Slice Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slice Expression</em>'.
	 * @see org.nasdanika.models.cypher.SliceExpression
	 * @generated
	 */
	EClass getSliceExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.SliceExpression#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.nasdanika.models.cypher.SliceExpression#getTarget()
	 * @see #getSliceExpression()
	 * @generated
	 */
	EReference getSliceExpression_Target();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.SliceExpression#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see org.nasdanika.models.cypher.SliceExpression#getFrom()
	 * @see #getSliceExpression()
	 * @generated
	 */
	EReference getSliceExpression_From();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.SliceExpression#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see org.nasdanika.models.cypher.SliceExpression#getTo()
	 * @see #getSliceExpression()
	 * @generated
	 */
	EReference getSliceExpression_To();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.cypher.CypherEvaluator <em>Evaluator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluator</em>'.
	 * @see org.nasdanika.models.cypher.CypherEvaluator
	 * @generated
	 */
	EClass getCypherEvaluator();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.cypher.CypherEvaluator#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statement</em>'.
	 * @see org.nasdanika.models.cypher.CypherEvaluator#getStatement()
	 * @see #getCypherEvaluator()
	 * @generated
	 */
	EReference getCypherEvaluator_Statement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.CypherEvaluator#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see org.nasdanika.models.cypher.CypherEvaluator#isReadOnly()
	 * @see #getCypherEvaluator()
	 * @generated
	 */
	EAttribute getCypherEvaluator_ReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.CypherEvaluator#getRowLimit <em>Row Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Limit</em>'.
	 * @see org.nasdanika.models.cypher.CypherEvaluator#getRowLimit()
	 * @see #getCypherEvaluator()
	 * @generated
	 */
	EAttribute getCypherEvaluator_RowLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.cypher.CypherEvaluator#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see org.nasdanika.models.cypher.CypherEvaluator#getTimeout()
	 * @see #getCypherEvaluator()
	 * @generated
	 */
	EAttribute getCypherEvaluator_Timeout();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.cypher.Dialect <em>Dialect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dialect</em>'.
	 * @see org.nasdanika.models.cypher.Dialect
	 * @generated
	 */
	EEnum getDialect();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.cypher.SortDirection <em>Sort Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sort Direction</em>'.
	 * @see org.nasdanika.models.cypher.SortDirection
	 * @generated
	 */
	EEnum getSortDirection();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.cypher.MergeActionKind <em>Merge Action Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Merge Action Kind</em>'.
	 * @see org.nasdanika.models.cypher.MergeActionKind
	 * @generated
	 */
	EEnum getMergeActionKind();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.cypher.PathSelector <em>Path Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Path Selector</em>'.
	 * @see org.nasdanika.models.cypher.PathSelector
	 * @generated
	 */
	EEnum getPathSelector();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.cypher.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction</em>'.
	 * @see org.nasdanika.models.cypher.Direction
	 * @generated
	 */
	EEnum getDirection();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.cypher.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Operator</em>'.
	 * @see org.nasdanika.models.cypher.BinaryOperator
	 * @generated
	 */
	EEnum getBinaryOperator();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.cypher.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unary Operator</em>'.
	 * @see org.nasdanika.models.cypher.UnaryOperator
	 * @generated
	 */
	EEnum getUnaryOperator();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.cypher.Quantifier <em>Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Quantifier</em>'.
	 * @see org.nasdanika.models.cypher.Quantifier
	 * @generated
	 */
	EEnum getQuantifier();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CypherFactory getCypherFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.CypherSourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.CypherSourceImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getCypherSource()
		 * @generated
		 */
		EClass CYPHER_SOURCE = eINSTANCE.getCypherSource();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CYPHER_SOURCE__SOURCE = eINSTANCE.getCypherSource_Source();

		/**
		 * The meta object literal for the '<em><b>Parsed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CYPHER_SOURCE__PARSED = eINSTANCE.getCypherSource_Parsed();

		/**
		 * The meta object literal for the '<em><b>Dialect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CYPHER_SOURCE__DIALECT = eINSTANCE.getCypherSource_Dialect();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CYPHER_SOURCE__STATEMENTS = eINSTANCE.getCypherSource_Statements();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.CypherElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.CypherElementImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getCypherElement()
		 * @generated
		 */
		EClass CYPHER_ELEMENT = eINSTANCE.getCypherElement();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.StatementImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.UnparsedStatementImpl <em>Unparsed Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.UnparsedStatementImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getUnparsedStatement()
		 * @generated
		 */
		EClass UNPARSED_STATEMENT = eINSTANCE.getUnparsedStatement();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNPARSED_STATEMENT__TEXT = eINSTANCE.getUnparsedStatement_Text();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNPARSED_STATEMENT__ERROR = eINSTANCE.getUnparsedStatement_Error();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.QueryImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '<em><b>Explain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__EXPLAIN = eINSTANCE.getQuery_Explain();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__PROFILE = eINSTANCE.getQuery_Profile();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.SingleQueryImpl <em>Single Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.SingleQueryImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getSingleQuery()
		 * @generated
		 */
		EClass SINGLE_QUERY = eINSTANCE.getSingleQuery();

		/**
		 * The meta object literal for the '<em><b>Clauses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_QUERY__CLAUSES = eINSTANCE.getSingleQuery_Clauses();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.UnionImpl <em>Union</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.UnionImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getUnion()
		 * @generated
		 */
		EClass UNION = eINSTANCE.getUnion();

		/**
		 * The meta object literal for the '<em><b>All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNION__ALL = eINSTANCE.getUnion_All();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNION__OPERANDS = eINSTANCE.getUnion_Operands();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.ClauseImpl <em>Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.ClauseImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getClause()
		 * @generated
		 */
		EClass CLAUSE = eINSTANCE.getClause();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.MatchClauseImpl <em>Match Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.MatchClauseImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getMatchClause()
		 * @generated
		 */
		EClass MATCH_CLAUSE = eINSTANCE.getMatchClause();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH_CLAUSE__OPTIONAL = eINSTANCE.getMatchClause_Optional();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH_CLAUSE__PATTERN = eINSTANCE.getMatchClause_Pattern();

		/**
		 * The meta object literal for the '<em><b>Where</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH_CLAUSE__WHERE = eINSTANCE.getMatchClause_Where();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.ProjectionClauseImpl <em>Projection Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.ProjectionClauseImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getProjectionClause()
		 * @generated
		 */
		EClass PROJECTION_CLAUSE = eINSTANCE.getProjectionClause();

		/**
		 * The meta object literal for the '<em><b>Distinct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECTION_CLAUSE__DISTINCT = eINSTANCE.getProjectionClause_Distinct();

		/**
		 * The meta object literal for the '<em><b>All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECTION_CLAUSE__ALL = eINSTANCE.getProjectionClause_All();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECTION_CLAUSE__ITEMS = eINSTANCE.getProjectionClause_Items();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECTION_CLAUSE__ORDER = eINSTANCE.getProjectionClause_Order();

		/**
		 * The meta object literal for the '<em><b>Skip</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECTION_CLAUSE__SKIP = eINSTANCE.getProjectionClause_Skip();

		/**
		 * The meta object literal for the '<em><b>Limit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECTION_CLAUSE__LIMIT = eINSTANCE.getProjectionClause_Limit();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.ReturnClauseImpl <em>Return Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.ReturnClauseImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getReturnClause()
		 * @generated
		 */
		EClass RETURN_CLAUSE = eINSTANCE.getReturnClause();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.WithClauseImpl <em>With Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.WithClauseImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getWithClause()
		 * @generated
		 */
		EClass WITH_CLAUSE = eINSTANCE.getWithClause();

		/**
		 * The meta object literal for the '<em><b>Where</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WITH_CLAUSE__WHERE = eINSTANCE.getWithClause_Where();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.ProjectionItemImpl <em>Projection Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.ProjectionItemImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getProjectionItem()
		 * @generated
		 */
		EClass PROJECTION_ITEM = eINSTANCE.getProjectionItem();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECTION_ITEM__EXPRESSION = eINSTANCE.getProjectionItem_Expression();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECTION_ITEM__ALIAS = eINSTANCE.getProjectionItem_Alias();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.SortItemImpl <em>Sort Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.SortItemImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getSortItem()
		 * @generated
		 */
		EClass SORT_ITEM = eINSTANCE.getSortItem();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORT_ITEM__EXPRESSION = eINSTANCE.getSortItem_Expression();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORT_ITEM__DIRECTION = eINSTANCE.getSortItem_Direction();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.UnwindClauseImpl <em>Unwind Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.UnwindClauseImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getUnwindClause()
		 * @generated
		 */
		EClass UNWIND_CLAUSE = eINSTANCE.getUnwindClause();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNWIND_CLAUSE__EXPRESSION = eINSTANCE.getUnwindClause_Expression();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNWIND_CLAUSE__VARIABLE = eINSTANCE.getUnwindClause_Variable();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.CreateClauseImpl <em>Create Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.CreateClauseImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getCreateClause()
		 * @generated
		 */
		EClass CREATE_CLAUSE = eINSTANCE.getCreateClause();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_CLAUSE__PATTERN = eINSTANCE.getCreateClause_Pattern();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.MergeClauseImpl <em>Merge Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.MergeClauseImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getMergeClause()
		 * @generated
		 */
		EClass MERGE_CLAUSE = eINSTANCE.getMergeClause();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_CLAUSE__PATTERN = eINSTANCE.getMergeClause_Pattern();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_CLAUSE__ACTIONS = eINSTANCE.getMergeClause_Actions();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.MergeActionImpl <em>Merge Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.MergeActionImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getMergeAction()
		 * @generated
		 */
		EClass MERGE_ACTION = eINSTANCE.getMergeAction();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_ACTION__KIND = eINSTANCE.getMergeAction_Kind();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_ACTION__SET = eINSTANCE.getMergeAction_Set();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.SetClauseImpl <em>Set Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.SetClauseImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getSetClause()
		 * @generated
		 */
		EClass SET_CLAUSE = eINSTANCE.getSetClause();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_CLAUSE__ITEMS = eINSTANCE.getSetClause_Items();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.SetItemImpl <em>Set Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.SetItemImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getSetItem()
		 * @generated
		 */
		EClass SET_ITEM = eINSTANCE.getSetItem();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.SetPropertyImpl <em>Set Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.SetPropertyImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getSetProperty()
		 * @generated
		 */
		EClass SET_PROPERTY = eINSTANCE.getSetProperty();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_PROPERTY__PROPERTY = eINSTANCE.getSetProperty_Property();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_PROPERTY__VALUE = eINSTANCE.getSetProperty_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.SetVariableImpl <em>Set Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.SetVariableImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getSetVariable()
		 * @generated
		 */
		EClass SET_VARIABLE = eINSTANCE.getSetVariable();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_VARIABLE__VARIABLE = eINSTANCE.getSetVariable_Variable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VARIABLE__VALUE = eINSTANCE.getSetVariable_Value();

		/**
		 * The meta object literal for the '<em><b>Merge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_VARIABLE__MERGE = eINSTANCE.getSetVariable_Merge();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.SetLabelsImpl <em>Set Labels</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.SetLabelsImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getSetLabels()
		 * @generated
		 */
		EClass SET_LABELS = eINSTANCE.getSetLabels();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_LABELS__VARIABLE = eINSTANCE.getSetLabels_Variable();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_LABELS__LABELS = eINSTANCE.getSetLabels_Labels();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.RemoveClauseImpl <em>Remove Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.RemoveClauseImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getRemoveClause()
		 * @generated
		 */
		EClass REMOVE_CLAUSE = eINSTANCE.getRemoveClause();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_CLAUSE__ITEMS = eINSTANCE.getRemoveClause_Items();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.RemoveItemImpl <em>Remove Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.RemoveItemImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getRemoveItem()
		 * @generated
		 */
		EClass REMOVE_ITEM = eINSTANCE.getRemoveItem();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.RemovePropertyImpl <em>Remove Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.RemovePropertyImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getRemoveProperty()
		 * @generated
		 */
		EClass REMOVE_PROPERTY = eINSTANCE.getRemoveProperty();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_PROPERTY__PROPERTY = eINSTANCE.getRemoveProperty_Property();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.RemoveLabelsImpl <em>Remove Labels</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.RemoveLabelsImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getRemoveLabels()
		 * @generated
		 */
		EClass REMOVE_LABELS = eINSTANCE.getRemoveLabels();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_LABELS__VARIABLE = eINSTANCE.getRemoveLabels_Variable();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_LABELS__LABELS = eINSTANCE.getRemoveLabels_Labels();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.DeleteClauseImpl <em>Delete Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.DeleteClauseImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getDeleteClause()
		 * @generated
		 */
		EClass DELETE_CLAUSE = eINSTANCE.getDeleteClause();

		/**
		 * The meta object literal for the '<em><b>Detach</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_CLAUSE__DETACH = eINSTANCE.getDeleteClause_Detach();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE_CLAUSE__EXPRESSIONS = eINSTANCE.getDeleteClause_Expressions();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.ForeachClauseImpl <em>Foreach Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.ForeachClauseImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getForeachClause()
		 * @generated
		 */
		EClass FOREACH_CLAUSE = eINSTANCE.getForeachClause();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREACH_CLAUSE__VARIABLE = eINSTANCE.getForeachClause_Variable();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREACH_CLAUSE__EXPRESSION = eINSTANCE.getForeachClause_Expression();

		/**
		 * The meta object literal for the '<em><b>Clauses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREACH_CLAUSE__CLAUSES = eINSTANCE.getForeachClause_Clauses();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.CallClauseImpl <em>Call Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.CallClauseImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getCallClause()
		 * @generated
		 */
		EClass CALL_CLAUSE = eINSTANCE.getCallClause();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CLAUSE__NAMESPACE = eINSTANCE.getCallClause_Namespace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CLAUSE__NAME = eINSTANCE.getCallClause_Name();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_CLAUSE__ARGUMENTS = eINSTANCE.getCallClause_Arguments();

		/**
		 * The meta object literal for the '<em><b>Yield Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_CLAUSE__YIELD_ITEMS = eINSTANCE.getCallClause_YieldItems();

		/**
		 * The meta object literal for the '<em><b>Where</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_CLAUSE__WHERE = eINSTANCE.getCallClause_Where();

		/**
		 * The meta object literal for the '<em><b>Subquery</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_CLAUSE__SUBQUERY = eINSTANCE.getCallClause_Subquery();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.PatternImpl <em>Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.PatternImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getPattern()
		 * @generated
		 */
		EClass PATTERN = eINSTANCE.getPattern();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__PARTS = eINSTANCE.getPattern_Parts();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.PatternPartImpl <em>Pattern Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.PatternPartImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getPatternPart()
		 * @generated
		 */
		EClass PATTERN_PART = eINSTANCE.getPatternPart();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_PART__VARIABLE = eINSTANCE.getPatternPart_Variable();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_PART__SELECTOR = eINSTANCE.getPatternPart_Selector();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_PART__ELEMENT = eINSTANCE.getPatternPart_Element();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.PatternElementImpl <em>Pattern Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.PatternElementImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getPatternElement()
		 * @generated
		 */
		EClass PATTERN_ELEMENT = eINSTANCE.getPatternElement();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.NodePatternImpl <em>Node Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.NodePatternImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getNodePattern()
		 * @generated
		 */
		EClass NODE_PATTERN = eINSTANCE.getNodePattern();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_PATTERN__VARIABLE = eINSTANCE.getNodePattern_Variable();

		/**
		 * The meta object literal for the '<em><b>Label Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_PATTERN__LABEL_EXPRESSION = eINSTANCE.getNodePattern_LabelExpression();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_PATTERN__PROPERTIES = eINSTANCE.getNodePattern_Properties();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.LabelExpressionImpl <em>Label Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.LabelExpressionImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getLabelExpression()
		 * @generated
		 */
		EClass LABEL_EXPRESSION = eINSTANCE.getLabelExpression();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.LabelNameImpl <em>Label Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.LabelNameImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getLabelName()
		 * @generated
		 */
		EClass LABEL_NAME = eINSTANCE.getLabelName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_NAME__NAME = eINSTANCE.getLabelName_Name();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.LabelConjunctionImpl <em>Label Conjunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.LabelConjunctionImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getLabelConjunction()
		 * @generated
		 */
		EClass LABEL_CONJUNCTION = eINSTANCE.getLabelConjunction();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL_CONJUNCTION__OPERANDS = eINSTANCE.getLabelConjunction_Operands();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.LabelDisjunctionImpl <em>Label Disjunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.LabelDisjunctionImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getLabelDisjunction()
		 * @generated
		 */
		EClass LABEL_DISJUNCTION = eINSTANCE.getLabelDisjunction();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL_DISJUNCTION__OPERANDS = eINSTANCE.getLabelDisjunction_Operands();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.LabelNegationImpl <em>Label Negation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.LabelNegationImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getLabelNegation()
		 * @generated
		 */
		EClass LABEL_NEGATION = eINSTANCE.getLabelNegation();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL_NEGATION__OPERAND = eINSTANCE.getLabelNegation_Operand();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.LabelWildcardImpl <em>Label Wildcard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.LabelWildcardImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getLabelWildcard()
		 * @generated
		 */
		EClass LABEL_WILDCARD = eINSTANCE.getLabelWildcard();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.RelationshipChainImpl <em>Relationship Chain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.RelationshipChainImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getRelationshipChain()
		 * @generated
		 */
		EClass RELATIONSHIP_CHAIN = eINSTANCE.getRelationshipChain();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_CHAIN__LEFT = eINSTANCE.getRelationshipChain_Left();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_CHAIN__RELATIONSHIP = eINSTANCE.getRelationshipChain_Relationship();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_CHAIN__RIGHT = eINSTANCE.getRelationshipChain_Right();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.RelationshipPatternImpl <em>Relationship Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.RelationshipPatternImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getRelationshipPattern()
		 * @generated
		 */
		EClass RELATIONSHIP_PATTERN = eINSTANCE.getRelationshipPattern();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_PATTERN__VARIABLE = eINSTANCE.getRelationshipPattern_Variable();

		/**
		 * The meta object literal for the '<em><b>Type Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_PATTERN__TYPE_EXPRESSION = eINSTANCE.getRelationshipPattern_TypeExpression();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_PATTERN__DIRECTION = eINSTANCE.getRelationshipPattern_Direction();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_PATTERN__PROPERTIES = eINSTANCE.getRelationshipPattern_Properties();

		/**
		 * The meta object literal for the '<em><b>Variable Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_PATTERN__VARIABLE_LENGTH = eINSTANCE.getRelationshipPattern_VariableLength();

		/**
		 * The meta object literal for the '<em><b>Min Hops</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_PATTERN__MIN_HOPS = eINSTANCE.getRelationshipPattern_MinHops();

		/**
		 * The meta object literal for the '<em><b>Max Hops</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_PATTERN__MAX_HOPS = eINSTANCE.getRelationshipPattern_MaxHops();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.ExpressionImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.VariableImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.ParameterImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.LiteralImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.StringLiteralImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getStringLiteral()
		 * @generated
		 */
		EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.IntegerLiteralImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getIntegerLiteral()
		 * @generated
		 */
		EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_LITERAL__VALUE = eINSTANCE.getIntegerLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.FloatLiteralImpl <em>Float Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.FloatLiteralImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getFloatLiteral()
		 * @generated
		 */
		EClass FLOAT_LITERAL = eINSTANCE.getFloatLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_LITERAL__VALUE = eINSTANCE.getFloatLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.BooleanLiteralImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getBooleanLiteral()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.NullLiteralImpl <em>Null Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.NullLiteralImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getNullLiteral()
		 * @generated
		 */
		EClass NULL_LITERAL = eINSTANCE.getNullLiteral();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.ListLiteralImpl <em>List Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.ListLiteralImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getListLiteral()
		 * @generated
		 */
		EClass LIST_LITERAL = eINSTANCE.getListLiteral();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_LITERAL__ELEMENTS = eINSTANCE.getListLiteral_Elements();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.MapLiteralImpl <em>Map Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.MapLiteralImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getMapLiteral()
		 * @generated
		 */
		EClass MAP_LITERAL = eINSTANCE.getMapLiteral();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_LITERAL__ENTRIES = eINSTANCE.getMapLiteral_Entries();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.MapEntryImpl <em>Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.MapEntryImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getMapEntry()
		 * @generated
		 */
		EClass MAP_ENTRY = eINSTANCE.getMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_ENTRY__KEY = eINSTANCE.getMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_ENTRY__VALUE = eINSTANCE.getMapEntry_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.PropertyAccessImpl <em>Property Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.PropertyAccessImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getPropertyAccess()
		 * @generated
		 */
		EClass PROPERTY_ACCESS = eINSTANCE.getPropertyAccess();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_ACCESS__TARGET = eINSTANCE.getPropertyAccess_Target();

		/**
		 * The meta object literal for the '<em><b>Property Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_ACCESS__PROPERTY_KEY = eINSTANCE.getPropertyAccess_PropertyKey();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.LabelCheckImpl <em>Label Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.LabelCheckImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getLabelCheck()
		 * @generated
		 */
		EClass LABEL_CHECK = eINSTANCE.getLabelCheck();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL_CHECK__TARGET = eINSTANCE.getLabelCheck_Target();

		/**
		 * The meta object literal for the '<em><b>Label Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL_CHECK__LABEL_EXPRESSION = eINSTANCE.getLabelCheck_LabelExpression();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.BinaryExpressionImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_EXPRESSION__OPERATOR = eINSTANCE.getBinaryExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__LEFT = eINSTANCE.getBinaryExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__RIGHT = eINSTANCE.getBinaryExpression_Right();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.UnaryExpressionImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_EXPRESSION__OPERATOR = eINSTANCE.getUnaryExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__OPERAND = eINSTANCE.getUnaryExpression_Operand();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.FunctionInvocationImpl <em>Function Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.FunctionInvocationImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getFunctionInvocation()
		 * @generated
		 */
		EClass FUNCTION_INVOCATION = eINSTANCE.getFunctionInvocation();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_INVOCATION__NAMESPACE = eINSTANCE.getFunctionInvocation_Namespace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_INVOCATION__NAME = eINSTANCE.getFunctionInvocation_Name();

		/**
		 * The meta object literal for the '<em><b>Distinct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_INVOCATION__DISTINCT = eINSTANCE.getFunctionInvocation_Distinct();

		/**
		 * The meta object literal for the '<em><b>Star</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_INVOCATION__STAR = eINSTANCE.getFunctionInvocation_Star();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_INVOCATION__ARGUMENTS = eINSTANCE.getFunctionInvocation_Arguments();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.CaseExpressionImpl <em>Case Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.CaseExpressionImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getCaseExpression()
		 * @generated
		 */
		EClass CASE_EXPRESSION = eINSTANCE.getCaseExpression();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_EXPRESSION__SUBJECT = eINSTANCE.getCaseExpression_Subject();

		/**
		 * The meta object literal for the '<em><b>Alternatives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_EXPRESSION__ALTERNATIVES = eINSTANCE.getCaseExpression_Alternatives();

		/**
		 * The meta object literal for the '<em><b>Else Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_EXPRESSION__ELSE_EXPRESSION = eINSTANCE.getCaseExpression_ElseExpression();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.CaseAlternativeImpl <em>Case Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.CaseAlternativeImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getCaseAlternative()
		 * @generated
		 */
		EClass CASE_ALTERNATIVE = eINSTANCE.getCaseAlternative();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_ALTERNATIVE__CONDITION = eINSTANCE.getCaseAlternative_Condition();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_ALTERNATIVE__RESULT = eINSTANCE.getCaseAlternative_Result();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.ListComprehensionImpl <em>List Comprehension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.ListComprehensionImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getListComprehension()
		 * @generated
		 */
		EClass LIST_COMPREHENSION = eINSTANCE.getListComprehension();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_COMPREHENSION__VARIABLE = eINSTANCE.getListComprehension_Variable();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_COMPREHENSION__LIST = eINSTANCE.getListComprehension_List();

		/**
		 * The meta object literal for the '<em><b>Where</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_COMPREHENSION__WHERE = eINSTANCE.getListComprehension_Where();

		/**
		 * The meta object literal for the '<em><b>Projection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_COMPREHENSION__PROJECTION = eINSTANCE.getListComprehension_Projection();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.PatternComprehensionImpl <em>Pattern Comprehension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.PatternComprehensionImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getPatternComprehension()
		 * @generated
		 */
		EClass PATTERN_COMPREHENSION = eINSTANCE.getPatternComprehension();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_COMPREHENSION__VARIABLE = eINSTANCE.getPatternComprehension_Variable();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_COMPREHENSION__PATTERN = eINSTANCE.getPatternComprehension_Pattern();

		/**
		 * The meta object literal for the '<em><b>Where</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_COMPREHENSION__WHERE = eINSTANCE.getPatternComprehension_Where();

		/**
		 * The meta object literal for the '<em><b>Projection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_COMPREHENSION__PROJECTION = eINSTANCE.getPatternComprehension_Projection();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.QuantifiedExpressionImpl <em>Quantified Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.QuantifiedExpressionImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getQuantifiedExpression()
		 * @generated
		 */
		EClass QUANTIFIED_EXPRESSION = eINSTANCE.getQuantifiedExpression();

		/**
		 * The meta object literal for the '<em><b>Quantifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTIFIED_EXPRESSION__QUANTIFIER = eINSTANCE.getQuantifiedExpression_Quantifier();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTIFIED_EXPRESSION__VARIABLE = eINSTANCE.getQuantifiedExpression_Variable();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFIED_EXPRESSION__LIST = eINSTANCE.getQuantifiedExpression_List();

		/**
		 * The meta object literal for the '<em><b>Where</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFIED_EXPRESSION__WHERE = eINSTANCE.getQuantifiedExpression_Where();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.ExistsExpressionImpl <em>Exists Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.ExistsExpressionImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getExistsExpression()
		 * @generated
		 */
		EClass EXISTS_EXPRESSION = eINSTANCE.getExistsExpression();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXISTS_EXPRESSION__PATTERN = eINSTANCE.getExistsExpression_Pattern();

		/**
		 * The meta object literal for the '<em><b>Subquery</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXISTS_EXPRESSION__SUBQUERY = eINSTANCE.getExistsExpression_Subquery();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.SubscriptImpl <em>Subscript</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.SubscriptImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getSubscript()
		 * @generated
		 */
		EClass SUBSCRIPT = eINSTANCE.getSubscript();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPT__TARGET = eINSTANCE.getSubscript_Target();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPT__INDEX = eINSTANCE.getSubscript_Index();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.SliceExpressionImpl <em>Slice Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.SliceExpressionImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getSliceExpression()
		 * @generated
		 */
		EClass SLICE_EXPRESSION = eINSTANCE.getSliceExpression();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICE_EXPRESSION__TARGET = eINSTANCE.getSliceExpression_Target();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICE_EXPRESSION__FROM = eINSTANCE.getSliceExpression_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICE_EXPRESSION__TO = eINSTANCE.getSliceExpression_To();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.impl.CypherEvaluatorImpl <em>Evaluator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.impl.CypherEvaluatorImpl
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getCypherEvaluator()
		 * @generated
		 */
		EClass CYPHER_EVALUATOR = eINSTANCE.getCypherEvaluator();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CYPHER_EVALUATOR__STATEMENT = eINSTANCE.getCypherEvaluator_Statement();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CYPHER_EVALUATOR__READ_ONLY = eINSTANCE.getCypherEvaluator_ReadOnly();

		/**
		 * The meta object literal for the '<em><b>Row Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CYPHER_EVALUATOR__ROW_LIMIT = eINSTANCE.getCypherEvaluator_RowLimit();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CYPHER_EVALUATOR__TIMEOUT = eINSTANCE.getCypherEvaluator_Timeout();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.Dialect <em>Dialect</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.Dialect
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getDialect()
		 * @generated
		 */
		EEnum DIALECT = eINSTANCE.getDialect();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.SortDirection <em>Sort Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.SortDirection
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getSortDirection()
		 * @generated
		 */
		EEnum SORT_DIRECTION = eINSTANCE.getSortDirection();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.MergeActionKind <em>Merge Action Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.MergeActionKind
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getMergeActionKind()
		 * @generated
		 */
		EEnum MERGE_ACTION_KIND = eINSTANCE.getMergeActionKind();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.PathSelector <em>Path Selector</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.PathSelector
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getPathSelector()
		 * @generated
		 */
		EEnum PATH_SELECTOR = eINSTANCE.getPathSelector();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.Direction <em>Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.Direction
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getDirection()
		 * @generated
		 */
		EEnum DIRECTION = eINSTANCE.getDirection();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.BinaryOperator <em>Binary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.BinaryOperator
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getBinaryOperator()
		 * @generated
		 */
		EEnum BINARY_OPERATOR = eINSTANCE.getBinaryOperator();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.UnaryOperator <em>Unary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.UnaryOperator
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getUnaryOperator()
		 * @generated
		 */
		EEnum UNARY_OPERATOR = eINSTANCE.getUnaryOperator();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.cypher.Quantifier <em>Quantifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.cypher.Quantifier
		 * @see org.nasdanika.models.cypher.impl.CypherPackageImpl#getQuantifier()
		 * @generated
		 */
		EEnum QUANTIFIER = eINSTANCE.getQuantifier();

	}

} //CypherPackage
