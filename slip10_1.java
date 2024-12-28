import java.util.*;
interface Cube
{
   float cube();
 }
class Draw implements Cube
{
  public float cube()
  {
     System.out.println("ente the number:");
     Scanner sc=new Scanner(System.in);
     float n=sc.nextInt();
     double cube=n*n*n;
     System.out.println("cube of the no is:"+cube);
     return 0;
   }
   public static void main(String args[])
   {
       Draw d=new Draw();
       d.cube();
    }
  }
  
  /*
   javac slip10_1.java
   java Draw
   */
