package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestionDropDoen {

	public static void main(String[] args) throws InterruptedException 
	{
	
		    WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.tgsrtcbus.in/oprs-web/");
			
			Thread.sleep(3000);
			
			WebElement From=driver.findElement(By.xpath("//*[@id=\"fromPlaceName\"]"));
			From.click();
			From.sendKeys("Hyde");

			Thread.sleep(3000);
			
			From.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
			
			From.sendKeys(Keys.ENTER);
	}

}
