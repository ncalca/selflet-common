package it.polimi.elet.selflet.negotiation.nodeState;

import it.polimi.elet.selflet.exceptions.NotFoundException;
import it.polimi.elet.selflet.id.ISelfLetID;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

/**
 * An implementation of node state
 * 
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * */
public class NodeState implements INodeState, Serializable {

	private static final long serialVersionUID = 1L;

	private final ISelfLetID selfletID;
	private final Date timeStamp;
	private final Map<String, Serializable> genericAttributes;
	private final Set<String> availableServices;
	private final Set<ISelfLetID> knownNeighbors;

	private double utilization;

	public NodeState(ISelfLetID selfletID) {
		this.selfletID = selfletID;
		this.timeStamp = new Date();
		this.genericAttributes = Maps.newHashMap();
		this.availableServices = Sets.newHashSet();
		this.knownNeighbors = Sets.newHashSet();
	}

	public void addAvailableServices(Set<String> availableServices) {
		this.availableServices.addAll(availableServices);
	}

	public Set<String> getAvailableServices() {
		return availableServices;
	}

	public ISelfLetID getSelfletID() {
		return selfletID;
	}

	public Date getTimeStamp() {
		return new Date(timeStamp.getTime());
	}

	@Override
	public void addGenericData(Map<String, Serializable> performanceData) {
		genericAttributes.putAll(performanceData);
	}

	@Override
	public Map<String, Serializable> getGenericData() {
		return Maps.newHashMap(genericAttributes);
	}

	@Override
	public Set<ISelfLetID> getKnownNeighbors() {
		return knownNeighbors;
	}

	@Override
	public void addKnownNeighbors(Set<ISelfLetID> knownNeighbors) {
		this.knownNeighbors.addAll(knownNeighbors);
	}

	@Override
	public String toString() {
		return selfletID + ", utilization: " + utilization + ", services: " + getAvailableServices() + ", generic_attributes: " + genericAttributes;
	}

	@Override
	public Serializable getGenericDataWithKey(String key) {
		if (genericAttributes.containsKey(key)) {
			return genericAttributes.get(key);
		}
		throw new NotFoundException("Cannot find property " + key);
	}

	public void setUtilization(double utilization) {
		this.utilization = utilization;
	}

	@Override
	public double getUtilization() {
		return utilization;
	}

}
