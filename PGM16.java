import java.util.*;
public class PGM16
{
public static void main(String args[])
{
int c;
Scanner in=new Scanner(System.in);
System.out.println("Enter the first Number\n");
int a=in.nextInt();
System.out.println("Enter the second number\n");
int b=in.nextInt();
System.out.println("Numbers before swapping:\n a="+a+"\n b="+b);
c=a;
a=b;
b=c;
System.out.println("Numbers after swapping using 3rd variable:\n a="+a+"\n b="+b);
System.out.println("Enter the first Number\n");
int x=in.nextInt();
System.out.println("Enter the second number\n");
int y=in.nextInt();
System.out.println("Numbers before swapping:\n x="+x+"\n y="+y);
x=x+y;
y=x-y;
x=x-y;
System.out.println("Numbers after swapping without using 3rd variable:\n x="+x+"\n y="+y);
}
}