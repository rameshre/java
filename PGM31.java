import org.shapes.*;
import java.util.*;
class PGM31
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Side of square\n");
  int s=sc.nextInt();
  Square sq=new Square(s);
  System.out.println("Area of Square = "+sq.area());

  System.out.println("Enter the radius of Circle\n");
  int r=sc.nextInt();
  Circle1 c1=new Circle1(r);
  System.out.println("Area of circle = "+c1.area());

  System.out.println("Enter the base and height of Triangle\n");
  int b=sc.nextInt();
  int h=sc.nextInt();
  Triangle t=new Triangle(b,h);
  System.out.println("Area of Square = "+t.area());
 }
}