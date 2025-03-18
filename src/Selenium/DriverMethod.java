package Selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a driver: ");
		String str = sc.next();
		if(str.equalsIgnoreCase("chrome"))
		{
			WebDriver driver = new ChromeDriver();
			method(driver);
		}
		else if(str.equalsIgnoreCase("firefox"))
		{
			WebDriver driver = new FirefoxDriver();
			method(driver);
		}
		else if(str.equalsIgnoreCase("edge"))
		{
			WebDriver driver = new EdgeDriver();
			method(driver);
		}
		else
		{
			System.out.println("Enter a proper driver");
		}
	}
	
	public static void method(WebDriver driver) throws InterruptedException
	{
		driver.get("https://www.google.com/");//Enter the URL
		//capture the current url
		System.out.println(driver.getCurrentUrl());
		driver.navigate().to("https://www.selenium.dev/");
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.navigate().forward();
	}
}
