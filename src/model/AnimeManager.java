package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import exceptions.AnimeNameAlreadyExistsException;
import exceptions.NotTheSamePasswordException;



public class AnimeManager {

	private LinkedList<User> users;
	private LinkedList<Anime> animes;
	private ArrayList<Comic> mangas;
	private ArrayList<Comic>  manhwas;
	private ArrayList<Book> lnovels;
	private ArrayList<Quizz> quizzes;


	public AnimeManager() {

		users = new LinkedList<>();
		animes = new LinkedList<>();
		mangas = new ArrayList<>();
		manhwas = new ArrayList<>();
		lnovels = new ArrayList<>();
		quizzes = new ArrayList<>();
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

	//**********************ANIME SECTION********************************************************************************************


	//ADD ANIME METHODS*********************************************************************************************************


	public void addAnimeToAnimeList(Anime animeToAdd) throws AnimeNameAlreadyExistsException{
		for(int i = 0; i < animes.size(); i++) {
			if(animeToAdd.getName().equals(animes.get(i).getName())) {
				throw new AnimeNameAlreadyExistsException();
			}
		}
		animes.add(animeToAdd);
	}


	//**********************SORT ANIME METHODS*********************************************

	public LinkedList<Anime> getListAnimeListFiltredbyScoreUsingBubble() {
		LinkedList<Anime> anlist = new LinkedList<>();
		Anime[] temporal = animes.toArray(new Anime[animes.size()]);
		Anime temp = null;
		for(int c = 0; c < temporal.length; c++) {
			for(int v = 1; v < (temporal.length - c); v++) {
				if(temporal[v-1].getScore() > temporal[v].getScore()) {  
					//swap elements  
					temp = temporal[v-1];  
					temporal[v-1] = temporal[v];  
					temporal[v] = temp;  
				}
			}
		}
		for(int c = 0; c < temporal.length; c++) {
			anlist.add(temporal[c]);
		}
		return anlist;
	}

	public LinkedList<Anime> getAnimeListFiltredbyNameSelection() {
		LinkedList<Anime> animelist = new LinkedList<>();
		Anime[] temporalL = animes.toArray(new Anime[animes.size()]);
		for(int c = 0; c < temporalL.length - 1; c++ ) {
			int menor= c;
			int index = c;

			for(int v = c+1; v < temporalL.length; v++) {
				if(temporalL[v].getName().compareToIgnoreCase(temporalL[menor].getName()) > 0) {
					menor=v;
					index = v;
				}
			}
			Anime temp = temporalL[c];
			temporalL[c] = temporalL[menor];
			temporalL[index] = temp;
		}
		for(int c = 0; c < temporalL.length; c++) {
			animelist.add(temporalL[c]);
		}
		return animelist;
	}

	public LinkedList<FollowingAnime> getAnimeListFiltredByCurrentEpisode() {
		LinkedList<FollowingAnime> animelist = new LinkedList<>();
		Anime[] temporaL = animes.toArray(new Anime[animes.size()]);
		ArrayList<FollowingAnime> temporaL2 = new ArrayList<>();
		FollowingAnime helper;
		for(int i = 0; i< temporaL.length; i++) {
			if(temporaL[i] instanceof FollowingAnime) {
				temporaL2.add((FollowingAnime)temporaL[i]);
			}
		}

		for(int c = 0; c < temporaL2.size(); c++) {
			helper = temporaL2.get(c);
			int i = c - 1;
			while((i > -1) && (temporaL2.get(i).getCurrentep()) >(helper.getCurrentep())) {

				temporaL2.set(i+1, temporaL2.get(i));
				i--;
			}
			temporaL2.set(i+1, helper);
		}
		for(int c = 0; c < temporaL2.size(); c++) {
			animelist.add(temporaL2.get(c));
		}
		return animelist;
	}

	public LinkedList<FollowingAnime> getAnimeCurrentScoreComparator() {
		LinkedList<FollowingAnime> animelistz = new LinkedList<>();
		LinkedList<FollowingAnime> animelist = new LinkedList<>();
		for(int c = 0; c < animes.size(); c++) {

			if(animes.get(c) instanceof FollowingAnime) {
				animelistz.add((FollowingAnime) animes.get(c));
			}
		}

		animecurrentscorecomparator pcm = new animecurrentscorecomparator();
		Collections.sort(animelistz, pcm);

		for(int i = 0; i<animelistz.size(); i++) {

			animelist.add(animelistz.get(i));

		}

		return animelist;
	}
	public class animecurrentscorecomparator implements Comparator<FollowingAnime> {
		@Override
		public int compare(FollowingAnime u1, FollowingAnime u2) {
			int response = 0;
			if(u1.getCurrentscore() > u2.getCurrentscore()) {
				response = -1;
			} else if(u1.getCurrentscore() < u2.getCurrentscore()) {
				response = 1;
			}
			return response;
		}


	}

	// Getters Anime methods***********************************************************

	public LinkedList<FollowingAnime> getListFollowingAnime() {
		LinkedList<FollowingAnime> listFollowingAnime = new LinkedList<>();

		for(int i = 0; i < users.size();i++) {
			if(animes.get(i) instanceof FollowingAnime) {
				FollowingAnime current = (FollowingAnime)(animes.get(i));
				listFollowingAnime.add(current);
			}
		}

		return listFollowingAnime;
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

	public void addQuizz(int t, String d) {

		Quizz q = new Quizz(t,d);

		quizzes.add(q);

	}

	public ArrayList<Quizz> getQuizzes() {
		return quizzes;
	}




	public LinkedList<Anime> getAnimes() {
		return animes;
	}


}
