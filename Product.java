import java.util.*;
class Product
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter the First Number\n");
int a=obj.nextInt();
System.out.println("Enter the Second Number\n");
int b=obj.nextInt();
int p=a*b;
System.out.println(a+"*"+b+"="+p);
}
}