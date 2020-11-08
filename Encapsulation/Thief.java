public class Thief
{
public static void steal()
{
System.out.println("thief class");
System.out.println("invoked steal method");
double bank=Reliance.getBudget();
System.out.println("bank include budget from Reliance:"+bank);

//this become private Reliance.budget=0;

//System.out.println("bank value made zero:"+Reliance.budget);

System.out.println("exit::thief");
}
}