import java.io.*;
class Student
{
  public static void main(String args[])throws Exception
  {
    InputStreamReader r=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(r);
    System.out.println("enter name:");
    String name=br.readLine();
    System.out.println("enter rollno:");
    String number=br.readLine();
    System.out.println("enter percentage:");
    String marks=br.readLine();
    System.out.println("enter class:");
    String classname=br.readLine();
   System.out.println("name:"+name);
   System.out.println("rollno:"+number);
   System.out.println("marks:"+marks);
   System.out.println("class:"+classname);
 }
}
   
   
   /*
   javac slip25_1.java
   java Student
   */ 
