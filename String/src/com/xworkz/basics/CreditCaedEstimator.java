package com.xworkz.String;

public class CreditCaedEstimator {
	
	private static double limitAmount=1000;
	
	public static void expenditure(double amount)
	{
		System.out.println("expenditure");
		System.out.println("amount spent:"+amount);
		if(amount>limitAmount)
		{
			System.out.println("credit limit exceeded");
			
		}
		else
		{
			System.out.println("within the limit");
		}
	}
	public static double getLimitAmount()
	{
		return limitAmount;
	}
	
	

}
