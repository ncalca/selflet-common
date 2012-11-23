package it.polimi.elet.selflet.id;

/**
 * This selflet ID represents a broadcast message
 * 
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * */
public class BroadcastSelfLetID implements ISelfLetID {

	private static final long serialVersionUID = 1L;

	private static final String BROADCAST = "BROADCAST";

	public Integer getID() {
		throw new IllegalStateException("Cannot retrieve ID for broadcast selflet ID");
	}

	public boolean isBroadcast() {
		return true;
	}

	public boolean isNeighbors() {
		return false;
	}

	@Override
	public String toString() {
		return BROADCAST;
	}

}
