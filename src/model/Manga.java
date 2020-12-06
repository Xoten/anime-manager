package model;

public class Manga extends Comic {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private Boolean animeAdaptation;
	

	private String animeAdaptationN;

	public Manga(String n,String t,int c, int v, String a, String g, String i, int s, String aan) {
		super(n,t,c, v, a, g, i,s);
		
		
		animeAdaptationN = aan;
	}
	
	public Boolean getAnimeAdaptation() {
		return animeAdaptation;
	}

	public void setAnimeAdaptation(Boolean animeAdaptation) {
		this.animeAdaptation = animeAdaptation;
	}

	public String getAnimeAdaptationN() {
		return animeAdaptationN;
	}

	public void setAnimeAdaptationN(String animeAdaptationN) {
		this.animeAdaptationN = animeAdaptationN;
	}

}