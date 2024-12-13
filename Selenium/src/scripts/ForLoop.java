package scripts;

public class ForLoop {

	public static void main(String[] args) 
	{
		/*for (int i=1;i<=10;i++)      //2 3
		{
			System.out.println(i);   //1 2 3
			if (i==5)
			{
			break;	
			}
		}*/
		
		for (int i=1;i<=10;i++)      //2 3
		{
			if (i==3 || i==5 || i==7)
			{
             continue;				
			}
			System.out.println(i);   //1 2 3 4 6 7 8 9 10
		}
		
	}

}
