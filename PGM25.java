import java.util.*;
class PGM25
 { 
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of strings: ");
    int max=Integer.parseInt(sc.nextLine());
    System.out.println("Enter the String\n");
    String[] str=new String[max];
    System.out.println("Enter the Strings: ");
		for(int i=0;i<max;i++)
		{
			str[i]=sc.nextLine();
		}
    System.out.println("Before sort: ");
    System.out.print(Arrays.toString(str) + "\t");
    Arrays.sort(str);
    System.out.println("\nAfter sort: ");
    System.out.print(Arrays.toString(str) + "\t");
  }
 }