package exceptions;

public class AnimeNameAlreadyExistsException extends Exception{
	
	
	
	private static final long serialVersionUID = 1L;

	public AnimeNameAlreadyExistsException() {
		super(" that Anime Name it's already on the list!");
	}

}
