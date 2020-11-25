package model;

public class Anime {


	private String picture;
	private String studios;
	private int score;
	private String type;
	private String genres;
	private int episodes;
	private int currentep;


	public Anime(String p, String st, int s, String t, String g, int ep) {
		p = picture;
		st = studios;
		s = score;
		t = type;
		g = genres;
		ep = episodes;


	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getStudios() {
		return studios;
	}
	public void setStudios(String s) {
		s = studios;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getGenres() {
		return genres;
	}
	public void setGenres(String genres) {
		this.genres = genres;
	}
	public int getEpisodes() {
		return episodes;
	}
	public void setEpisodes(int episodes) {
		this.episodes = episodes;
	}
	
	public int getCurrentep() {
		return currentep;
	}
	public void setCurrentep(int currentep) {
		this.currentep = currentep;
	}
}

