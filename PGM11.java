import java.util.*;
public class PGM11
{
public static void main(String args[])
{
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter 1st number\n");
	int a=obj.nextInt();
	System.out.println("Enter 2nd number\n");
	int b=obj.nextInt();
	System.out.println("Enter 3rd number\n");
	int c=obj.nextInt();
	System.out.println("The smallest number is"+Math.min(Math.min(a,b),c)+"\n"); 
}
}