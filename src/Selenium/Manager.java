package Selenium;

public class Manager extends Employee
{
	public Manager(String name, String address, double salary, String jobTitle)
	{
		super(name, address, salary, jobTitle);
	}
	
	@Override
	public double calculateBonus()
	{
		return salary * 0.2; // Higher bonus for Managers.
	}
	
	public void manageProjects()
	{
		System.out.println(name + " is managing multiple projects.");
	}
}
