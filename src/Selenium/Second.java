package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String browser="firefox";//assignment ?
		//To import ctr+shift+o from key board
		WebDriver driver = new ChromeDriver();
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

