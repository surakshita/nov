public class Ans3
{
public static void main(String[] args)
{
System.out.println("main invoked");

String alphabets="26";
byte convertNo=Byte.parseByte(alphabets);
System.out.println("converted:"+convertNo);

String statesInWorld="206";
short total=Short.parseShort(statesInWorld);
System.out.println("total:"+total);

String species="8000000";
int totalSpecies=Integer.parseInt(species);
System.out.println("total:"+totalSpecies);

String youTubeChannels="31000000000L"; 
long convert=Long.parseLong(youTubeChannels);
System.out.println("total:"+ convert);

String temp="36.3f";
float convertedTemp=Float.parseFloat(temp);
System.out.println("temp:"+ convertedTemp);

String geographicalArea="12.56d";
double convertedArea=Double.parseDouble(geographicalArea);
System.out.println("area:"+ convertedArea);

String acIsTurnedOn="false";
boolean convertedFloat=Boolean.parseBoolean(acIsTurnedOn);
System.out.println("converted:"+ convertedFloat);

String shoeSize='7';
char convertChar=shoeSize.charAt(0);
System.out.println("char:"+convertChar);

}
}