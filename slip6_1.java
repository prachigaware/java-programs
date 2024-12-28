class Emp{
  int id,salary;
  String name;
  String desig;
  Emp(int id,String name,int salary,String desig)
  {
    this.id=id;
    this.name=name;
    this.desig=desig;
    this.salary=salary;
  }
    public String toString()
    {
       return id+" "+name+" "+salary+" "+desig;
     }
     public static void main(String args[])
     {
     Emp E1=new Emp(111,"rakesh",50000,"bsc cs");
     Emp E2=new Emp(112,"suresh",500003,"mcs cs");
   System.out.println("employee details: "+E1);
   System.out.println("employee details:"+E2);
  }
  }
    /*
    javac slip6_1.java
    java Emp
    */
  
