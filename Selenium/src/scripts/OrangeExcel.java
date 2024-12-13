package scripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OrangeExcel {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		//Library 
		
		Library LB=new Library();
		
		LB.OpenApp("https://opensource-demo.orangehrmlive.com/");
		
		// To Get Test Data Excel File
		
		FileInputStream FIS=new FileInputStream("D:\\SeleniumTheoryOct\\Selenium\\src\\properties\\OrangeHRM.xlsx");
		
		//WorkBook
		
		XSSFWorkbook WB=new XSSFWorkbook(FIS);
		
		//Sheet
		
		XSSFSheet WS=WB.getSheet("OData");
		
		//Row Count
		
		int Rc=WS.getLastRowNum();
		System.out.println(Rc);
		
		//Multiple Iterations ------ Loop
		
		for (int i=1;i<=Rc;i++) 
		{
			
			//Row
			
			XSSFRow WR=WS.getRow(i);
			
			//Cell
			
			XSSFCell WC=WR.getCell(0);    // UserName
			XSSFCell WC1=WR.getCell(1);   //Password
			
			XSSFCell WC2=WR.createCell(2);   //Results
			
			//Cell Values
			
			String UName=WC.getStringCellValue();
			String PSWD=WC1.getStringCellValue();
			
			String Rval=LB.Login(UName,PSWD);
			WC2.setCellValue(Rval);
			
			
		}
		

		//Results 
		
		FileOutputStream FOS=new FileOutputStream("D:\\SeleniumTheoryOct\\Selenium\\src\\properties\\Res_OrangeHRM.xlsx");
		WB.write(FOS);
		WB.close();
		
	}

	
}
