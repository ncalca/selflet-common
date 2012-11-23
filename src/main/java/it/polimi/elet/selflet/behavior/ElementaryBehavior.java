package it.polimi.elet.selflet.behavior;

import it.polimi.elet.selflet.exceptions.InvalidValueException;

public class ElementaryBehavior extends Behavior implements IElementaryBehavior {

	private static final long serialVersionUID = 1L;

	private double cost = 0;

	/**
	 * Constructs an elementary behavior from a <code>BehaviorStructure</code>.
	 * */
	public ElementaryBehavior(BehaviorStructure behaviorStructure, Double cost) {
		super(behaviorStructure);

		if (cost <= 0) {
			throw new InvalidValueException("Trying to initialize an elementary behavior with a negative cost");
		}
		if (!BehaviorUtilities.isElementaryBehaviorStructure(behaviorStructure)) {
			throw new InvalidValueException("Trying to create an elementary behavior with a wrong behavior structure");
		}
		this.cost = cost;
	}

	public double getElementaryBehaviorCost() {
		return cost;
	}

	@Override
	public boolean isElementaryBehavior() {
		return true;
	}

}
