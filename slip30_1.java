import java.util.*;
class person
	{
		String Personname;
		int Adharno, Panno;
		public void display()
	{
 System.out.println("Name of the Person:"+this.Personname+" "+ "Adharnumber is: "+ this.Adharno+" "+"Pan numberis:"+ this.Panno);
        }
               public void accept()
        {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of the person:");
		Personname=sc.next();
		System.out.println("Enter Adhar number of the person:");
		Adharno=sc.nextInt();
		System.out.println("Enter Pan number of the person:");
		Panno=sc.nextInt();
	}
public static void main(String args[])
{ 
     int i;
     person ob=new person();
    for(i=1;i<=5;i++)
 {
    ob.accept(); 
  ob.display();
 }
}
}

/*
javac slip30_1.java
java person
*/
