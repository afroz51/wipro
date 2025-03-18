package Selenium;

public class Account 
{
	private double balance;
	
//  Constructor to initialize balance
	public Account(double balance)
	{
		this.balance = balance;
	}
	
//	Method to add deposit to the balance
	public void addDeposit(double amount)
	{
		balance += amount;
		System.out.println("Deposited: "+amount);
	}
	
//	Method to get the current balance
	public double getbalance()
	{
		return balance;
	}
	
//	Method to withdraw an amount, throw exception if funds are insufficient
	public void Withdraw(double amount) throws InsufficientFundsException 
	{
		if(amount > balance)
		{
			throw new InsufficientFundsException("Insufficient funds! Available balance: "+balance);
		}
		balance -= amount;
		System.out.println("Withdrawing: "+amount);
		System.out.println("Current balance: "+balance);
	}
	
	public static void main(String[] args)
	{
		Account acc = new Account(1500);
		System.out.println("Current balance: "+acc.getbalance());
		
		try {
			acc.Withdraw(500);
		}
		catch(InsufficientFundsException exp)
		{
			System.out.println(exp.getMessage());
		}
	}
}
