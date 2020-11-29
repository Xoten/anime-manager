package model;

import java.util.ArrayList;
import java.util.LinkedList;

import exceptions.PasswordNotEqualsException;



public class AnimeManager {

	private LinkedList<User> users;
	private LinkedList<Anime> animes;
	private ArrayList<Comic> mangas;
	private ArrayList<Book> lnovels;

	public AnimeManager() {

		users = new LinkedList<>();
	}

	public void newUser( String n, String p, String ph) {
		User user = null;

		user = new User( n, p, ph);

		if(users.isEmpty()) {
			users.add(user);
		} else {
			int c = 0;
			while(c < users.size() && comparatorAddUser(n, (users.get(c)).getNickname()) >= 1) {
				c++;
			}
			users.add(c, user);
		}
	}
	public void verificationPasswords(String password, String passwordVerify) throws PasswordNotEqualsException{
		if(!password.equals(passwordVerify)) {
			throw new PasswordNotEqualsException();
		}
	}	
	public User binarySearchUser(String username) {
		User userSeek = null;
		boolean find = false;
		int in = 0;
		int fin = users.size();
		
		while(in <= fin && !find) {
			int pos = (int) Math.floor((in+fin)/2);
			if(pos != users.size()) {
				String el = users.get(pos).getNickname();
				int compar = username.compareToIgnoreCase(el);
				if(compar == 0) {
					userSeek = users.get(pos);
					find = true;
				} else if(compar < 0) {
					fin = pos - 1;
				} else if(compar > 0) {
					in = pos + 1;
				}
			}
		}
		return userSeek;
	}

	private int comparatorAddUser(String username1, String username2) {
		return username1.compareToIgnoreCase(username2);
	}
}
