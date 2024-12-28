import java.util.*;
abstract class Shape
{
      int n1,n2;
      public abstract void printArea();
}
class Rectangle extends Shape
  {
	 Rectangle(int a,int b)
      {
	n1=a;
  	n2=b;
       }
        public void printArea()
    {
        float area;
	area=n1*n2;
	System.out.println("area of rectangle="+area);
    }
}
class Triangle extends Shape
{
Triangle(int a,int b)
{
n1=a;
n2=b;
}
public void printArea()
{
float area;
area=(n1*n2)/2;
System.out.println("area of triangle="+area);
}
}
class Circle extends Shape
   {
		Circle(int a)
        {
  		n1=a;
         }
          public void printArea()
     {
	 System.out.println("area of circle="+3.142*n1*n1);
     }
}
class Area
{
public static void main(String args[])
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 2 values");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
		Rectangle ob=new Rectangle(n1,n2);
		ob.printArea();
		Triangle tr=new Triangle(n1,n2);
		tr.printArea();
		Circle cr=new Circle(n1);
		cr.printArea();
   }
}

/*
javac slip22_1.java
java Area
*/
