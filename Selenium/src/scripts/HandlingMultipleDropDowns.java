package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultipleDropDowns {

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		//Launch Chrome Browser
		
				WebDriver driver=new ChromeDriver();
				
				//Maximize
				
				driver.manage().window().maximize();
				
				//Url
				
				driver.get("http://www.facebook.com");
				
				Thread.sleep(3000);
				
				//Create Account
				
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();


				//Day
				
				WebElement Day=driver.findElement(By.xpath("//*[@id=\"day\"]"));
	             SelectOption(Day,"15");
	             
				WebElement Month=driver.findElement(By.xpath("//*[@id=\"month\"]"));
				SelectOption(Month,"Dec");
				
				WebElement Year=driver.findElement(By.xpath("//*[@id=\"year\"]"));
	               SelectOption(Year,"2015");
	}

	public static void SelectOption(WebElement Ele,String value)
	{
		
		Select DropDown=new Select(Ele);
		
		List<WebElement> AllDD=DropDown.getOptions();
		
		for(WebElement option:AllDD)
		{
			if (option.getText().equals(value))
			{
			   option.click();
			   break;
			}
		}
		
	}
	
	
}
