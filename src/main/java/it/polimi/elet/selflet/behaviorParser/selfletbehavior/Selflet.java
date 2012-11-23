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
 * <em><b>Selflet</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link it.polimi.elet.selflet.behaviorParser.selfletbehavior.Selflet#getService
 * <em>Service</em>}</li>
 * </ul>
 * </p>
 * 
 * @see it.polimi.elet.selflet.behaviorParser.selfletbehavior.SelfletbehaviorPackage#getSelflet()
 * @model
 * @generated
 */
public interface Selflet extends EObject {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link it.polimi.elet.selflet.behaviorParser.selfletbehavior.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Service</em>' containment reference list.
	 * @see it.polimi.elet.selflet.behaviorParser.selfletbehavior.SelfletbehaviorPackage#getSelflet_Service()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getService();

} // Selflet
