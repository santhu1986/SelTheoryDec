package scripts;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelinRuntime {

	public static void main(String[] args) throws IOException 
	{
		
		//Create Excel
		
		FileOutputStream FOS=new FileOutputStream("C:\\Users\\LENOVO\\OneDrive\\Desktop\\RunTimeExcel.xlsx");
		
		//WorkBook
		
		XSSFWorkbook WB=new XSSFWorkbook();
		
		//Create Sheet
		
		XSSFSheet WS=WB.createSheet("RunTimeSheet");
		
		//Create Row  ----- Row 1
		
		XSSFRow Row1=WS.createRow(0);
		
		//Column
		
		Row1.createCell(0).setCellValue("Student Name");
		Row1.createCell(1).setCellValue("Course Name");
		
		//Create Row  ----- Row 2
		
				XSSFRow Row2=WS.createRow(1);
				
				//Column
				
				Row2.createCell(0).setCellValue("Santhosh");
				Row2.createCell(1).setCellValue("Selenium");
				
				//Create Row  ----- Row 3
				
				XSSFRow Row3=WS.createRow(2);
				
				//Column
				
				Row3.createCell(0).setCellValue("Tester");
				Row3.createCell(1).setCellValue("Manual");
				
				WB.write(FOS);
		
		
	}

}
