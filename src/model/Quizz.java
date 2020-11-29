package model;

import java.util.ArrayList;

public class Quizz {

	private ArrayList<String> questions;
	private ArrayList<String> answers;
	private int time;
	private String difficult;
	
	public Quizz(int t, String d  ) {
		
		time = t;
		difficult = d;
		questions = new ArrayList<>();
		answers = new ArrayList<>();
		
		
		
	}
	
	 public void addQuestion(String s) {
		 
		 
		 
	 }
	 
	 public void addAnswer(String a) {
		 
		 
		 
	 }

	public ArrayList<String> getQuestions() {
		return questions;
	}

	

	public ArrayList<String> getAnswers() {
		return answers;
	}

	

	public int getTime() {
		return time;
	}

	

	public String getDifficult() {
		return difficult;
	}

	
	 
	 
	 
	
	
}
