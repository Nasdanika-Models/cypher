/**
 */
package org.nasdanika.models.cypher;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.cypher.CypherPackage
 * @generated
 */
public interface CypherFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CypherFactory eINSTANCE = org.nasdanika.models.cypher.impl.CypherFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source</em>'.
	 * @generated
	 */
	CypherSource createCypherSource();

	/**
	 * Returns a new object of class '<em>Unparsed Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unparsed Statement</em>'.
	 * @generated
	 */
	UnparsedStatement createUnparsedStatement();

	/**
	 * Returns a new object of class '<em>Single Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Query</em>'.
	 * @generated
	 */
	SingleQuery createSingleQuery();

	/**
	 * Returns a new object of class '<em>Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Union</em>'.
	 * @generated
	 */
	Union createUnion();

	/**
	 * Returns a new object of class '<em>Match Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Match Clause</em>'.
	 * @generated
	 */
	MatchClause createMatchClause();

	/**
	 * Returns a new object of class '<em>Return Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Clause</em>'.
	 * @generated
	 */
	ReturnClause createReturnClause();

	/**
	 * Returns a new object of class '<em>With Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>With Clause</em>'.
	 * @generated
	 */
	WithClause createWithClause();

	/**
	 * Returns a new object of class '<em>Projection Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Projection Item</em>'.
	 * @generated
	 */
	ProjectionItem createProjectionItem();

	/**
	 * Returns a new object of class '<em>Sort Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sort Item</em>'.
	 * @generated
	 */
	SortItem createSortItem();

	/**
	 * Returns a new object of class '<em>Unwind Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unwind Clause</em>'.
	 * @generated
	 */
	UnwindClause createUnwindClause();

	/**
	 * Returns a new object of class '<em>Create Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Clause</em>'.
	 * @generated
	 */
	CreateClause createCreateClause();

	/**
	 * Returns a new object of class '<em>Merge Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merge Clause</em>'.
	 * @generated
	 */
	MergeClause createMergeClause();

	/**
	 * Returns a new object of class '<em>Merge Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merge Action</em>'.
	 * @generated
	 */
	MergeAction createMergeAction();

	/**
	 * Returns a new object of class '<em>Set Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Clause</em>'.
	 * @generated
	 */
	SetClause createSetClause();

	/**
	 * Returns a new object of class '<em>Set Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Property</em>'.
	 * @generated
	 */
	SetProperty createSetProperty();

	/**
	 * Returns a new object of class '<em>Set Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Variable</em>'.
	 * @generated
	 */
	SetVariable createSetVariable();

	/**
	 * Returns a new object of class '<em>Set Labels</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Labels</em>'.
	 * @generated
	 */
	SetLabels createSetLabels();

	/**
	 * Returns a new object of class '<em>Remove Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Clause</em>'.
	 * @generated
	 */
	RemoveClause createRemoveClause();

	/**
	 * Returns a new object of class '<em>Remove Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Property</em>'.
	 * @generated
	 */
	RemoveProperty createRemoveProperty();

	/**
	 * Returns a new object of class '<em>Remove Labels</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Labels</em>'.
	 * @generated
	 */
	RemoveLabels createRemoveLabels();

	/**
	 * Returns a new object of class '<em>Delete Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Clause</em>'.
	 * @generated
	 */
	DeleteClause createDeleteClause();

	/**
	 * Returns a new object of class '<em>Foreach Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Foreach Clause</em>'.
	 * @generated
	 */
	ForeachClause createForeachClause();

	/**
	 * Returns a new object of class '<em>Call Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Clause</em>'.
	 * @generated
	 */
	CallClause createCallClause();

	/**
	 * Returns a new object of class '<em>Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern</em>'.
	 * @generated
	 */
	Pattern createPattern();

	/**
	 * Returns a new object of class '<em>Pattern Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Part</em>'.
	 * @generated
	 */
	PatternPart createPatternPart();

	/**
	 * Returns a new object of class '<em>Node Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Pattern</em>'.
	 * @generated
	 */
	NodePattern createNodePattern();

	/**
	 * Returns a new object of class '<em>Label Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Name</em>'.
	 * @generated
	 */
	LabelName createLabelName();

	/**
	 * Returns a new object of class '<em>Label Conjunction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Conjunction</em>'.
	 * @generated
	 */
	LabelConjunction createLabelConjunction();

	/**
	 * Returns a new object of class '<em>Label Disjunction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Disjunction</em>'.
	 * @generated
	 */
	LabelDisjunction createLabelDisjunction();

	/**
	 * Returns a new object of class '<em>Label Negation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Negation</em>'.
	 * @generated
	 */
	LabelNegation createLabelNegation();

	/**
	 * Returns a new object of class '<em>Label Wildcard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Wildcard</em>'.
	 * @generated
	 */
	LabelWildcard createLabelWildcard();

	/**
	 * Returns a new object of class '<em>Relationship Chain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship Chain</em>'.
	 * @generated
	 */
	RelationshipChain createRelationshipChain();

	/**
	 * Returns a new object of class '<em>Relationship Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship Pattern</em>'.
	 * @generated
	 */
	RelationshipPattern createRelationshipPattern();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Literal</em>'.
	 * @generated
	 */
	StringLiteral createStringLiteral();

	/**
	 * Returns a new object of class '<em>Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Literal</em>'.
	 * @generated
	 */
	IntegerLiteral createIntegerLiteral();

	/**
	 * Returns a new object of class '<em>Float Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Float Literal</em>'.
	 * @generated
	 */
	FloatLiteral createFloatLiteral();

	/**
	 * Returns a new object of class '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Literal</em>'.
	 * @generated
	 */
	BooleanLiteral createBooleanLiteral();

	/**
	 * Returns a new object of class '<em>Null Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Null Literal</em>'.
	 * @generated
	 */
	NullLiteral createNullLiteral();

	/**
	 * Returns a new object of class '<em>List Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Literal</em>'.
	 * @generated
	 */
	ListLiteral createListLiteral();

	/**
	 * Returns a new object of class '<em>Map Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Literal</em>'.
	 * @generated
	 */
	MapLiteral createMapLiteral();

	/**
	 * Returns a new object of class '<em>Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Entry</em>'.
	 * @generated
	 */
	MapEntry createMapEntry();

	/**
	 * Returns a new object of class '<em>Property Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Access</em>'.
	 * @generated
	 */
	PropertyAccess createPropertyAccess();

	/**
	 * Returns a new object of class '<em>Label Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Check</em>'.
	 * @generated
	 */
	LabelCheck createLabelCheck();

	/**
	 * Returns a new object of class '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Expression</em>'.
	 * @generated
	 */
	BinaryExpression createBinaryExpression();

	/**
	 * Returns a new object of class '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Expression</em>'.
	 * @generated
	 */
	UnaryExpression createUnaryExpression();

	/**
	 * Returns a new object of class '<em>Function Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Invocation</em>'.
	 * @generated
	 */
	FunctionInvocation createFunctionInvocation();

	/**
	 * Returns a new object of class '<em>Case Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Expression</em>'.
	 * @generated
	 */
	CaseExpression createCaseExpression();

	/**
	 * Returns a new object of class '<em>Case Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Alternative</em>'.
	 * @generated
	 */
	CaseAlternative createCaseAlternative();

	/**
	 * Returns a new object of class '<em>List Comprehension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Comprehension</em>'.
	 * @generated
	 */
	ListComprehension createListComprehension();

	/**
	 * Returns a new object of class '<em>Pattern Comprehension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Comprehension</em>'.
	 * @generated
	 */
	PatternComprehension createPatternComprehension();

	/**
	 * Returns a new object of class '<em>Quantified Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantified Expression</em>'.
	 * @generated
	 */
	QuantifiedExpression createQuantifiedExpression();

	/**
	 * Returns a new object of class '<em>Exists Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exists Expression</em>'.
	 * @generated
	 */
	ExistsExpression createExistsExpression();

	/**
	 * Returns a new object of class '<em>Subscript</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subscript</em>'.
	 * @generated
	 */
	Subscript createSubscript();

	/**
	 * Returns a new object of class '<em>Slice Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slice Expression</em>'.
	 * @generated
	 */
	SliceExpression createSliceExpression();

	/**
	 * Returns a new object of class '<em>Evaluator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evaluator</em>'.
	 * @generated
	 */
	CypherEvaluator createCypherEvaluator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CypherPackage getCypherPackage();

} //CypherFactory
