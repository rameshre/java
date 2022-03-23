import java.util.*;
class multiplication
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter a number\n");
int a=obj.nextInt();
for(int i=1;i<=10;i++)
{
System.out.println(i+"*"+a+"="+i*a);
}
}
}