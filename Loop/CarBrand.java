public class CarBrand
{
public static void main(String[] args)
{
getBrands();
}
public static String[] getBrands()
{
String[] names={"BMW","Honda","jaguar","Toyota","Ferrari","Tesla"};

for(int count=0;count<names.length;count++)
{
System.out.println("count:"+count);
String carName=names[count];

System.out.println("Brands="+ carName);
}
return names; 
}
}
