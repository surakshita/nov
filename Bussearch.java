package com.xworkz.bussearch;

public class Bussearch {
	private static String[] places= {"muysur","gulbarga","mangalore"};
	
	public static void search(String name)
	{
		System.out.println("search invoking");
		System.out.println("name:"+places.length);
		System.out.println("arg 0:"+name);
		
		boolean placeFound=false;
		
		for(int count=0;count<places.length;count++)
		{
			//System.out.println("item at position:"+items[count]);
			String names=places[count];
			
			if(names.equals(name))
			{
				//System.out.println("item found");
				placeFound=true;
				break;
			}
			else 
			{
				//System.out.println("item not found");
				placeFound=false;
				
			}
		}
		
		if(placeFound)
		{
			System.out.println("place found");
			
		}
		else
		{
			System.out.println("place not found");
		}
		System.out.println("search exit");
			
	}
	
	public static int totalPlaces()
	{
	return places.length;
	}
}

