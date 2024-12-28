 class Bank {
	private double balance;
	public Bank()
	{
		balance=0;
	}
	public Bank(double initialBalance)
	{
		balance=initialBalance;
	}
	public void deposite(double amount)
	{
		balance=balance+amount;
	}
	public void withdraw(double amount)
	{
		balance=balance-amount;
	}
	public double getBalance()
	{
		return balance;
	}
	public static void main(String[] args)
	{
		Bank b=new Bank(1000);
		b.withdraw(250);
		System.out.println("the withdraw is:"+b.balance);
		b.deposite(400);
		System.out.println("the deposite is:"+b.balance);
		System.out.println("the balance is:"+b.getBalance());
	}

}

