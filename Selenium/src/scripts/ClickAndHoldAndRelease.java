package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldAndRelease {

	public static void main(String[] args) throws InterruptedException 
	{
	
		    WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://jqueryui.com/droppable/");
			
			Thread.sleep(3000);
			
			//Frames
			
			driver.switchTo().frame(0);
			
			//Actions

			Thread.sleep(3000);
			
			Actions act=new Actions(driver);
			act.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]"))).
			moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]"))).release().build().perform();
			
			
	}

}
