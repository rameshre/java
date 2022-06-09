import java.util.*;
import java.io.IOException;
class MyException extends Exception
{
	public MyException(String str)
{
System.out.println(str);
}
}
public class PGM33
{
	public static void main(String args[]) throws IOException
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the limit\n");
	int n=sc.nextInt();
	int sum=0,k=0;
 	Integer numbers[]=new Integer[n];
	while(n>0){try
	{
	System.out.println("Enter the numbers\n");
	int num=sc.nextInt();
	if(num<0)
	{
throw new MyException("Number is negative");
}
else
{
numbers[k]=num;
sum=sum+num;
k++;
}
n--;
}
catch (MyException m)
{
System.out.println(m);
}
}
System.out.println("The average is " + sum/k);
}
}