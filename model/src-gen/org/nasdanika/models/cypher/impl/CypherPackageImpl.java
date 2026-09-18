/**
 */
package org.nasdanika.models.cypher.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.cypher.BinaryExpression;
import org.nasdanika.models.cypher.BinaryOperator;
import org.nasdanika.models.cypher.BooleanLiteral;
import org.nasdanika.models.cypher.CallClause;
import org.nasdanika.models.cypher.CaseAlternative;
import org.nasdanika.models.cypher.CaseExpression;
import org.nasdanika.models.cypher.Clause;
import org.nasdanika.models.cypher.CreateClause;
import org.nasdanika.models.cypher.CypherElement;
import org.nasdanika.models.cypher.CypherEvaluator;
import org.nasdanika.models.cypher.CypherFactory;
import org.nasdanika.models.cypher.CypherPackage;
import org.nasdanika.models.cypher.CypherSource;
import org.nasdanika.models.cypher.DeleteClause;
import org.nasdanika.models.cypher.Dialect;
import org.nasdanika.models.cypher.Direction;
import org.nasdanika.models.cypher.ExistsExpression;
import org.nasdanika.models.cypher.Expression;
import org.nasdanika.models.cypher.FloatLiteral;
import org.nasdanika.models.cypher.ForeachClause;
import org.nasdanika.models.cypher.FunctionInvocation;
import org.nasdanika.models.cypher.IntegerLiteral;
import org.nasdanika.models.cypher.LabelCheck;
import org.nasdanika.models.cypher.LabelConjunction;
import org.nasdanika.models.cypher.LabelDisjunction;
import org.nasdanika.models.cypher.LabelExpression;
import org.nasdanika.models.cypher.LabelName;
import org.nasdanika.models.cypher.LabelNegation;
import org.nasdanika.models.cypher.LabelWildcard;
import org.nasdanika.models.cypher.ListComprehension;
import org.nasdanika.models.cypher.ListLiteral;
import org.nasdanika.models.cypher.Literal;
import org.nasdanika.models.cypher.MapEntry;
import org.nasdanika.models.cypher.MapLiteral;
import org.nasdanika.models.cypher.MatchClause;
import org.nasdanika.models.cypher.MergeAction;
import org.nasdanika.models.cypher.MergeActionKind;
import org.nasdanika.models.cypher.MergeClause;
import org.nasdanika.models.cypher.NodePattern;
import org.nasdanika.models.cypher.NullLiteral;
import org.nasdanika.models.cypher.Parameter;
import org.nasdanika.models.cypher.PathSelector;
import org.nasdanika.models.cypher.Pattern;
import org.nasdanika.models.cypher.PatternComprehension;
import org.nasdanika.models.cypher.PatternElement;
import org.nasdanika.models.cypher.PatternPart;
import org.nasdanika.models.cypher.ProjectionClause;
import org.nasdanika.models.cypher.ProjectionItem;
import org.nasdanika.models.cypher.PropertyAccess;
import org.nasdanika.models.cypher.QuantifiedExpression;
import org.nasdanika.models.cypher.Quantifier;
import org.nasdanika.models.cypher.Query;
import org.nasdanika.models.cypher.RelationshipChain;
import org.nasdanika.models.cypher.RelationshipPattern;
import org.nasdanika.models.cypher.RemoveClause;
import org.nasdanika.models.cypher.RemoveItem;
import org.nasdanika.models.cypher.RemoveLabels;
import org.nasdanika.models.cypher.RemoveProperty;
import org.nasdanika.models.cypher.ReturnClause;
import org.nasdanika.models.cypher.SetClause;
import org.nasdanika.models.cypher.SetItem;
import org.nasdanika.models.cypher.SetLabels;
import org.nasdanika.models.cypher.SetProperty;
import org.nasdanika.models.cypher.SetVariable;
import org.nasdanika.models.cypher.SingleQuery;
import org.nasdanika.models.cypher.SliceExpression;
import org.nasdanika.models.cypher.SortDirection;
import org.nasdanika.models.cypher.SortItem;
import org.nasdanika.models.cypher.Statement;
import org.nasdanika.models.cypher.StringLiteral;
import org.nasdanika.models.cypher.Subscript;
import org.nasdanika.models.cypher.UnaryExpression;
import org.nasdanika.models.cypher.UnaryOperator;
import org.nasdanika.models.cypher.Union;
import org.nasdanika.models.cypher.UnparsedStatement;
import org.nasdanika.models.cypher.UnwindClause;
import org.nasdanika.models.cypher.Variable;
import org.nasdanika.models.cypher.WithClause;

