
import java.io.*;


public class FileEx{

 public static void main(String args[])
 {

     int i;

     try{
  
     FileInputStream fin =new FileInputStream("data.txt");

     FileOutputStream fodd=new FileOutputStream("dataodd1.txt");

     FileOutputStream feven= new FileOutputStream("dataeven1.txt");
 
     while((i=fin.read()) != -1) 

     {
 
     if(i%2==0)
 
     feven.write(i);

      else
   
   fodd.write(i);
 
    }
 
   
     fodd.close();

   fin.close();

     feven.close();

     }catch(Exception e){
 
     System.out.println("There are some IOException") ;
  

     }

 }

}