package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException
	{
	
		
	//Launch Chrome Browser
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\LENOVO\\OneDrive\\Desktop\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		//Maximize
		
		driver.manage().window().maximize();
		
		//Url
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		Thread.sleep(3000);
		
		//UserName
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//Password
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
	    //Login
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}

}
