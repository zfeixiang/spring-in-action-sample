package com.example.soundsystem;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CDPlayerTest {
	
	@Autowired
	private CompactDisc compactDisc;
	
	@Autowired
	private MediaPlayer cdPlayer;
	
	@Autowired
	private TrackCounter trackCounter;
	
	@Test
	public void cdShouldNotBeNull() {
		System.out.println(compactDisc.toString());
		assertNotNull(compactDisc);
	}
	
	@Test
	public void playTest() {
		cdPlayer.play();
	}
	
	@Test
	public void trackCounterTest() {
		compactDisc.playTracks(2);
		compactDisc.playTracks(3);
		compactDisc.playTracks(2);
		compactDisc.playTracks(3);
		compactDisc.playTracks(4);
		compactDisc.playTracks(3);
		assertEquals(2, trackCounter.getPlayCount(2));
		assertEquals(3, trackCounter.getPlayCount(3));
		assertEquals(1, trackCounter.getPlayCount(4));
		assertEquals(0, trackCounter.getPlayCount(5));
	}
}

