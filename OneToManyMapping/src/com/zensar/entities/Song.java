package com.zensar.entities;
/**
 *@author Prince Tiwari
 *@creation_date 27th Sep 2019 4.47pm
 *@Modification_date 27th Sep 2019 4.47pm
 *@version 1.0
 *@copyright Zensar Technologies. All rights reserved.
 *@description Persistence class
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Song {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int songId;
	private String songName;
	@ManyToOne
	@JoinColumn(name="movie_id")
	private Movie movie;
	
	public Song( String songName) {
		super();
		
		this.songName = songName;
	}
	public Song() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public int getSongId() {
		return songId;
	}
	public void setSongId(int songId) {
		this.songId = songId;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	@Override
	public String toString() {
		return "Song [songId=" + songId + ", songName=" + songName + "]";
	}
	
	
}
