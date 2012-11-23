package it.polimi.elet.selflet.utilities;

/**
 * A static class used to retrieve some static properties of the selflet
 * 
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 */
public class UtilitiesProvider {

	private static String workingDir = null;
	private static String initialService = null;

	private UtilitiesProvider() {
	} // Do not instantiate this

	public static String getWorkingDir() {
		if (workingDir == null) {
			return "";
		}
		return workingDir;
	}

	public static void setWorkingDir(String workingDir) {
		UtilitiesProvider.workingDir = workingDir;
	}

	public static String getInitialServiceName() {
		if (initialService == null) {
			throw new IllegalStateException("Trying to get a null initial service name");
		}
		return initialService;
	}

	public static void setInitialServiceName(String initialService) {
		UtilitiesProvider.initialService = initialService;
	}

}