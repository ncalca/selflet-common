package it.polimi.elet.selflet;

/**
 * Main constants used in the SelfLet prototype
 * 
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * */
public interface SelfLetConstants {

	// FILES
	String SELFLET_MAIN_FILE = "selflet.xml";
	String SELFLET_MAIN_FILE_XSD = "/xsd/selflet.xsd";
	String SELFLET_SERVICE_FILE_XSD = "/xsd/service.xsd";
	String CONFIGURATION_FILE = "parameters.conf";

	// FOLDERS
	String BEHAVIOR_FOLDER = "behaviors";
	String ABILITIES_FOLDER = "abilities";
	String RULES_FOLDER = "rules";
	String SERVICE_FOLDER = "services";

	// EXTENSIONS
	String SERVICES_EXTENSION = "xml";
	String RULES_EXTENSION = "drl";
	String ABILITIES_EXTENSION = "jar";
	String BEHAVIORS_EXTENSION = "service";

}
