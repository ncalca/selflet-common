package it.polimi.elet.selflet.behavior;

/**
 * Main interface for elementary behavior
 * 
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * */
public interface IElementaryBehavior extends IBehavior {

	/**
	 * Get the elementary behavior cost specified at design time
	 * 
	 * */
	double getElementaryBehaviorCost();

}
