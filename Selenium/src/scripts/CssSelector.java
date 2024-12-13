package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException
	{
		//Launch Chrome Browser
		
				WebDriver driver=new ChromeDriver();
				
				//Maximize
				
				driver.manage().window().maximize();
				
				//Url
				
				driver.get("http://www.facebook.com");
				
				Thread.sleep(3000);
				
				//Email ----- Tag & ID
				
			//	driver.findElement(By.cssSelector("input#email")).sendKeys("Selenium");   
			//	driver.findElement(By.cssSelector("#email")).sendKeys("Selenium");
			
				//Email ------ Tag & Class
				
				//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Automation");
				driver.findElement(By.cssSelector(".inputtext")).sendKeys("Automation");
				
				//Password ----- Tag & Attribute
				
				//driver.findElement(By.cssSelector("input[name=pass]")).sendKeys("Testing");
				//driver.findElement(By.cssSelector("[name=pass]")).sendKeys("Testing");
				
				//Tag Class & Attribute
				
				//driver.findElement(By.cssSelector("input.inputtext[name=pass]")).sendKeys("Testing");
				driver.findElement(By.cssSelector(".inputtext[name=pass]")).sendKeys("Testing");
				
				
				
				
				
				
				
				
				
						
	
	}

}
