package com.xworkz.basics;

public class PocketMoneyEstimator {
	
	private static double totalAmount;
	
	public static void request(double amount,String day)
	{
		System.out.println("invoked request");
		System.out.println("index 0 amount:"+amount);
		System.out.println("index 1 day:"+day);
		//double totalAmount=0.0;
		totalAmount=totalAmount+amount;
		System.out.println("totalAmount after request:"+totalAmount);
		System.out.println("exit:request");
		
	}
	
	public static void expenditure(double amount)
	{
		System.out.println("invoked expenditure");
		System.out.println("args 1:"+amount);
		totalAmount=totalAmount-amount;
		System.out.println("totalamount after expenditure:"+totalAmount);
		System.out.println("exit:expenditure");
    }
	
}

