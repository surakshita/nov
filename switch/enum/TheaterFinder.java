public class TheaterFinder
{
public static void main(String[] args)
{
System.out.println("switch and enum:");

TheaterBest.usingString("PVR");
String theaterName="MUKTA";

Theater enumName=Theater.valueOf(theaterName);
TheaterBest.usingEnum(enumName);

}
}
