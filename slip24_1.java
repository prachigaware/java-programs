abstract class Bank
{
     public abstract void getBalance();
}
      class BankA extends Bank
  {
      int bal=100;
      public void getBalance()
   {
         System.out.println("Balance of BankA is "+bal);
    }
  }
     class BankB extends Bank
  {
       int bal=150;
       public void getBalance()
     {
         System.out.println("Balance of BankB is "+bal);
     }
  }
    class BankC extends Bank
 {
      int bal=200;
      public void getBalance()
   {
        System.out.println("Balance of BankC is "+bal);
   }
    public static void main(String args[])
  {
	BankA a=new BankA();
	BankB b=new BankB();
	BankC c=new BankC();
	a.getBalance();
	b.getBalance();
	c.getBalance();
   }
}


/*
javac slip24_1.java
java BankC
*/
