public class Gallery
{
public static void main(String[] photos)
{
String folder=photos[0];
switch(folder)
{
case "Private":
System.out.println("private folder for photos");
System.out.println("nov 07");
break;

case "Public":
System.out.println("public folder for photos");
System.out.println("nov 07");
break;

case "Cloud":
System.out.println("cloud storage");
System.out.println("nov 07");
break;

default:
System.out.println("no photos are stored");

}
}
}