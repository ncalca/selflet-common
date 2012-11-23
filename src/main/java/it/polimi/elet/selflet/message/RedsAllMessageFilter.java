package it.polimi.elet.selflet.message;

import polimi.reds.Filter;
import polimi.reds.Message;

/**
 * This filter does not filter nothing. It is used for monitoring reasons.
 * 
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * */
public class RedsAllMessageFilter implements Filter {

	private static final long serialVersionUID = -5669799055112003987L;

	/**
	 * Always matched
	 * */
	public boolean matches(Message m) {
		return true;
	}

}
