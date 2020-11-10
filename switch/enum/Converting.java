public class Converting
{
public enum Currency
{
USD,INR,EURO
}
 
public static void main(String[] args)
{
String index=args[0];
System.out.println("index:"+index);
String inr="INR";

Enum currency=Enum.valueOf(Currency.class,inr);

System.out.println("string to enum:"+currency);
}
}

