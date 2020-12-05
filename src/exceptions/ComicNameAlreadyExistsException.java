package exceptions;

public class ComicNameAlreadyExistsException extends Exception{

	
	private static final long serialVersionUID = 1L;

	public ComicNameAlreadyExistsException() {
		super(" that Comic Name it's already on the list!");
	}
}
