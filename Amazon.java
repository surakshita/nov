package com.xworkz.online;

public class Amazon {
	private static String[] items = { "mobile", "watch", "shoes", "dress", "books", "jewellery", "headphones",
			"home decore's", "git cards" };
	
	public static void search(String products)
	{
		System.out.println("search invoking");
		System.out.println("total items:"+items.length);
		System.out.println("arg 0:"+products);
		
		boolean itemFound=false;
		
		for(int count=0;count<items.length;count++)
		{
			//System.out.println("item at position:"+items[count]);
			String item=items[count];
			
			if(item.equals(products))
			{
				//System.out.println("item found");
				itemFound=true;
				break;
			}
			else 
			{
				//System.out.println("item not found");
				itemFound=false;
				
			}
		}
		
		if(itemFound)
		{
			System.out.println("item found");
			
		}
		else
		{
			System.out.println("item not found");
		}
		System.out.println("search exit");
			
	}
	
	public static int totalItems()
	{
	return items.length;
	}
}
