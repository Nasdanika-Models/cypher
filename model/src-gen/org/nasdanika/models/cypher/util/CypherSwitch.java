/**
 */
package org.nasdanika.models.cypher.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.models.cypher.*;

import org.nasdanika.models.nxcore.Documented;
import org.nasdanika.models.nxcore.Evaluator;
import org.nasdanika.models.nxcore.Marked;
import org.nasdanika.models.nxcore.ModelElement;
import org.nasdanika.models.nxcore.Referrable;
import org.nasdanika.models.nxcore.SourceEvaluator;
import org.nasdanika.models.nxcore.StringIdentity;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.cypher.CypherPackage
 * @generated
 */
public class CypherSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CypherPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CypherSwitch() {
		if (modelPackage == null) {
			modelPackage = CypherPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CypherPackage.CYPHER_SOURCE: {
				CypherSource cypherSource = (CypherSource)theEObject;
				T result = caseCypherSource(cypherSource);
				if (result == null) result = caseModelElement(cypherSource);
				if (result == null) result = caseStringIdentity(cypherSource);
				if (result == null) result = caseDocumented(cypherSource);
				if (result == null) result = caseMarked(cypherSource);
				if (result == null) result = caseReferrable(cypherSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.CYPHER_ELEMENT: {
				CypherElement cypherElement = (CypherElement)theEObject;
				T result = caseCypherElement(cypherElement);
				if (result == null) result = caseMarked(cypherElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				T result = caseStatement(statement);
				if (result == null) result = caseCypherElement(statement);
				if (result == null) result = caseMarked(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.UNPARSED_STATEMENT: {
				UnparsedStatement unparsedStatement = (UnparsedStatement)theEObject;
				T result = caseUnparsedStatement(unparsedStatement);
				if (result == null) result = caseStatement(unparsedStatement);
				if (result == null) result = caseCypherElement(unparsedStatement);
				if (result == null) result = caseMarked(unparsedStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.QUERY: {
				Query query = (Query)theEObject;
				T result = caseQuery(query);
				if (result == null) result = caseStatement(query);
				if (result == null) result = caseCypherElement(query);
				if (result == null) result = caseMarked(query);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.SINGLE_QUERY: {
				SingleQuery singleQuery = (SingleQuery)theEObject;
				T result = caseSingleQuery(singleQuery);
				if (result == null) result = caseQuery(singleQuery);
				if (result == null) result = caseStatement(singleQuery);
				if (result == null) result = caseCypherElement(singleQuery);
				if (result == null) result = caseMarked(singleQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.UNION: {
				Union union = (Union)theEObject;
				T result = caseUnion(union);
				if (result == null) result = caseQuery(union);
				if (result == null) result = caseStatement(union);
				if (result == null) result = caseCypherElement(union);
				if (result == null) result = caseMarked(union);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.CLAUSE: {
				Clause clause = (Clause)theEObject;
				T result = caseClause(clause);
				if (result == null) result = caseCypherElement(clause);
				if (result == null) result = caseMarked(clause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.MATCH_CLAUSE: {
				MatchClause matchClause = (MatchClause)theEObject;
				T result = caseMatchClause(matchClause);
				if (result == null) result = caseClause(matchClause);
				if (result == null) result = caseCypherElement(matchClause);
				if (result == null) result = caseMarked(matchClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.PROJECTION_CLAUSE: {
				ProjectionClause projectionClause = (ProjectionClause)theEObject;
				T result = caseProjectionClause(projectionClause);
				if (result == null) result = caseClause(projectionClause);
				if (result == null) result = caseCypherElement(projectionClause);
				if (result == null) result = caseMarked(projectionClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.RETURN_CLAUSE: {
				ReturnClause returnClause = (ReturnClause)theEObject;
				T result = caseReturnClause(returnClause);
				if (result == null) result = caseProjectionClause(returnClause);
				if (result == null) result = caseClause(returnClause);
				if (result == null) result = caseCypherElement(returnClause);
				if (result == null) result = caseMarked(returnClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.WITH_CLAUSE: {
				WithClause withClause = (WithClause)theEObject;
				T result = caseWithClause(withClause);
				if (result == null) result = caseProjectionClause(withClause);
				if (result == null) result = caseClause(withClause);
				if (result == null) result = caseCypherElement(withClause);
				if (result == null) result = caseMarked(withClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.PROJECTION_ITEM: {
				ProjectionItem projectionItem = (ProjectionItem)theEObject;
				T result = caseProjectionItem(projectionItem);
				if (result == null) result = caseCypherElement(projectionItem);
				if (result == null) result = caseMarked(projectionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.SORT_ITEM: {
				SortItem sortItem = (SortItem)theEObject;
				T result = caseSortItem(sortItem);
				if (result == null) result = caseCypherElement(sortItem);
				if (result == null) result = caseMarked(sortItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.UNWIND_CLAUSE: {
				UnwindClause unwindClause = (UnwindClause)theEObject;
				T result = caseUnwindClause(unwindClause);
				if (result == null) result = caseClause(unwindClause);
				if (result == null) result = caseCypherElement(unwindClause);
				if (result == null) result = caseMarked(unwindClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.CREATE_CLAUSE: {
				CreateClause createClause = (CreateClause)theEObject;
				T result = caseCreateClause(createClause);
				if (result == null) result = caseClause(createClause);
				if (result == null) result = caseCypherElement(createClause);
				if (result == null) result = caseMarked(createClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.MERGE_CLAUSE: {
				MergeClause mergeClause = (MergeClause)theEObject;
				T result = caseMergeClause(mergeClause);
				if (result == null) result = caseClause(mergeClause);
				if (result == null) result = caseCypherElement(mergeClause);
				if (result == null) result = caseMarked(mergeClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.MERGE_ACTION: {
				MergeAction mergeAction = (MergeAction)theEObject;
				T result = caseMergeAction(mergeAction);
				if (result == null) result = caseCypherElement(mergeAction);
				if (result == null) result = caseMarked(mergeAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.SET_CLAUSE: {
				SetClause setClause = (SetClause)theEObject;
				T result = caseSetClause(setClause);
				if (result == null) result = caseClause(setClause);
				if (result == null) result = caseCypherElement(setClause);
				if (result == null) result = caseMarked(setClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.SET_ITEM: {
				SetItem setItem = (SetItem)theEObject;
				T result = caseSetItem(setItem);
				if (result == null) result = caseCypherElement(setItem);
				if (result == null) result = caseMarked(setItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.SET_PROPERTY: {
				SetProperty setProperty = (SetProperty)theEObject;
				T result = caseSetProperty(setProperty);
				if (result == null) result = caseSetItem(setProperty);
				if (result == null) result = caseCypherElement(setProperty);
				if (result == null) result = caseMarked(setProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.SET_VARIABLE: {
				SetVariable setVariable = (SetVariable)theEObject;
				T result = caseSetVariable(setVariable);
				if (result == null) result = caseSetItem(setVariable);
				if (result == null) result = caseCypherElement(setVariable);
				if (result == null) result = caseMarked(setVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.SET_LABELS: {
				SetLabels setLabels = (SetLabels)theEObject;
				T result = caseSetLabels(setLabels);
				if (result == null) result = caseSetItem(setLabels);
				if (result == null) result = caseCypherElement(setLabels);
				if (result == null) result = caseMarked(setLabels);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.REMOVE_CLAUSE: {
				RemoveClause removeClause = (RemoveClause)theEObject;
				T result = caseRemoveClause(removeClause);
				if (result == null) result = caseClause(removeClause);
				if (result == null) result = caseCypherElement(removeClause);
				if (result == null) result = caseMarked(removeClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.REMOVE_ITEM: {
				RemoveItem removeItem = (RemoveItem)theEObject;
				T result = caseRemoveItem(removeItem);
				if (result == null) result = caseCypherElement(removeItem);
				if (result == null) result = caseMarked(removeItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.REMOVE_PROPERTY: {
				RemoveProperty removeProperty = (RemoveProperty)theEObject;
				T result = caseRemoveProperty(removeProperty);
				if (result == null) result = caseRemoveItem(removeProperty);
				if (result == null) result = caseCypherElement(removeProperty);
				if (result == null) result = caseMarked(removeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.REMOVE_LABELS: {
				RemoveLabels removeLabels = (RemoveLabels)theEObject;
				T result = caseRemoveLabels(removeLabels);
				if (result == null) result = caseRemoveItem(removeLabels);
				if (result == null) result = caseCypherElement(removeLabels);
				if (result == null) result = caseMarked(removeLabels);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.DELETE_CLAUSE: {
				DeleteClause deleteClause = (DeleteClause)theEObject;
				T result = caseDeleteClause(deleteClause);
				if (result == null) result = caseClause(deleteClause);
				if (result == null) result = caseCypherElement(deleteClause);
				if (result == null) result = caseMarked(deleteClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.FOREACH_CLAUSE: {
				ForeachClause foreachClause = (ForeachClause)theEObject;
				T result = caseForeachClause(foreachClause);
				if (result == null) result = caseClause(foreachClause);
				if (result == null) result = caseCypherElement(foreachClause);
				if (result == null) result = caseMarked(foreachClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.CALL_CLAUSE: {
				CallClause callClause = (CallClause)theEObject;
				T result = caseCallClause(callClause);
				if (result == null) result = caseClause(callClause);
				if (result == null) result = caseCypherElement(callClause);
				if (result == null) result = caseMarked(callClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.PATTERN: {
				Pattern pattern = (Pattern)theEObject;
				T result = casePattern(pattern);
				if (result == null) result = caseCypherElement(pattern);
				if (result == null) result = caseMarked(pattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.PATTERN_PART: {
				PatternPart patternPart = (PatternPart)theEObject;
				T result = casePatternPart(patternPart);
				if (result == null) result = caseCypherElement(patternPart);
				if (result == null) result = caseMarked(patternPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.PATTERN_ELEMENT: {
				PatternElement patternElement = (PatternElement)theEObject;
				T result = casePatternElement(patternElement);
				if (result == null) result = caseCypherElement(patternElement);
				if (result == null) result = caseMarked(patternElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.NODE_PATTERN: {
				NodePattern nodePattern = (NodePattern)theEObject;
				T result = caseNodePattern(nodePattern);
				if (result == null) result = casePatternElement(nodePattern);
				if (result == null) result = caseCypherElement(nodePattern);
				if (result == null) result = caseMarked(nodePattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.LABEL_EXPRESSION: {
				LabelExpression labelExpression = (LabelExpression)theEObject;
				T result = caseLabelExpression(labelExpression);
				if (result == null) result = caseCypherElement(labelExpression);
				if (result == null) result = caseMarked(labelExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.LABEL_NAME: {
				LabelName labelName = (LabelName)theEObject;
				T result = caseLabelName(labelName);
				if (result == null) result = caseLabelExpression(labelName);
				if (result == null) result = caseCypherElement(labelName);
				if (result == null) result = caseMarked(labelName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.LABEL_CONJUNCTION: {
				LabelConjunction labelConjunction = (LabelConjunction)theEObject;
				T result = caseLabelConjunction(labelConjunction);
				if (result == null) result = caseLabelExpression(labelConjunction);
				if (result == null) result = caseCypherElement(labelConjunction);
				if (result == null) result = caseMarked(labelConjunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.LABEL_DISJUNCTION: {
				LabelDisjunction labelDisjunction = (LabelDisjunction)theEObject;
				T result = caseLabelDisjunction(labelDisjunction);
				if (result == null) result = caseLabelExpression(labelDisjunction);
				if (result == null) result = caseCypherElement(labelDisjunction);
				if (result == null) result = caseMarked(labelDisjunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.LABEL_NEGATION: {
				LabelNegation labelNegation = (LabelNegation)theEObject;
				T result = caseLabelNegation(labelNegation);
				if (result == null) result = caseLabelExpression(labelNegation);
				if (result == null) result = caseCypherElement(labelNegation);
				if (result == null) result = caseMarked(labelNegation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.LABEL_WILDCARD: {
				LabelWildcard labelWildcard = (LabelWildcard)theEObject;
				T result = caseLabelWildcard(labelWildcard);
				if (result == null) result = caseLabelExpression(labelWildcard);
				if (result == null) result = caseCypherElement(labelWildcard);
				if (result == null) result = caseMarked(labelWildcard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.RELATIONSHIP_CHAIN: {
				RelationshipChain relationshipChain = (RelationshipChain)theEObject;
				T result = caseRelationshipChain(relationshipChain);
				if (result == null) result = casePatternElement(relationshipChain);
				if (result == null) result = caseCypherElement(relationshipChain);
				if (result == null) result = caseMarked(relationshipChain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.RELATIONSHIP_PATTERN: {
				RelationshipPattern relationshipPattern = (RelationshipPattern)theEObject;
				T result = caseRelationshipPattern(relationshipPattern);
				if (result == null) result = casePatternElement(relationshipPattern);
				if (result == null) result = caseCypherElement(relationshipPattern);
				if (result == null) result = caseMarked(relationshipPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseCypherElement(expression);
				if (result == null) result = caseMarked(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseExpression(variable);
				if (result == null) result = caseCypherElement(variable);
				if (result == null) result = caseMarked(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseExpression(parameter);
				if (result == null) result = caseCypherElement(parameter);
				if (result == null) result = caseMarked(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.LITERAL: {
				Literal literal = (Literal)theEObject;
				T result = caseLiteral(literal);
				if (result == null) result = caseExpression(literal);
				if (result == null) result = caseCypherElement(literal);
				if (result == null) result = caseMarked(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.STRING_LITERAL: {
				StringLiteral stringLiteral = (StringLiteral)theEObject;
				T result = caseStringLiteral(stringLiteral);
				if (result == null) result = caseLiteral(stringLiteral);
				if (result == null) result = caseExpression(stringLiteral);
				if (result == null) result = caseCypherElement(stringLiteral);
				if (result == null) result = caseMarked(stringLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.INTEGER_LITERAL: {
				IntegerLiteral integerLiteral = (IntegerLiteral)theEObject;
				T result = caseIntegerLiteral(integerLiteral);
				if (result == null) result = caseLiteral(integerLiteral);
				if (result == null) result = caseExpression(integerLiteral);
				if (result == null) result = caseCypherElement(integerLiteral);
				if (result == null) result = caseMarked(integerLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.FLOAT_LITERAL: {
				FloatLiteral floatLiteral = (FloatLiteral)theEObject;
				T result = caseFloatLiteral(floatLiteral);
				if (result == null) result = caseLiteral(floatLiteral);
				if (result == null) result = caseExpression(floatLiteral);
				if (result == null) result = caseCypherElement(floatLiteral);
				if (result == null) result = caseMarked(floatLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.BOOLEAN_LITERAL: {
				BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
				T result = caseBooleanLiteral(booleanLiteral);
				if (result == null) result = caseLiteral(booleanLiteral);
				if (result == null) result = caseExpression(booleanLiteral);
				if (result == null) result = caseCypherElement(booleanLiteral);
				if (result == null) result = caseMarked(booleanLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.NULL_LITERAL: {
				NullLiteral nullLiteral = (NullLiteral)theEObject;
				T result = caseNullLiteral(nullLiteral);
				if (result == null) result = caseLiteral(nullLiteral);
				if (result == null) result = caseExpression(nullLiteral);
				if (result == null) result = caseCypherElement(nullLiteral);
				if (result == null) result = caseMarked(nullLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.LIST_LITERAL: {
				ListLiteral listLiteral = (ListLiteral)theEObject;
				T result = caseListLiteral(listLiteral);
				if (result == null) result = caseLiteral(listLiteral);
				if (result == null) result = caseExpression(listLiteral);
				if (result == null) result = caseCypherElement(listLiteral);
				if (result == null) result = caseMarked(listLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.MAP_LITERAL: {
				MapLiteral mapLiteral = (MapLiteral)theEObject;
				T result = caseMapLiteral(mapLiteral);
				if (result == null) result = caseLiteral(mapLiteral);
				if (result == null) result = caseExpression(mapLiteral);
				if (result == null) result = caseCypherElement(mapLiteral);
				if (result == null) result = caseMarked(mapLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.MAP_ENTRY: {
				MapEntry mapEntry = (MapEntry)theEObject;
				T result = caseMapEntry(mapEntry);
				if (result == null) result = caseCypherElement(mapEntry);
				if (result == null) result = caseMarked(mapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.PROPERTY_ACCESS: {
				PropertyAccess propertyAccess = (PropertyAccess)theEObject;
				T result = casePropertyAccess(propertyAccess);
				if (result == null) result = caseExpression(propertyAccess);
				if (result == null) result = caseCypherElement(propertyAccess);
				if (result == null) result = caseMarked(propertyAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.LABEL_CHECK: {
				LabelCheck labelCheck = (LabelCheck)theEObject;
				T result = caseLabelCheck(labelCheck);
				if (result == null) result = caseExpression(labelCheck);
				if (result == null) result = caseCypherElement(labelCheck);
				if (result == null) result = caseMarked(labelCheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.BINARY_EXPRESSION: {
				BinaryExpression binaryExpression = (BinaryExpression)theEObject;
				T result = caseBinaryExpression(binaryExpression);
				if (result == null) result = caseExpression(binaryExpression);
				if (result == null) result = caseCypherElement(binaryExpression);
				if (result == null) result = caseMarked(binaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.UNARY_EXPRESSION: {
				UnaryExpression unaryExpression = (UnaryExpression)theEObject;
				T result = caseUnaryExpression(unaryExpression);
				if (result == null) result = caseExpression(unaryExpression);
				if (result == null) result = caseCypherElement(unaryExpression);
				if (result == null) result = caseMarked(unaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.FUNCTION_INVOCATION: {
				FunctionInvocation functionInvocation = (FunctionInvocation)theEObject;
				T result = caseFunctionInvocation(functionInvocation);
				if (result == null) result = caseExpression(functionInvocation);
				if (result == null) result = caseCypherElement(functionInvocation);
				if (result == null) result = caseMarked(functionInvocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.CASE_EXPRESSION: {
				CaseExpression caseExpression = (CaseExpression)theEObject;
				T result = caseCaseExpression(caseExpression);
				if (result == null) result = caseExpression(caseExpression);
				if (result == null) result = caseCypherElement(caseExpression);
				if (result == null) result = caseMarked(caseExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.CASE_ALTERNATIVE: {
				CaseAlternative caseAlternative = (CaseAlternative)theEObject;
				T result = caseCaseAlternative(caseAlternative);
				if (result == null) result = caseCypherElement(caseAlternative);
				if (result == null) result = caseMarked(caseAlternative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.LIST_COMPREHENSION: {
				ListComprehension listComprehension = (ListComprehension)theEObject;
				T result = caseListComprehension(listComprehension);
				if (result == null) result = caseExpression(listComprehension);
				if (result == null) result = caseCypherElement(listComprehension);
				if (result == null) result = caseMarked(listComprehension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.PATTERN_COMPREHENSION: {
				PatternComprehension patternComprehension = (PatternComprehension)theEObject;
				T result = casePatternComprehension(patternComprehension);
				if (result == null) result = caseExpression(patternComprehension);
				if (result == null) result = caseCypherElement(patternComprehension);
				if (result == null) result = caseMarked(patternComprehension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.QUANTIFIED_EXPRESSION: {
				QuantifiedExpression quantifiedExpression = (QuantifiedExpression)theEObject;
				T result = caseQuantifiedExpression(quantifiedExpression);
				if (result == null) result = caseExpression(quantifiedExpression);
				if (result == null) result = caseCypherElement(quantifiedExpression);
				if (result == null) result = caseMarked(quantifiedExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.EXISTS_EXPRESSION: {
				ExistsExpression existsExpression = (ExistsExpression)theEObject;
				T result = caseExistsExpression(existsExpression);
				if (result == null) result = caseExpression(existsExpression);
				if (result == null) result = caseCypherElement(existsExpression);
				if (result == null) result = caseMarked(existsExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.SUBSCRIPT: {
				Subscript subscript = (Subscript)theEObject;
				T result = caseSubscript(subscript);
				if (result == null) result = caseExpression(subscript);
				if (result == null) result = caseCypherElement(subscript);
				if (result == null) result = caseMarked(subscript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.SLICE_EXPRESSION: {
				SliceExpression sliceExpression = (SliceExpression)theEObject;
				T result = caseSliceExpression(sliceExpression);
				if (result == null) result = caseExpression(sliceExpression);
				if (result == null) result = caseCypherElement(sliceExpression);
				if (result == null) result = caseMarked(sliceExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CypherPackage.CYPHER_EVALUATOR: {
				CypherEvaluator cypherEvaluator = (CypherEvaluator)theEObject;
				T result = caseCypherEvaluator(cypherEvaluator);
				if (result == null) result = caseSourceEvaluator(cypherEvaluator);
				if (result == null) result = caseEvaluator(cypherEvaluator);
				if (result == null) result = caseDocumented(cypherEvaluator);
				if (result == null) result = caseMarked(cypherEvaluator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCypherSource(CypherSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCypherElement(CypherElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unparsed Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unparsed Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnparsedStatement(UnparsedStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuery(Query object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleQuery(SingleQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Union</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnion(Union object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClause(Clause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Match Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Match Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchClause(MatchClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Projection Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Projection Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectionClause(ProjectionClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnClause(ReturnClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>With Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>With Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWithClause(WithClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Projection Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Projection Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectionItem(ProjectionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sort Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortItem(SortItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unwind Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unwind Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnwindClause(UnwindClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateClause(CreateClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergeClause(MergeClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergeAction(MergeAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetClause(SetClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetItem(SetItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetProperty(SetProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetVariable(SetVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Labels</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Labels</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetLabels(SetLabels object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveClause(RemoveClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveItem(RemoveItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveProperty(RemoveProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Labels</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Labels</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveLabels(RemoveLabels object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteClause(DeleteClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Foreach Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Foreach Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForeachClause(ForeachClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallClause(CallClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern(Pattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatternPart(PatternPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatternElement(PatternElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodePattern(NodePattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelExpression(LabelExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelName(LabelName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Conjunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Conjunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelConjunction(LabelConjunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Disjunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Disjunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelDisjunction(LabelDisjunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Negation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Negation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelNegation(LabelNegation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Wildcard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Wildcard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelWildcard(LabelWildcard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Chain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Chain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationshipChain(RelationshipChain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationshipPattern(RelationshipPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringLiteral(StringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerLiteral(IntegerLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatLiteral(FloatLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanLiteral(BooleanLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullLiteral(NullLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListLiteral(ListLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapLiteral(MapLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapEntry(MapEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyAccess(PropertyAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelCheck(LabelCheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryExpression(BinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryExpression(UnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionInvocation(FunctionInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseExpression(CaseExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Alternative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseAlternative(CaseAlternative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Comprehension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Comprehension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListComprehension(ListComprehension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Comprehension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Comprehension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatternComprehension(PatternComprehension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantified Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantified Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantifiedExpression(QuantifiedExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exists Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exists Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExistsExpression(ExistsExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscript</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscript</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscript(Subscript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slice Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slice Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSliceExpression(SliceExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCypherEvaluator(CypherEvaluator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferrable(Referrable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringIdentity(StringIdentity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumented(Documented object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarked(Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluator(Evaluator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Evaluator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Evaluator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceEvaluator(SourceEvaluator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CypherSwitch
