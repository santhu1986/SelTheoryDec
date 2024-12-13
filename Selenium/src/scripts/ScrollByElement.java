package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByElement {

	public static void main(String[] args) throws InterruptedException 
	{
		    WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
			
			Thread.sleep(8000);
			
		WebElement IndiaFlag=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/table[1]/tbody/tr[86]/td[1]/img"));
			
		JavascriptExecutor Js=(JavascriptExecutor)driver;
	//	Js.executeScript("arguments[0].scrollIntoView();",IndiaFlag);
	
	    // Scroll page till bottom
		
		Js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
	}

}
