package model;

public class AnimeSeries extends Anime {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String airingtime;
	private int seasons;
	
	public AnimeSeries(String n,String p, String st, int s, String t, String g, int ep, String at ,int sea) {
		super(n,p, st, s, t, g, ep);
	
		
		airingtime = at;
		seasons = sea;
	}

	public String getAiringtime() {
		return airingtime;
	}
	public void setAiringtime(String airingtime) {
		this.airingtime = airingtime;
	}
	
	public int getSeasons() {
		
		return seasons;
	}
	
	
	
}
