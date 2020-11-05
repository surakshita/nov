public class AddressCheck
{
public static void main(String[] args)
{
System.out.println("invoked main jvm");

short door=Address.doorNo;
System.out.println("door number:"+ door);

String cityName= Address.city;
System.out.println("city name:"+ cityName);

String streetName= Address.street;
System.out.println("street name:"+ streetName);

int zip= Address.pincode;
System.out.println("zip code:"+ zip);

}
}