class Item
{
int ino;
String iname;
double iprice;
static int count=0;
Item()
{ }
Item(int no,String nm,double d)
{
ino=no;
nm=iname;
iprice=d;
count++;
}
public void display()
{
System.out.println("Total objects created "+count);
System.out.println(ino+" "+iname+" "+iprice);
}
public static void main(String args[])
{
Item ob1=new Item(1,"Laptop",20000.00);
ob1.display();
Item ob2=new Item(1,"Laptop",20000.00);
ob2.display();
}
}
