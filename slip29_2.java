import java.io.*;
class Vehicle
{
  String company;
  double price;
  public void accept()throws IOException
  {
    System.out.println("enter the company and price of the vehicle:")
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    company=br.readLine();
    price=Double.parseDouble(br.readLine());
  }
  public void display()
  {
    System.out.prinltn("Company: "+company+" Price: "+price);
   }
 }
 class LightMotorVehicle extends Vehicle
 {
    double mileage;
    public void accept()throws IOException
    {
      super.accept();
      
