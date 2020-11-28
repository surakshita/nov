package com.xworkz.copies;
import com.xworkz.copies.constructor.Bike;

public class BikeTester {
	
	public static void main(String[] args)
	
	{
		Bike bike=new Bike("BLUE");
		System.out.println(bike.color);
		
		Bike ktm=new Bike("orange");
		System.out.println(ktm.color);
		
	}

}
