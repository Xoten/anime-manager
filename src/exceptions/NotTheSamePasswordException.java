package exceptions;

public class NotTheSamePasswordException extends Exception {

	


	private static final long serialVersionUID = 1L;

	public NotTheSamePasswordException() {
		super("the password is not the same");
	}

}
