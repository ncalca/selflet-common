package it.polimi.elet.selflet.negotiation;

import java.io.Serializable;

/**
 * This message represents a service request received by another selflet
 * 
 * @author silvia
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 */
public class NeededServiceParam implements Serializable {

	private static final long serialVersionUID = 1L;

	private final String serviceName;
	private final ServiceAskModeEnum mode;

	public NeededServiceParam(String serviceName, ServiceAskModeEnum mode) {
		this.serviceName = serviceName;
		this.mode = mode;
	}

	public String getNeededServiceName() {
		return serviceName;
	}

	public ServiceAskModeEnum getMode() {
		return mode;
	}

	@Override
	public String toString() {
		return serviceName + " needed in " + mode + " mode";
	}
}