package model;

public class AnimeMovie extends Anime {
      
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String release;
	
	
	public AnimeMovie(String n,String p, String st, int s, String t, String g, int ep, String r) {
		super(n,p, st, s, t, g, ep);
		
		release = r;
		
		
	}
	
	public String getAiringtime() {
		return release;
	}



	public void setAiringtime(String airingtime) {
		this.release = airingtime;
	}


}
