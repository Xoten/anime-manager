package model;

import java.util.ArrayList;
import java.util.LinkedList;

import exceptions.NotTheSamePasswordException;



public class AnimeManager {

	private LinkedList<User> users;
	private LinkedList<Anime> animes;
	private ArrayList<Comic> mangas;
	private ArrayList<Comic>  manhwas;
	private ArrayList<Book> lnovels;

	public AnimeManager() {

		users = new LinkedList<>();
		animes = new LinkedList<>();
		mangas = new ArrayList<>();
		manhwas = new ArrayList<>();
		lnovels = new ArrayList<>();
	}
	
	public void addAnime() {
		
		
	}

	public void toAddNewUser( String n, String p, String ph) {
		User user = null;

		user = new User( n, p, ph);

		if(users.isEmpty()) {
			users.add(user);
		} else {
			int c = 0;
			while(c < users.size() && comparatorUserNickname(n, (users.get(c)).getNickname()) >= 1) {
				c++;
			}
			users.add(c, user);
		}
	}
	public void toVerifyPassword(String password, String pV) throws NotTheSamePasswordException{
		if(!password.equals(pV)) {
			throw new NotTheSamePasswordException();
		}
	}	
	public User searchUser(String username) {
		User toSearch = null;
		boolean find = false;
		int in = 0;
		int fin = users.size();
		
		while(in <= fin && !find) {
			int pos = (int) Math.floor((in+fin)/2);
			if(pos != users.size()) {
				String el = users.get(pos).getNickname();
				int compar = username.compareToIgnoreCase(el);
				if(compar == 0) {
					toSearch = users.get(pos);
					find = true;
				} else if(compar < 0) {
					fin = pos - 1;
				} else if(compar > 0) {
					in = pos + 1;
				}
			}
		}
		return toSearch;
	}

	private int comparatorUserNickname(String u1, String u2) {
		return u1.compareToIgnoreCase(u2);
	}

	public ArrayList<Comic> getMangas() {
		return mangas;
	}

	

	public ArrayList<Comic> getManhwas() {
		return manhwas;
	}

	public ArrayList<Book> getLnovels() {
		return lnovels;
	}



	public LinkedList<Anime> getAnimes() {
		return animes;
	}

	
}
