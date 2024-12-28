import java.io.*;
class slip
{
     public static void main(String argd[])throws Exception
     {
        String fname=argd[0];
        File f=new File(fname);
        if(f.isFile())
        {
          FileInputStream fis=new FileInputStream(fname);
          int ch,cnt=0,cnt1=0;
          while((ch=fis.read())!=-1)
          {
                 if(ch=='\n')
                 {
                    cnt++;
                  }
           }
           System.out.println("number of line in given file is "+cnt);
         }
         else
         {
          System.out.println("file not exixts");
      }
    }
   }
   
   /*
   javac slip13_1.java
   java slip bcs.txt
   */
