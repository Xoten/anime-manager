package model;

public class FollowingLightNovel extends LightNovel{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int currentchap;
	private int currentvol;
	private int currentscore;

	public FollowingLightNovel(String n,int c, int v, String a, String g, String i,  String ad, int cup, int curol, int cursc) {
		super(n, c, v, a, g, i, ad);

		currentchap = cup;
		currentvol = curol;
		currentscore = cursc;
	}
	
	public int getCurrentchap() {
		return currentchap;
	}

	public void setCurrentchap(int currentchap) {
		this.currentchap = currentchap;
	}

	public int getCurrentvol() {
		return currentvol;
	}

	public void setCurrentvol(int currentvol) {
		this.currentvol = currentvol;
	}

	public int getCurrentscore() {
		return currentscore;
	}

	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}

}
