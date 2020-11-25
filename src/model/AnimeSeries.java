package model;

public class AnimeSeries extends Anime {

	
	private String airingtime;
	
	public AnimeSeries(String p, String st, int s, String t, String g, int ep, String at) {
		super(p, st, s, t, g, ep);
	
		
		airingtime = at;
	}

	public String getAiringtime() {
		return airingtime;
	}
	public void setAiringtime(String airingtime) {
		this.airingtime = airingtime;
	}
	
	
	
}
