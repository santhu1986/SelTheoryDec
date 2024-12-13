package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleNg
{
       
	WebDriver driver;
       
	@BeforeTest
	public void xyz()
	{
		//Launch Browser
	
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test(priority=2)
	public void abc() throws InterruptedException
	{
		//URl
		
		driver.get("http://www.facebook.com");
	    Thread.sleep(3000);
	}
	
	@Test(priority=1)
	public void bcd() throws InterruptedException
	{
		//URl
		
		driver.get("http://www.google.com");
	    Thread.sleep(3000);
	}
	
	@AfterTest
	public void pqr()
	{
		// Close App
		
		driver.close();
	}
	
}
