package it.polimi.elet.selflet.behavior;

import java.util.List;

/**
 * Some utilities for behaviors
 * 
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * */
public class BehaviorUtilities {

	private static final int STATES_IN_ELEMENTARY_BEHAVIOR = 3;

	private BehaviorUtilities() {
		// private constructor
	}

	/**
	 * Checks whether the passed behavior structure conforms with the rules of
	 * the elementary behaviors
	 * */
	public static boolean isElementaryBehaviorStructure(BehaviorStructure behaviorStructure) {

		List<State> states = behaviorStructure.getStates();

		if (states.size() != STATES_IN_ELEMENTARY_BEHAVIOR) {
			return false;
		}

		boolean initialState, finalState, abilityState;
		initialState = finalState = abilityState = false;

		for (State state : states) {

			if (!finalState) {
				finalState = state.isFinalState() ? true : false;
			}
			if (!initialState) {
				initialState = state.isInitialState() ? true : false;
			}
			if (!abilityState) {
				abilityState = (!state.isFinalState() && !state.isInitialState()) ? true : false;
			}
		}

		return (initialState && finalState && abilityState);
	}

	public static double computeStateProbability(IBehavior defaultBehavior, State state) {
		long stateVisits = 0;
		for (Transition transition : defaultBehavior.getTransitions()) {
			if (transition.getTarget().equals(state)) {
				stateVisits += transition.getSource().getVisits();
			}
		}
		if (stateVisits == 0) {
			return 0;
		}
		long totalVisits = defaultBehavior.getInitialState().getVisits();
		return ((double) stateVisits) / totalVisits;
	}
}
