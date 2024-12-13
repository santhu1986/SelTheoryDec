package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrangeDataProvider 
{
    @Test(dataProvider="Odata")
	public void OrangeDP(String Un,String Pwd) throws InterruptedException
	{
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 
		 //Login
		 
		 Thread.sleep(3000);
	      
	        //UserName
	
			driver.findElement(By.name("username")).sendKeys(Un);
			
			//Password
			
			driver.findElement(By.name("password")).sendKeys(Pwd);
			
			//Refesh
			Thread.sleep(3000);
			driver.navigate().refresh();
	
	}
	
	@DataProvider
     public Object [][] Odata()
	{
		Object[][] Obj=new Object[3][2];
		
		Obj[0][0]="Admin";
		Obj[0][1]="admin123";


		Obj[1][0]="manual";
		Obj[1][1]="admin123";
		

		Obj[2][0]="Selenium";
		Obj[2][1]="admin123";
		
		return Obj;
	
	}
}
