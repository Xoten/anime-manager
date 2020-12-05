import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Manga;

class MangaTest {

public void setupStage1() {
		
		
	}
	
	@Test
	public void testManga() {
		setupStage1();
		Manga m = new Manga("Kimi No Nawa","Manga",24, 12 , "Kideo", "Gore, Romance",  "asd123", 8, "Kimi No Nawa X");
		
		assertEquals("Kimi No Nawa", m.getName());
		assertEquals(24 ,m.getChapters());
		assertEquals(12 ,m.getVolumes());
		assertEquals("Kideo",m.getAuthor());
		assertEquals("Gore, Romance", m.getGenres());
		assertEquals("asd123", m.getImage());
		assertEquals("Kimi No Nawa X", m.getAnimeAdaptationN());
		
		
}

	

}
