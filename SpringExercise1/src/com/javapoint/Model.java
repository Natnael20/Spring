package com.javapoint;



/*
 * A Java application 
 * has a Model class ‘Art’. Further, 
 * this class has three attributes – 
 * art_id, art_title, and artist_name. 
 * You are required to create a Spring XML 
 * configuration file to create a bean entry 
 * for the Art object. This object must have 
 * some property values. Also, develop a program to
 *  display the details of the Art objects.
 */

public class Model {
	
	String art_title, artist_name;
	int art_id;

	public void setArt_title(String newArt_Title) {
		 art_title = newArt_Title;
	}
	
	public String getArt_Title() {
		return art_title;
	}
	
	public void setArtist_name(String newArtist_name) {
		artist_name = newArtist_name;
	}
	
	public String getArtist_name() {
		return artist_name;
	}
	
	public void setArt_Id(int newArt_id) {
		art_id = newArt_id;
	}
	
	public int getArt_id() {
		return art_id;
	}
	
	public void display() {
		System.out.println("ArtistName " + getArtist_name() + "\nArtistTitel " + getArt_Title() 
		+ "\nArtistId " + getArt_id());
	}
	
	
}
