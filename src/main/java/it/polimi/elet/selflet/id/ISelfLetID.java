package it.polimi.elet.selflet.id;

import java.io.Serializable;

/**
 * Interface that represents a selflet ID or a broadcast ID
 * 
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * */
public interface ISelfLetID extends Serializable {

	/**
	 * Returns the numeric id identifying this selflet
	 * */
	Integer getID();

	/**
	 * True iff this is a special ID identifying broadcast
	 * */
	boolean isBroadcast();

	/**
	 * True iff this is a special ID identifying neighbors of this selflet
	 * */
	boolean isNeighbors();

}
