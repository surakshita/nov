package com.xworkz.anniversary;

import com.xworkz.anniversary.celebrate.*;//wild card import

import static com.xworkz.anniversary.celebrate.Party.join;//static import

import java.time.LocalDate;
import java.time.LocalTime;




public class Tester {

	public static void main(String[] args) {
		System.out.println("invoked main");
		Event.team();
		join();
		com.xworkz.anniversary.festival.Event.play();//inner import
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
	}

}
