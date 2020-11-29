import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.AnimeMovie;

class AnimeMovieTest {

	public void setupStage1() {
		
		
	}
	
	@Test
	public void testAnimeMovie() {
		setupStage1();
		AnimeMovie am = new AnimeMovie("Kimi No Nawa","asd123","Bones, Mad House",10, "Movie" , "Romance, Sci-Fi" , 1, "November 8 2016");
		
		assertEquals("Kimi No Nawa", am.getName());
		assertEquals("asd123",am.getPicture());
		assertEquals("Bones, Mad House",am.getStudios());
		assertEquals(10,am.getScore());
		assertEquals("Movie", am.getType());
		assertEquals("Romance, Sci-Fi", am.getGenres());
		assertEquals(1, am.getEpisodes());
		assertEquals("November 8 2016", am.getAiringtime());
		
}

}