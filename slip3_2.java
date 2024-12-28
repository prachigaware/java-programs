import java.io.*;
class CovidException extends Exception
{
     public CovidException()
     {
         System.out.println("patient is covid positive and need to be hospitalized");
       }
   }
   class Patient
   {
     String name;
     int age;
     double level,hrct;
     public Patient(String name,int age,double level,double hrct)
     {
       this.name=name;
       this.age=age;
       this.level=level;
       this.hrct=hrct;
    }
    public static void main(String[] args)throws IOException
    {
       String name;
       int age;
       double level,hrct;
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("enter name:");
       name=br.readLine();
       System.out.println("enter the age");
       age=Integer.parseInt(br.readLine());
       System.out.println("oxygen level");
       level=Double.parseDouble(br.readLine());
       System.out.println("hrct report");
       hrct=Double.parseDouble(br.readLine());
       Patient ob=new Patient(name,age,level,hrct);
       try{
        if(ob.level<95 && ob.hrct>10)
        throw new CovidException();
        else
        System.out.println("\n patient info:");
        System.out.println("\n name:"+ob.name);
        System.out.println("\n age:"+ob.age);
        System.out.println("\n hrct report:"+ob.hrct);
        System.out.println("\n oxygen level:"+ob.level);
        }catch(CovidException e){
        
        }
        }
        }
    /* 
    javac slip3_2.java
    java Patient
   */
       
     
      
      
