package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException 
	{
	

	    WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		Thread.sleep(1000);
		
		//RowCount
		
		int RowCount=driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr")).size();
        System.out.println("Table Row Count is "+RowCount);
        
        //Column Count
        
        int ColCount=driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr/th")).size();
        System.out.println("Table Column Count is "+ColCount);
        
        //To get specific data from the Table
        
        String CtryVal=driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[5]/td[3]")).getText();
	     System.out.println("Cell Value is "+CtryVal);
	
	      //Specific Row Data
	     
	     String RowData=driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[5]")).getText();
	     System.out.println("5th Row Data is "+RowData);
	     
	     System.out.println("---------------Table-----------------");
	     
	     //Table Data
	     
	   //  WebElement Table=driver.findElement(By.xpath("//*[@id=\"customers\"]"));
	    // System.out.println(Table.getText());
	     
	     
	     //Specific Column Data
	     
	   /*  List<WebElement> ColData=driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr/td[3]"));
	     
	     //For 
	     
	        for(WebElement Col:ColData)
	        {
	        	System.out.println(Col.getText());
	        }*/
	     
	     
	     //Condition
	     
	   /*  for (int r=1;r<=RowCount;r++)
	     {
		
	    	String Company= driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+(r+1)+"]/td[1]")).getText();
		    System.out.println(Company);
		    
		    if (Company.equalsIgnoreCase("Island Trading"))
		    {
		    	String Ctry=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+(r+1)+"]/td[3]")).getText();
			     System.out.println("Country name is "+ Ctry);
			     break;
		    }
	     }*/
	     
	     
	     
	    //To Retrive all the Table data using Loop
	     
	     for (int r=2;r<=RowCount;r++)   // Rows   1,2
	     {
			for (int c=1; c<=ColCount;c++)   // Col 1,2,3    1,2,3
			{
				String allTabledata=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+r+"]/td["+c+"]")).getText();
			     System.out.print(allTabledata);
			}
			System.out.println();
		}
	     
	     
	     
	     
	     
	     driver.close();
	     
	     
	     
	     
	     
	}

}
