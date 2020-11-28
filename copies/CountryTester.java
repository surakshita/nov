package com.xworkz.copies;

import com.xworkz.copies.constructor.Country;

public class CountryTester {

	public static void main(String[] args) {
		String state="29";
		byte states=Byte.parseByte(state);
		
		String populatedRank="2";
		byte rankLargestedCountry=Byte.parseByte(populatedRank);
		
		Country country=new Country("INDIA",states,"DELHI","HOCKEY",22,1380004385,rankLargestedCountry,"vasco de gama");
		System.out.println(country.name);
		System.out.println(country.states);
		System.out.println(country.captial);
		System.out.println(country.sport);
		System.out.println(country.totalLanguages);
		System.out.println(country.population);
		System.out.println(country.rankLargestedCountry);
		System.out.println(country.founder);
		
	}

}