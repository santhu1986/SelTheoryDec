package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsercommands {

	public static void main(String[] args) throws InterruptedException 
	{
		// Launch Firefox
		
		   WebDriver driver=new FirefoxDriver();
		   
		   //URL
		   
		   driver.get("http:www.facebook.com");
		   
		   //Maximize
		   
		   driver.manage().window().maximize();
		   
		   //Get Title 
		   
		   String Tit=driver.getTitle();
		   System.out.println(Tit);
		   
		   //GetCurrent URL
		   String PageUrl=driver.getCurrentUrl();
		   System.out.println(PageUrl);
		   
		   //Page Source
		   
		   String Src=driver.getPageSource();
		   System.out.println(Src);
		   
		   
		   //Navigate to Gmail
		   
		   driver.navigate().to("http://www.gmail.com");
		   
		   //Back
		   Thread.sleep(3000);
		   driver.navigate().back();
		   
		   //Forward
		   
		   Thread.sleep(3000);
		   driver.navigate().forward();
		   
		   //Refresh
		   
		   Thread.sleep(3000);
		   driver.navigate().refresh();
		   
		   //Close
		   
		   Thread.sleep(3000);
		   driver.quit();
	}

}
