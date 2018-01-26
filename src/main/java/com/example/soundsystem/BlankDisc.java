package com.example.soundsystem;

import java.util.List;

public class BlankDisc implements CompactDisc {

	private String title ;
	private String artist ;
	private List<String> tracks;
	
	public BlankDisc(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
	
	public BlankDisc(String title, String artist, List<String> tracks) {
		this.title = title;
		this.artist = artist;
		this.tracks = tracks;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public List<String> getTracks() {
		return tracks;
	}

	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}

	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
		if (null != tracks) {
			for (String track : tracks) {
				System.out.println("-track-" + track);
			}
		}
	}

	@Override
	public String toString() {
		return "BlankDisc [title=" + title + ", artist=" + artist + ", tracks=" + tracks + "]";
	}

	@Override
	public void playTracks(int trackNum) {
		if(null != tracks && tracks.size()>=trackNum) {
			System.out.println(tracks.get(trackNum-1));
		}
	}
	
	

}
