package scripts;

public class Operators {

	public static void main(String[] args) 
	{
		
	/*	int a=10;       //int is Datatype   a is variable    10 is value
		int b=30;
		
		// Arithmetic Operators    +  -  *  /  %
		
		System.out.println("Sum of a and b is:" +(a+b));
		System.out.println("Diff of a and b is:"+(b-a));
		System.out.println("Mul of a and b is" +(a*b));
        System.out.println("Div of a and b is" +(a/b));
        System.out.println(("Mod div a and b is" +(a%b)));
        
        
        //Relational Operator/Comparision Operator  -------   ==    <     >    <=   >=   !=
        
        //Always it will return Boolean Value
        
        System.out.println("----------Relational Operators-----------------");
        
        System.out.println(a==b);    // False
        System.out.println(a>b);    // False
        System.out.println(a<b);    //True
        System.out.println(a>=b);   //False
        System.out.println(a<=b);   //True
        System.out.println(a!=b);    //True        
        
        
        //Logical Operators       &&      ||    !
        
        //Always we have to work with two Boolean Values
        
        boolean x=true;
        boolean y=false;
        
        System.out.println("------------------Logical Operator-------------------");
        
        System.out.println(x && y);    //False
        System.out.println(x || y);    //True
        System.out.println(!x);        //False
        System.out.println(!y);        //True
    */    
       
		//Incremental and Decremental Operator   ++    --
        
             int p=5;
             p=p+1;
             System.out.println(p);    //6
             p++;  
             System.out.println(p);    //7
        
        
        //Decremental
             
             p=p-1;
             System.out.println(p);    //6
             p--;
             System.out.println(p);    //5
             
        
        // Post Increment and Pre Increment
             
             int n=5;
             System.out.println(n);    //5
             
             int m=n--;      //1st it will assign the value then it takes increment
        
             System.out.println(m); //5
             System.out.println(n); //6
        
             int x=--m;     //1st increment then assign the value
             
             System.out.println(x);   //6
             System.out.println(m);  //6
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
