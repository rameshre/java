import java.util.*;
public class PGM18
{
public static void main(String args[])
{
int q,a=0,s=0;
Scanner obj=new Scanner(System.in);
System.out.println("Enter the number\n");
int n=obj.nextInt();
q=n;
while(n>0)
{
a=n%10;
s=s+a*a*a;
n=n/10;
}
if(s==q)
System.out.println("Number is armstrong");
else
System.out.println("Number is not armstrong");
}
}