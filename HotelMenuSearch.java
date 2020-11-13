package com.xworkz.hotel;

public class HotelMenuSearch {
private static String[] menu= {"veg.korma","dal fry","paneer kadai"};
	
	public static void search(String name)
	{
		System.out.println("search invoking");
		System.out.println("name:"+menu.length);
		System.out.println("arg 0:"+name);
		
		boolean menuItem=false;
		
		for(int count=0;count<menu.length;count++)
		{
			//System.out.println("item at position:"+items[count]);
			String items=menu[count];
			
			if(items.equals(name))
			{
				//System.out.println("item found");
				menuItem=true;
				break;
			}
			else 
			{
				//System.out.println("item not found");
				menuItem=false;
				
			}
		}
		
		if(menuItem)
		{
			System.out.println("dish on menu available");
			
		}
		else
		{
			System.out.println("dish on menu not available");
		}
		System.out.println("search exit");
			
	}
	
	public static int totalMenu()
	{
	return menu.length;
	}
}



