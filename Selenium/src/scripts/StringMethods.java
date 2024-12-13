package scripts;

public class StringMethods {

	public static void main(String[] args) 
	{
		
		
		   String MyStr="MindqSystems";
		   
//		   System.out.println(MyStr.length());
//		   
//		   System.out.println(MyStr.charAt(4));   //q
//		   
//		   System.out.println(MyStr.charAt(11));  //s
//		   
//		   System.out.println(MyStr.charAt(MyStr.length()-1));  //s
//		   
//		   System.out.println(MyStr.indexOf("s",6));  //5
//		   
//		   System.out.println(MyStr);
//		   
//		   System.out.println(MyStr.toLowerCase());
//		   
//		   System.out.println(MyStr.toUpperCase());
//		   
		   String MyStr1="Selenium";
		   String MyStr2="Testing";
		   
		   System.out.println(MyStr1.isEmpty());  //True
		   System.out.println(MyStr.isEmpty());  //False
		   
		   System.out.println(MyStr1.concat(MyStr2));
		   System.out.println(MyStr1+MyStr2);
		
		   System.out.println(MyStr1.equals("selenium"));  //False  
		   
	    System.out.println(MyStr1.equals("Selenium"));   //True
	    
	    System.out.println(MyStr1.equalsIgnoreCase("selenium"));  //True
	    
	    System.out.println(MyStr.startsWith("Mind"));  //True
	    
	    System.out.println(MyStr.endsWith("Systems"));
	    
	    System.out.println(MyStr.contains("Sys"));
	    
	    System.out.println(MyStr);
	    
	    System.out.println(MyStr.trim());
	    
	    System.out.println(MyStr.replace("m","@"));
	    
	    //System.err.println(MyStr.replace("Systems","Testing"));
	    
	   System.out.println(MyStr.substring(6,11));     //Mindq Systems 
	    
	    
		   
	  }

   }
