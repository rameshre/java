import java.util.*;
class Product
{
int pcode,price;
String pname;
Product(int x, String y,int z)
{
pcode=x;
pname=y;
price=z;
}
}
public class PGM21
{
public static void main(String args[])
{
Scanner obj=new Scanner (System.in);
System.out.println("Enter the details of First Product\n");
System.out.println("Enter the Product code\n");
int a1=obj.nextInt();
System.out.println("Enter the Product Name\n");
String b1=obj.next();
System.out.println("Enter the Product Price\n");
int c1=obj.nextInt();
Product pdt1=new Product(a1,b1,c1);

System.out.println("Enter the details of Second Product\n");
System.out.println("Enter the Product code\n");
int a2=obj.nextInt();
System.out.println("Enter the Product Name\n");
String b2=obj.next();
System.out.println("Enter the Product Price\n");
int c2=obj.nextInt();
Product pdt2=new Product(a2,b2,c2);

System.out.println("Enter the details of Third Product\n");
System.out.println("Enter the Product code\n");
int a3=obj.nextInt();
System.out.println("Enter the Product Name\n");
String b3=obj.next();
System.out.println("Enter the Product Price\n");
int c3=obj.nextInt();
Product pdt3=new Product(a3,b3,c3);
if(pdt1.price<pdt2.price && pdt1.price<pdt3.price)
  System.out.println("The lowest price is for "+pdt1.pname);
else if(pdt2.price<pdt1.price && pdt2.price<pdt3.price)
  System.out.println("The lowest price is for "+pdt2.pname);
else
System.out.println("The lowest price is for "+pdt3.pname);
}
}