import java.util.Scanner;
class UsernameException extends Exception
{
 public  UsernameException(String msg)
{
  super(msg);
}
}
class passwordException extends Exception
{
 public passwordException(String msg)
{
  super(msg);
}
}
public class PGM32
{
 public static void main(String[] args)
{
 Scanner s=new Scanner(System.in);
String username,password;
System.out.print("Enter username:");
 username=s.next();
System.out.print("Enter password:");
password=s.next();
int length=username.length();
try
{
if(l   se if(!password.equals("hello"))
throw new passwordException("Incorrect password\nType correct password");
else
System.out.println("Login Successfull!!!");
}
catch(UsernameException u)
{
u.printStackTrace();
}
catch(passwordException p)
{
p.printStackTrace();
}
finally
{
System.out.println("The finally statement is executed");
}
}
}