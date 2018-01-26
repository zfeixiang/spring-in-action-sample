package com.example.soundsystem;

import org.springframework.stereotype.Component;

//@Component
public class SgtPeppers implements CompactDisc {

	private String title = "(field)Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "(field)The Beatles";
	
	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);

	}

	@Override
	public void playTracks(int i) {
		// TODO Auto-generated method stub
		
	}

}
