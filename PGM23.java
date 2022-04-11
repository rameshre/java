import java.util.*;
class ComplexNumber
{
int real,image;
ComplexNumber(int r,int i)
{
this.real=r;
this.image=i;
}
public void show()
{
System.out.println(this.real+ " +i"+ this.image);
}
ComplexNumber add(ComplexNumber n1,ComplexNumber n2)
{
ComplexNumber res1=new ComplexNumber(0,0);
res1.real=n1.real+n2.real;
res1.image=n1.image+n2.image;
return res1;
}
}
public class PGM23
{
public static void main(String args[])
{
ComplexNumber c1=new ComplexNumber(4,5);
ComplexNumber c2=new ComplexNumber(10,5);
System.out.println("First Complex Number\n");
c1.show();
System.out.println("Second Complex Number\n");
c2.show();


System.out.println("Sum of Complex Number\n");
ComplexNumber x=c1.add(c1,c2);
x.show();
}
}
