package Selenium;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop extends BaseClass
{
	public static void main(String[] args)
	{
		invokeBrowser("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/droppable/");
		
		WebElement source = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement target = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
		
		String str = target.getText();
		System.out.println(str);
		
		if(str.equals("Dropped!"))
		{
			System.out.println("Dropped Successfully!");
		}
		else
		{
			System.out.println("Drop Failed");
		}
	}
}
