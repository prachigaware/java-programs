import java.util.Scanner;
import java.util.*;
class Zerono extends Exception
{}
class prime
{
static int count=0;
public static void main(String args[])
{
  int i,j,no;
  Scanner sc=new Scanner(System.in);
  try
  {
  System.out.println("enter the no:");
  no=sc.nextInt();
  if(no==0)
  throw new Zerono();
  if(no>0)
  {
    for(i=2;i<=no/2;i++)
    {
      if(no%i==0)
      {
         count++;
      }
    }
  }
  if(count==0)
  System.out.println("no is prime");
  else
  System.out.println("no is not prime");
  }
  catch(Zerono ob)
  {
  System.out.println("no can not be zero");
 }
}
}

/*
javac slip14_1.java
java prime
*/
