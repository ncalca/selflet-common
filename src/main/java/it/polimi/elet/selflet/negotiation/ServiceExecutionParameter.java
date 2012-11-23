package it.polimi.elet.selflet.negotiation;

import java.io.Serializable;
import java.util.Map;

/**
 * This class is used as a simple storage class. It contains the service we want
 * to execute and the map of parameters for the service.
 * 
 * @author silvia
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 */
public class ServiceExecutionParameter implements Serializable {

	private static final long serialVersionUID = 1L;
	private final String serviceName;
	private final Map<String, Object> serviceParameters;

	public ServiceExecutionParameter(String serviceName, Map<String, Object> params) {
		this.serviceName = serviceName;
		this.serviceParameters = params;
	}

	public String getServiceName() {
		return serviceName;
	}

	public Map<String, Object> getServiceParameters() {
		return serviceParameters;
	}

	public String toString() {
		return "[Service " + serviceName + ", Parameters: " + serviceParameters + "]";
	}
}
