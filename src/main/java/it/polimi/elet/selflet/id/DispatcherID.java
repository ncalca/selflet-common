package it.polimi.elet.selflet.id;

/**
 * An ID to represent the dispatcher
 * 
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * */
public class DispatcherID implements ISelfLetID {

	private static final long serialVersionUID = 1L;

	private static final int DISPATCHER_ID = 0;

	public Integer getID() {
		return DISPATCHER_ID;
	}

	public boolean isBroadcast() {
		return false;
	}

	public boolean isNeighbors() {
		return false;
	}

	@Override
	public String toString() {
		return getID().toString();
	}
}
