package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef 
{
          WebDriver driver;

@Given("^User used on Orange Home Page$")
public void user_used_on_Orange_Home_Page() throws Throwable 
{
	              driver=new FirefoxDriver();
	
	               //Maximize
	
	              driver.manage().window().maximize();
	
	              //Url
	
	               driver.get("https://opensource-demo.orangehrmlive.com");
	
	               Thread.sleep(3000);
	

}

@When("^User enters \"(.*)\" and \"(.*)\"$")
public void user_enters_Username_and_Password(String Un,String Pwd) throws Throwable 
{
	

	driver.findElement(By.name("username")).sendKeys(Un);
	
	//Password
	
	driver.findElement(By.name("password")).sendKeys(Pwd);
	
    Thread.sleep(3000);
    driver.navigate().refresh();
    //Login
	
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();


}

@Then("^user Validates Login Functionality$")
public void user_Validates_Login_Functionality() throws Throwable 
{
               String Tit=driver.getTitle();
                System.out.println(Tit);
}


}
