package Selenium;

public class Programmer extends Developer
{

	public Programmer(String name, String address, double salary, String jobTitle) 
	{
		super(name, address, salary, jobTitle);
	}
	
	@Override
	public double calculateBonus()
	{
		return salary * 0.1; //  Bonus for Programmers.
	}
	
	public void debugCode()
	{
		System.out.println(name+" is debugging the code.");
	}

}
