package it.polimi.elet.selflet.behavior;

import java.io.Serializable;
import java.util.List;

/**
 * The interface of an SelfLet Behaviour. A IBehavior
 * 
 * @author Davide Devescovi
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 */
public interface IBehavior extends Serializable {

	/**
	 * Gets the behaviour name.
	 * 
	 * @return a String representing the behaviour name
	 */
	String getName();

	/**
	 * Gets the initial state of the behavior
	 * 
	 * */
	State getInitialState();

	/**
	 * Gets all the States of the Behaviour.
	 * 
	 * @return a List of States
	 */
	List<State> getStates();

	/**
	 * Gets all the Transitions of the Behaviour.
	 * 
	 * @return a List of transitions.
	 */
	List<Transition> getTransitions();

	/**
	 * Gets all outgoing transitions from a given state
	 * 
	 * @return a List of transitions
	 * */
	List<Transition> getOutgoingTransitions(State state);

	/**
	 * Returns the repository of the Behavior
	 */
	BehaviorStructure getBehaviorStructure();

	/**
	 * Returns a list of all the states' names in the behavior
	 */
	List<String> getStateNames();

	/**
	 * Checks whether the current behavior is an elementary one
	 * 
	 * @return true <==> if the behavior is elementary
	 * */
	boolean isElementaryBehavior();

}