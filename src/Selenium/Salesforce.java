package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://google.com");
		driver.navigate().to("https://login.salesforce.com/?locale=in");
		WebElement id = driver.findElement(By.name("username"));
		id.sendKeys("sfsfrs");
		WebElement pass = driver.findElement(By.name("pw"));
		pass.sendKeys("sfrgerg");
		driver.findElement(By.name("Login")).click();
		Thread.sleep(2000);
		WebElement error = driver.findElement(By.id("error"));
		String errormessege = error.getText();
		System.out.println(errormessege);
		driver.close();
	}
}
