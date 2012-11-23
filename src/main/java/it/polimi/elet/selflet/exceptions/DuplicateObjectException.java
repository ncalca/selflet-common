package it.polimi.elet.selflet.exceptions;

public class DuplicateObjectException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DuplicateObjectException(String message) {

		super(message);
	}
}
