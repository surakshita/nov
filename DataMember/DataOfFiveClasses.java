public class DataOfFiveClasses
{ 
public static void main(String[] args)
{
System.out.println("main:");

byte val1=Human.organs;
System.out.println("organs number:"+val1);

byte val2=Human.humanAverageAge;
System.out.println("human age max:"+val2);

short val3=Human.cellsTypes;
System.out.println("number of cells:"+val3);

byte val4=Human.senses;
System.out.println("number of senses:"+val4);

short val5=Human.bones;
System.out.println("number of bones:"+val5);

System.out.println("plant class");
int plantNum=Plants.noTypes;
System.out.println("types of plants:"+plantNum);
String ex=Plants.example;
System.out.println("example:"+ex);
System.out.println("color:"+ Plants.color);
System.out.println("life time:"+ Plants.life);
System.out.println("blossom most at :"+ Plants.blossom);

System.out.println("Trainee class:");
System.out.println("name:"+Trainee.name);
System.out.println("degree:"+Trainee.degree);
System.out.println("experience:"+ Trainee.experience);
System.out.println("skills:"+Trainee.skills);
System.out.println("lang:"+Trainee.languages);

System.out.println("device class:");
System.out.println("no of types :"+ Device.types);
System.out.println("one:"+ Device.type1);
System.out.println("two:"+ Device.type2);
System.out.println("three:"+ Device.type3);
System.out.println("example:"+Device.example);

System.out.println("Season class:");
System.out.println("seasons types:"+Seasons.types);
System.out.println("example:"+ Seasons.example);
System.out.println("duration of spring:"+ Seasons.duration);
System.out.println("month of spring:"+ Seasons.month);
System.out.println("flower name:"+ Seasons.springFlower);
}
}