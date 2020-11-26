package model;

public class User {

	private int quizzes;
	private int rank;
	private int totalanimesw;
	private int totalmangaw;
	private int totalLnovelw;
	private String nickname;
	private String password;
	
	
	
	public User(int q, int r, int totala, int totalm, int totalL, String n, String p) {
		
		quizzes = q;
		rank = r;
		totalanimesw = totala;
		totalmangaw = totalm;
		totalLnovelw = totalL;
		nickname = n;
		password = p;
		
		
	}
	public int getQuizzes() {
		return quizzes;
	}
	public void setQuizzes(int quizzes) {
		this.quizzes = quizzes;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getTotalanimesw() {
		return totalanimesw;
	}
	public void setTotalanimesw(int totalanimesw) {
		this.totalanimesw = totalanimesw;
	}
	public int getTotalmangaw() {
		return totalmangaw;
	}
	public void setTotalmangaw(int totalmangaw) {
		this.totalmangaw = totalmangaw;
	}
	public int getTotalLnovelw() {
		return totalLnovelw;
	}
	public void setTotalLnovelw(int totalLnovelw) {
		this.totalLnovelw = totalLnovelw;
	}

	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
}
