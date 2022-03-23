import java.util.*;
public class PGM8
{
public static void main(String args[])
{
String test="jdsfsdg;sg;sg1234";
count(test);
}
public static void count(String x)
{
char[] ch=x.toCharArray();
int l=0;
int space=0;
int num=0;
int other=0;
for(int i=0;i<x.length();i++)
{
if(Character.isLetter(ch[i]))
{
l++;
}
else if(Character.isDigit(ch[i]))
{
num++;
}
else if(Character.isSpaceChar(ch[i]))
{
space++;
}
else
{
other++;
}
}
System.out.println("The String is:........");
System.out.println("letter :"+l);
System.out.println("number :"+num);
System.out.println("Other :"+other);
}
}