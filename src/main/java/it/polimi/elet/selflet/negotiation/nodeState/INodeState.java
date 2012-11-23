package it.polimi.elet.selflet.negotiation.nodeState;

import it.polimi.elet.selflet.id.ISelfLetID;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import java.util.Set;

/**
 * This interface represents the state of a node.
 * 
 * Classes implementing this interface are passed within the SelfLetMsg
 * messages.
 * 
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * */
public interface INodeState extends Serializable {

	/**
	 * The ID of the selflet to which this state is referring to
	 * */
	ISelfLetID getSelfletID();

	/**
	 * @return returns all available services at the node
	 */
	Set<String> getAvailableServices();

	/**
	 * Adds a set of services which are available at this node
	 * */
	void addAvailableServices(Set<String> availableServices);

	/**
	 * Returns the timestamp of this node state creation time
	 * */
	Date getTimeStamp();

	/**
	 * Adds a map of generic data to this node state
	 * */
	void addGenericData(Map<String, Serializable> genericData);

	/**
	 * Returns the set of known neighbors
	 * */
	Set<ISelfLetID> getKnownNeighbors();

	/**
	 * Adds the set of known neighbors by this node
	 * */
	void addKnownNeighbors(Set<ISelfLetID> knownNeighbors);

	/**
	 * Returns the set of associated generic data associated to this node state
	 * */
	Map<String, Serializable> getGenericData();

	/**
	 * Return the generic data associated with the given key
	 * */
	Serializable getGenericDataWithKey(String key);

	double getUtilization();

	void setUtilization(double currentTotalCPUUtilization);
}
