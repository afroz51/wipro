package Selenium;

// Custom exception for insufficient funds
public class InsufficientFundsException extends Exception
{
	public InsufficientFundsException(String messege)
	{
		super(messege);
	}
}
