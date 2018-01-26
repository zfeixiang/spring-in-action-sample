package com.example.soundsystem;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {

	@Bean
	public TrackCounter trackCounter() {
		return new TrackCounter();
	}
	
	@Bean
	public CompactDisc compactDisc() {
		BlankDisc cd =  new BlankDisc("Sgt. Pepper's Lonely Hearts Club Band","The Beatles");
		List<String> tracks = new ArrayList<String>();
		tracks.add("A");
		tracks.add("B");
		tracks.add("C");
		tracks.add("D");
		tracks.add("E");
		tracks.add("F");
		cd.setTracks(tracks);
		return cd;
	}
}
