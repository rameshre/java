import java.util.*;
class PGM14
{
public static void main(String args[])
{
int first=0,second=1,i;
Scanner obj=new Scanner(System.in);
System.out.println("Enter the limit");
int max=obj.nextInt();
System.out.println("Fibonacci series of"+max+"numbers:\n");
for(i=0;i<max;i++)
{
System.out.println(first+" ");
int sum=first+second;
first=second;
second=sum;
}
}
}