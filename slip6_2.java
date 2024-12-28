import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
abstract class Order
{
  String id,des;
}
class Porder extends Order
{
   String cnm,vnm;
   public void accept()throws IOException
   {
        System.out.println("enter id,description,name of customer and vendors:");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        id=br.readLine();
        des=br.readLine();
        cnm=br.readLine();
        vnm=br.readLine();
    }
    public void display()
    {
      System.out.println("id:"+id);
      System.out.println("description:"+des);
      System.out.println("customer name:"+cnm);
      System.out.println("vendor name:"+vnm);
      System.out.println("----------------------------");
   }
 }
 class Sorder extends Order
 {
      String cnm,vnm;
   public void accept()throws IOException
   {
        System.out.println("enter id,description,name of customer and vendors:");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        id=br.readLine();
        des=br.readLine();
        cnm=br.readLine();
        vnm=br.readLine();
    }
    public void display()
    {
      System.out.println("id:"+id);
      System.out.println("description:"+des);
      System.out.println("customer name:"+cnm);
      System.out.println("vendor name:"+vnm);
      System.out.println("----------------------------");
   }
 }
 class Main
 {
    public static void main(String args[])throws IOException
    {
        int i;
        System.out.println("select any one :");
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("1.purchase order:");
         System.out.println("2.sales order:");
         System.out.println("3:exit:");
         int ch=Integer.parseInt(br.readLine());
         switch(ch)
         {
              case 1:System.out.println("enter the no of purchase order:");
              int n=Integer.parseInt(br.readLine());
              Porder[] l=new Porder[n];
              for(i=0;i<n;i++)
              {
                  l[i]=new Porder();
                  l[i].accept();
               }
               for(i=0;i<n;i++)
               {
                 l[i].display();
                 System.out.println("object is created:");
               }
               case 2:
               System.out.println("enter the no of sales order:");
               int m=Integer.parseInt(br.readLine());
               Porder[] h=new Porder[m];
                for(i=0;i<m;i++)
              {
                  h[i]=new Porder();
                  h[i].accept();
               }
               for(i=0;i<m;i++)
               {
                 h[i].display();
                 System.out.println("object is created:");
               }
               case 3:System.out.println("exit:");
               System.exit(0);
            }
         }
      }
   /*
   javac slip6_2.java
   java Main
 */
               
