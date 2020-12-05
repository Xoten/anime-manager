package model;

public class FollowingManga extends Manga {

	 private int currentchap;
	 private int currentscore;
	 private int currentvol;
	
	        
	public FollowingManga(String n , String t,int c, int v, String a, String g, String i, int s, String aan, int curc, int crs, int crv) {
		super(n,t,c, v, a, g, i,s, aan);
		
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
