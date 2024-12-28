 package student;
class StudentInfo
{
    public int r_no;
    public String name,clas;
    public int a,b,c,d,e,f;
    int sum=0;
    double per;
    public void display()
    {
      System.out.println("roll no:"+r_no);
      System.out.println("name:"+name);
      System.out.println("class:"+clas);
      System.out.println("-----------------");
      System.out.println("sub 1:"+a);
      System.out.println("sub 2:"+b);
      System.out.println("sub 3:"+c);
      System.out.println("sub 4:"+d);
      System.out.println("sub 5:"+e);
      System.out.println("sub 6:"+f);
      System.out.println("total:"+sum);
      System.out.println("percentage:"+per);
      System.out.println("----------------------");
    }
 }
 public class StudentPer extends StudentInfo
 {
            public StudentPer(int rollno,String nm,String cla,int m1,int m2,int m3,int m4,int m5,int m6)
         {
              r_no=rollno;
              clas=cla;
              name=nm;
              a=m1;
              b=m2;
              c=m3;
              d=m4;
              e=m5;
              f=m6;
              sum=a+b+c+d+e+f;
              per=sum/6;
            }
     }
     Main File
     import student.StudentPer;
     import java.util.*;
     import java.lang.*;
     import java.io.*;
     class StudentMain
     {
         public   static void main(String[] args)
         {
           String nm,cla;
           int rollno;
           Scanner sc=new Scanner(System.in);
           System.out.println("enter roll no:=");
           rollno=sc.nextInt();
           System.out.println("enter name:=");
           nm=sc.next();
           System.out.println("enter class:=");
           cla=sc.next();
           int m1,m2,m3,m4,m5,m6;
           System.out.println("enter 6 sub marks:");
           m1=sc.nextInt();
           m2=sc.nextInt();
           m3=sc.nextInt();
           m4=sc.nextInt();
           m5=sc.nextInt();
           m6=sc.nextInt();
           StudentPer s=new StudentPer(rollno,nm,cla,m1,m2,m3,m4,m5,m6);
           s.display();
      }
   }
           
            
         
