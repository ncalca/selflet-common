package it.polimi.elet.selflet.negotiation;

import java.io.Serializable;

/**
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * */
public class RemoteServiceCompleted implements Serializable {

	private static final long serialVersionUID = 1L;
	private final Serializable output;

	public RemoteServiceCompleted(Serializable output) {
		this.output = output;
	}

	public Serializable getOutput() {
		return output;
	}

	public String toString() {
		return "[Remote service completed with output" + output + "]";
	}
}
