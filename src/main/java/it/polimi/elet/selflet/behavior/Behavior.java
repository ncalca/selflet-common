package it.polimi.elet.selflet.behavior;

import java.util.List;

import org.apache.log4j.Logger;

/**
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * @author silvia
 */
public class Behavior implements IBehavior {

	private static final Logger LOG = Logger.getLogger(Behavior.class);
	private static final long serialVersionUID = -6475709692124642526L;

	private final String name;
	private final BehaviorStructure behaviorStructure;

	/**
	 * Constructs a Behavior object, given the repository which contains its
	 * parts.
	 * 
	 * This method is mainly used by the NegotiationManager to build a behavior
	 * starting from the behaviour's pieces it receive after a service
	 * negotiation
	 * 
	 * @param the
	 *            behavior repository
	 * 
	 */
	public Behavior(BehaviorStructure behaviorStructure) {
		this.behaviorStructure = behaviorStructure;
		this.name = behaviorStructure.getBehaviorName();
		LOG.debug("Created behaviour " + name);
	}

	public BehaviorStructure getBehaviorStructure() {
		return behaviorStructure;
	}

	public String getName() {
		return name;
	}

	public List<State> getStates() {
		return behaviorStructure.getStates();
	}

	public List<String> getStateNames() {
		return behaviorStructure.getStateNames();
	}

	public List<Transition> getTransitions() {
		return behaviorStructure.getTransitions();
	}

	public State getInitialState() {
		return behaviorStructure.getInitialState();
	}

	public List<Transition> getOutgoingTransitions(State state) {
		return behaviorStructure.getOutgoingTransitions(state);
	}

	public boolean isElementaryBehavior() {
		return false;
	}

	@Override
	public String toString() {
		return name;
	}

}