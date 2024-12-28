Package
package SY;
public class SYMarks
{
     int ct,mt,et;
     public SYMarks(int ct,int mt,int et)
     {
        this.ct=ct;
        this.mt=mt;
        this.et=et;
      }
      public void display()
      {
         System.out.println("marks:");
         System.out.println("computer\tmaths\telectronics");
         System.out.println(ct+"\t"+mt+"\t"+et);
       }
 }
 Package 2
 package TY;
 public class TYMarks
 {
    int Theory,Practicals;
    public TYMarks(int Theory,int Practicals)
    {
          this.Theory=Theory;
          this.Practicals=Practicals;
      }
      public void display()
      {
         System.out.println("marks are:");
         System.out.println("Theory\tPracticals");
         System.out.println(Theory+"\t"+Practicals);
       }
  }
  Mainfile
  import SY.SYMarks;
  import TY.TYMarks;
  import java.io.*;
  class SYTY
  {
  int rollno;
  int ComputerTotal,MathsTotal,ElecTotal,Theory,Practicals;
  String name;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  public SYTY()
  {}
  public SYTY(int rollno,String name)throws Exception
  {
     this.rollno=rollno;
     this.name=name;
     System.out.println("enter SY marks:");
     System.out.println("\nenter computer marks:");
     ComputerTotal=Integer.parseInt(br.readLine());
  while((ComputerTotal<0||ComputerTotal>100))
  {
     System.out.println("\n\tinvalid marks:");
     System.out.println("please reenter the marks:");
     ComputerTotal=Integer.parseInt(br.readLine());
  }
  System.out.println("\n enter maths marks:");
  MathsTotal=Integer.parseInt(br.readLine());
  while((MathsTotal<0||MAthsTotal>100))
  {
      System.out.println("\n\tinvalid marks:");
     System.out.println("please reenter the marks:");
     MathsTotal=Integer.parseInt(br.readLine());
  }
  System.out.println("\n enter electronics marks:");
  ElecTotal=Integer.parseInt(br.readLine());
  while((ElecTotal<0||ElecTotal>100))
  {
  System.out.println("\n\tinvalid marks:");
     System.out.println("please reenter the marks:");
     ElecTotal=Integer.parseInt(br.readLine());
  }
  SYMarks sy=new SYMarks(ComputerTotal,MathsTotal,ElecTotal);
  System.out.println("\nenter TY marks:");
  System.out.println("\n enter theory marks:");
  Theory=Integer.parseInt(br.readLine());
  while((Theory<0||Theory>100))
 {
     System.out.println("\n\tinvalid marks:");
     System.out.println("please reenter the marks:");
     Theory=Integer.parseInt(br.readLine());
  }
  System.out.println("\n enter practicals marks:");
 Practicals=Integer.parseInt(br.readLine());
  while((Practicals<0||Practicals>100))
  {
  System.out.println("\n\tinvalid marks:");
     System.out.println("please reenter the marks:");
     Practicals=Integer.parseInt(br.readLine());
  }
  TYMarks ty=new TYMarks(Theory,Practicals);
  CalculateGrade();
 }
 public void getdata()throws Exception
 {
   System.out.println("enter number of students:");
   int n=Integer.parseInt(br.readLine());
   SYTY object[]=new SYTY[n];
   for(int i=0;i<n;i++)
   {
    System.out.println("\nenter name:");
    String name=br.readLine();
    System.out.println("\n enter roll no:");
    int roll=Integer.parseInt(br.readLine());
    object[i]=new SYTY(roll,name);
    System.out.println("-----------------------");
  }
 }
 public void CalculateGrade()
 {
   double percentage;
   percentage=(ComputerTotal+MathsTotal+ElecTotal+Theory+Practicals)/5;
   System.out.println("Results:");
   if(percentage>=70)
   System.out.println("Grade:A");
   else  if(percentage>=60)
   System.out.println("Grade:B");
   else  if(percentage>=50)
   System.out.println("Grade:c");
   else  if(percentage>=40)
   System.out.println("Grade:PASS");
   else 
   System.out.println("Grade:FAIL\n\t Try again..........");
  }
  public static void main(String args[])throws Exception
  {
    SYTY st=new SYTY();
    st.getdata();
  }
 }
