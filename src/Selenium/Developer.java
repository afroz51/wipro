package Selenium;

public class Developer extends Employee
{
	public Developer(String name, String address, double salary, String jobTitle)
	{
		super(name, address, salary, jobTitle);
	}
	
	@Override
	public double calculateBonus()
	{
		return salary * 0.15; // Bonus for developers.
	}
	
	public void writeCode()
	{
		System.out.println(name+ " is writing code for a new feature.");
	}
}
