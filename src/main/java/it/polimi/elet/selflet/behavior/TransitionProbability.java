package it.polimi.elet.selflet.behavior;

import java.io.Serializable;

/**
 * Probability associated with a transition.
 * 
 * Maybe this should be an attibute of the transition class
 * 
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * */
public class TransitionProbability implements Serializable {

	private static final long serialVersionUID = 1L;

	private final String from;
	private final String to;
	private final double probability;
	private final boolean towardFinalState;

	public TransitionProbability(String from, String to, double probability, boolean towardFinalState) {
		this.from = from;
		this.to = to;
		this.probability = probability;
		this.towardFinalState = towardFinalState;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public double getProbability() {
		return probability;
	}

	public boolean isTowardFinalState() {
		return towardFinalState;
	}
}
