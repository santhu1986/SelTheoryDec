package scripts;

public class SmallestOfThreeNumbers 
{

	public static void main(String[] args) 
	{
		
		int a=30;
		int b=10;
		int c=50;
		
		if ((a<b)&&(a<c)) 
		{
			System.out.println("Smallest number is :" +a);
		}
		else if(b<c)
		{
			System.out.println("Smallest number is :" +b);
		}
		else
		{
			System.out.println("Smallest number is :" +c);
		}
	}

}

