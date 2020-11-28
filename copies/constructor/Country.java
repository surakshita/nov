package com.xworkz.copies.constructor;

public class Country {

	public String name;
	public byte states;
	public String captial;
	public String sport;
	public int totalLanguages;
	public int population;
	public byte rankLargestedCountry;
	public String founder;

	public Country(String nameOfCountry, byte totalStates, String cptialOfCountry, String sportOfCountry,
			int langSpoken, int populationTotal, byte rank, String founderOfCountry) {
		
		name=nameOfCountry;
		states=totalStates;
		captial=cptialOfCountry;
		sport=sportOfCountry;
		totalLanguages=langSpoken;
		population=populationTotal;
		rankLargestedCountry=rank;
		founder=founderOfCountry;

	}

}
