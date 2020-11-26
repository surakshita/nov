package com.xworkz.copies;

import com.xworkz.copies.camera.Speaker;

public class SpeakerTester {

	public static void main(String[] args) {
		
		Speaker speaker=new Speaker();
		speaker.volumn="high";
		System.out.println(speaker.volumn);
		System.out.println("**************");
		speaker.volumn="low";
		System.out.println(speaker.volumn);
		System.out.println("**************");
		System.out.println(speaker.brand);
		speaker.brand="jbl";
		System.out.println(speaker.brand);
		
		
	}

}
