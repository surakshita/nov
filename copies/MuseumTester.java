package com.xworkz.copies;

import com.xworkz.copies.constructor.Museum;

public class MuseumTester {

	public static void main(String[] args) {
		
		Museum museum=new Museum("ART & GALLERIES","LOUVRE MUSEUM","PARIS");
		System.out.println("Type of Museum:"+museum.type);
		System.out.println("Name of museum:"+museum.name);
		System.out.println("Located at:"+museum.location);
		System.out.println("*********************************************************");
		Museum museum2=new Museum("HISTORICAL & CULTURAL","THE ARMY MUSEUM","PARIS");
		System.out.println("Type of Museum:"+museum2.type);
		System.out.println("Name of museum:"+museum2.name);
		System.out.println("Located at:"+museum2.location);
		System.out.println("*********************************************************");
		Museum museum3=new Museum("DANCE MUSEUM","NATIONAL MUSEUM OF DANCE AND HALL OF FRAME","NEW YORK");
		System.out.println("Type of Museum:"+museum3.type);
		System.out.println("Name of museum:"+museum3.name);
		System.out.println("Located at:"+museum3.location);
	
	
	}

}
