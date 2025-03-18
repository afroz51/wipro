package Selenium;

public class Employee 
{
	String name;
	String address;
	double salary;
	String jobTitle;
	
	public Employee(String name, String address, double salary, String jobTitle)
	{
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.jobTitle = jobTitle;
	}
	
	public double calculateBonus()
	{
		return salary * 0.1; // Base bonus calculation.
	}
	
	public void generatePerformanceReport()
	{
		System.out.println(name + " Performance Report: Excellent performance.");
	}
}
