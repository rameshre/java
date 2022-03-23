import java.util.*;
public class PGM9
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter the first number\n");
int a=obj.nextInt();
System.out.println("Enter the second number\n");
int b=obj.nextInt();
System.out.println("Enter the third number\n");
int c=obj.nextInt();
System.out.println("The result is:"+sumoftwo(a,b,c));
}
public static boolean sumoftwo(int x,int y,int z)
{
return((x+y)==z|| (y+z)==x ||(z+x)==y);
}
}
