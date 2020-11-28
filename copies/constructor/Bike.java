package com.xworkz.copies.constructor;

public class Bike {
	
	public String color="RED";
			
	
	public Bike(String bikeColor)
	{
		System.out.println("invoked bike constructor");
		System.out.println("arg1:"+bikeColor);
		System.out.println("value assigned to arg at first");
		color=bikeColor;
		System.out.println("instance var :"+color);
	}

}
