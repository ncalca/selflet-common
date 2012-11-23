package it.polimi.elet.selflet.behavior;

import java.io.Serializable;

/**
 * A class representing a transition in an SelfLet Behaviour.
 * 
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * @author Davide Devescovi
 */
public class Transition implements Serializable {

	private static final long serialVersionUID = 1L;

	private final String transitionId;

	private final State source;
	private final State target;
	private final Condition condition;

	private long visits = 0;

	/**
	 * Constructs a Transition with the given parameters. While uniqueId, source
	 * and target are mandatory (so that a NullPointerException will be thrown
	 * if any of these is null), the trigger, guard and action paramters are
	 * optional and can be null.
	 * 
	 * @param uniqueId
	 *            the unique id of the Transition
	 * @param source
	 *            the source State of the Transition
	 * @param target
	 *            the target State of the Transition
	 * @param condition
	 *            the optional Condition which guards the Transition
	 * @param transitionName
	 * 
	 * @throws NullPointerException
	 *             if a mandatory parameter is null
	 */
	public Transition(String uniqueId, State source, State target, Condition condition, String transitionName) {

		if (uniqueId == null || source == null || target == null) {
			throw new NullPointerException("An input parameter was null when creating a " + "Transition object");
		}

		this.transitionId = uniqueId;
		this.source = source;
		this.target = target;
		this.condition = condition;

		// if the arc probability is not set, set it to 1
		if (transitionName == null || transitionName.length() == 0) {
			transitionName = "1";
		}
	}

	public String transitionId() {
		return transitionId;
	}

	public State getSource() {
		return source;
	}

	public State getTarget() {
		return target;
	}

	public Condition getCondition() {
		return condition;
	}

	public double getProbability() {
		long sourceStateVisits = source.getVisits();
		if (sourceStateVisits == 0) {
			return 0;
		}
		return ((double) visits) / sourceStateVisits;
	}

	public void incrementVisits() {
		this.visits++;
	}

	public long getVisits() {
		return this.visits;
	}

	/* ************************************** */
	/* Overridden equals and hashCode methods */
	/* ************************************** */

	@Override
	public boolean equals(Object object) {

		if (this == object) {
			return true;
		}

		if (!(object instanceof Transition)) {
			return false;
		}

		Transition secondTransition = (Transition) object;

		if (secondTransition.transitionId.equals(this.transitionId)) {
			return true;
		}

		if (!(secondTransition.condition == null ? this.condition == null : secondTransition.condition.equals(this.condition))

		|| !(secondTransition.source.equals(this.source)) || !(secondTransition.target.equals(this.target))) {
			return false;
		}

		return true;
	}

	@Override
	public int hashCode() {

		int hashCode = 1;
		hashCode = hashCode * 31 + transitionId.hashCode();
		hashCode = hashCode * 31 + source.hashCode();
		hashCode = hashCode * 31 + target.hashCode();
		hashCode = hashCode * 31 + (condition != null ? condition.hashCode() : 0);

		return hashCode;
	}

	@Override
	public String toString() {
		return source + " -> " + target;
	}

}