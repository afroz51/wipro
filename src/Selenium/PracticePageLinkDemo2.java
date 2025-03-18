package Selenium;

import java.awt.Window.Type;
import java.time.Duration;
import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.module.Input;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class PracticePageLinkDemo2 extends BaseClass{
	public static void main(String args[]) throws InterruptedException
	{
		invokeBrowser("chrome");
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//identify the footer section
		WebElement footer = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		List<WebElement> footerLinks = driver.findElements(By.xpath("//div[@id='gf-BIG']//a"));
		System.out.println(footerLinks.size());//total no of links in footer section
		
		//print all the links
		for(WebElement link: footerLinks)
		{
			System.out.println(link.getText());			
		}
		
		//To find the total no of radio buttons
		List<WebElement> radioBtns = driver.findElements(By.cssSelector("input[type='radio']"));
		System.out.println(radioBtns.size()); //3
		//print all the radio btns
		for(WebElement radioBtn: radioBtns)
		{
			System.out.println(radioBtn.getAttribute("value"));
			System.out.println("Displayed : "+radioBtn.isDisplayed());
			System.out.println("Enabled : "+radioBtn.isEnabled());
			System.out.println("Selected : "+radioBtn.isSelected());
		}
		
		List<WebElement> checklist = driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println(checklist.size());
		for(WebElement check:checklist)
		{
			System.out.println(check.getAttribute("value"));
			System.out.println("Displayed: "+check.isDisplayed());
			System.out.println("Enabled : "+check.isEnabled());
			System.out.println("Selected : "+check.isSelected());
		}
		
		//Select drop down
		WebElement selBox = driver.findElement(By.xpath("//select[@name='dropdown-class-example']"));
		Select sel = new Select(selBox);
		sel.selectByIndex(1);
		Thread.sleep(2000);
		sel.selectByValue("option3");
		Thread.sleep(2000);
		sel.selectByVisibleText("Option2");
				
		//check box 3
		driver.findElement(By.id("checkBoxOption3")).click();
		
		WebElement suggestions = driver.findElement(By.cssSelector("#autocomplete"));
		String key = "India";
		suggestions.sendKeys(key);
		suggestions.sendKeys(Keys.DOWN);
		
//		closeBrowser();
		//Thread.sleep(5000);
		//driver.close();
	}
	
	//Close browser functionality
		public static void closeBrowser() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.close();
		}
 
}