package it.polimi.elet.selflet.exceptions;

public class WrongParametersException extends RuntimeException {

	private static final long serialVersionUID = 358681809520689086L;

	public WrongParametersException(String msg) {
		super(msg);
	}

}
