package scripts;

import java.io.IOException;

public class ExeLib 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
	
		//Instance Class / Reference Class
		
		
		Library LB=new Library();
		
		String Rval=LB.OpenApp("https://opensource-demo.orangehrmlive.com/");
		System.out.println(Rval);
		
	//	LB.Login("Admin","admin123");
	//	LB.LogOut();
		//LB.AppClose();
	}

}
