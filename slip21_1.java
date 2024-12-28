import java.util.*;
class InvalidDateException extends Exception
{
}
class MyDate
{
  int day,month,year;
public void accept()
{
System.out.println("enter date,month and year");
try
{
Scanner sc=new  Scanner(System.in);
day=sc.nextInt();
  if(day<1||day>31)
  throw new InvalidDateException();
  month=sc.nextInt();
  if(month>12||month<1)
  throw new InvalidDateException();
  year=sc.nextInt();
  if(year>10000||year<1000)
  throw new InvalidDateException();
}
catch(InvalidDateException e)
{
  System.out.println("invalid date entered:");
  System.exit(0);
}
}
public void display()
{
System.out.println("entered date is"+day+":"+month+":"+year);
}
public static void main(String args[])
{
 MyDate ob=new MyDate();
 ob.accept();
 ob.display();
}
}

/*
javac slip21_1.java
java MyDate
*/
