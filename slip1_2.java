import java.util.*;
abstract class Staff
{
   protected int id;
   protected String name;
   public Staff(int id,String name)
   {
     this.id=id;
     this.name=name;
    }
 }
    class OfficeStaff extends Staff
    {
      String dept;
      OfficeStaff(int id,String name,String dept)
      {
         super(id,name);
         this.dept=dept;
       }
     public void display()
     {
       System.out.println("ID:"+id+" name:"+name+" department:"+dept);
      }
      public static void main(String args[])
      {
         int n,id;
         String name,dept;
         Scanner sc=new Scanner(System.in);
         System.out.println("how many staff members?");
         n=sc.nextInt();
         OfficeStaff ob[]=new OfficeStaff[n];
         System.out.println("enter details of "+n+" staff");
         for(int i=0;i<n;i++)
         {
           System.out.println("enter id,name,departement");
           id=sc.nextInt();
           name=sc.next();
           dept=sc.next();
           ob[i]=new OfficeStaff(id,name,dept);
         }
         System.out.println("entered details are:");
         for(int i=0;i<n;i++)
         {
           ob[i].display();
         }
      }
   }
   /*
    javac slip1_2.java
    java OfficeStaff
   */
