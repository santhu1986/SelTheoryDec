package scripts;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DifferentBrowsers {

	public static void main(String[] args) 
	{
		
		// Chrome Browser
		
		//System.setProperty("webdriver.chrome.driver","D:\\SeleniumTheoryOct\\Selenium\\Drivers\\chromedriver.exe");
		
		//Launch Browser
		
		//WebDriver driver=new ChromeDriver();
		
		
		//Firefox Browser
		
		//System.setProperty("webdriver.gecko.driver","D:\\SeleniumTheoryOct\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();

		//MicrosoftEdge Browser
		
		//System.setProperty("webdriver.edge.driver","C:\\Users\\LENOVO\\OneDrive\\Desktop\\msedgedriver.exe");
		//WebDriver driver=new EdgeDriver();
		
	}

}
