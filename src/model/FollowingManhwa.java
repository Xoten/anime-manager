package model;

public class FollowingManhwa extends Manhwa {

	private int currentchapt;
	private int currentscore;


	private int currentvolu;

	public FollowingManhwa(String n, int c, int v, String a, String g, String i, boolean cl, int cc, int cs, int cv) {
		super(n,c, v, a, g, i, cl);

		currentchapt = cc;
		currentscore = cs;
		currentvolu = cv;

	}

	public int getCurrentchapt() {
		return currentchapt;
	}

	public void setCurrentchapt(int currentchapt) {
		this.currentchapt = currentchapt;
	}

	public int getCurrentscore() {
		return currentscore;
	}

	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}

	public int getCurrentvolu() {
		return currentvolu;
	}

	public void setCurrentvolu(int currentvolu) {
		this.currentvolu = currentvolu;
	}


}
