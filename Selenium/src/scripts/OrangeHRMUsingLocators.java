package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRMUsingLocators {

	public static void main(String[] args) throws InterruptedException
	{
		// Launch Browser
		
		WebDriver driver=new FirefoxDriver();
		
		//Maximize
		
		driver.manage().window().maximize();
		
		//URL
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		Thread.sleep(3000);
		
		//Login
		
	    WebElement Uname=driver.findElement(By.xpath("//input[@placeholder='Username']"));
	    System.out.println(Uname.getAttribute("class"));
		Uname.sendKeys("Admin");
		
		WebElement Password=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		Password.sendKeys("admin123");
		
		WebElement Login=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        Login.click();
        
        Thread.sleep(3000);
        
        
        WebElement AdminLink=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span"));
	    AdminLink.click();
	
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
	    
	    Thread.sleep(3000);
	    //Log out
	    
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")).click();
	

	    Thread.sleep(3000);
	
	    driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	    

	    Thread.sleep(3000);
	
	    driver.close();
	    
	

	
	}
	

}
