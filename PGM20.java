import java.util.*;
public class PGM20
{
public static void main(String args[])
{
int a=0,s=0;
Scanner obj=new Scanner(System.in);
System.out.println("Enter the Number\n");
int n=obj.nextInt();
int q=n;
while(n>0)
{
a=n%10;
s=s*10+a;
n=n/10;
}
System.out.println("Reverse of "+q+" is"+s);
}
}
