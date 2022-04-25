import java.util.*;
class Employee
{
int eno;
String eName;
int eSalary;
public Employee(int no,String name, int salary)
{
this.eno=no;
this.eName=name;
this.eSalary=salary;
}
public void showData()
	{
		System.out.print("Emp Id= "+eno+" "+"Employee name= "+eName+" salary= "+eSalary);
		System.out.println();
	}
}
public class PGM27
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of employee");
int n=sc.nextInt();
Employee[] array=new Employee[n];
for(int i=0;i<n;i++)
{
System.out.println("Please enter your employee number:");
            int e = sc.nextInt();
            System.out.printf("Please enter name:");
            String name=sc.next();
            System.out.printf("Please enter your salary:");
            int s = sc.nextInt();
            array[i] = new Employee(e,name,s);
}
System.out.println("Enter the employee number for searching\n");
int x=sc.nextInt();
boolean found=false;
for(Employee e:array)
{
if(x==e.eno)
{
found=false;
System.out.println("Employee found\n");
e.showData();
}
}
if(!found)
		{
			System.out.println("Employee Not available\n");
		}
}
}