package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException 
	{
	
		
		// Launch Browser
		
		WebDriver driver=new ChromeDriver();
		
		//Maximize
		
		driver.manage().window().maximize();
		
		//URL
		
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		Thread.sleep(3000);
		
		//Drop Down 
		
		WebElement CountryEle=driver.findElement(By.xpath("//*[@id=\"Form_getForm_Country\"]"));
		
		Select Ctry=new Select(CountryEle);
		//Ctry.selectByVisibleText("India");
	    //Ctry.selectByIndex(13);
		//Ctry.selectByValue("Belgium");
		
		
		List<WebElement> AllCtrys=Ctry.getOptions();
		System.out.println(AllCtrys.size());
		
		
		//Loop
		
				for(WebElement Country:AllCtrys)
				{
					System.out.println(Country.getText());
					
		 			if (Country.getText().equalsIgnoreCase("India")) 
					{
						Country.click();
						break;
					}
				}
		}

}
