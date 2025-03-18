package Selenium;

public class EmployeeHierarchy 
{
	public static void main(String[] args)
	{
		Manager manager = new Manager("Alice", "123 Street", 80000, "Manager");
		Developer developer = new Developer("Bob", "456 Avenue", 60000, "Developer");
		Programmer programmer = new Programmer("Charlie", "789 Boulevard", 50000, "Programmer");
		
		System.out.println(manager.name+ "'s Bonus: $"+manager.calculateBonus());
		System.out.println(developer.name+ "'s Bonus: $"+developer.calculateBonus());
		System.out.println(programmer.name+ "'s Bonus: $"+programmer.calculateBonus());
		
		manager.generatePerformanceReport();
		developer.generatePerformanceReport();
		programmer.generatePerformanceReport();
		
		manager.manageProjects();
		developer.writeCode();
		programmer.debugCode();
	}
}
