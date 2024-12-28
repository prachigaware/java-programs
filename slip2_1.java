class BM
{
  public static void main(String args[])
  {
       String fname=args[0];
       String lname=args[1];
       double weight=Double.parseDouble(args[2]);
       double height=Double.parseDouble(args[3]);
       double BMI=weight / (height *height);
       System.out.println("first name is:"+fname);
       System.out.println("last name is:"+lname);
       System.out.println("weight is:"+weight);
       System.out.println("height is:"+height);
       System.out.println("the body mass index (BMI) is "+ BMI +" kg/m2");
     }
   }
   /*  
   javac slip2_1.java
   java BM prachi gaware 50 5
   */
