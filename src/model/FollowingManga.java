package model;

public class FollowingManga extends Manga {

	 private int currentchap;
	 private int currentscore;
	 private int currentvol;
	
	        
	public FollowingManga(String n ,int c, int v, String a, String g, String i, String aan, int curc, int crs, int crv) {
		super(n,c, v, a, g, i, aan);
		
		currentchap = curc;
		currentscore = crs;
		currentvol = crv;
	}
	
	 

		public void setCurrentchap(int currentchap) {
			this.currentchap = currentchap;
		}

		public int getCurrentscore() {
			return currentscore;
		}

		public void setCurrentscore(int currentscore) {
			this.currentscore = currentscore;
		}

		public int getCurrentvol() {
			return currentvol;
		}

		public void setCurrentvol(int currentvol) {
			this.currentvol = currentvol;
		}

		public int getCurrentchap() {
			
			return currentchap;
		}


	
	

}
