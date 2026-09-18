/**
 */
package org.nasdanika.models.cypher.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.cypher.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CypherFactoryImpl extends EFactoryImpl implements CypherFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CypherFactory init() {
		try {
			CypherFactory theCypherFactory = (CypherFactory)EPackage.Registry.INSTANCE.getEFactory(CypherPackage.eNS_URI);
			if (theCypherFactory != null) {
				return theCypherFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CypherFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CypherFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CypherPackage.CYPHER_SOURCE: return createCypherSource();
			case CypherPackage.UNPARSED_STATEMENT: return createUnparsedStatement();
			case CypherPackage.SINGLE_QUERY: return createSingleQuery();
			case CypherPackage.UNION: return createUnion();
			case CypherPackage.MATCH_CLAUSE: return createMatchClause();
			case CypherPackage.RETURN_CLAUSE: return createReturnClause();
			case CypherPackage.WITH_CLAUSE: return createWithClause();
			case CypherPackage.PROJECTION_ITEM: return createProjectionItem();
			case CypherPackage.SORT_ITEM: return createSortItem();
			case CypherPackage.UNWIND_CLAUSE: return createUnwindClause();
			case CypherPackage.CREATE_CLAUSE: return createCreateClause();
			case CypherPackage.MERGE_CLAUSE: return createMergeClause();
			case CypherPackage.MERGE_ACTION: return createMergeAction();
			case CypherPackage.SET_CLAUSE: return createSetClause();
			case CypherPackage.SET_PROPERTY: return createSetProperty();
			case CypherPackage.SET_VARIABLE: return createSetVariable();
			case CypherPackage.SET_LABELS: return createSetLabels();
			case CypherPackage.REMOVE_CLAUSE: return createRemoveClause();
			case CypherPackage.REMOVE_PROPERTY: return createRemoveProperty();
			case CypherPackage.REMOVE_LABELS: return createRemoveLabels();
			case CypherPackage.DELETE_CLAUSE: return createDeleteClause();
			case CypherPackage.FOREACH_CLAUSE: return createForeachClause();
			case CypherPackage.CALL_CLAUSE: return createCallClause();
			case CypherPackage.PATTERN: return createPattern();
			case CypherPackage.PATTERN_PART: return createPatternPart();
			case CypherPackage.NODE_PATTERN: return createNodePattern();
			case CypherPackage.LABEL_NAME: return createLabelName();
			case CypherPackage.LABEL_CONJUNCTION: return createLabelConjunction();
			case CypherPackage.LABEL_DISJUNCTION: return createLabelDisjunction();
			case CypherPackage.LABEL_NEGATION: return createLabelNegation();
			case CypherPackage.LABEL_WILDCARD: return createLabelWildcard();
			case CypherPackage.RELATIONSHIP_CHAIN: return createRelationshipChain();
			case CypherPackage.RELATIONSHIP_PATTERN: return createRelationshipPattern();
			case CypherPackage.VARIABLE: return createVariable();
			case CypherPackage.PARAMETER: return createParameter();
			case CypherPackage.STRING_LITERAL: return createStringLiteral();
			case CypherPackage.INTEGER_LITERAL: return createIntegerLiteral();
			case CypherPackage.FLOAT_LITERAL: return createFloatLiteral();
			case CypherPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
			case CypherPackage.NULL_LITERAL: return createNullLiteral();
			case CypherPackage.LIST_LITERAL: return createListLiteral();
			case CypherPackage.MAP_LITERAL: return createMapLiteral();
			case CypherPackage.MAP_ENTRY: return createMapEntry();
			case CypherPackage.PROPERTY_ACCESS: return createPropertyAccess();
			case CypherPackage.LABEL_CHECK: return createLabelCheck();
			case CypherPackage.BINARY_EXPRESSION: return createBinaryExpression();
			case CypherPackage.UNARY_EXPRESSION: return createUnaryExpression();
			case CypherPackage.FUNCTION_INVOCATION: return createFunctionInvocation();
			case CypherPackage.CASE_EXPRESSION: return createCaseExpression();
			case CypherPackage.CASE_ALTERNATIVE: return createCaseAlternative();
			case CypherPackage.LIST_COMPREHENSION: return createListComprehension();
			case CypherPackage.PATTERN_COMPREHENSION: return createPatternComprehension();
			case CypherPackage.QUANTIFIED_EXPRESSION: return createQuantifiedExpression();
			case CypherPackage.EXISTS_EXPRESSION: return createExistsExpression();
			case CypherPackage.SUBSCRIPT: return createSubscript();
			case CypherPackage.SLICE_EXPRESSION: return createSliceExpression();
			case CypherPackage.CYPHER_EVALUATOR: return createCypherEvaluator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CypherPackage.DIALECT:
				return createDialectFromString(eDataType, initialValue);
			case CypherPackage.SORT_DIRECTION:
				return createSortDirectionFromString(eDataType, initialValue);
			case CypherPackage.MERGE_ACTION_KIND:
				return createMergeActionKindFromString(eDataType, initialValue);
			case CypherPackage.PATH_SELECTOR:
				return createPathSelectorFromString(eDataType, initialValue);
			case CypherPackage.DIRECTION:
				return createDirectionFromString(eDataType, initialValue);
			case CypherPackage.BINARY_OPERATOR:
				return createBinaryOperatorFromString(eDataType, initialValue);
			case CypherPackage.UNARY_OPERATOR:
				return createUnaryOperatorFromString(eDataType, initialValue);
			case CypherPackage.QUANTIFIER:
				return createQuantifierFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CypherPackage.DIALECT:
				return convertDialectToString(eDataType, instanceValue);
			case CypherPackage.SORT_DIRECTION:
				return convertSortDirectionToString(eDataType, instanceValue);
			case CypherPackage.MERGE_ACTION_KIND:
				return convertMergeActionKindToString(eDataType, instanceValue);
			case CypherPackage.PATH_SELECTOR:
				return convertPathSelectorToString(eDataType, instanceValue);
			case CypherPackage.DIRECTION:
				return convertDirectionToString(eDataType, instanceValue);
			case CypherPackage.BINARY_OPERATOR:
				return convertBinaryOperatorToString(eDataType, instanceValue);
			case CypherPackage.UNARY_OPERATOR:
				return convertUnaryOperatorToString(eDataType, instanceValue);
			case CypherPackage.QUANTIFIER:
				return convertQuantifierToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CypherSource createCypherSource() {
		CypherSourceImpl cypherSource = new CypherSourceImpl();
		return cypherSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnparsedStatement createUnparsedStatement() {
		UnparsedStatementImpl unparsedStatement = new UnparsedStatementImpl();
		return unparsedStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleQuery createSingleQuery() {
		SingleQueryImpl singleQuery = new SingleQueryImpl();
		return singleQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Union createUnion() {
		UnionImpl union = new UnionImpl();
		return union;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchClause createMatchClause() {
		MatchClauseImpl matchClause = new MatchClauseImpl();
		return matchClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnClause createReturnClause() {
		ReturnClauseImpl returnClause = new ReturnClauseImpl();
		return returnClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WithClause createWithClause() {
		WithClauseImpl withClause = new WithClauseImpl();
		return withClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectionItem createProjectionItem() {
		ProjectionItemImpl projectionItem = new ProjectionItemImpl();
		return projectionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortItem createSortItem() {
		SortItemImpl sortItem = new SortItemImpl();
		return sortItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnwindClause createUnwindClause() {
		UnwindClauseImpl unwindClause = new UnwindClauseImpl();
		return unwindClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateClause createCreateClause() {
		CreateClauseImpl createClause = new CreateClauseImpl();
		return createClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeClause createMergeClause() {
		MergeClauseImpl mergeClause = new MergeClauseImpl();
		return mergeClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeAction createMergeAction() {
		MergeActionImpl mergeAction = new MergeActionImpl();
		return mergeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetClause createSetClause() {
		SetClauseImpl setClause = new SetClauseImpl();
		return setClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetProperty createSetProperty() {
		SetPropertyImpl setProperty = new SetPropertyImpl();
		return setProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetVariable createSetVariable() {
		SetVariableImpl setVariable = new SetVariableImpl();
		return setVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetLabels createSetLabels() {
		SetLabelsImpl setLabels = new SetLabelsImpl();
		return setLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveClause createRemoveClause() {
		RemoveClauseImpl removeClause = new RemoveClauseImpl();
		return removeClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveProperty createRemoveProperty() {
		RemovePropertyImpl removeProperty = new RemovePropertyImpl();
		return removeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveLabels createRemoveLabels() {
		RemoveLabelsImpl removeLabels = new RemoveLabelsImpl();
		return removeLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteClause createDeleteClause() {
		DeleteClauseImpl deleteClause = new DeleteClauseImpl();
		return deleteClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeachClause createForeachClause() {
		ForeachClauseImpl foreachClause = new ForeachClauseImpl();
		return foreachClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallClause createCallClause() {
		CallClauseImpl callClause = new CallClauseImpl();
		return callClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern createPattern() {
		PatternImpl pattern = new PatternImpl();
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternPart createPatternPart() {
		PatternPartImpl patternPart = new PatternPartImpl();
		return patternPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodePattern createNodePattern() {
		NodePatternImpl nodePattern = new NodePatternImpl();
		return nodePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelName createLabelName() {
		LabelNameImpl labelName = new LabelNameImpl();
		return labelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelConjunction createLabelConjunction() {
		LabelConjunctionImpl labelConjunction = new LabelConjunctionImpl();
		return labelConjunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelDisjunction createLabelDisjunction() {
		LabelDisjunctionImpl labelDisjunction = new LabelDisjunctionImpl();
		return labelDisjunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelNegation createLabelNegation() {
		LabelNegationImpl labelNegation = new LabelNegationImpl();
		return labelNegation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelWildcard createLabelWildcard() {
		LabelWildcardImpl labelWildcard = new LabelWildcardImpl();
		return labelWildcard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipChain createRelationshipChain() {
		RelationshipChainImpl relationshipChain = new RelationshipChainImpl();
		return relationshipChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipPattern createRelationshipPattern() {
		RelationshipPatternImpl relationshipPattern = new RelationshipPatternImpl();
		return relationshipPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringLiteral createStringLiteral() {
		StringLiteralImpl stringLiteral = new StringLiteralImpl();
		return stringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerLiteral createIntegerLiteral() {
		IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
		return integerLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatLiteral createFloatLiteral() {
		FloatLiteralImpl floatLiteral = new FloatLiteralImpl();
		return floatLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanLiteral createBooleanLiteral() {
		BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
		return booleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullLiteral createNullLiteral() {
		NullLiteralImpl nullLiteral = new NullLiteralImpl();
		return nullLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListLiteral createListLiteral() {
		ListLiteralImpl listLiteral = new ListLiteralImpl();
		return listLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapLiteral createMapLiteral() {
		MapLiteralImpl mapLiteral = new MapLiteralImpl();
		return mapLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapEntry createMapEntry() {
		MapEntryImpl mapEntry = new MapEntryImpl();
		return mapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyAccess createPropertyAccess() {
		PropertyAccessImpl propertyAccess = new PropertyAccessImpl();
		return propertyAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelCheck createLabelCheck() {
		LabelCheckImpl labelCheck = new LabelCheckImpl();
		return labelCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpression createBinaryExpression() {
		BinaryExpressionImpl binaryExpression = new BinaryExpressionImpl();
		return binaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryExpression createUnaryExpression() {
		UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
		return unaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionInvocation createFunctionInvocation() {
		FunctionInvocationImpl functionInvocation = new FunctionInvocationImpl();
		return functionInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseExpression createCaseExpression() {
		CaseExpressionImpl caseExpression = new CaseExpressionImpl();
		return caseExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseAlternative createCaseAlternative() {
		CaseAlternativeImpl caseAlternative = new CaseAlternativeImpl();
		return caseAlternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListComprehension createListComprehension() {
		ListComprehensionImpl listComprehension = new ListComprehensionImpl();
		return listComprehension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternComprehension createPatternComprehension() {
		PatternComprehensionImpl patternComprehension = new PatternComprehensionImpl();
		return patternComprehension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantifiedExpression createQuantifiedExpression() {
		QuantifiedExpressionImpl quantifiedExpression = new QuantifiedExpressionImpl();
		return quantifiedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistsExpression createExistsExpression() {
		ExistsExpressionImpl existsExpression = new ExistsExpressionImpl();
		return existsExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscript createSubscript() {
		SubscriptImpl subscript = new SubscriptImpl();
		return subscript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SliceExpression createSliceExpression() {
		SliceExpressionImpl sliceExpression = new SliceExpressionImpl();
		return sliceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CypherEvaluator createCypherEvaluator() {
		CypherEvaluatorImpl cypherEvaluator = new CypherEvaluatorImpl();
		return cypherEvaluator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dialect createDialectFromString(EDataType eDataType, String initialValue) {
		Dialect result = Dialect.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDialectToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortDirection createSortDirectionFromString(EDataType eDataType, String initialValue) {
		SortDirection result = SortDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSortDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeActionKind createMergeActionKindFromString(EDataType eDataType, String initialValue) {
		MergeActionKind result = MergeActionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMergeActionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathSelector createPathSelectorFromString(EDataType eDataType, String initialValue) {
		PathSelector result = PathSelector.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPathSelectorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction createDirectionFromString(EDataType eDataType, String initialValue) {
		Direction result = Direction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperator createBinaryOperatorFromString(EDataType eDataType, String initialValue) {
		BinaryOperator result = BinaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOperator createUnaryOperatorFromString(EDataType eDataType, String initialValue) {
		UnaryOperator result = UnaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnaryOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantifier createQuantifierFromString(EDataType eDataType, String initialValue) {
		Quantifier result = Quantifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuantifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CypherPackage getCypherPackage() {
		return (CypherPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CypherPackage getPackage() {
		return CypherPackage.eINSTANCE;
	}

} //CypherFactoryImpl
