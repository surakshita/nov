public class Scissor
{
public static void main(String[] clothes)
{
String store=clothes[0];
int argSwicth=Integer.parseInt(store);

switch(argSwicth)
{
case 1:
System.out.println("case one matched");
break;

case 2:
System.out.println("casetwo matched");
break;

case 3:
System.out.println("case three matched");
break;

default:
System.out.println("case doesn't matched");
break;
}
}
}