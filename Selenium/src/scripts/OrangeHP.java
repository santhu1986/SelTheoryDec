package scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeHP 
{

	//Element Properties
	
	@FindBy(name="username")
	WebElement Uname;
	
	@FindBy(name="password")
	WebElement Pswd;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement Lgn;
	
	
	
	//Element Methods
	
	public void Login(String Un,String Pwd) throws InterruptedException
	{
		Uname.sendKeys(Un);
		Pswd.sendKeys(Pwd);
		Thread.sleep(3000);
		Lgn.click();
	}


}
