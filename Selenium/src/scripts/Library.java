package scripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Library 
{

	public static WebDriver driver;
	public static FileInputStream FIS;
	public static Properties PR;
	
	
	public String OpenApp(String URL) throws IOException, InterruptedException 
	{
		FIS=new FileInputStream("D:\\SeleniumTheoryOct\\Selenium\\src\\properties\\Repo.properties");
		PR=new Properties();
		PR.load(FIS);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\OneDrive\\Desktop\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get(URL);
	   Thread.sleep(3000);
	   
	   return "Application Launch Succ";
			   
	}
	
	
	public String Login(String Un,String Pwd) throws InterruptedException
	{
		
		Thread.sleep(3000);
		      
		        //UserName
		
				driver.findElement(By.name(PR.getProperty("Uname"))).sendKeys(Un);
				
				//Password
				
				driver.findElement(By.name(PR.getProperty("Pswd"))).sendKeys(Pwd);
				
				//Refesh
				Thread.sleep(3000);
				driver.navigate().refresh();
				
			    //Login
				
				//driver.findElement(By.xpath(PR.getProperty("Lgn"))).click();

	            return "Pass";  
				
	             }
	
	public void AdminLnk() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
	}
	
	public void LeaveLnk() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a")).click();
	}
	
	public void LogOut() throws InterruptedException
	{

		Thread.sleep(3000);
		 
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")).click();
	    
	    Thread.sleep(3000);
		
	    driver.findElement(By.xpath(PR.getProperty("Lout"))).click();
	
	
	}
	
	public void AppClose() throws InterruptedException
	{

		Thread.sleep(3000);
	     driver.close();	
	}
}
