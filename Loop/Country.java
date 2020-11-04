public class Country
{
public static void main(String[] names)
{
System.out.println("main::");

for(byte place=0;place<=names.length;place++)
{
System.out.println("names=:"+names);
String print=names[place];
System.out.println("print:"+print);
}
System.out.println("exit:");
}
}