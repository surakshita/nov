public class VTU
{
public static void printMessage()
{
System.out.println("invoked printMessage");
for(byte msg=0;msg<=4;msg++)
{
System.out.println("welcome to the future");
System.out.println("Message" +msg);
}
}


public static void printMessage(int loopSize)
{
System.out.println("invoked printMessage with parameter");
for(int msg=0;msg<=loopSize;msg++)
{
System.out.println("msg:" +msg);
}
}


public static void groupMessageAndLoop()
{
System.out.println("Invoked groupMessageAndLoop");
String[] messages={"Good Morning","how are you","have a great day","bye","take care"};
System.out.println("length:" +messages.length);
		 
for(int count=0;count<messages.length;count++)
{
System.out.println("messages count" +count);
String message=messages[count];
System.out.println("Display messages:" +message);
}
}
}

