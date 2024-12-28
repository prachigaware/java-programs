interface Square
 {
      int calculate(int x);
}
class Slip16_1 
{
public static void main(String args[])
{
int a = 5;
Square s = (int x) -> x * x;
int ans = s.calculate(a);
System.out.println(ans);
}
}


/*
javac slip16_1.java
java Slip16_1
*/

