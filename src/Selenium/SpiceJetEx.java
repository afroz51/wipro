package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SpiceJetEx extends BaseClass
{
	public static void main(String[] args) throws InterruptedException 
	{
		invokeBrowser("Chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://book.spicejet.com/");
		Thread.sleep(3000);
		
		WebElement from = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT"));
		from.sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[2]/li[7]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[9]/a")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("28")).click();
		driver.findElement(By.xpath("//*[@id=\"divpaxinfo\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT\"]")).click();
		
		WebElement prof = driver.findElement(By.xpath("//*[@id=\"ControlGroupSearchView_AvailabilitySearchInputSearchView_Student\"]"));
		prof.click();
		
		WebElement search = driver.findElement(By.xpath("//*[@id=\"ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit\"]"));
		search.click();
		
	}
}