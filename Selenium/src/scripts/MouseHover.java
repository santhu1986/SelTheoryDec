package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException
	{
	            WebDriver driver=new ChromeDriver();
		
				driver.manage().window().maximize();
				
				driver.get("https://jqueryui.com/droppable/");
				
				Thread.sleep(3000);
				
				//add ons
				
				WebElement Contribute=driver.findElement(By.xpath("//*[@id=\"global-nav\"]/nav/div/ul[2]/li[2]/a"));
			
				//actions
				
				Actions act=new Actions(driver);
			    act.moveToElement(Contribute).build().perform();
	
				Thread.sleep(3000);
				
				
				WebElement Doc=driver.findElement(By.xpath("//*[@id=\"global-nav\"]/nav/div/ul[2]/li[2]/ul/li[5]/a"));
	            act.moveToElement(Doc).click().perform();
	
	}

}
