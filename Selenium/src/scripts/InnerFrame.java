package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerFrame {

	public static void main(String[] args) throws InterruptedException 
	{
	
		//Launch Browser
		
		WebDriver driver=new ChromeDriver();
		
		//Maximize
		
		driver.manage().window().maximize();
		
		//URL
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		
		//Outter Frame using Webelement
		
		WebElement OutterFrame=driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
  
		//Switch to Outter Frame
		
		driver.switchTo().frame(OutterFrame);

		Thread.sleep(3000);
		
		//innerFrame using Webelement

		Thread.sleep(3000);
		
		WebElement InnerFrame=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		
		//Swtich to Inner Frame
		
		driver.switchTo().frame(InnerFrame);

		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Welcome to Frames");
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		String text=driver.findElement(By.xpath("/html/body/section/div/div/h5")).getText();
		System.out.println(text);
		
		
	}

}
