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
	
	@Test
	public void cdShouldNotBeNull() {
		System.out.println(compactDisc.toString());
		assertNotNull(compactDisc);
	}
	
	@Test
	public void playTest() {
		cdPlayer.play();
	}
}

