package scripts;

public class DoWhileLoop {

	public static void main(String[] args) 
	{
		// Print 1 to 5 Numbers
		
		int n=5;
		
		do
		{
			System.out.println(n);   //1 2 3 4 5
			n--;   //2 3 4 5 6
			if (n==3) 
			{
			break;	
			}
		}while(n>0);
	}

}
