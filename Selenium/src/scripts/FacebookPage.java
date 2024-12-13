package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookPage {

	public static void main(String[] args) throws InterruptedException 
	{
	
		//launch chrome
		
		WebDriver driver=new ChromeDriver();
		
		//Maximize
		
		driver.manage().window().maximize();
		
		//URL
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		//Create Account
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();

		//IsDisplayed
		
		WebElement Fname=driver.findElement(By.name("firstname"));
	    System.out.println("Display Status "+Fname.isDisplayed());
	    System.out.println("Enable Status "+Fname.isEnabled());
	    Fname.sendKeys("SanthoshTesting");
	    Thread.sleep(3000);
	    Fname.clear();
	    Thread.sleep(3000);
	    Fname.click();
	    
	
	  //Gender
	    
	  WebElement Gender=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[4]/span/span[2]/label"));
	  System.out.println("Selected Status "+Gender.isSelected());
      Thread.sleep(3000);
      Gender.click();
	
	}
	

}
