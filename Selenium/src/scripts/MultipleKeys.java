package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleKeys {

	public static void main(String[] args) throws InterruptedException
	{
		    WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://text-compare.com/");
			
			Thread.sleep(3000);
			
			WebElement InputField1=driver.findElement(By.xpath("//*[@id=\"inputText1\"]"));
			InputField1.sendKeys("Welcome to Keyboard");
	
			Thread.sleep(3000);
			
			WebElement InputField2=driver.findElement(By.xpath("//*[@id=\"inputText2\"]"));
			
			Actions act=new Actions(driver);
			
			//To Select the data Ctrl+A
			Thread.sleep(3000);
			
			act.keyDown(Keys.CONTROL);
			act.sendKeys("a");
			act.keyUp(Keys.CONTROL);
			act.perform();
			
			//Copy the Data Ctrl+C
			Thread.sleep(3000);
			
			act.keyDown(Keys.CONTROL);
			act.sendKeys("c");
			act.keyUp(Keys.CONTROL);
			act.perform();
			Thread.sleep(3000);
			//To shift to the next Element --- Tab
			
			act.sendKeys(Keys.TAB);
			act.perform();
			
			Thread.sleep(3000);
			
			//paste the the Data Ctrl+v
				
			act.keyDown(Keys.CONTROL);
			act.sendKeys("v");
			act.keyUp(Keys.CONTROL);
			act.perform();
			Thread.sleep(3000);
			
			//compare Both the Input fields 	
			
			if (InputField1.getAttribute("value").equals(InputField2.getAttribute("value"))) 
			{
			    System.out.println("Text matched");	
			}
			else
			{
				System.out.println("Text Not Matched");
			}
			
	}

}
