package bg.pragmatic.notepads.exceptions;

public class PageNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 605554362890225995L;

	public PageNotFoundException() {
		super();
	}

	public PageNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PageNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public PageNotFoundException(String message) {
		super(message);
	}

	public PageNotFoundException(Throwable cause) {
		super(cause);
	}

	
}
