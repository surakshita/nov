package com.xworkz.concepts;

import com.xworkz.concepts.obj.Vehicle;

public class ObjectTester {

	public static void main(String[] args) {
		
		Vehicle vehicle=new Vehicle();
		vehicle.displayInfo();
		vehicle.model="BMW";
		vehicle.color="Black";
		vehicle.displayInfo();

		
		System.out.println("*******************");
		Vehicle vehicle1=new Vehicle();
		
		vehicle1.model="Baleno";
		vehicle1.color="silver";
		vehicle1.displayInfo();
		
	}

}
