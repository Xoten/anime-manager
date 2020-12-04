package model;

public class Comic {

	private int chapters;
	private int volumes;
	private String author;
	private String genres;
	private String image;
	private String name;
	
	
	public Comic( String n, int c, int v, String a,String g, String i) {
		
	chapters = c;
	volumes = v;
	author = a;
	genres = g;
	image = i;
	name = n;
		
		
		
	}
	
	public String getName() {
		
		return name;
	}
	
	
	public int getChapters() {
		return chapters;
	}
	public void setChapters(int chapters) {
		this.chapters = chapters;
	}
	public int getVolumes() {
		return volumes;
	}
	public void setVolumes(int volumes) {
		this.volumes = volumes;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenres() {
		return genres;
	}
	public void setGenres(String genres) {
		this.genres = genres;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}
	
	
	
	
}
