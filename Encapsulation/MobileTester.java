public class MobileTester
{
public static void main(String[] args)
{
System.out.println("invoked main");

String value=args[0];
String securityValue=Mobile.getSecurity();

System.out.println("Value"+ securityValue);

Mobile.setSecurity(value);

securityValue=Mobile.getSecurity();

System.out.println("Value"+securityValue);

System.out.println("EXIT");

}
	
}