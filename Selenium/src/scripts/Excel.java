package scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException 
	{
		// TO Get Test Data Excel File
		
		FileInputStream FIS=new FileInputStream("C:\\Users\\LENOVO\\OneDrive\\Desktop\\SampleData.xlsx");
		
		//WorkBook
		
		XSSFWorkbook WB=new XSSFWorkbook(FIS);
		
		//Sheet
		
		XSSFSheet WS=WB.getSheet("Data");
		
		//Row Count
		
		int RowCount=WS.getLastRowNum();
		System.out.println("RowCount is "+RowCount);	
		
		//Column Count
		
		int ColCount=WS.getRow(1).getLastCellNum();
	    System.out.println("Column count is "+ColCount);
	     
	     //To get all the Excel data
	     
	     for (int i=1;i<=RowCount;i++)    //Rows
	     {
		      XSSFRow WR=WS.getRow(i);   // i value is 0
		      
		      XSSFCell WC=WR.getCell(0);
		      XSSFCell WC1=WR.getCell(1);
		      XSSFCell WC2=WR.getCell(2);
		      
		      
		      String Name=WC.getStringCellValue();
		      System.out.println(Name);
		      
		      String Sub=WC1.getStringCellValue();
		      System.out.println(Sub);
		      
		      int Marks=(int) WC2.getNumericCellValue();
		      System.out.println(Marks);
		      
	     }
	}
}
		    //  for (int j=0;j<=ColCount;j++)    //Columns
		    //  {
				//XSSFCell WC=WR.getCell(j); // j value is 0
			
			/*switch(WC.getCellType())
				{
				case STRING:
                      System.out.println(WC.getStringCellValue());					
					break;
				case NUMERIC:
					System.out.println(WC.getNumericCellValue());
					break;
			    case BOOLEAN:
			    	System.out.println(WC.getBooleanCellValue());
			    	break;
			default:
				System.out.println("Enter Valid Data");
				break;
				}
				
			}
		}
	     
	     //Cell Value
	     
	    // System.out.println(WS.getRow(4).getCell(1).getStringCellValue());
	*/
	