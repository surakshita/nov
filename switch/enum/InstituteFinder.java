public class InstituteFinder
{
public static void usingString(String institueName)
{
switch(institueName)
{
case "XWORKZ":
System.out.println("name:"+institueName);
System.out.println("enterprise project 20k");
break;

case "JSPIDER":
System.out.println("name:"+institueName);
System.out.println("java project 30k");
break;

default:
System.out.println("no institute found");
}
}

public static void usingEnum(Institute institueName)
{
switch(institueName)
{
case XWORKZ:
System.out.println("name:"+institueName);
System.out.println("enterprise project 20k");
break;

case JSPIDER:
System.out.println("name:"+institueName);
System.out.println("java project 30k");
break;

default:
System.out.println("no institute found");
}
}
}
