package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCFrame {

	public static void main(String[] args) throws InterruptedException 
	{
	
		//Launch Browser
		
				WebDriver driver=new ChromeDriver();
				
				//Maximize
				
				driver.manage().window().maximize();
				
				//URL
				
				driver.get("https://netbanking.hdfcbank.com/netbanking/");
				
				Thread.sleep(3000);
				
				//No of frames available in the page
				
				 List<WebElement> Frames=driver.findElements(By.tagName("frame"));
				 System.out.println(Frames.size());
				 
				 for(WebElement Fr:Frames)
				 {
                     System.out.println(Fr.getAttribute("name"));					 
				 }
				 
				 //Frame name
				 
				// driver.switchTo().frame("login_page");   //Name
				 
				 //Index
				 
			//  driver.switchTo().frame(0);  //Index
				
				 //Using Webelement
				 
				 WebElement FrameName=driver.findElement(By.name("login_page"));
				 driver.switchTo().frame(FrameName);  //WebElement
				 Thread.sleep(3000);
				 
	           //Customer ID
				
				driver.findElement(By.xpath("//*[@id=\"pageBody\"]/div[1]/form/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/input")).sendKeys("12345");
	
	}

}
