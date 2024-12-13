package scripts;

import org.testng.annotations.Test;


public class TestNGClass 
{
     @Test(groups="smoke")
	public void abc()
	{
		System.out.println("Test1");
	}
     @Test
	public void pqr()
	{
		System.out.println("Test2");
	}
     @Test(groups="functional")
	public void xyz()
	{
		System.out.println("Test3");
	}
     @Test(groups="Regression")
	public void def()
	{
		System.out.println("Test4");
	}
}
