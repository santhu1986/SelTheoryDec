package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

import org.testng.annotations.AfterSuite;

public class Base 
{
	
	 Library LB=new Library();
 
  @BeforeTest
  public void beforeTest() throws InterruptedException 
  {
       //Login
	  
	  LB.Login("Admin","admin123");
  }

  @AfterTest
  public void afterTest() throws InterruptedException 
  {
       //LogOut
	  
	  LB.LogOut();
  }

  @BeforeSuite
  public void beforeSuite() throws IOException, InterruptedException
  {
      // Launch Application
	  
	  LB.OpenApp("https://opensource-demo.orangehrmlive.com/");
  }

  @AfterSuite
  public void afterSuite() throws InterruptedException 
  {
      //Close
	  
	  LB.AppClose();
  }

}
