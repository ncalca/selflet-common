package it.polimi.elet.selflet.behavior;

import it.polimi.elet.selflet.exceptions.DuplicateObjectException;
import it.polimi.elet.selflet.exceptions.NotFoundException;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Lists;

/**
 * This class is used to store, access and modify all the components (states,
 * transitions, triggers etc.) of a Behaviour.
 * 
 * 
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * @author Mose Tronci
 * @author Davide Devescovi
 * @author silvia
 */
public class BehaviorStructure implements Serializable {

	private static final long serialVersionUID = 1L;

	private final String behaviorName;
	private State initialState;
	private List<State> states = Lists.newArrayList();
	private List<Transition> transitions = Lists.newArrayList();
	private List<Condition> conditions = Lists.newArrayList();
	private List<TransitionProbability> probabilities = Lists.newArrayList();

	public BehaviorStructure(String behaviorName) {
		if (behaviorName == null || behaviorName.trim().length() == 0) {
			throw new IllegalArgumentException("Behavior name cannot be null or empty");
		}

		this.behaviorName = behaviorName;
	}

	/**
	 * Get the initial state of the behavior
	 * 
	 * @return The initial state for the behavior. If more than an initial state
	 *         are defined, the last added state is returned.
	 */
	public State getInitialState() {

		if (initialState == null) {
			throw new NotFoundException("An initial state is not defined for behavior " + behaviorName);
		}

		return initialState;
	}

	/**
	 * Adds a state to the repository.
	 * 
	 * @param state
	 *            the State to be added
	 * 
	 * @throws DuplicateObjectException
	 *             if the specified State already exists in the behaviour
	 * @throws NullPointerException
	 *             if the State is null
	 */
	public void addState(State state) {

		if (state == null) {
			throw new IllegalArgumentException();
		}

		if (states.contains(state)) {
			throw new DuplicateObjectException("State " + state + " already exists in the list of states: " + states);
		}
		
		states.add(state);

		if (state.isInitialState()) {
			initialState = state;
		}
	}

	/**
	 * Adds a transition to the repository.
	 * 
	 * @param transition
	 *            the Transition to be added
	 * 
	 * @throws DuplicateObjectException
	 *             if the specified Transition already exists in the behaviour
	 * @throws NullPointerException
	 *             if the Transition is null
	 */
	public void addTransition(Transition transition) {

		if (transition == null) {
			throw new IllegalArgumentException();
		}
		if (transitions.contains(transition)) {
			throw new DuplicateObjectException("The transition " + transition.transitionId() + "is already " + "in the behaviour repository");
		}

		transitions.add(transition);

		String from = transition.getSource().getName();
		String to = transition.getTarget().getName();
		double probability = transition.getProbability();
		boolean toFinalState = transition.getTarget().isFinalState();
		probabilities.add(new TransitionProbability(from, to, probability, toFinalState));
	}

	/**
	 * Adds a condition to the repository.
	 * 
	 * @param condition
	 *            the Condition to be added
	 * 
	 * @throws DuplicateObjectException
	 *             if the specified Condition already exists in the behaviour
	 * @throws NullPointerException
	 *             if the Condition is null
	 */
	public void addCondition(Condition condition) {

		if (condition == null) {
			throw new IllegalArgumentException();
		}

		if (conditions.contains(condition)) {
			throw new DuplicateObjectException("The trigger " + condition.getName() + "is already " + "in the behaviour repository");
		}

		conditions.add(condition);
	}

	/**
	 * Removes a state from the behaviour.
	 * 
	 * @param state
	 *            the State to be removed
	 */
	public void removeState(State state) {
		states.remove(state);
	}

	/**
	 * Removes a transition from the behaviour.
	 * 
	 * @param transition
	 *            the Transition to be removed
	 */
	public void removeTransition(Transition transition) {
		transitions.remove(transition);
	}

	/**
	 * Removes a condition from the behaviour.
	 * 
	 * @param condition
	 *            the Condition to be removed
	 */
	public void removeCondition(Condition condition) {
		conditions.remove(condition);
	}

	/**
	 * Gets the state corresponding to the specified ID.
	 * 
	 * @param uniqueId
	 *            the id of the state
	 * 
	 * @return the State object whose ID is the specified ID
	 * 
	 * @throws NotFoundException
	 *             if no state is found with the specified ID
	 */
	public State getStateById(String uniqueId) {
		for (State state : states) {

			if (state.getUniqueId().equals(uniqueId)) {
				return state;
			}
		}

		throw new NotFoundException("Couldn't find state " + uniqueId + " in the behaviour repository");
	}

