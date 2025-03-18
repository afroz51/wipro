package Selenium;

import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
 
public class PracticePageLinkDemo extends BaseClass{
	public static void main(String args[]) throws InterruptedException
	{
		invokeBrowser("chrome");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//identify the footer section
		List<WebElement> footerLinks = driver.findElements(By.xpath("//div[@id='gf-BIG']//a"));
		System.out.println(footerLinks.size());//total no of links in footer section
		
		//print all the links
		for(WebElement link: footerLinks)
		{
			System.out.println(link.getText());			
		}
		Thread.sleep(5000);
		driver.close();
	}
 
}
 
 
