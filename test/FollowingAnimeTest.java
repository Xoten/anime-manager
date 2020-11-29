import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.FollowingAnime;

class FollowingAnimeTest {

public void setupStage1() {
		
		
	}
	
	@Test
	public void testFollowingAnime() {
		setupStage1();
		FollowingAnime fa = new FollowingAnime("Kimi No Nawa","asd123","Bones, Mad House",10, "Movie" , "Romance, Sci-Fi" , 12, "October 2018- December 2018", 2, 1, 2, 8);
		
		assertEquals("Kimi No Nawa", fa.getName());
		assertEquals("asd123",fa.getPicture());
		assertEquals("Bones, Mad House",fa.getStudios());
		assertEquals(10,fa.getScore());
		assertEquals("Movie", fa.getType());
		assertEquals("Romance, Sci-Fi", fa.getGenres());
		assertEquals(12, fa.getEpisodes());
		assertEquals("October 2018- December 2018", fa.getAiringtime());
		assertEquals(2, fa.getSeasons());
		assertEquals(1, fa.getCurrentep());
		assertEquals(2, fa.getCurrentseas());
		assertEquals(8, fa.getCurrentscore());
		
}
}
