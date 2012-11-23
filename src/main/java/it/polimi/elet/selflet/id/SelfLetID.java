package it.polimi.elet.selflet.id;

/**
 * Identifier for a single (unique) Selflet
 * 
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * */
public class SelfLetID implements ISelfLetID {

	private static final long serialVersionUID = 1L;

	private final Integer id;

	public SelfLetID(String selfLetId) {
		this.id = Integer.valueOf(selfLetId);
	}

	public SelfLetID(Integer id) {
		this.id = id;
	}

	public Integer getID() {
		return id;
	}

	public boolean isBroadcast() {
		return false;
	}

	public String toString() {
		return getID().toString();
	}

	public boolean isNeighbors() {
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof SelfLetID)) {
			return false;
		}
		SelfLetID other = (SelfLetID) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

}
