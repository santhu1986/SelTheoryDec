package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsXpath {

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		
		//Launch Chrome Browser
		
		WebDriver driver=new ChromeDriver();
		
		//Maximize
		
		driver.manage().window().maximize();
		
		//Url
		
		driver.get("http://www.facebook.com");
		
		Thread.sleep(3000);

		
		//Absolute Xpath
		
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("AutomationTesting");
	    //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")).sendKeys("Selenium");
	
		
		//Relative xpath
		
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Selenium");
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Testing");
		
		//Xpath with or
		
		
		//driver.findElement(By.xpath("//input[@id='email' or @name='email']")).sendKeys("Automation");
		
		//Xpath with and
		
		
		//driver.findElement(By.xpath("//input[@id='email' and @name='email']")).sendKeys("Automation");
		
		//Xpath using Contains
		
	   //driver.findElement(By.xpath("//input[contains(@id,'ail')]")).sendKeys("Selenium");
		
		
		//Xpath using Starts-with
		
		//driver.findElement(By.xpath("//input[starts-with(@id,'pa')]")).sendKeys("Testing");
		
		
		//Xpath with text
		
		
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
