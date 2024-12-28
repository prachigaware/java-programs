package operation;
import java.util.*;
class Addition
{
public int ans,n1,n2;
public float answer,num1,num2;
public Addition(int n1,int n2,float num1,float num2)
{
this.n1=n1;
this.n2=n2;
this.num1=num1;
this.num2=num2;
}
public void add()
{
ans=n1+n2;
System.out.println("addition is="+ans);
}
public void sub()
{
answer=num1-num2;
System.out.println("subtraction is="+answer);
}
}
public class Maximum extends Addition
{
public Maximum(int n1,int n2, float num1, float num2)
{
super(n1,n2,num1,num2);
}
public void max()
{
if (n1>n2)
System.out.println(n1+" is greater than "+n2);
else
System.out.println(n2+" is greater than "+n1);
}
}
import operation.Maximum;
import java.util.*;
class Arithmatic
{
public static void main (String args[])
{
int n1,n2;
float num1,num2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter first no=");
n1=sc.nextInt();
System.out.println("Enter second no=");
n2=sc.nextInt();
System.out.println("Enter third no=");
num1=sc.nextFloat();
System.out.println("Enter fourth no=");
num2=sc.nextFloat();
Maximum ob1=new Maximum(n1,n2,num1,num2);
ob1.add();
ob1.sub();
ob1.max();
}
}
