package exceptions;

public class BookNameAlreadyExistsException  extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BookNameAlreadyExistsException() {
		super(" that Book Name it's already on the list!");
	}
}
