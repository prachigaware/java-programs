import java.util.*;
class college
{ 
 int no;
 String name;
 String addr;
 }
 class dept extends college
 {
   int dno;
   String dname;
   Scanner sc=new Scanner(System.in);
   public void accept()
   {
     System.out.println("enter no");
     no=sc.nextInt();
     System.out.println("enter the name");
     name=sc.next();
     System.out.println("enter the address");
     addr=sc.next();
     System.out.println("enter the department no");
     dno=sc.nextInt();
     System.out.println("enter the department name");
     dname=sc.next();
   }
   public void display()
   {
     System.out.println("college no:"+no);
     System.out.println("college name:"+name);
     System.out.println("college address:"+addr);
     System.out.println("department no:"+dno);
     System.out.println("departemnt name"+dname);
    }
    public static void main(String a[])
    {
      dept ob=new dept();
      ob.accept();
      ob.display();
   }
 }
 
 /*
  javac slip12_1.java
  java dept
  */