	/**
	 * Gets the state corresponding to the specified name.
	 * 
	 * @param name
	 *            the name of the state
	 * 
	 * @return the State object whose name is the specified name
	 * 
	 * @throws NotFoundException
	 *             if no state is found with the specified name
	 */
	public State getStateByName(String name) {
		for (State state : states) {
			if (state.getName().equals(name)) {
				return state;
			}
		}

		throw new NotFoundException("Couldn't find state " + name + " in the behaviour repository");
	}

	/**
	 * Gets all the states in the repository.
	 * 
	 * @return a List of State objects
	 */
	public List<State> getStates() {
		return new ArrayList<State>(states);
	}

	/**
	 * Gets all the state names
	 * 
	 * @return a List of String objects. Each string represents the state name
	 */
	public List<String> getStateNames() {
		List<String> names = new ArrayList<String>();
		for (State state : states) {
			names.add(state.getName());
		}
		return names;
	}

	/**
	 * Gets the transition corresponding to the specified ID.
	 * 
	 * @param uniqueId
	 *            the id of the transition
	 * 
	 * @return the Transition object whose ID is the specified ID
	 * 
	 * @throws NotFoundException
	 *             if no Transition is found with the specified ID
	 */
	public Transition getTransitionById(String uniqueId) {

		for (Transition transition : transitions) {

			if (transition.transitionId().equals(uniqueId)) {
				return transition;
			}
		}

		throw new NotFoundException("Couldn't find transition " + uniqueId + " in the behaviour repository");
	}

	/**
	 * Gets the transition whose source, target and trigger fields correspond to
	 * the specified parameters. Note: Conditions and Actions are always unique,
	 * so if a Transition is in the Repository its Condition and Action are
	 * certainly unique.
	 * 
	 * @param source
	 *            the source state of the transition
	 * @param target
	 *            the target state of the transition
	 * @param trigger
	 *            the trigger of the transition
	 * 
	 * @return the Transition object whose fields correspond to the parameters
	 * 
	 * @throws NotFoundException
	 *             if no Transition is found with the specified fields
	 */
	public Transition getTransitionByStatesAndTrigger(State source, State target) {

		for (Transition trasition : transitions) {

			if (trasition.getSource().equals(source) && trasition.getTarget().equals(target)) {
				return trasition;
			}
		}

		throw new NotFoundException("Couldn't find transition by source, target and trigger " + "in the behaviour repository");
	}

	/**
	 * Gets all the outgoing transitions of a given state.
	 * 
	 * @param state
	 *            the State of interest
	 * 
	 * @return a List of Transition objects, containing all the outgoing
	 *         transitions
	 */
	public List<Transition> getOutgoingTransitions(State state) {

		List<Transition> outgoing = Lists.newArrayList();

		for (Transition transition : transitions) {

			if (transition.getSource().equals(state)) {
				outgoing.add(transition);
			}
		}

		return outgoing;
	}

	/**
	 * Gets all the incoming transitions of a given state.
	 * 
	 * @param state
	 *            the State of interest
	 * 
	 * @return a List of Transition objects, containing all the incoming
	 *         transitions
	 */
	public List<Transition> getIncomingTransitions(State state) {

		ArrayList<Transition> incoming = new ArrayList<Transition>();

		for (Transition transition : transitions) {

			if (transition.getTarget().equals(state)) {
				incoming.add(transition);
			}
		}

		if (incoming.size() == 0) {
			return new ArrayList<Transition>();
		} else {
			return incoming;
		}
	}

	/**
	 * Gets all the transitions of the behaviour.
	 * 
	 * @return a List of Transition objects, containing all the transitions of
	 *         the behaviour
	 */
	public List<Transition> getTransitions() {
		return new ArrayList<Transition>(transitions);
	}

	/**
	 * Gets the conditions corresponding to the specified ID.
	 * 
	 * @param uniqueId
	 *            the id of the Condition
	 * 
	 * @return the Condition object whose ID corresponds to the specified ID
	 * 
	 * @throws NotFoundException
	 *             if no Condition with the specified name was found
	 */
	public Condition getConditionById(String uniqueId) {

		for (Condition condition : conditions) {

			if (condition.getUniqueId().equals(uniqueId)) {
				return condition;
			}
		}

		throw new NotFoundException("Couldn't find condition " + uniqueId + " in the behaviour repository");
	}

	public String getBehaviorName() {
		return behaviorName;
	}

	public List<TransitionProbability> getTransitionProbabilities() {
		return new ArrayList<TransitionProbability>(probabilities);
	}

	public String toString() {
		String string = "behaviorName: " + behaviorName;
		string += "initialState: " + initialState;
		string += "states: " + states.toString();
		string += "transitions: " + transitions.toString();
		string += "conditions: " + conditions.toString();
		string += "probabilities: " + probabilities.toString();
		return string;
	}

}