import org.nasdanika.models.nxcore.NxcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CypherPackageImpl extends EPackageImpl implements CypherPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cypherSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cypherElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unparsedStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectionClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass withClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unwindClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setLabelsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeLabelsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foreachClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodePatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelConjunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelDisjunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelNegationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelWildcardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipChainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionInvocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseAlternativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listComprehensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternComprehensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantifiedExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existsExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sliceExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cypherEvaluatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dialectEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sortDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mergeActionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pathSelectorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binaryOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unaryOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum quantifierEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.cypher.CypherPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CypherPackageImpl() {
		super(eNS_URI, CypherFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CypherPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CypherPackage init() {
		if (isInited) return (CypherPackage)EPackage.Registry.INSTANCE.getEPackage(CypherPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCypherPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CypherPackageImpl theCypherPackage = registeredCypherPackage instanceof CypherPackageImpl ? (CypherPackageImpl)registeredCypherPackage : new CypherPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		NxcorePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCypherPackage.createPackageContents();

		// Initialize created meta-data
		theCypherPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCypherPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CypherPackage.eNS_URI, theCypherPackage);
		return theCypherPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCypherSource() {
		return cypherSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCypherSource_Source() {
		return (EAttribute)cypherSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCypherSource_Parsed() {
		return (EAttribute)cypherSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCypherSource_Dialect() {
		return (EAttribute)cypherSourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCypherSource_Statements() {
		return (EReference)cypherSourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCypherElement() {
		return cypherElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnparsedStatement() {
		return unparsedStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnparsedStatement_Text() {
		return (EAttribute)unparsedStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnparsedStatement_Error() {
		return (EAttribute)unparsedStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuery() {
		return queryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_Explain() {
		return (EAttribute)queryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_Profile() {
		return (EAttribute)queryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleQuery() {
		return singleQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleQuery_Clauses() {
		return (EReference)singleQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnion() {
		return unionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnion_All() {
		return (EAttribute)unionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnion_Operands() {
		return (EReference)unionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClause() {
		return clauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatchClause() {
		return matchClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatchClause_Optional() {
		return (EAttribute)matchClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatchClause_Pattern() {
		return (EReference)matchClauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatchClause_Where() {
		return (EReference)matchClauseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectionClause() {
		return projectionClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectionClause_Distinct() {
		return (EAttribute)projectionClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectionClause_All() {
		return (EAttribute)projectionClauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectionClause_Items() {
		return (EReference)projectionClauseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectionClause_Order() {
		return (EReference)projectionClauseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectionClause_Skip() {
		return (EReference)projectionClauseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectionClause_Limit() {
		return (EReference)projectionClauseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnClause() {
		return returnClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWithClause() {
		return withClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWithClause_Where() {
		return (EReference)withClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectionItem() {
		return projectionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectionItem_Expression() {
		return (EReference)projectionItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectionItem_Alias() {
		return (EAttribute)projectionItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortItem() {
		return sortItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortItem_Expression() {
		return (EReference)sortItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortItem_Direction() {
		return (EAttribute)sortItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnwindClause() {
		return unwindClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnwindClause_Expression() {
		return (EReference)unwindClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnwindClause_Variable() {
		return (EAttribute)unwindClauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateClause() {
		return createClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateClause_Pattern() {
		return (EReference)createClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergeClause() {
		return mergeClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMergeClause_Pattern() {
		return (EReference)mergeClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMergeClause_Actions() {
		return (EReference)mergeClauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergeAction() {
		return mergeActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMergeAction_Kind() {
		return (EAttribute)mergeActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMergeAction_Set() {
		return (EReference)mergeActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetClause() {
		return setClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetClause_Items() {
		return (EReference)setClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetItem() {
		return setItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetProperty() {
		return setPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetProperty_Property() {
		return (EReference)setPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetProperty_Value() {
		return (EReference)setPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetVariable() {
		return setVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetVariable_Variable() {
		return (EAttribute)setVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetVariable_Value() {
		return (EReference)setVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetVariable_Merge() {
		return (EAttribute)setVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetLabels() {
		return setLabelsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetLabels_Variable() {
		return (EAttribute)setLabelsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetLabels_Labels() {
		return (EAttribute)setLabelsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveClause() {
		return removeClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoveClause_Items() {
		return (EReference)removeClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveItem() {
		return removeItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveProperty() {
		return removePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoveProperty_Property() {
		return (EReference)removePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveLabels() {
		return removeLabelsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveLabels_Variable() {
		return (EAttribute)removeLabelsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveLabels_Labels() {
		return (EAttribute)removeLabelsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteClause() {
		return deleteClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteClause_Detach() {
		return (EAttribute)deleteClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteClause_Expressions() {
		return (EReference)deleteClauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForeachClause() {
		return foreachClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForeachClause_Variable() {
		return (EAttribute)foreachClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeachClause_Expression() {
		return (EReference)foreachClauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeachClause_Clauses() {
		return (EReference)foreachClauseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallClause() {
		return callClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallClause_Namespace() {
		return (EAttribute)callClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallClause_Name() {
		return (EAttribute)callClauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallClause_Arguments() {
		return (EReference)callClauseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallClause_YieldItems() {
		return (EReference)callClauseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallClause_Where() {
		return (EReference)callClauseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallClause_Subquery() {
		return (EReference)callClauseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern() {
		return patternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_Parts() {
		return (EReference)patternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternPart() {
		return patternPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternPart_Variable() {
		return (EAttribute)patternPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternPart_Selector() {
		return (EAttribute)patternPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternPart_Element() {
		return (EReference)patternPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternElement() {
		return patternElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodePattern() {
		return nodePatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodePattern_Variable() {
		return (EAttribute)nodePatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodePattern_LabelExpression() {
		return (EReference)nodePatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodePattern_Properties() {
		return (EReference)nodePatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelExpression() {
		return labelExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelName() {
		return labelNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelName_Name() {
		return (EAttribute)labelNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelConjunction() {
		return labelConjunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelConjunction_Operands() {
		return (EReference)labelConjunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelDisjunction() {
		return labelDisjunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelDisjunction_Operands() {
		return (EReference)labelDisjunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelNegation() {
		return labelNegationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelNegation_Operand() {
		return (EReference)labelNegationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelWildcard() {
		return labelWildcardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipChain() {
		return relationshipChainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipChain_Left() {
		return (EReference)relationshipChainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipChain_Relationship() {
		return (EReference)relationshipChainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipChain_Right() {
		return (EReference)relationshipChainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipPattern() {
		return relationshipPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipPattern_Variable() {
		return (EAttribute)relationshipPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipPattern_TypeExpression() {
		return (EReference)relationshipPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipPattern_Direction() {
		return (EAttribute)relationshipPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipPattern_Properties() {
		return (EReference)relationshipPatternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipPattern_VariableLength() {
		return (EAttribute)relationshipPatternEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipPattern_MinHops() {
		return (EAttribute)relationshipPatternEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipPattern_MaxHops() {
		return (EAttribute)relationshipPatternEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteral() {
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringLiteral() {
		return stringLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringLiteral_Value() {
		return (EAttribute)stringLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerLiteral() {
		return integerLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerLiteral_Value() {
		return (EAttribute)integerLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatLiteral() {
		return floatLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatLiteral_Value() {
		return (EAttribute)floatLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanLiteral() {
		return booleanLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanLiteral_Value() {
		return (EAttribute)booleanLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNullLiteral() {
		return nullLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListLiteral() {
		return listLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListLiteral_Elements() {
		return (EReference)listLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapLiteral() {
		return mapLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapLiteral_Entries() {
		return (EReference)mapLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapEntry() {
		return mapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapEntry_Key() {
		return (EAttribute)mapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapEntry_Value() {
		return (EReference)mapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyAccess() {
		return propertyAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyAccess_Target() {
		return (EReference)propertyAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyAccess_PropertyKey() {
		return (EAttribute)propertyAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelCheck() {
		return labelCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelCheck_Target() {
		return (EReference)labelCheckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelCheck_LabelExpression() {
		return (EReference)labelCheckEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryExpression() {
		return binaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryExpression_Operator() {
		return (EAttribute)binaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_Left() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_Right() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryExpression() {
		return unaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryExpression_Operator() {
		return (EAttribute)unaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryExpression_Operand() {
		return (EReference)unaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionInvocation() {
		return functionInvocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionInvocation_Namespace() {
		return (EAttribute)functionInvocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionInvocation_Name() {
		return (EAttribute)functionInvocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionInvocation_Distinct() {
		return (EAttribute)functionInvocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionInvocation_Star() {
		return (EAttribute)functionInvocationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionInvocation_Arguments() {
		return (EReference)functionInvocationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaseExpression() {
		return caseExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseExpression_Subject() {
		return (EReference)caseExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseExpression_Alternatives() {
		return (EReference)caseExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseExpression_ElseExpression() {
		return (EReference)caseExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaseAlternative() {
		return caseAlternativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseAlternative_Condition() {
		return (EReference)caseAlternativeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseAlternative_Result() {
		return (EReference)caseAlternativeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListComprehension() {
		return listComprehensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListComprehension_Variable() {
		return (EAttribute)listComprehensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListComprehension_List() {
		return (EReference)listComprehensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListComprehension_Where() {
		return (EReference)listComprehensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListComprehension_Projection() {
		return (EReference)listComprehensionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternComprehension() {
		return patternComprehensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternComprehension_Variable() {
		return (EAttribute)patternComprehensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternComprehension_Pattern() {
		return (EReference)patternComprehensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternComprehension_Where() {
		return (EReference)patternComprehensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternComprehension_Projection() {
		return (EReference)patternComprehensionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantifiedExpression() {
		return quantifiedExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantifiedExpression_Quantifier() {
		return (EAttribute)quantifiedExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantifiedExpression_Variable() {
		return (EAttribute)quantifiedExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantifiedExpression_List() {
		return (EReference)quantifiedExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantifiedExpression_Where() {
		return (EReference)quantifiedExpressionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExistsExpression() {
		return existsExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExistsExpression_Pattern() {
		return (EReference)existsExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExistsExpression_Subquery() {
		return (EReference)existsExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubscript() {
		return subscriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscript_Target() {
		return (EReference)subscriptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscript_Index() {
		return (EReference)subscriptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSliceExpression() {
		return sliceExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSliceExpression_Target() {
		return (EReference)sliceExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSliceExpression_From() {
		return (EReference)sliceExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSliceExpression_To() {
		return (EReference)sliceExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCypherEvaluator() {
		return cypherEvaluatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCypherEvaluator_Statement() {
		return (EReference)cypherEvaluatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCypherEvaluator_ReadOnly() {
		return (EAttribute)cypherEvaluatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCypherEvaluator_RowLimit() {
		return (EAttribute)cypherEvaluatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCypherEvaluator_Timeout() {
		return (EAttribute)cypherEvaluatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDialect() {
		return dialectEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSortDirection() {
		return sortDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMergeActionKind() {
		return mergeActionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPathSelector() {
		return pathSelectorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirection() {
		return directionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBinaryOperator() {
		return binaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnaryOperator() {
		return unaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQuantifier() {
		return quantifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CypherFactory getCypherFactory() {
		return (CypherFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cypherSourceEClass = createEClass(CYPHER_SOURCE);
		createEAttribute(cypherSourceEClass, CYPHER_SOURCE__SOURCE);
		createEAttribute(cypherSourceEClass, CYPHER_SOURCE__PARSED);
		createEAttribute(cypherSourceEClass, CYPHER_SOURCE__DIALECT);
		createEReference(cypherSourceEClass, CYPHER_SOURCE__STATEMENTS);

		cypherElementEClass = createEClass(CYPHER_ELEMENT);

		statementEClass = createEClass(STATEMENT);

		unparsedStatementEClass = createEClass(UNPARSED_STATEMENT);
		createEAttribute(unparsedStatementEClass, UNPARSED_STATEMENT__TEXT);
		createEAttribute(unparsedStatementEClass, UNPARSED_STATEMENT__ERROR);

		queryEClass = createEClass(QUERY);
		createEAttribute(queryEClass, QUERY__EXPLAIN);
		createEAttribute(queryEClass, QUERY__PROFILE);

		singleQueryEClass = createEClass(SINGLE_QUERY);
		createEReference(singleQueryEClass, SINGLE_QUERY__CLAUSES);

		unionEClass = createEClass(UNION);
		createEAttribute(unionEClass, UNION__ALL);
		createEReference(unionEClass, UNION__OPERANDS);

		clauseEClass = createEClass(CLAUSE);

		matchClauseEClass = createEClass(MATCH_CLAUSE);
		createEAttribute(matchClauseEClass, MATCH_CLAUSE__OPTIONAL);
		createEReference(matchClauseEClass, MATCH_CLAUSE__PATTERN);
		createEReference(matchClauseEClass, MATCH_CLAUSE__WHERE);

		projectionClauseEClass = createEClass(PROJECTION_CLAUSE);
		createEAttribute(projectionClauseEClass, PROJECTION_CLAUSE__DISTINCT);
		createEAttribute(projectionClauseEClass, PROJECTION_CLAUSE__ALL);
		createEReference(projectionClauseEClass, PROJECTION_CLAUSE__ITEMS);
		createEReference(projectionClauseEClass, PROJECTION_CLAUSE__ORDER);
		createEReference(projectionClauseEClass, PROJECTION_CLAUSE__SKIP);
		createEReference(projectionClauseEClass, PROJECTION_CLAUSE__LIMIT);

		returnClauseEClass = createEClass(RETURN_CLAUSE);

		withClauseEClass = createEClass(WITH_CLAUSE);
		createEReference(withClauseEClass, WITH_CLAUSE__WHERE);

		projectionItemEClass = createEClass(PROJECTION_ITEM);
		createEReference(projectionItemEClass, PROJECTION_ITEM__EXPRESSION);
		createEAttribute(projectionItemEClass, PROJECTION_ITEM__ALIAS);

		sortItemEClass = createEClass(SORT_ITEM);
		createEReference(sortItemEClass, SORT_ITEM__EXPRESSION);
		createEAttribute(sortItemEClass, SORT_ITEM__DIRECTION);

		unwindClauseEClass = createEClass(UNWIND_CLAUSE);
		createEReference(unwindClauseEClass, UNWIND_CLAUSE__EXPRESSION);
		createEAttribute(unwindClauseEClass, UNWIND_CLAUSE__VARIABLE);

		createClauseEClass = createEClass(CREATE_CLAUSE);
		createEReference(createClauseEClass, CREATE_CLAUSE__PATTERN);

		mergeClauseEClass = createEClass(MERGE_CLAUSE);
		createEReference(mergeClauseEClass, MERGE_CLAUSE__PATTERN);
		createEReference(mergeClauseEClass, MERGE_CLAUSE__ACTIONS);

		mergeActionEClass = createEClass(MERGE_ACTION);
		createEAttribute(mergeActionEClass, MERGE_ACTION__KIND);
		createEReference(mergeActionEClass, MERGE_ACTION__SET);

		setClauseEClass = createEClass(SET_CLAUSE);
		createEReference(setClauseEClass, SET_CLAUSE__ITEMS);

		setItemEClass = createEClass(SET_ITEM);

		setPropertyEClass = createEClass(SET_PROPERTY);
		createEReference(setPropertyEClass, SET_PROPERTY__PROPERTY);
		createEReference(setPropertyEClass, SET_PROPERTY__VALUE);

		setVariableEClass = createEClass(SET_VARIABLE);
		createEAttribute(setVariableEClass, SET_VARIABLE__VARIABLE);
		createEReference(setVariableEClass, SET_VARIABLE__VALUE);
		createEAttribute(setVariableEClass, SET_VARIABLE__MERGE);

		setLabelsEClass = createEClass(SET_LABELS);
		createEAttribute(setLabelsEClass, SET_LABELS__VARIABLE);
		createEAttribute(setLabelsEClass, SET_LABELS__LABELS);

		removeClauseEClass = createEClass(REMOVE_CLAUSE);
		createEReference(removeClauseEClass, REMOVE_CLAUSE__ITEMS);

		removeItemEClass = createEClass(REMOVE_ITEM);

		removePropertyEClass = createEClass(REMOVE_PROPERTY);
		createEReference(removePropertyEClass, REMOVE_PROPERTY__PROPERTY);

		removeLabelsEClass = createEClass(REMOVE_LABELS);
		createEAttribute(removeLabelsEClass, REMOVE_LABELS__VARIABLE);
		createEAttribute(removeLabelsEClass, REMOVE_LABELS__LABELS);

		deleteClauseEClass = createEClass(DELETE_CLAUSE);
		createEAttribute(deleteClauseEClass, DELETE_CLAUSE__DETACH);
		createEReference(deleteClauseEClass, DELETE_CLAUSE__EXPRESSIONS);

		foreachClauseEClass = createEClass(FOREACH_CLAUSE);
		createEAttribute(foreachClauseEClass, FOREACH_CLAUSE__VARIABLE);
		createEReference(foreachClauseEClass, FOREACH_CLAUSE__EXPRESSION);
		createEReference(foreachClauseEClass, FOREACH_CLAUSE__CLAUSES);

		callClauseEClass = createEClass(CALL_CLAUSE);
		createEAttribute(callClauseEClass, CALL_CLAUSE__NAMESPACE);
		createEAttribute(callClauseEClass, CALL_CLAUSE__NAME);
		createEReference(callClauseEClass, CALL_CLAUSE__ARGUMENTS);
		createEReference(callClauseEClass, CALL_CLAUSE__YIELD_ITEMS);
		createEReference(callClauseEClass, CALL_CLAUSE__WHERE);
		createEReference(callClauseEClass, CALL_CLAUSE__SUBQUERY);

		patternEClass = createEClass(PATTERN);
		createEReference(patternEClass, PATTERN__PARTS);

		patternPartEClass = createEClass(PATTERN_PART);
		createEAttribute(patternPartEClass, PATTERN_PART__VARIABLE);
		createEAttribute(patternPartEClass, PATTERN_PART__SELECTOR);
		createEReference(patternPartEClass, PATTERN_PART__ELEMENT);

		patternElementEClass = createEClass(PATTERN_ELEMENT);

		nodePatternEClass = createEClass(NODE_PATTERN);
		createEAttribute(nodePatternEClass, NODE_PATTERN__VARIABLE);
		createEReference(nodePatternEClass, NODE_PATTERN__LABEL_EXPRESSION);
		createEReference(nodePatternEClass, NODE_PATTERN__PROPERTIES);

		labelExpressionEClass = createEClass(LABEL_EXPRESSION);

		labelNameEClass = createEClass(LABEL_NAME);
		createEAttribute(labelNameEClass, LABEL_NAME__NAME);

		labelConjunctionEClass = createEClass(LABEL_CONJUNCTION);
		createEReference(labelConjunctionEClass, LABEL_CONJUNCTION__OPERANDS);

		labelDisjunctionEClass = createEClass(LABEL_DISJUNCTION);
		createEReference(labelDisjunctionEClass, LABEL_DISJUNCTION__OPERANDS);

		labelNegationEClass = createEClass(LABEL_NEGATION);
		createEReference(labelNegationEClass, LABEL_NEGATION__OPERAND);

		labelWildcardEClass = createEClass(LABEL_WILDCARD);

		relationshipChainEClass = createEClass(RELATIONSHIP_CHAIN);
		createEReference(relationshipChainEClass, RELATIONSHIP_CHAIN__LEFT);
		createEReference(relationshipChainEClass, RELATIONSHIP_CHAIN__RELATIONSHIP);
		createEReference(relationshipChainEClass, RELATIONSHIP_CHAIN__RIGHT);

		relationshipPatternEClass = createEClass(RELATIONSHIP_PATTERN);
		createEAttribute(relationshipPatternEClass, RELATIONSHIP_PATTERN__VARIABLE);
		createEReference(relationshipPatternEClass, RELATIONSHIP_PATTERN__TYPE_EXPRESSION);
		createEAttribute(relationshipPatternEClass, RELATIONSHIP_PATTERN__DIRECTION);
		createEReference(relationshipPatternEClass, RELATIONSHIP_PATTERN__PROPERTIES);
		createEAttribute(relationshipPatternEClass, RELATIONSHIP_PATTERN__VARIABLE_LENGTH);
		createEAttribute(relationshipPatternEClass, RELATIONSHIP_PATTERN__MIN_HOPS);
		createEAttribute(relationshipPatternEClass, RELATIONSHIP_PATTERN__MAX_HOPS);

		expressionEClass = createEClass(EXPRESSION);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NAME);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);

		literalEClass = createEClass(LITERAL);

		stringLiteralEClass = createEClass(STRING_LITERAL);
		createEAttribute(stringLiteralEClass, STRING_LITERAL__VALUE);

		integerLiteralEClass = createEClass(INTEGER_LITERAL);
		createEAttribute(integerLiteralEClass, INTEGER_LITERAL__VALUE);

		floatLiteralEClass = createEClass(FLOAT_LITERAL);
		createEAttribute(floatLiteralEClass, FLOAT_LITERAL__VALUE);

		booleanLiteralEClass = createEClass(BOOLEAN_LITERAL);
		createEAttribute(booleanLiteralEClass, BOOLEAN_LITERAL__VALUE);

		nullLiteralEClass = createEClass(NULL_LITERAL);

		listLiteralEClass = createEClass(LIST_LITERAL);
		createEReference(listLiteralEClass, LIST_LITERAL__ELEMENTS);

		mapLiteralEClass = createEClass(MAP_LITERAL);
		createEReference(mapLiteralEClass, MAP_LITERAL__ENTRIES);

		mapEntryEClass = createEClass(MAP_ENTRY);
		createEAttribute(mapEntryEClass, MAP_ENTRY__KEY);
		createEReference(mapEntryEClass, MAP_ENTRY__VALUE);

		propertyAccessEClass = createEClass(PROPERTY_ACCESS);
		createEReference(propertyAccessEClass, PROPERTY_ACCESS__TARGET);
		createEAttribute(propertyAccessEClass, PROPERTY_ACCESS__PROPERTY_KEY);

		labelCheckEClass = createEClass(LABEL_CHECK);
		createEReference(labelCheckEClass, LABEL_CHECK__TARGET);
		createEReference(labelCheckEClass, LABEL_CHECK__LABEL_EXPRESSION);

		binaryExpressionEClass = createEClass(BINARY_EXPRESSION);
		createEAttribute(binaryExpressionEClass, BINARY_EXPRESSION__OPERATOR);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__LEFT);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__RIGHT);

		unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
		createEAttribute(unaryExpressionEClass, UNARY_EXPRESSION__OPERATOR);
		createEReference(unaryExpressionEClass, UNARY_EXPRESSION__OPERAND);

		functionInvocationEClass = createEClass(FUNCTION_INVOCATION);
		createEAttribute(functionInvocationEClass, FUNCTION_INVOCATION__NAMESPACE);
		createEAttribute(functionInvocationEClass, FUNCTION_INVOCATION__NAME);
		createEAttribute(functionInvocationEClass, FUNCTION_INVOCATION__DISTINCT);
		createEAttribute(functionInvocationEClass, FUNCTION_INVOCATION__STAR);
		createEReference(functionInvocationEClass, FUNCTION_INVOCATION__ARGUMENTS);

		caseExpressionEClass = createEClass(CASE_EXPRESSION);
		createEReference(caseExpressionEClass, CASE_EXPRESSION__SUBJECT);
		createEReference(caseExpressionEClass, CASE_EXPRESSION__ALTERNATIVES);
		createEReference(caseExpressionEClass, CASE_EXPRESSION__ELSE_EXPRESSION);

		caseAlternativeEClass = createEClass(CASE_ALTERNATIVE);
		createEReference(caseAlternativeEClass, CASE_ALTERNATIVE__CONDITION);
		createEReference(caseAlternativeEClass, CASE_ALTERNATIVE__RESULT);

		listComprehensionEClass = createEClass(LIST_COMPREHENSION);
		createEAttribute(listComprehensionEClass, LIST_COMPREHENSION__VARIABLE);
		createEReference(listComprehensionEClass, LIST_COMPREHENSION__LIST);
		createEReference(listComprehensionEClass, LIST_COMPREHENSION__WHERE);
		createEReference(listComprehensionEClass, LIST_COMPREHENSION__PROJECTION);

		patternComprehensionEClass = createEClass(PATTERN_COMPREHENSION);
		createEAttribute(patternComprehensionEClass, PATTERN_COMPREHENSION__VARIABLE);
		createEReference(patternComprehensionEClass, PATTERN_COMPREHENSION__PATTERN);
		createEReference(patternComprehensionEClass, PATTERN_COMPREHENSION__WHERE);
		createEReference(patternComprehensionEClass, PATTERN_COMPREHENSION__PROJECTION);

		quantifiedExpressionEClass = createEClass(QUANTIFIED_EXPRESSION);
		createEAttribute(quantifiedExpressionEClass, QUANTIFIED_EXPRESSION__QUANTIFIER);
		createEAttribute(quantifiedExpressionEClass, QUANTIFIED_EXPRESSION__VARIABLE);
		createEReference(quantifiedExpressionEClass, QUANTIFIED_EXPRESSION__LIST);
		createEReference(quantifiedExpressionEClass, QUANTIFIED_EXPRESSION__WHERE);

		existsExpressionEClass = createEClass(EXISTS_EXPRESSION);
		createEReference(existsExpressionEClass, EXISTS_EXPRESSION__PATTERN);
		createEReference(existsExpressionEClass, EXISTS_EXPRESSION__SUBQUERY);

		subscriptEClass = createEClass(SUBSCRIPT);
		createEReference(subscriptEClass, SUBSCRIPT__TARGET);
		createEReference(subscriptEClass, SUBSCRIPT__INDEX);

		sliceExpressionEClass = createEClass(SLICE_EXPRESSION);
		createEReference(sliceExpressionEClass, SLICE_EXPRESSION__TARGET);
		createEReference(sliceExpressionEClass, SLICE_EXPRESSION__FROM);
		createEReference(sliceExpressionEClass, SLICE_EXPRESSION__TO);

		cypherEvaluatorEClass = createEClass(CYPHER_EVALUATOR);
		createEReference(cypherEvaluatorEClass, CYPHER_EVALUATOR__STATEMENT);
		createEAttribute(cypherEvaluatorEClass, CYPHER_EVALUATOR__READ_ONLY);
		createEAttribute(cypherEvaluatorEClass, CYPHER_EVALUATOR__ROW_LIMIT);
		createEAttribute(cypherEvaluatorEClass, CYPHER_EVALUATOR__TIMEOUT);

		// Create enums
		dialectEEnum = createEEnum(DIALECT);
		sortDirectionEEnum = createEEnum(SORT_DIRECTION);
		mergeActionKindEEnum = createEEnum(MERGE_ACTION_KIND);
		pathSelectorEEnum = createEEnum(PATH_SELECTOR);
		directionEEnum = createEEnum(DIRECTION);
		binaryOperatorEEnum = createEEnum(BINARY_OPERATOR);
		unaryOperatorEEnum = createEEnum(UNARY_OPERATOR);
		quantifierEEnum = createEEnum(QUANTIFIER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NxcorePackage theNxcorePackage = (NxcorePackage)EPackage.Registry.INSTANCE.getEPackage(NxcorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cypherSourceEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		cypherElementEClass.getESuperTypes().add(theNxcorePackage.getMarked());
		statementEClass.getESuperTypes().add(this.getCypherElement());
		unparsedStatementEClass.getESuperTypes().add(this.getStatement());
		queryEClass.getESuperTypes().add(this.getStatement());
		singleQueryEClass.getESuperTypes().add(this.getQuery());
		unionEClass.getESuperTypes().add(this.getQuery());
		clauseEClass.getESuperTypes().add(this.getCypherElement());
		matchClauseEClass.getESuperTypes().add(this.getClause());
		projectionClauseEClass.getESuperTypes().add(this.getClause());
		returnClauseEClass.getESuperTypes().add(this.getProjectionClause());
		withClauseEClass.getESuperTypes().add(this.getProjectionClause());
		projectionItemEClass.getESuperTypes().add(this.getCypherElement());
		sortItemEClass.getESuperTypes().add(this.getCypherElement());
		unwindClauseEClass.getESuperTypes().add(this.getClause());
		createClauseEClass.getESuperTypes().add(this.getClause());
		mergeClauseEClass.getESuperTypes().add(this.getClause());
		mergeActionEClass.getESuperTypes().add(this.getCypherElement());
		setClauseEClass.getESuperTypes().add(this.getClause());
		setItemEClass.getESuperTypes().add(this.getCypherElement());
		setPropertyEClass.getESuperTypes().add(this.getSetItem());
		setVariableEClass.getESuperTypes().add(this.getSetItem());
		setLabelsEClass.getESuperTypes().add(this.getSetItem());
		removeClauseEClass.getESuperTypes().add(this.getClause());
		removeItemEClass.getESuperTypes().add(this.getCypherElement());
		removePropertyEClass.getESuperTypes().add(this.getRemoveItem());
		removeLabelsEClass.getESuperTypes().add(this.getRemoveItem());
		deleteClauseEClass.getESuperTypes().add(this.getClause());
		foreachClauseEClass.getESuperTypes().add(this.getClause());
		callClauseEClass.getESuperTypes().add(this.getClause());
		patternEClass.getESuperTypes().add(this.getCypherElement());
		patternPartEClass.getESuperTypes().add(this.getCypherElement());
		patternElementEClass.getESuperTypes().add(this.getCypherElement());
		nodePatternEClass.getESuperTypes().add(this.getPatternElement());
		labelExpressionEClass.getESuperTypes().add(this.getCypherElement());
		labelNameEClass.getESuperTypes().add(this.getLabelExpression());
		labelConjunctionEClass.getESuperTypes().add(this.getLabelExpression());
		labelDisjunctionEClass.getESuperTypes().add(this.getLabelExpression());
		labelNegationEClass.getESuperTypes().add(this.getLabelExpression());
		labelWildcardEClass.getESuperTypes().add(this.getLabelExpression());
		relationshipChainEClass.getESuperTypes().add(this.getPatternElement());
		relationshipPatternEClass.getESuperTypes().add(this.getPatternElement());
		expressionEClass.getESuperTypes().add(this.getCypherElement());
		variableEClass.getESuperTypes().add(this.getExpression());
		parameterEClass.getESuperTypes().add(this.getExpression());
		literalEClass.getESuperTypes().add(this.getExpression());
		stringLiteralEClass.getESuperTypes().add(this.getLiteral());
		integerLiteralEClass.getESuperTypes().add(this.getLiteral());
		floatLiteralEClass.getESuperTypes().add(this.getLiteral());
		booleanLiteralEClass.getESuperTypes().add(this.getLiteral());
		nullLiteralEClass.getESuperTypes().add(this.getLiteral());
		listLiteralEClass.getESuperTypes().add(this.getLiteral());
		mapLiteralEClass.getESuperTypes().add(this.getLiteral());
		mapEntryEClass.getESuperTypes().add(this.getCypherElement());
		propertyAccessEClass.getESuperTypes().add(this.getExpression());
		labelCheckEClass.getESuperTypes().add(this.getExpression());
		binaryExpressionEClass.getESuperTypes().add(this.getExpression());
		unaryExpressionEClass.getESuperTypes().add(this.getExpression());
		functionInvocationEClass.getESuperTypes().add(this.getExpression());
		caseExpressionEClass.getESuperTypes().add(this.getExpression());
		caseAlternativeEClass.getESuperTypes().add(this.getCypherElement());
		listComprehensionEClass.getESuperTypes().add(this.getExpression());
		patternComprehensionEClass.getESuperTypes().add(this.getExpression());
		quantifiedExpressionEClass.getESuperTypes().add(this.getExpression());
		existsExpressionEClass.getESuperTypes().add(this.getExpression());
		subscriptEClass.getESuperTypes().add(this.getExpression());
		sliceExpressionEClass.getESuperTypes().add(this.getExpression());
		cypherEvaluatorEClass.getESuperTypes().add(theNxcorePackage.getSourceEvaluator());

		// Initialize classes, features, and operations; add parameters
		initEClass(cypherSourceEClass, CypherSource.class, "CypherSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCypherSource_Source(), theEcorePackage.getEString(), "source", null, 0, 1, CypherSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCypherSource_Parsed(), theEcorePackage.getEBoolean(), "parsed", null, 0, 1, CypherSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCypherSource_Dialect(), this.getDialect(), "dialect", null, 0, 1, CypherSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCypherSource_Statements(), this.getStatement(), null, "statements", null, 0, -1, CypherSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cypherElementEClass, CypherElement.class, "CypherElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unparsedStatementEClass, UnparsedStatement.class, "UnparsedStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnparsedStatement_Text(), theEcorePackage.getEString(), "text", null, 0, 1, UnparsedStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnparsedStatement_Error(), theEcorePackage.getEString(), "error", null, 0, 1, UnparsedStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryEClass, Query.class, "Query", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuery_Explain(), theEcorePackage.getEBoolean(), "explain", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuery_Profile(), theEcorePackage.getEBoolean(), "profile", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleQueryEClass, SingleQuery.class, "SingleQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleQuery_Clauses(), this.getClause(), null, "clauses", null, 0, -1, SingleQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unionEClass, Union.class, "Union", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnion_All(), theEcorePackage.getEBoolean(), "all", null, 0, 1, Union.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnion_Operands(), this.getQuery(), null, "operands", null, 0, -1, Union.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clauseEClass, Clause.class, "Clause", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(matchClauseEClass, MatchClause.class, "MatchClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatchClause_Optional(), theEcorePackage.getEBoolean(), "optional", null, 0, 1, MatchClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatchClause_Pattern(), this.getPattern(), null, "pattern", null, 0, 1, MatchClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatchClause_Where(), this.getExpression(), null, "where", null, 0, 1, MatchClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectionClauseEClass, ProjectionClause.class, "ProjectionClause", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProjectionClause_Distinct(), theEcorePackage.getEBoolean(), "distinct", null, 0, 1, ProjectionClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectionClause_All(), theEcorePackage.getEBoolean(), "all", null, 0, 1, ProjectionClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjectionClause_Items(), this.getProjectionItem(), null, "items", null, 0, -1, ProjectionClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjectionClause_Order(), this.getSortItem(), null, "order", null, 0, -1, ProjectionClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjectionClause_Skip(), this.getExpression(), null, "skip", null, 0, 1, ProjectionClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjectionClause_Limit(), this.getExpression(), null, "limit", null, 0, 1, ProjectionClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnClauseEClass, ReturnClause.class, "ReturnClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(withClauseEClass, WithClause.class, "WithClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWithClause_Where(), this.getExpression(), null, "where", null, 0, 1, WithClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectionItemEClass, ProjectionItem.class, "ProjectionItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProjectionItem_Expression(), this.getExpression(), null, "expression", null, 0, 1, ProjectionItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectionItem_Alias(), theEcorePackage.getEString(), "alias", null, 0, 1, ProjectionItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sortItemEClass, SortItem.class, "SortItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSortItem_Expression(), this.getExpression(), null, "expression", null, 0, 1, SortItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortItem_Direction(), this.getSortDirection(), "direction", null, 0, 1, SortItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unwindClauseEClass, UnwindClause.class, "UnwindClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnwindClause_Expression(), this.getExpression(), null, "expression", null, 0, 1, UnwindClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnwindClause_Variable(), theEcorePackage.getEString(), "variable", null, 0, 1, UnwindClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createClauseEClass, CreateClause.class, "CreateClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreateClause_Pattern(), this.getPattern(), null, "pattern", null, 0, 1, CreateClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mergeClauseEClass, MergeClause.class, "MergeClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMergeClause_Pattern(), this.getPatternPart(), null, "pattern", null, 0, 1, MergeClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMergeClause_Actions(), this.getMergeAction(), null, "actions", null, 0, -1, MergeClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mergeActionEClass, MergeAction.class, "MergeAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMergeAction_Kind(), this.getMergeActionKind(), "kind", null, 0, 1, MergeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMergeAction_Set(), this.getSetClause(), null, "set", null, 0, 1, MergeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setClauseEClass, SetClause.class, "SetClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetClause_Items(), this.getSetItem(), null, "items", null, 0, -1, SetClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setItemEClass, SetItem.class, "SetItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setPropertyEClass, SetProperty.class, "SetProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetProperty_Property(), this.getPropertyAccess(), null, "property", null, 0, 1, SetProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetProperty_Value(), this.getExpression(), null, "value", null, 0, 1, SetProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setVariableEClass, SetVariable.class, "SetVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetVariable_Variable(), theEcorePackage.getEString(), "variable", null, 0, 1, SetVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetVariable_Value(), this.getExpression(), null, "value", null, 0, 1, SetVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetVariable_Merge(), theEcorePackage.getEBoolean(), "merge", null, 0, 1, SetVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setLabelsEClass, SetLabels.class, "SetLabels", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetLabels_Variable(), theEcorePackage.getEString(), "variable", null, 0, 1, SetLabels.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetLabels_Labels(), theEcorePackage.getEString(), "labels", null, 0, -1, SetLabels.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeClauseEClass, RemoveClause.class, "RemoveClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemoveClause_Items(), this.getRemoveItem(), null, "items", null, 0, -1, RemoveClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeItemEClass, RemoveItem.class, "RemoveItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removePropertyEClass, RemoveProperty.class, "RemoveProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemoveProperty_Property(), this.getPropertyAccess(), null, "property", null, 0, 1, RemoveProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeLabelsEClass, RemoveLabels.class, "RemoveLabels", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveLabels_Variable(), theEcorePackage.getEString(), "variable", null, 0, 1, RemoveLabels.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoveLabels_Labels(), theEcorePackage.getEString(), "labels", null, 0, -1, RemoveLabels.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteClauseEClass, DeleteClause.class, "DeleteClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeleteClause_Detach(), theEcorePackage.getEBoolean(), "detach", null, 0, 1, DeleteClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeleteClause_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, DeleteClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(foreachClauseEClass, ForeachClause.class, "ForeachClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForeachClause_Variable(), theEcorePackage.getEString(), "variable", null, 0, 1, ForeachClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForeachClause_Expression(), this.getExpression(), null, "expression", null, 0, 1, ForeachClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForeachClause_Clauses(), this.getClause(), null, "clauses", null, 0, -1, ForeachClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callClauseEClass, CallClause.class, "CallClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCallClause_Namespace(), theEcorePackage.getEString(), "namespace", null, 0, -1, CallClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallClause_Name(), theEcorePackage.getEString(), "name", null, 0, 1, CallClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallClause_Arguments(), this.getExpression(), null, "arguments", null, 0, -1, CallClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallClause_YieldItems(), this.getProjectionItem(), null, "yieldItems", null, 0, -1, CallClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallClause_Where(), this.getExpression(), null, "where", null, 0, 1, CallClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallClause_Subquery(), this.getQuery(), null, "subquery", null, 0, 1, CallClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternEClass, Pattern.class, "Pattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPattern_Parts(), this.getPatternPart(), null, "parts", null, 0, -1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternPartEClass, PatternPart.class, "PatternPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatternPart_Variable(), theEcorePackage.getEString(), "variable", null, 0, 1, PatternPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatternPart_Selector(), this.getPathSelector(), "selector", null, 0, 1, PatternPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternPart_Element(), this.getPatternElement(), null, "element", null, 0, 1, PatternPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternElementEClass, PatternElement.class, "PatternElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodePatternEClass, NodePattern.class, "NodePattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodePattern_Variable(), theEcorePackage.getEString(), "variable", null, 0, 1, NodePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodePattern_LabelExpression(), this.getLabelExpression(), null, "labelExpression", null, 0, 1, NodePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodePattern_Properties(), this.getExpression(), null, "properties", null, 0, 1, NodePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelExpressionEClass, LabelExpression.class, "LabelExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(labelNameEClass, LabelName.class, "LabelName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabelName_Name(), theEcorePackage.getEString(), "name", null, 0, 1, LabelName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelConjunctionEClass, LabelConjunction.class, "LabelConjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLabelConjunction_Operands(), this.getLabelExpression(), null, "operands", null, 0, -1, LabelConjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelDisjunctionEClass, LabelDisjunction.class, "LabelDisjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLabelDisjunction_Operands(), this.getLabelExpression(), null, "operands", null, 0, -1, LabelDisjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelNegationEClass, LabelNegation.class, "LabelNegation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLabelNegation_Operand(), this.getLabelExpression(), null, "operand", null, 0, 1, LabelNegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelWildcardEClass, LabelWildcard.class, "LabelWildcard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationshipChainEClass, RelationshipChain.class, "RelationshipChain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationshipChain_Left(), this.getPatternElement(), null, "left", null, 0, 1, RelationshipChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipChain_Relationship(), this.getRelationshipPattern(), null, "relationship", null, 0, 1, RelationshipChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipChain_Right(), this.getNodePattern(), null, "right", null, 0, 1, RelationshipChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipPatternEClass, RelationshipPattern.class, "RelationshipPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationshipPattern_Variable(), theEcorePackage.getEString(), "variable", null, 0, 1, RelationshipPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipPattern_TypeExpression(), this.getLabelExpression(), null, "typeExpression", null, 0, 1, RelationshipPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipPattern_Direction(), this.getDirection(), "direction", null, 0, 1, RelationshipPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipPattern_Properties(), this.getExpression(), null, "properties", null, 0, 1, RelationshipPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipPattern_VariableLength(), theEcorePackage.getEBoolean(), "variableLength", null, 0, 1, RelationshipPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipPattern_MinHops(), theEcorePackage.getEInt(), "minHops", "-1", 0, 1, RelationshipPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipPattern_MaxHops(), theEcorePackage.getEInt(), "maxHops", "-1", 0, 1, RelationshipPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalEClass, Literal.class, "Literal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringLiteral_Value(), theEcorePackage.getEString(), "value", null, 0, 1, StringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerLiteralEClass, IntegerLiteral.class, "IntegerLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerLiteral_Value(), theEcorePackage.getELong(), "value", null, 0, 1, IntegerLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(floatLiteralEClass, FloatLiteral.class, "FloatLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloatLiteral_Value(), theEcorePackage.getEDouble(), "value", null, 0, 1, FloatLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanLiteralEClass, BooleanLiteral.class, "BooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanLiteral_Value(), theEcorePackage.getEBoolean(), "value", null, 0, 1, BooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nullLiteralEClass, NullLiteral.class, "NullLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listLiteralEClass, ListLiteral.class, "ListLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListLiteral_Elements(), this.getExpression(), null, "elements", null, 0, -1, ListLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapLiteralEClass, MapLiteral.class, "MapLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapLiteral_Entries(), this.getMapEntry(), null, "entries", null, 0, -1, MapLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapEntryEClass, MapEntry.class, "MapEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapEntry_Key(), theEcorePackage.getEString(), "key", null, 0, 1, MapEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapEntry_Value(), this.getExpression(), null, "value", null, 0, 1, MapEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyAccessEClass, PropertyAccess.class, "PropertyAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyAccess_Target(), this.getExpression(), null, "target", null, 0, 1, PropertyAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyAccess_PropertyKey(), theEcorePackage.getEString(), "propertyKey", null, 0, 1, PropertyAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelCheckEClass, LabelCheck.class, "LabelCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLabelCheck_Target(), this.getExpression(), null, "target", null, 0, 1, LabelCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabelCheck_LabelExpression(), this.getLabelExpression(), null, "labelExpression", null, 0, 1, LabelCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryExpressionEClass, BinaryExpression.class, "BinaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryExpression_Operator(), this.getBinaryOperator(), "operator", null, 0, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExpression_Left(), this.getExpression(), null, "left", null, 0, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExpression_Right(), this.getExpression(), null, "right", null, 0, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnaryExpression_Operator(), this.getUnaryOperator(), "operator", null, 0, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnaryExpression_Operand(), this.getExpression(), null, "operand", null, 0, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionInvocationEClass, FunctionInvocation.class, "FunctionInvocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionInvocation_Namespace(), theEcorePackage.getEString(), "namespace", null, 0, -1, FunctionInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionInvocation_Name(), theEcorePackage.getEString(), "name", null, 0, 1, FunctionInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionInvocation_Distinct(), theEcorePackage.getEBoolean(), "distinct", null, 0, 1, FunctionInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionInvocation_Star(), theEcorePackage.getEBoolean(), "star", null, 0, 1, FunctionInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionInvocation_Arguments(), this.getExpression(), null, "arguments", null, 0, -1, FunctionInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caseExpressionEClass, CaseExpression.class, "CaseExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCaseExpression_Subject(), this.getExpression(), null, "subject", null, 0, 1, CaseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaseExpression_Alternatives(), this.getCaseAlternative(), null, "alternatives", null, 0, -1, CaseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaseExpression_ElseExpression(), this.getExpression(), null, "elseExpression", null, 0, 1, CaseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caseAlternativeEClass, CaseAlternative.class, "CaseAlternative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCaseAlternative_Condition(), this.getExpression(), null, "condition", null, 0, 1, CaseAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaseAlternative_Result(), this.getExpression(), null, "result", null, 0, 1, CaseAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listComprehensionEClass, ListComprehension.class, "ListComprehension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListComprehension_Variable(), theEcorePackage.getEString(), "variable", null, 0, 1, ListComprehension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListComprehension_List(), this.getExpression(), null, "list", null, 0, 1, ListComprehension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListComprehension_Where(), this.getExpression(), null, "where", null, 0, 1, ListComprehension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListComprehension_Projection(), this.getExpression(), null, "projection", null, 0, 1, ListComprehension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternComprehensionEClass, PatternComprehension.class, "PatternComprehension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatternComprehension_Variable(), theEcorePackage.getEString(), "variable", null, 0, 1, PatternComprehension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternComprehension_Pattern(), this.getPatternElement(), null, "pattern", null, 0, 1, PatternComprehension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternComprehension_Where(), this.getExpression(), null, "where", null, 0, 1, PatternComprehension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternComprehension_Projection(), this.getExpression(), null, "projection", null, 0, 1, PatternComprehension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantifiedExpressionEClass, QuantifiedExpression.class, "QuantifiedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuantifiedExpression_Quantifier(), this.getQuantifier(), "quantifier", null, 0, 1, QuantifiedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantifiedExpression_Variable(), theEcorePackage.getEString(), "variable", null, 0, 1, QuantifiedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantifiedExpression_List(), this.getExpression(), null, "list", null, 0, 1, QuantifiedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantifiedExpression_Where(), this.getExpression(), null, "where", null, 0, 1, QuantifiedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(existsExpressionEClass, ExistsExpression.class, "ExistsExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExistsExpression_Pattern(), this.getPatternElement(), null, "pattern", null, 0, 1, ExistsExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExistsExpression_Subquery(), this.getQuery(), null, "subquery", null, 0, 1, ExistsExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subscriptEClass, Subscript.class, "Subscript", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubscript_Target(), this.getExpression(), null, "target", null, 0, 1, Subscript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubscript_Index(), this.getExpression(), null, "index", null, 0, 1, Subscript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sliceExpressionEClass, SliceExpression.class, "SliceExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSliceExpression_Target(), this.getExpression(), null, "target", null, 0, 1, SliceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSliceExpression_From(), this.getExpression(), null, "from", null, 0, 1, SliceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSliceExpression_To(), this.getExpression(), null, "to", null, 0, 1, SliceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cypherEvaluatorEClass, CypherEvaluator.class, "CypherEvaluator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCypherEvaluator_Statement(), this.getStatement(), null, "statement", null, 0, 1, CypherEvaluator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCypherEvaluator_ReadOnly(), theEcorePackage.getEBoolean(), "readOnly", "true", 0, 1, CypherEvaluator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCypherEvaluator_RowLimit(), theEcorePackage.getEInt(), "rowLimit", "-1", 0, 1, CypherEvaluator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCypherEvaluator_Timeout(), theEcorePackage.getEInt(), "timeout", "-1", 0, 1, CypherEvaluator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dialectEEnum, Dialect.class, "Dialect");
		addEEnumLiteral(dialectEEnum, Dialect.OPEN_CYPHER_9);
		addEEnumLiteral(dialectEEnum, Dialect.OPEN_CYPHER_2024);
		addEEnumLiteral(dialectEEnum, Dialect.NEO4J);
		addEEnumLiteral(dialectEEnum, Dialect.GQL);
		addEEnumLiteral(dialectEEnum, Dialect.OTHER);

		initEEnum(sortDirectionEEnum, SortDirection.class, "SortDirection");
		addEEnumLiteral(sortDirectionEEnum, SortDirection.ASCENDING);
		addEEnumLiteral(sortDirectionEEnum, SortDirection.DESCENDING);

		initEEnum(mergeActionKindEEnum, MergeActionKind.class, "MergeActionKind");
		addEEnumLiteral(mergeActionKindEEnum, MergeActionKind.ON_CREATE);
		addEEnumLiteral(mergeActionKindEEnum, MergeActionKind.ON_MATCH);

		initEEnum(pathSelectorEEnum, PathSelector.class, "PathSelector");
		addEEnumLiteral(pathSelectorEEnum, PathSelector.NONE);
		addEEnumLiteral(pathSelectorEEnum, PathSelector.SHORTEST);
		addEEnumLiteral(pathSelectorEEnum, PathSelector.ALL_SHORTEST);

		initEEnum(directionEEnum, Direction.class, "Direction");
		addEEnumLiteral(directionEEnum, Direction.OUTGOING);
		addEEnumLiteral(directionEEnum, Direction.INCOMING);
		addEEnumLiteral(directionEEnum, Direction.UNDIRECTED);

		initEEnum(binaryOperatorEEnum, BinaryOperator.class, "BinaryOperator");
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.PLUS);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.MINUS);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.MULTIPLY);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.DIVIDE);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.MODULO);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.POWER);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.EQUAL);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.NOT_EQUAL);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.LESS);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.LESS_OR_EQUAL);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.GREATER);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.GREATER_OR_EQUAL);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.AND);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.OR);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.XOR);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.IN);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.STARTS_WITH);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.ENDS_WITH);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.CONTAINS);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.MATCHES);

		initEEnum(unaryOperatorEEnum, UnaryOperator.class, "UnaryOperator");
		addEEnumLiteral(unaryOperatorEEnum, UnaryOperator.NOT);
		addEEnumLiteral(unaryOperatorEEnum, UnaryOperator.NEGATE);
		addEEnumLiteral(unaryOperatorEEnum, UnaryOperator.IS_NULL);
		addEEnumLiteral(unaryOperatorEEnum, UnaryOperator.IS_NOT_NULL);

		initEEnum(quantifierEEnum, Quantifier.class, "Quantifier");
		addEEnumLiteral(quantifierEEnum, Quantifier.ALL);
		addEEnumLiteral(quantifierEEnum, Quantifier.ANY);
		addEEnumLiteral(quantifierEEnum, Quantifier.NONE);
		addEEnumLiteral(quantifierEEnum, Quantifier.SINGLE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "modelDirectory", "/model/src-gen",
			   "featureDelegation", "Dynamic",
			   "complianceLevel", "25",
			   "suppressGenModelAnnotations", "false",
			   "copyrightFields", "false",
			   "operationReflection", "true",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.models"
		   });
		addAnnotation
		  (dialectEEnum,
		   source,
		   new String[] {
			   "documentation", " ===========================================================================\nROOT AND STATEMENTS\n==========================================================================="
		   });
		addAnnotation
		  (dialectEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", " openCypher 9, the baseline this model tracks and the one the TCK tests."
		   });
		addAnnotation
		  (dialectEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "The openCypher 2024 series, which added label expressions, quantified path\npatterns and SHORTEST while aligning with GQL. The grammar\'s on-ramp to the\nstandard, and the reason label matching is an expression tree here."
		   });
		addAnnotation
		  (dialectEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", " Neo4j\'s own Cypher, which has diverged since openCypher 9."
		   });
		addAnnotation
		  (dialectEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", " ISO/IEC 39075 GQL."
		   });
		addAnnotation
		  (dialectEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", " Memgraph, Apache AGE, Neptune openCypher and everything else."
		   });
		addAnnotation
		  (cypherSourceEClass,
		   source,
		   new String[] {
			   "documentation", "The contents of a .cypher resource: an ordered list of statements plus the text\nthey were parsed from. The text is kept so that a resource which was only\npartly understood can still be saved unchanged, and so that a statement can be\nshown to a reader exactly as its author wrote it."
		   });
		addAnnotation
		  (getCypherSource_Source(),
		   source,
		   new String[] {
			   "documentation", " The verbatim source, retained for lossless save and for display."
		   });
		addAnnotation
		  (getCypherSource_Parsed(),
		   source,
		   new String[] {
			   "documentation", " False when at least one statement is an UnparsedStatement."
		   });
		addAnnotation
		  (cypherElementEClass,
		   source,
		   new String[] {
			   "documentation", "The shared base of every AST node. Marked gives each node the NxCore marker\nlist, which is where line, column and source location live, so diagnostics and\ngenerated documentation can point at the character a construct came from."
		   });
		addAnnotation
		  (statementEClass,
		   source,
		   new String[] {
			   "documentation", "One statement, normally one semicolon-delimited unit of a .cypher file."
		   });
		addAnnotation
		  (unparsedStatementEClass,
		   source,
		   new String[] {
			   "documentation", "A statement the parser could not handle. Keeping the text and the error is what\nmakes per-statement tolerance work: one unusual construct costs one statement,\nnot the whole file."
		   });
		addAnnotation
		  (queryEClass,
		   source,
		   new String[] {
			   "documentation", "A query: either a single linear sequence of clauses or a union of them.\nEXPLAIN and PROFILE are recorded as flags rather than as wrapper statements,\nsince they change how a query is executed and not what it means."
		   });
		addAnnotation
		  (singleQueryEClass,
		   source,
		   new String[] {
			   "documentation", "A linear query: clauses applied in order, each consuming the rows the previous\none produced. That ordering is the whole execution model of Cypher and is why\nthe clause list is ordered containment rather than a set of features."
		   });
		addAnnotation
		  (unionEClass,
		   source,
		   new String[] {
			   "documentation", "UNION and UNION ALL over two or more operands. Flattened rather than nested to\nthe left, because Cypher\'s union is associative and a flat list is what both\nreaders and planners want."
		   });
		addAnnotation
		  (getUnion_All(),
		   source,
		   new String[] {
			   "documentation", " UNION ALL when true, UNION (distinct) when false."
		   });
		addAnnotation
		  (clauseEClass,
		   source,
		   new String[] {
			   "documentation", " ===========================================================================\nCLAUSES\n==========================================================================="
		   });
		addAnnotation
		  (matchClauseEClass,
		   source,
		   new String[] {
			   "documentation", "MATCH and OPTIONAL MATCH. The pattern is the interesting part: it is a graph\npattern to be matched, which is the same thing a transformation language calls\na match morphism, and it is what makes a Cypher write statement analyzable in a\nway a script never is."
		   });
		addAnnotation
		  (projectionClauseEClass,
		   source,
		   new String[] {
			   "documentation", "The shared shape of RETURN and WITH: a projection, optionally distinct,\noptionally ordered, skipped and limited. Keeping them one class makes the\nevaluator\'s projection code single-sourced, which matters because this is where\naggregation is detected and where the pipeline breaks."
		   });
		addAnnotation
		  (getProjectionClause_All(),
		   source,
		   new String[] {
			   "documentation", " RETURN * and WITH *: project everything currently in scope."
		   });
		addAnnotation
		  (returnClauseEClass,
		   source,
		   new String[] {
			   "documentation", "The final projection of a query. What a RETURN produces is a table of values,\nnot a graph: Cypher has no CONSTRUCT clause, which is the most consequential gap\nwhen Cypher is used to produce model contents rather than to answer a question.\nSee readme.md for how that is addressed."
		   });
		addAnnotation
		  (withClauseEClass,
		   source,
		   new String[] {
			   "documentation", "An intermediate projection which also opens a new scope. WITH is where a Cypher\nquery is segmented, and the optional WHERE after it is the only way to filter on\nan aggregate."
		   });
		addAnnotation
		  (getProjectionItem_Alias(),
		   source,
		   new String[] {
			   "documentation", " The AS name, or null when the expression\'s own text is the column name."
		   });
		addAnnotation
		  (unwindClauseEClass,
		   source,
		   new String[] {
			   "documentation", "UNWIND: turns a list into rows. The cheapest way to feed external data into a\nquery, and the clause a generated or parameterized query uses most."
		   });
		addAnnotation
		  (createClauseEClass,
		   source,
		   new String[] {
			   "documentation", "CREATE. A created object goes into the resource contents unless something in the\nsame statement contains it, which is how the Draw.io loader already behaves and\nhow an EMF resource already works. Because the pipeline is lazy, attachment\nhappens at commit rather than at creation: created objects are pending until the\nstatement completes, so a failed statement leaves nothing behind and the recorded\nchange is one coherent change rather than a create followed by a move."
		   });
		addAnnotation
		  (mergeClauseEClass,
		   source,
		   new String[] {
			   "documentation", "MERGE: match the pattern or create it, with actions that fire on whichever\nhappened. Against a model whose identity is the NxCore URI scheme this is the\nnatural idempotent upsert, and it is what makes repeated application of the same\nauthored statement safe."
		   });
		addAnnotation
		  (setClauseEClass,
		   source,
		   new String[] {
			   "documentation", "SET: assign properties, replace or merge property maps, add labels."
		   });
		addAnnotation
		  (setPropertyEClass,
		   source,
		   new String[] {
			   "documentation", " n.prop = expression"
		   });
		addAnnotation
		  (setVariableEClass,
		   source,
		   new String[] {
			   "documentation", " n = map (replace) or n += map (merge)."
		   });
		addAnnotation
		  (getSetVariable_Merge(),
		   source,
		   new String[] {
			   "documentation", " True for +=, false for =."
		   });
		addAnnotation
		  (setLabelsEClass,
		   source,
		   new String[] {
			   "documentation", " n:Label:OtherLabel"
		   });
		addAnnotation
		  (removeClauseEClass,
		   source,
		   new String[] {
			   "documentation", "REMOVE: the inverse of the additive half of SET."
		   });
		addAnnotation
		  (deleteClauseEClass,
		   source,
		   new String[] {
			   "documentation", "DELETE and DETACH DELETE. The distinction maps cleanly onto EMF: plain DELETE\nrefuses to strand references, DETACH DELETE is EcoreUtil.delete with cross\nreferences cleaned up."
		   });
		addAnnotation
		  (foreachClauseEClass,
		   source,
		   new String[] {
			   "documentation", "FOREACH: the only place openCypher 9 allows updating clauses inside an\nexpression-driven iteration."
		   });
		addAnnotation
		  (callClauseEClass,
		   source,
		   new String[] {
			   "documentation", "CALL, in both of its forms: a procedure call with YIELD, and (an extension\nbeyond openCypher 9) a subquery. A procedure call is the extension point where\nan engine exposes host capabilities to a query, which for a Nasdanika engine is\nhow a query reaches capabilities, evaluators and loaded resources."
		   });
		addAnnotation
		  (getCallClause_Namespace(),
		   source,
		   new String[] {
			   "documentation", " The dotted namespace of a procedure, e.g. db, apoc, nasdanika."
		   });
		addAnnotation
		  (getCallClause_Subquery(),
		   source,
		   new String[] {
			   "documentation", " CALL { ... }: post openCypher 9."
		   });
		addAnnotation
		  (patternEClass,
		   source,
		   new String[] {
			   "documentation", " ===========================================================================\nPATTERNS\n==========================================================================="
		   });
		addAnnotation
		  (pathSelectorEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", " The plain case: every match."
		   });
		addAnnotation
		  (patternPartEClass,
		   source,
		   new String[] {
			   "documentation", "One pattern, optionally bound to a path variable and optionally wrapped in a\nshortest-path selector."
		   });
		addAnnotation
		  (getPatternPart_Variable(),
		   source,
		   new String[] {
			   "documentation", " p in p = (a)-[:knows]->(b)"
		   });
		addAnnotation
		  (nodePatternEClass,
		   source,
		   new String[] {
			   "documentation", "(variable:Label {property: value}). Against an EMF graph, labels are the EClass\nname and the names of all of its supertypes, so a pattern can match at any level\nof the type hierarchy without the query knowing the hierarchy."
		   });
		addAnnotation
		  (getNodePattern_LabelExpression(),
		   source,
		   new String[] {
			   "documentation", " Null matches any label. openCypher 9\'s :A:B loads as a Conjunction."
		   });
		addAnnotation
		  (getNodePattern_Properties(),
		   source,
		   new String[] {
			   "documentation", " A MapLiteral or a Parameter."
		   });
		addAnnotation
		  (labelExpressionEClass,
		   source,
		   new String[] {
			   "documentation", "How a pattern selects labels or relationship types.\n\nopenCypher 9 needs almost none of this: a node pattern carries a conjunction of\nlabel names and a relationship pattern carries a disjunction of type names, which\ntwo string lists would have expressed. The tree is here anyway because it is the\none part of the language where the direction of travel is known to be\nnon-additive. openCypher 2024.2 introduced label expressions with &, |, ! and %,\nand GQL has them, so a String[] would have to be replaced rather than extended,\nand label matching appears in every query ever written against this model.\n\nEverything else the 2024 series added is additive (quantified path patterns are\none new PatternElement subclass, SHORTEST is one more PathSelector literal) and is\ndeliberately left for when it is needed."
		   });
		addAnnotation
		  (labelNameEClass,
		   source,
		   new String[] {
			   "documentation", " A single label or relationship type name."
		   });
		addAnnotation
		  (labelConjunctionEClass,
		   source,
		   new String[] {
			   "documentation", " :A:B in openCypher 9, :A&B in 2024.2 and later."
		   });
		addAnnotation
		  (labelDisjunctionEClass,
		   source,
		   new String[] {
			   "documentation", " :A|B"
		   });
		addAnnotation
		  (labelNegationEClass,
		   source,
		   new String[] {
			   "documentation", " :!A"
		   });
		addAnnotation
		  (labelWildcardEClass,
		   source,
		   new String[] {
			   "documentation", " :% - any label. Distinct from a null expression, which is \"label not constrained\"."
		   });
		addAnnotation
		  (relationshipChainEClass,
		   source,
		   new String[] {
			   "documentation", "A pattern element extended by one relationship and one node: (left)-[rel]->(right).\nLeft-nested so that a chain of any length has one shape."
		   });
		addAnnotation
		  (directionEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", " -[]-: matches either direction."
		   });
		addAnnotation
		  (relationshipPatternEClass,
		   source,
		   new String[] {
			   "documentation", "The relationship half of a pattern. Against an EMF graph a relationship type is\nan EReference name. EReferenceConnection carries the reference and its index and\nis Comparable, so matches come back in model order by default and r.index is\navailable for a query that wants to say so; a property graph has neither."
		   });
		addAnnotation
		  (getRelationshipPattern_TypeExpression(),
		   source,
		   new String[] {
			   "documentation", " Null matches any type. openCypher 9\'s [:knows|:follows] loads as a Disjunction."
		   });
		addAnnotation
		  (getRelationshipPattern_VariableLength(),
		   source,
		   new String[] {
			   "documentation", " True for *, *2, *1..5 and friends."
		   });
		addAnnotation
		  (getRelationshipPattern_MinHops(),
		   source,
		   new String[] {
			   "documentation", " Lower bound of a variable length pattern, -1 when unspecified."
		   });
		addAnnotation
		  (getRelationshipPattern_MaxHops(),
		   source,
		   new String[] {
			   "documentation", " Upper bound of a variable length pattern, -1 when unbounded."
		   });
		addAnnotation
		  (expressionEClass,
		   source,
		   new String[] {
			   "documentation", " ===========================================================================\nEXPRESSIONS\n==========================================================================="
		   });
		addAnnotation
		  (parameterEClass,
		   source,
		   new String[] {
			   "documentation", "$name. Parameters are the boundary between an authored statement and its\nbindings, which is what lets one statement be a reusable, reviewable artifact\nrather than a string built at runtime. An engine should refuse concatenated\nstatements as an input path for the same reason JDBC did."
		   });
		addAnnotation
		  (propertyAccessEClass,
		   source,
		   new String[] {
			   "documentation", "n.property, and also map.key. Held as its own class rather than as a binary\noperator because property access is the thing static analysis most wants to\nenumerate: which properties does this statement read, and which does it write."
		   });
		addAnnotation
		  (labelCheckEClass,
		   source,
		   new String[] {
			   "documentation", "n:Label, as a predicate rather than as part of a pattern."
		   });
		addAnnotation
		  (binaryOperatorEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", " Arithmetic, and string and list concatenation."
		   });
		addAnnotation
		  (binaryOperatorEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "documentation", " Comparison."
		   });
		addAnnotation
		  (binaryOperatorEEnum.getELiterals().get(12),
		   source,
		   new String[] {
			   "documentation", " Boolean."
		   });
		addAnnotation
		  (binaryOperatorEEnum.getELiterals().get(15),
		   source,
		   new String[] {
			   "documentation", " Membership and string predicates."
		   });
		addAnnotation
		  (binaryOperatorEEnum.getELiterals().get(19),
		   source,
		   new String[] {
			   "documentation", " The regular expression operator, =~"
		   });
		addAnnotation
		  (unaryOperatorEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", " Unary minus."
		   });
		addAnnotation
		  (functionInvocationEClass,
		   source,
		   new String[] {
			   "documentation", "A function call, including aggregating functions. Whether a function aggregates\nis a property of the function rather than of the syntax, which is why there is\nno separate aggregation class: the engine\'s function registry decides, and that\nregistry is the other extension point besides procedures."
		   });
		addAnnotation
		  (getFunctionInvocation_Distinct(),
		   source,
		   new String[] {
			   "documentation", " count(DISTINCT x)"
		   });
		addAnnotation
		  (getFunctionInvocation_Star(),
		   source,
		   new String[] {
			   "documentation", " count(*)"
		   });
		addAnnotation
		  (getCaseExpression_Subject(),
		   source,
		   new String[] {
			   "documentation", " The simple form\'s subject: CASE x WHEN ... . Null for the generic form."
		   });
		addAnnotation
		  (listComprehensionEClass,
		   source,
		   new String[] {
			   "documentation", " [x IN list WHERE predicate | projection]"
		   });
		addAnnotation
		  (patternComprehensionEClass,
		   source,
		   new String[] {
			   "documentation", " [(a)-[:knows]->(b) WHERE ... | b.name]"
		   });
		addAnnotation
		  (quantifiedExpressionEClass,
		   source,
		   new String[] {
			   "documentation", " all(x IN list WHERE predicate) and its siblings."
		   });
		addAnnotation
		  (existsExpressionEClass,
		   source,
		   new String[] {
			   "documentation", "EXISTS. The pattern form is openCypher 9; the subquery form is an extension."
		   });
		addAnnotation
		  (subscriptEClass,
		   source,
		   new String[] {
			   "documentation", " list[index]"
		   });
		addAnnotation
		  (sliceExpressionEClass,
		   source,
		   new String[] {
			   "documentation", " list[from..to], either bound optional."
		   });
		addAnnotation
		  (cypherEvaluatorEClass,
		   source,
		   new String[] {
			   "documentation", " ===========================================================================\nEVALUATOR\n==========================================================================="
		   });
		addAnnotation
		  (getCypherEvaluator_Statement(),
		   source,
		   new String[] {
			   "documentation", " The parsed statement. Derived from the inherited source when not set directly."
		   });
		addAnnotation
		  (getCypherEvaluator_ReadOnly(),
		   source,
		   new String[] {
			   "documentation", "When true the engine rejects CREATE, MERGE, SET, REMOVE, DELETE and any\nprocedure not declared read-only. This is the flag a data pack loader checks,\nand the default is the safe one."
		   });
		addAnnotation
		  (getCypherEvaluator_RowLimit(),
		   source,
		   new String[] {
			   "documentation", "Maximum number of rows the engine will produce before failing. A guard rather\nthan a tuning knob: an unconstrained join in a generated query is a hang, and\na hang in a documentation build is indistinguishable from a broken build.\n-1 means the engine\'s default."
		   });
		addAnnotation
		  (getCypherEvaluator_Timeout(),
		   source,
		   new String[] {
			   "documentation", " Evaluation timeout in milliseconds, -1 for the engine\'s default."
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore",
			   "GenModel", "http://www.eclipse.org/emf/2002/GenModel",
			   "Nasdanika", "urn:org.nasdanika"
		   });
	}

} //CypherPackageImpl
