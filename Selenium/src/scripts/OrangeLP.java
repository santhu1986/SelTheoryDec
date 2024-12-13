package scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeLP 
{

	//EP
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")
	WebElement AdminLink;
	

	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a/span")
	WebElement LeaveLink;
	
	
	//EM
	
	public void Alink() 
	{
	AdminLink.click();	
	}
	
	public void LLink() 
	{
		LeaveLink.click();
	}
}
