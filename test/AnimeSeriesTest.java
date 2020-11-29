import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.AnimeSeries;

class AnimeSeriesTest {


	public void setupStage1() {
		
		
	}
	
	@Test
	public void testAnimeSeries() {
		setupStage1();
		AnimeSeries as = new AnimeSeries("Kimi No Nawa","asd123","Bones, Mad House",10, "Movie" , "Romance, Sci-Fi" , 12, "October 2018- December 2018", 2);
		
		assertEquals("Kimi No Nawa", as.getName());
		assertEquals("asd123",as.getPicture());
		assertEquals("Bones, Mad House",as.getStudios());
		assertEquals(10,as.getScore());
		assertEquals("Movie", as.getType());
		assertEquals("Romance, Sci-Fi", as.getGenres());
		assertEquals(12, as.getEpisodes());
		assertEquals("October 2018- December 2018", as.getAiringtime());
		assertEquals(2, as.getSeasons());
		
}
	
	

}
