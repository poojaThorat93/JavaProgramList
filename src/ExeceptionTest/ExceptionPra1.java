package ExeceptionTest;

public class ExceptionPra1 {
	
	// ------------------ Java finally block --------------	
	/*Java finally block is a block that is used to execute important code such as closing connection, stream etc.
	Java finally block is always executed whether exception is handled or not.
	Java finally block follows try or catch block.
	*/
	public static void main(String [] args)
	{ 
		try {
		System.out.println("Hi");
		int i = 100/0;
		}
		catch(ArithmeticException e)// here we handle the execption  
		{
			System.out.println(e);
			//System.out.println("Bye");
		}
		finally
		{
			System.out.println("Always continue");
		}
		
		
	// ------------------ here we Not handle the execption  -----------------
		/*try
		{
			String city = null;
			System.out.println(city.length()); 
		}
		catch(ArithmeticException l){
			System.out.println(l);
		}
		finally  // can use  - 1. Try & Finally 2. try catch & Finally 
		{		// can not use - 1. catch & finally 
			System.out.println(" this is finally block it always executed");
		}*/
}

}