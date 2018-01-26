package com.example.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {

	private CompactDisc compactDisc;
	
/*	public void setCompactDisc(CompactDisc cd) {
		this.compactDisc = cd;
	}
*/
	@Autowired
	public CDPlayer(CompactDisc cd) {
		this.compactDisc = cd;
		//属性注入时候需要将此构造器去掉
	}
	
	@Override
	public void play() {
		compactDisc.play();
	}
}
