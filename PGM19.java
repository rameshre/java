import java.util.*;
public class PGM19
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter the String\n");
String n=obj.nextLine();
int s=n.length();
boolean ispalindrome=true;
for(int i=0;i<s/2;i++)
{
if(n.charAt(i)==n.charAt(s-i-1))
continue;
else
{
ispalindrome=false;
break;
}
}
if(ispalindrome)
System.out.println("The string "+n+" is palindrome\n");
else
System.out.println("The string "+n+" is not palindrome\n");
}
}
