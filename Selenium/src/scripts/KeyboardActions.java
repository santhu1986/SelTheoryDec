package scripts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException 
	{
		    WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://the-internet.herokuapp.com/key_presses");
			
			Thread.sleep(3000);
			
			//Actions
			
			Actions act=new Actions(driver);
			act.sendKeys(Keys.ENTER).perform();
					
			Thread.sleep(3000);
			
			act.sendKeys(Keys.ARROW_DOWN).perform();
			
            Thread.sleep(3000);
			
			act.sendKeys(Keys.SPACE).perform();
			
	}

}
