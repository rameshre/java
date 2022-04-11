import java.util.*;
public class PGM22
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the number of rows\n");
int m=in.nextInt();
System.out.println("Enter the number of columns\n");
int n=in.nextInt();
int a[][]= new int[m][n];
int b[][]= new int[m][n];
int s[][]= new int[m][n];
if(m!=n)
{
System.out.println("Matrix addition not possible");
}
else
{
System.out.println("Enter the fist matrix\n");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
a[i][j]=in.nextInt();
}
}
System.out.println("Enter the second matrix\n");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
b[i][j]=in.nextInt();
}
}
System.out.println("Matrix after addition\n");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
s[i][j]=a[i][j]+b[i][j];
}
}
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(s[i][j]+"\t");
}
System.out.print("\n");
}
}
}
}