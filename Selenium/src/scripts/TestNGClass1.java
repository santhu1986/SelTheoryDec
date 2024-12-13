package scripts;

import org.testng.annotations.Test;

public class TestNGClass1 
{

	  @Test(groups="smoke")
		public void abc()
		{
			System.out.println("Test5");
		}
	     @Test(groups="functional")
		public void pqr()
		{
			System.out.println("Test6");
		}
	     @Test(groups="smoke")
		public void xyz()
		{
			System.out.println("Test7");
		}
	     @Test(groups="Regression")
		public void def()
		{
			System.out.println("Test8");
		}
}
