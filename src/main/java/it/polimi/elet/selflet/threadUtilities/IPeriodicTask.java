package it.polimi.elet.selflet.threadUtilities;

/**
 * Interface for tasks that are executed periodically
 * 
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * */
public interface IPeriodicTask {

	/**
	 * Returns the activation period for a periodic task in milliseconds
	 * */
	int periodInMsec();
}
