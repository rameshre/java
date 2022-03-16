import java.util.*;
class DigitSum
{
public static void main(String args[])
{
int a,s=0;
Scanner obj=new Scanner(System.in);
System.out.println("Enter a Number\n");
int n=obj.nextInt();
while(n>0)
{
 a=n%10;
 s=s+a;
 n=n/10;
}
System.out.println("Digit Sum="+s);
}
}
