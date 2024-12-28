class Employee
{
  int id;
  String name,deptname;
  double sal;
  static int cnt=0;
  Employee()
  {
    cnt++;
    displayCount();
  }
  Employee(int id,String name,String deptname,double sal)
  {
    this.id=id;
    this.name=name;
    this.deptname=deptname;
    this.sal=sal;
      cnt++;
      displayCount();
  }
  public static void displayCount()
  {
    System.out.println("total objects created:"+cnt);
   }
   public void displayData()
   {
       System.out.println("id:"+this.id);
       System.out.println("\t\tname:"+this.name);
       System.out.println("\t\tdepartnamee:"+this.deptname);
       System.out.println("\t\tsalaray:"+this.sal);
    }
    public static void main(String args[])
    {
      Employee e1=new Employee(101,"maithili","HR",12000.20);
      Employee e2=new Employee(102,"soham","it",12479.20);
      Employee e3=new Employee(102,"akshay","account",110009.20);
      e1.displayData();
      e2.displayData();
      e3.displayData();
    }
  }
