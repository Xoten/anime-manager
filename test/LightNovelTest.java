import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.LightNovel;

class LightNovelTest {

public void setupStage1() {
		
		
	}
	
	@Test
	public void testLightNovel() {
		setupStage1();
		LightNovel ln = new LightNovel("Kimi No Nawa",24, 12 , "Kideo", "Gore, Romance",  "asd123", "Kimi No Nawa X");
		
		assertEquals("Kimi No Nawa", ln.getName());
		assertEquals(24 ,ln.getChapters());
		assertEquals(12 ,ln.getVolumes());
		assertEquals("Kideo",ln.getAuthor());
		assertEquals("Gore, Romance", ln.getGenres());
		assertEquals("asd123", ln.getImage());
		assertEquals("Kimi No Nawa X", ln.getAdaptationN());
		
		
}

}
