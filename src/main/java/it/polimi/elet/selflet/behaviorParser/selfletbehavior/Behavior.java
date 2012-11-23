/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.polimi.elet.selflet.behaviorParser.selfletbehavior;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Behavior</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link it.polimi.elet.selflet.behaviorParser.selfletbehavior.Behavior#getName
 * <em>Name</em>}</li>
 * <li>
 * {@link it.polimi.elet.selflet.behaviorParser.selfletbehavior.Behavior#getState
 * <em>State</em>}</li>
 * <li>
 * {@link it.polimi.elet.selflet.behaviorParser.selfletbehavior.Behavior#getTargetService
 * <em>Target Service</em>}</li>
 * </ul>
 * </p>
 * 
 * @see it.polimi.elet.selflet.behaviorParser.selfletbehavior.SelfletbehaviorPackage#getBehavior()
 * @model
 * @generated
 */
public interface Behavior extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.polimi.elet.selflet.behaviorParser.selfletbehavior.SelfletbehaviorPackage#getBehavior_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '
	 * {@link it.polimi.elet.selflet.behaviorParser.selfletbehavior.Behavior#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link it.polimi.elet.selflet.behaviorParser.selfletbehavior.State}. It
	 * is bidirectional and its opposite is '
	 * {@link it.polimi.elet.selflet.behaviorParser.selfletbehavior.State#getTargetBehavior
	 * <em>Target Behavior</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see it.polimi.elet.selflet.behaviorParser.selfletbehavior.SelfletbehaviorPackage#getBehavior_State()
	 * @see it.polimi.elet.selflet.behaviorParser.selfletbehavior.State#getTargetBehavior
	 * @model opposite="targetBehavior" containment="true"
	 * @generated
	 */
	EList<State> getState();

	/**
	 * Returns the value of the '<em><b>Target Service</b></em>' container
	 * reference. It is bidirectional and its opposite is '
	 * {@link it.polimi.elet.selflet.behaviorParser.selfletbehavior.Service#getBehavior
	 * <em>Behavior</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Target Service</em>' container reference.
	 * @see #setTargetService(Service)
	 * @see it.polimi.elet.selflet.behaviorParser.selfletbehavior.SelfletbehaviorPackage#getBehavior_TargetService()
	 * @see it.polimi.elet.selflet.behaviorParser.selfletbehavior.Service#getBehavior
	 * @model opposite="behavior" transient="false"
	 * @generated
	 */
	Service getTargetService();

	/**
	 * Sets the value of the '
	 * {@link it.polimi.elet.selflet.behaviorParser.selfletbehavior.Behavior#getTargetService
	 * <em>Target Service</em>}' container reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Target Service</em>' container
	 *            reference.
	 * @see #getTargetService()
	 * @generated
	 */
	void setTargetService(Service value);

} // Behavior
