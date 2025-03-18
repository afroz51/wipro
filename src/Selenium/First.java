package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Hello");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("automation");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
	}
}
