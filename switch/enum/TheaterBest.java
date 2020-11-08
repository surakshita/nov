public class TheaterBest
{
public static void usingString(String theaterName)
{
switch(theaterName)
{
case "MIRAJ":
System.out.println("name:"+theaterName);
System.out.println("located in Gulbarga");
break;

case "MUKTA":
System.out.println("name:"+theaterName);
System.out.println("located in Gulbarga");
break;

case "PVR":
System.out.println("name:"+theaterName);
System.out.println("located in banglore");
break;

default:
System.out.println("no theater found with that name:");
}
}

public static void usingEnum(Theater theaterName)
{
switch(theaterName)
{
case MIRAJ:
System.out.println("name:"+theaterName);
System.out.println("located in Gulbarga");
break;

case MUKTA:
System.out.println("name:"+theaterName);
System.out.println("located in Gulbarga");
break;

case PVR:
System.out.println("name:"+theaterName);
System.out.println("located in banglore");
break;

default:
System.out.println("no theater found with that name:");

}
}
}