package scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException
	{
		
		//Launch Browser
		
		WebDriver driver=new ChromeDriver();
		
		//Maximize
		
		driver.manage().window().maximize();
		
		//URL
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		Thread.sleep(3000);
		
	//	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		
	//	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		
		Thread.sleep(3000);
		
	     // Alert
		
		//driver.switchTo().alert().accept();   // Ok
		
		//driver.switchTo().alert().dismiss();    // Cancel
		
		Alert PopUp=driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(PopUp.getText());
        PopUp.sendKeys("Welecome to Automation");		
        Thread.sleep(3000);
        PopUp.accept();
		
	}

}
