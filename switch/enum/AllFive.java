public class AllFive
{
public static void main(String[] args)
{
System.out.println("main invoked");
System.out.println("Brand names:");

Brand[] allBrands=Brand.values();
System.out.println("length:"+allBrands.length);

for(int initial=0;initial<allBrands.length;initial++)
{
System.out.println("name at index:"+initial);
Brand brandValue=allBrands[initial];
System.out.println("name:"+brandValue);
}

System.out.println("*******************************************");
System.out.println("Fashion Brands:");

FashionBrand[] allFashionBrands=FashionBrand.values();
System.out.println("length:"+allFashionBrands.length);

for(int initialFashion=0;initialFashion<allFashionBrands.length;initialFashion++)
{
System.out.println("name at index:"+initialFashion);
FashionBrand brandFashionValue=allFashionBrands[initialFashion];
System.out.println("name:"+brandFashionValue);
}

System.out.println("*********************************************");
System.out.println("Fruits:");

Fruits[] allFruits=Fruits.values();
System.out.println("length:"+allFruits.length);

for(int initialFruit=0;initialFruit<allFruits.length;initialFruit++)
{
System.out.println("name at index:"+initialFruit);
Fruits fruitValue=allFruits[initialFruit];
System.out.println("name:"+fruitValue);
}

System.out.println("************************************************");
System.out.println("Transport:");

Transport[] allTransports=Transport.values();
System.out.println("length:"+allTransports.length);

for(int initialTransport=0;initialTransport<allTransports.length;initialTransport++)
{
System.out.println("name at index:"+initialTransport);
Transport transportValue=allTransports[initialTransport];
System.out.println("name:"+transportValue);
}

System.out.println("****************************************************");
System.out.println("Companies:");

Companies[] allCompanies=Companies.values();
System.out.println("length:"+allCompanies.length);

for(int initialC=0;initialC<allCompanies.length;initialC++)
{
System.out.println("name at index:"+initialC);
Companies cValue=allCompanies[initialC];
System.out.println("name:"+cValue);
}
}
}


