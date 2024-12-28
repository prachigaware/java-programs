import java.util.*;
class Sphere
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of the sphere:");
        double radius=sc.nextDouble();
        double surface_area=(4*3.14*(radius*radius));
        double volume=((double)4/3)*3.14*(radius*radius*radius);
        System.out.println("the surface area of the sphere is:"+surface_area);
        System.out.println("the volume of the sphere is:"+volume);
      }
   }
    
