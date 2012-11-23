/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.polimi.elet.selflet.behaviorParser.selfletbehavior.util;

import it.polimi.elet.selflet.behaviorParser.selfletbehavior.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * 
 * @see it.polimi.elet.selflet.behaviorParser.selfletbehavior.SelfletbehaviorPackage
 * @generated
 */
public class SelfletbehaviorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static SelfletbehaviorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public SelfletbehaviorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SelfletbehaviorPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc --> This implementation returns <code>true</code> if
	 * the object is either the model's package or is an instance object of the
	 * model. <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SelfletbehaviorSwitch<Adapter> modelSwitch = new SelfletbehaviorSwitch<Adapter>() {
		@Override
		public Adapter caseBehavior(Behavior object) {
			return createBehaviorAdapter();
		}

		@Override
		public Adapter caseState(State object) {
			return createStateAdapter();
		}

		@Override
		public Adapter caseInit(Init object) {
			return createInitAdapter();
		}

		@Override
		public Adapter caseFinal(Final object) {
			return createFinalAdapter();
		}

		@Override
		public Adapter caseIntermediate(Intermediate object) {
			return createIntermediateAdapter();
		}

		@Override
		public Adapter caseInvocation(Invocation object) {
			return createInvocationAdapter();
		}

		@Override
		public Adapter caseElementary(Elementary object) {
			return createElementaryAdapter();
		}

		@Override
		public Adapter caseComplex(Complex object) {
			return createComplexAdapter();
		}

		@Override
		public Adapter caseSelflet(Selflet object) {
			return createSelfletAdapter();
		}

		@Override
		public Adapter caseService(Service object) {
			return createServiceAdapter();
		}

		@Override
		public Adapter caseCondition(Condition object) {
			return createConditionAdapter();
		}

		@Override
		public Adapter caseAction(Action object) {
			return createActionAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link it.polimi.elet.selflet.behaviorParser.selfletbehavior.Behavior
	 * <em>Behavior</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see it.polimi.elet.selflet.behaviorParser.selfletbehavior.Behavior
	 * @generated
	 */
	public Adapter createBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link it.polimi.elet.selflet.behaviorParser.selfletbehavior.State
	 * <em>State</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see it.polimi.elet.selflet.behaviorParser.selfletbehavior.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link it.polimi.elet.selflet.behaviorParser.selfletbehavior.Init
	 * <em>Init</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see it.polimi.elet.selflet.behaviorParser.selfletbehavior.Init
	 * @generated
	 */
	public Adapter createInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link it.polimi.elet.selflet.behaviorParser.selfletbehavior.Final
	 * <em>Final</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see it.polimi.elet.selflet.behaviorParser.selfletbehavior.Final
	 * @generated
	 */
	public Adapter createFinalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link it.polimi.elet.selflet.behaviorParser.selfletbehavior.Intermediate
	 * <em>Intermediate</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.polimi.elet.selflet.behaviorParser.selfletbehavior.Intermediate
	 * @generated
	 */
	public Adapter createIntermediateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link it.polimi.elet.selflet.behaviorParser.selfletbehavior.Invocation
	 * <em>Invocation</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.polimi.elet.selflet.behaviorParser.selfletbehavior.Invocation
	 * @generated
	 */
	public Adapter createInvocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link it.polimi.elet.selflet.behaviorParser.selfletbehavior.Elementary
	 * <em>Elementary</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see it.polimi.elet.selflet.behaviorParser.selfletbehavior.Elementary
	 * @generated
	 */
	public Adapter createElementaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link it.polimi.elet.selflet.behaviorParser.selfletbehavior.Complex
	 * <em>Complex</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see it.polimi.elet.selflet.behaviorParser.selfletbehavior.Complex
	 * @generated
	 */
	public Adapter createComplexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link it.polimi.elet.selflet.behaviorParser.selfletbehavior.Selflet
	 * <em>Selflet</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see it.polimi.elet.selflet.behaviorParser.selfletbehavior.Selflet
	 * @generated
	 */
	public Adapter createSelfletAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link it.polimi.elet.selflet.behaviorParser.selfletbehavior.Service
	 * <em>Service</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see it.polimi.elet.selflet.behaviorParser.selfletbehavior.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link it.polimi.elet.selflet.behaviorParser.selfletbehavior.Condition
	 * <em>Condition</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see it.polimi.elet.selflet.behaviorParser.selfletbehavior.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link it.polimi.elet.selflet.behaviorParser.selfletbehavior.Action
	 * <em>Action</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see it.polimi.elet.selflet.behaviorParser.selfletbehavior.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This
	 * default implementation returns null. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // SelfletbehaviorAdapterFactory
