import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Manhwa;

class ManhwaTest {

public void setupStage1() {
		
		
	}
	
	@Test
	public void testManhwa() {
		setupStage1();
		Manhwa mw = new Manhwa("Kimi No Nawa","Manhwa",24, 12 , "Kideo", "Gore, Romance",  "asd123", 7,true);
		
		assertEquals("Kimi No Nawa", mw.getName());
		assertEquals(24 ,mw.getChapters());
		assertEquals(12 ,mw.getVolumes());
		assertEquals("Kideo",mw.getAuthor());
		assertEquals("Gore, Romance", mw.getGenres());
		assertEquals("asd123", mw.getImage());
		assertEquals(true, mw.isColorized());
		
		
}


}
