public class Mobile
{
private static String security="Pin";

public static String getSecurity()
{
System.out.println("getSecurity");
return security;
}

public static void setSecurity(String newSecurity)
{
if(newSecurity.equals("Face") || newSecurity.equals("FingerPrint"))
{
System.out.println("new security:"+newSecurity);
security=newSecurity;
}
else
{
System.out.print("can't use");
}
}
}
