import java.util.*;
public class PGM17
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter the starting limit\n");
int a=obj.nextInt();
System.out.println("Enter the max limit\n");
int b=obj.nextInt();
for(int i=a;i<=b;i++)
{
if(i%2!=0)
{
System.out.println("Prime Numbers are:"+i);
}
}
}
}