package it.polimi.elet.selflet.configuration;

public class ConfigurationException extends Exception {

	private static final long serialVersionUID = 9214366096599395864L;

	public ConfigurationException() {
		super();
	}

	public ConfigurationException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public ConfigurationException(String message) {
		super(message);
	}

	public ConfigurationException(Throwable cause) {
		super(cause);
	}

}
