import java.io.InputStreamReader;
import  java.io.BufferedReader;
import java.io.IOException;
class continent
{
      String con;
      InputStreamReader i=new InputStreamReader(System.in);
     BufferedReader r=new BufferedReader(i);  
 void con_input()throws IOException
     {
          System.out.println("enter the countryname:");
          con=r.readLine();
      }
 }
    class country extends continent
      {
           String cou;
            void cou_input() throws IOException
             {
                  System.out.println("enter country name:");
                   cou=r.readLine();
             }
       }
  class State extends country
       {
              String sta;
              void sta_input() throws IOException
           { 
               System.out.println("enter the state name:");
               sta=r.readLine();
           }
      }
   class Main extends State
        {
            String pla;
            void pla_input()throws IOException
             {
                 System.out.println("enter the place name:");
                 pla=r.readLine();
             }
  public static void main(String args[])throws IOException
   {
       Main s=new Main();
       s.con_input();
       s.cou_input();
       s.sta_input();
       s.pla_input();
      System.out.println("\n\ncontinent:"+s.con);
      System.out.println("\n\ncountry:"+s.cou);
      System.out.println("\nstate:"+s.sta);
      System.out.println("\nplace:"+s.pla);
   }
 }
 
     
     
     
