package com.haikuMaker.jsp;
import java.util.Random; 

public class haikuMaker {
	private static Random rand = new Random();
	private static String fWord, sWord, tWord; 
	private static String[] fLineArray =  {"A", "It is"};
	private static String[] sLineArray = {"man", "women", "animal"};
	private static String[] tLineArray = {"again", "chestnut", "sunset"};
	public haikuMaker(String fWord, String sWord, String tWord) {
		this.fWord = fWord; 
		this.sWord = sWord; 
		this.tWord = tWord; 
	}
	
	public static String fLine(String fWord) {
		int rand_int1 = rand.nextInt(2);
		return fLineArray[rand_int1]; 
	}
	
	public static String sLine(String sWord) {
		int rand_int1 = rand.nextInt(3);
		return sLineArray[rand_int1];
	}
	
	public static String tLine(String tWord) {
		int rand_int1 = rand.nextInt(3);
		return tLineArray[rand_int1];
	}
	
	public static String makeHaiku(String fWord, String sWord, String tWord) {
		return fLine(fWord) + "\n"+ sLine(sWord)+ "\n" + tLine(tWord);
	}
}
