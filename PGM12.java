import java.util.*;
class PGM12
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter the String\n");
String str=obj.nextLine();
System.out.println("Number of vowels in the String:"+countVowels(str)+"\n");
}
public static int countVowels(String str)
{
int count=0;
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
{
count++;
}
}
return count;
}
}
