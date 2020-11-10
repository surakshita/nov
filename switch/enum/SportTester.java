public class SportTester
{
public static void main(String[] args)
{
System.out.println("main invoked:");

String sportName="CRICKET";
Sport enumName=Sport.valueOf(sportName);

System.out.println("printing name:"+enumName);

//to find length
Sport[] allSports=Sport.values();
System.out.println("length :"+allSports.length);

for(int initial=0;initial<allSports.length;initial++)
{
System.out.println("name at index:"+initial);
Sport sportValue=allSports[initial];
System.out.println("enum name:"+sportValue);

}
}
}
