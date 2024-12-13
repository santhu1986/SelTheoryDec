package scripts;

import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EncodedPassword {

	public static void main(String[] args) throws InterruptedException 
	{
		
		   String password="YWRtaW4xMjM=";
		   
		      //Encoded
		   
		     //  byte[] EncryptPwd=Base64.getEncoder().encode(password.getBytes());
		      // System.out.println("EncryptPwd is "+new String(EncryptPwd));
		       
		       //Decode
		   
		          byte[] DecodePwd=Base64.getDecoder().decode(password.getBytes());
		          System.out.println("Decode Password is "+ new String(DecodePwd));
	
	
	
		  		WebDriver driver=new ChromeDriver();
				
				//Maximize
				
				driver.manage().window().maximize();
				
				//Url
				
				driver.get("https://opensource-demo.orangehrmlive.com/");
				
				Thread.sleep(3000);
				
				//UserName
				
				driver.findElement(By.name("username")).sendKeys("Admin");
				
				//Password
				
				driver.findElement(By.name("password")).sendKeys(new String(DecodePwd));
				
			    //Login
				
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

	
	
	}

}
