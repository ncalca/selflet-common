package it.polimi.elet.selflet.id;

/**
 * ID to identify neighbors of a selflet
 * */
public class NeighborsID implements ISelfLetID {

	private static final long serialVersionUID = 1L;
	private static final String NEIGHBORS = "NEIGHBORS";

	@Override
	public Integer getID() {
		throw new IllegalStateException("Cannot retrieve ID for neighbors selflet ID");
	}

	@Override
	public boolean isBroadcast() {
		return false;
	}

	@Override
	public boolean isNeighbors() {
		return true;
	}

	@Override
	public String toString() {
		return NEIGHBORS;
	}

}
