package it.polimi.elet.selflet.negotiation;

import it.polimi.elet.selflet.behavior.IBehavior;

import java.io.Serializable;
import java.util.Set;

import com.google.common.collect.Sets;

/**
 * This class contains a service and all its related informations (behaviors,
 * actions, conditions) which are needed when doing a service teach
 * 
 * @author silvia
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 */
public class ServicePack implements Serializable {

	private static final long serialVersionUID = 1L;

	private final Set<IBehavior> behaviors;

	private String serviceName;
	private IBehavior defaultBehavior;
	private long maxResponseTimeInMsec;

	public ServicePack(String name, Set<IBehavior> implementingBehaviors) {
		this.serviceName = name;
		this.behaviors = Sets.newHashSet(implementingBehaviors);
	}

	public String getName() {
		return serviceName;
	}

	public void setDefaultBehavior(IBehavior defaultBehavior) {
		this.defaultBehavior = defaultBehavior;
	}

	public IBehavior getDefaultBehavior() {
		return defaultBehavior;
	}

	@Override
	public String toString() {
		return "Service name: " + serviceName + ", behaviors: " + behaviors;
	}

	public Set<IBehavior> getImplementingBehaviors() {
		return behaviors;
	}

	public void setMaxResponseTime(long maxResponseTimeInMsec) {
		this.maxResponseTimeInMsec = maxResponseTimeInMsec;
	}

	public long getMaxResponseTimeInMsec() {
		return maxResponseTimeInMsec;
	}

}
