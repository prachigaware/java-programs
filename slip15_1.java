import java.io.*;
import java.util.*;
class demoFile
{
public static void main(String args[]) throws Exception
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the first file");
String f1=sc.next();
System.out.println("Enter the second file");
String f2=sc.next();
FileInputStream fis=new FileInputStream(f1);
FileOutputStream fos=new FileOutputStream(f2);
int ch;
while((ch=fis.read())!=-1)
{
fos.write(ch);
}
System.out.println("file copied...");
fis.close();
fos.close();
}
}
