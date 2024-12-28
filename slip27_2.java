import java.util.*;
import java.io.*;
class slip27_2
{
 public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String fname=args[0];
       File f=new File(fname);
       if(f.isFile())
     {
        System.out.println("File Name:"+ f.getName());
       System.out.println("File Length:"+ f.length());
       System.out.println("File Absolute Path:"+ f.getAbsolutePath());
       System.out.println("File Path:"+ f.getPath());
    }
     else if(f.isDirectory())
    {
      System.out.println("Sure you want Delete All Files (Press 1)");
      int n=sc.nextInt();
      if(n==1)
 {
       String[] s1=f.list();
       String a=".txt";
       for(String str: s1)
   {
       System.out.println(str);
       if(str.endsWith(a))
      {
         File f1=new File(fname, str); 
        System.out.println(str+"-->Deleted");
        f1.delete();
       }
   }
}
      else
         System.out.println("OKKKK");
   }
 }
}

/*
javac slip27_2.java
java slip27_2 bcs.txt
*/
