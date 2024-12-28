import  java.util.Scanner;
class SortStr
{
  public static void main(String args[])
  {
      String temp;
      Scanner SC=new Scanner(System.in);
      System.out.println("enter the value of n:");
      int N=SC.nextInt();
      SC.nextLine();
      String names[]=new String[N];
      System.out.println("enter names");
      for(int i=0;i<N;i++)
      {
         System.out.println("enter name [ " + (i+1) +"]:");
         names[i]=SC.nextLine();
        }
        for(int i=0;i<N;i++)
        {
           for( int j=1;j<N;j++)
           {
               if(names[j-1].compareTo(names[j])>0)
               {
                   temp=names[j-1];
                    names[j-1]=names[j];
                    names[j]=temp;
                  }
              }
           }
           System.out.println("\n sorted names are in ascending order:");
           for(int i=0;i<N;i++)
           { 
             System.out.println(names[i]);
           }
        }
      }
    /* 
    javac slip3_1.java
    java SortStr
   */
