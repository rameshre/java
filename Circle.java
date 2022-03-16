import java.util.*;
class Circle
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter the radius\n");
Double r=obj.nextDouble();
Double a=Math.PI*r*r;
Double p=2*Math.PI*r;
System.out.println("Area="+a);
System.out.println("Perimeter="+p);
}
}