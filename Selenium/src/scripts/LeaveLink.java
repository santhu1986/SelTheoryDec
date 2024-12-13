package scripts;

import org.testng.annotations.Test;

public class LeaveLink extends Base 
{
   @Test
	public void leave() throws InterruptedException
	{
		LB.LeaveLnk();
	}
}
