public class InstituteTester
{
public static void main(String[] args)
{
System.out.println("switch and enum:");

InstituteFinder.usingString("XWORKZ");
String institueName="JSPIDER";

Institute enumInstituteName=Institute.valueOf(institueName);
InstituteFinder.usingEnum(enumInstituteName);

}
}