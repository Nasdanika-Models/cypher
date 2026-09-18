/**
 */
package org.nasdanika.models.cypher.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.cypher.CypherPackage;
import org.nasdanika.models.cypher.NodePattern;
import org.nasdanika.models.cypher.PatternElement;
import org.nasdanika.models.cypher.RelationshipChain;
import org.nasdanika.models.cypher.RelationshipPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship Chain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.cypher.impl.RelationshipChainImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.RelationshipChainImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.nasdanika.models.cypher.impl.RelationshipChainImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipChainImpl extends PatternElementImpl implements RelationshipChain {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipChainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CypherPackage.Literals.RELATIONSHIP_CHAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternElement getLeft() {
		return (PatternElement)eDynamicGet(CypherPackage.RELATIONSHIP_CHAIN__LEFT, CypherPackage.Literals.RELATIONSHIP_CHAIN__LEFT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(PatternElement newLeft, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLeft, CypherPackage.RELATIONSHIP_CHAIN__LEFT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(PatternElement newLeft) {
		eDynamicSet(CypherPackage.RELATIONSHIP_CHAIN__LEFT, CypherPackage.Literals.RELATIONSHIP_CHAIN__LEFT, newLeft);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipPattern getRelationship() {
		return (RelationshipPattern)eDynamicGet(CypherPackage.RELATIONSHIP_CHAIN__RELATIONSHIP, CypherPackage.Literals.RELATIONSHIP_CHAIN__RELATIONSHIP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationship(RelationshipPattern newRelationship, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newRelationship, CypherPackage.RELATIONSHIP_CHAIN__RELATIONSHIP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationship(RelationshipPattern newRelationship) {
		eDynamicSet(CypherPackage.RELATIONSHIP_CHAIN__RELATIONSHIP, CypherPackage.Literals.RELATIONSHIP_CHAIN__RELATIONSHIP, newRelationship);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodePattern getRight() {
		return (NodePattern)eDynamicGet(CypherPackage.RELATIONSHIP_CHAIN__RIGHT, CypherPackage.Literals.RELATIONSHIP_CHAIN__RIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRight(NodePattern newRight, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newRight, CypherPackage.RELATIONSHIP_CHAIN__RIGHT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(NodePattern newRight) {
		eDynamicSet(CypherPackage.RELATIONSHIP_CHAIN__RIGHT, CypherPackage.Literals.RELATIONSHIP_CHAIN__RIGHT, newRight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CypherPackage.RELATIONSHIP_CHAIN__LEFT:
				return basicSetLeft(null, msgs);
			case CypherPackage.RELATIONSHIP_CHAIN__RELATIONSHIP:
				return basicSetRelationship(null, msgs);
			case CypherPackage.RELATIONSHIP_CHAIN__RIGHT:
				return basicSetRight(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CypherPackage.RELATIONSHIP_CHAIN__LEFT:
				return getLeft();
			case CypherPackage.RELATIONSHIP_CHAIN__RELATIONSHIP:
				return getRelationship();
			case CypherPackage.RELATIONSHIP_CHAIN__RIGHT:
				return getRight();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CypherPackage.RELATIONSHIP_CHAIN__LEFT:
				setLeft((PatternElement)newValue);
				return;
			case CypherPackage.RELATIONSHIP_CHAIN__RELATIONSHIP:
				setRelationship((RelationshipPattern)newValue);
				return;
			case CypherPackage.RELATIONSHIP_CHAIN__RIGHT:
				setRight((NodePattern)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CypherPackage.RELATIONSHIP_CHAIN__LEFT:
				setLeft((PatternElement)null);
				return;
			case CypherPackage.RELATIONSHIP_CHAIN__RELATIONSHIP:
				setRelationship((RelationshipPattern)null);
				return;
			case CypherPackage.RELATIONSHIP_CHAIN__RIGHT:
				setRight((NodePattern)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CypherPackage.RELATIONSHIP_CHAIN__LEFT:
				return getLeft() != null;
			case CypherPackage.RELATIONSHIP_CHAIN__RELATIONSHIP:
				return getRelationship() != null;
			case CypherPackage.RELATIONSHIP_CHAIN__RIGHT:
				return getRight() != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationshipChainImpl
