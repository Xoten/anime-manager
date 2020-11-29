package model;

public class Manga extends Comic {

	
	private Boolean animeAdaptation;
	

	private String animeAdaptationN;

	public Manga(String n,int c, int v, String a, String g, String i, String aan) {
		super(n,c, v, a, g, i);
		
		
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