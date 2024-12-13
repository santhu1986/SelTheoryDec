package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLocators
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		//Launch Chrome Browser
		
		WebDriver driver=new ChromeDriver();
		
		//Maximize
		
		driver.manage().window().maximize();
		
		//Url
		
		driver.get("http://www.google.com");
		
		Thread.sleep(3000);
		
		//Forgot Password using LinkText
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		//Forgot Password using partial LinkText
		
	//	driver.findElement(By.partialLinkText("Forgotten")).click();
		
	//	driver.findElement(By.partialLinkText("Gam")).click();
		
		//Login
		
		//driver.findElement(By.id("email")).sendKeys("SanthoshTesting");
		//driver.findElement(By.id("pass")).sendKeys("Selenium");
		
		//driver.findElement(By.name("login")).click();

		
		//TagName --- Counting the Links
		
		//int linkscount=driver.findElements(By.tagName("input")).size();
		//System.out.println(linkscount);
		
		
		//Classname
		
		driver.findElement(By.className("gLFyf")).sendKeys("Selenium");
		
		
	}

}
