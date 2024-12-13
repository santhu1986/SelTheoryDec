package scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exepom 
{
	
	WebDriver driver;
	
     @BeforeTest
	public void Launch() throws InterruptedException
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(3000);
		
	}
     @Test(dataProvider="Odata")
     public void Ologin(String Uname,String Pswd) throws InterruptedException, IOException
     {
    	
		//Login
		
		OrangeHP OHP=PageFactory.initElements(driver,OrangeHP.class);
		OHP.Login(Uname,Pswd);
		
		Thread.sleep(3000);
     
		driver.navigate().refresh();
		
		Thread.sleep(3000);
	    
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

     
     
     public void Leavelnk()
     {
		//Admin Link
		
		OrangeLP OLP=PageFactory.initElements(driver,OrangeLP.class);
		OLP.LLink();
	}
}
