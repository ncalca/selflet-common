package it.polimi.elet.selflet.behavior;

import it.polimi.elet.selflet.action.Action;
import it.polimi.elet.selflet.exceptions.WrongParametersException;

import java.io.Serializable;

import org.apache.log4j.Logger;

/**
 * A class representing a State of an SelfLet Behaviour.
 * 
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * @author Davide Devescovi
 */
public class State implements Serializable {

	private static final Logger LOG = Logger.getLogger(State.class);
	private static final long serialVersionUID = 1L;

	private final String name;
	private final String uniqueId;
	private final Action action;

	private boolean initialState;
	private boolean finalState;
	private long visits = 0;

	/**
	 * Constructs a State object with the given parameters. Name and uniqueId
	 * are mandatory, while the action is optional.
	 * 
	 * @param name
	 *            the name of the State
	 * @param uniqueId
	 *            the unique id of the State
	 * @param initialState
	 *            whether the state is initial or not
	 * @param finalState
	 *            whether the state is final or not
	 * @param action
	 *            the optional Action to be performed when in this state
	 * 
	 * @throws NullPointerException
	 *             if a mandatory parameter is null
	 */
	public State(String name, String uniqueId, boolean initialState, boolean finalState, Action action) {

		if (name == null || uniqueId == null) {
			throw new WrongParametersException("An input parameter was null when creating a State object.\n Name=" + name + " uniqueID=" + uniqueId
					+ " initialState=" + initialState + " finalState=" + finalState + " action=" + action);
		}

		if (name.trim().length() == 0) {
			LOG.info("State " + toString() + "has empty name ");
		}

		if (initialState && finalState) {
			throw new WrongParametersException("A state cannot be both initial and final");
		}

		this.name = name;
		this.uniqueId = uniqueId;
		this.initialState = initialState;
		this.finalState = finalState;
		this.action = action;
	}

	public String getName() {
		return name;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public boolean isInitialState() {
		return initialState;
	}

	public boolean isFinalState() {
		return finalState;
	}

	public Action getAction() {
		return action;
	}

	public void setInitialState(boolean initialState) {
		this.initialState = initialState;
	}

	public void setFinalState(boolean finalState) {
		this.finalState = finalState;
	}

	public void incrementVisits() {
		this.visits++;
	}

	public long getVisits() {
		return this.visits;
	}

	@Override
	public String toString() {
		return "[StateName = " + name + ", uniqueId = " + uniqueId + ", initialState = " + initialState + ", finalState = " + finalState + ", action = "
				+ action + "]";
	}


}
