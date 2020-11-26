package com.xworkz.copies.camera;

public class Camera {
	
	public String brand;
	public String connectivity;
	public String battery;
	public String color;
	public String price;
	
	public static String autoFocus;
	public static String displayType;
	
	public void detail()
	{
		System.out.println("invoked details");
		System.out.println(brand);
		System.out.println(connectivity);
		System.out.println(battery);
		System.out.println(color);
		System.out.println(price);
		System.out.println(autoFocus);
		System.out.println(displayType);
	}

}
