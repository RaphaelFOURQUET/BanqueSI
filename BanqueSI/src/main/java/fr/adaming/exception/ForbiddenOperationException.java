package fr.adaming.exception;

public class ForbiddenOperationException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public ForbiddenOperationException(String msg) {
		super(msg);
	}

}
