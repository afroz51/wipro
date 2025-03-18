package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertDemoqa extends BaseClass
{
	public static void main(String[] args) throws InterruptedException 
	{
		invokeBrowser("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/alerts");
		
//		Alert pop-up
		driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
		driver.switchTo().alert().accept();
		
//		alert pop-up apeared after 5 seconds
		driver.findElement(By.xpath("//*[@id=\"timerAlertButton\"]")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
//		alert pop-up with ok and cancel options
		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		driver.switchTo().alert().dismiss();
		
//		alert pop-up with text area
		driver.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();
		driver.switchTo().alert().sendKeys("Afroz");
		driver.switchTo().alert().accept();
		
	}
}
