package model;

public class FollowingAnime extends AnimeSeries {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int currentep;
	private int currentseas;
	private int currentscore;


	public FollowingAnime(String n ,String p, String st, int s, String t, String g, int ep, String at, int ses, int currep, int currseas, int cursco) {
		super(n,p, st, s, t, g, ep, at, ses);


		currentep = currep;
		currentseas = currseas;
		setCurrentscore(cursco);
	}
	
	
	public int getCurrentep() {
		return currentep;
	}




	public void setCurrentep(int currentep) {
		this.currentep = currentep;
	}




	public int getCurrentseas() {
		return currentseas;
	}




	public void setCurrentseas(int currentseas) {
		this.currentseas = currentseas;
	}


	public int getCurrentscore() {
		return currentscore;
	}


	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}





}
