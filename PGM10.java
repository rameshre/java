import java.util.*;
public class PGM10
{
public static void main(String args[])
{
int[] my_array1={101,235,111,555,107,234,869,367};
String[] my_array2={"java","python","php","c#","c","c++"};
System.out.println("Orginal string numeric array :"+Arrays.toString(my_array1));
Arrays.sort(my_array1);
System.out.println("Sorted numeric array:"+Arrays.toString(my_array1));
Arrays.toString(my_array1);
System.out.println("Orginal String array:"+Arrays.toString(my_array2));
Arrays.sort(my_array2);
System.out.println("Sorted numeric array:"+Arrays.toString(my_array2));
}
}