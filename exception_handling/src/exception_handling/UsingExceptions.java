package exception_handling;

public class UsingExceptions {
	public static void main(String args[]) {
		try {
			throwException(); 
		} // end try
		catch (Exception exception) // exception thrown by throwException
		{
			System.out.println("Exception handled in main");// err
		} // end catch

		doesNotThrowException();
	} // end main

	// demonstrate try...catch...finally
	public static void throwException() throws Exception {
		try // throw an exception and immediately catch it
		{
			System.out.println("Method throwException");
			throw new Exception(); // generate exception
		} // end try
		catch (Exception exception) // catch exception thrown in try
		{
			//System.err.println("Exception handled in method throwException");
			System.out.println("Exception handled in method throwException");
			//System.out.println(exception);
			throw exception; 

			// any code here would not be reached

		} // end catch
		finally // executes regardless of what occurs in try...catch
		{
			System.out.println("Finally executed in throwException"); // err
		} // end finally

		// any code here would not be reached, exception rethrown in catch

	} // end method throwException

	// demonstrate finally when no exception occurs
	public static void doesNotThrowException() {
		try // try block does not throw an exception
		{
			System.out.println("Method doesNotThrowException");
		} // end try
		catch (Exception exception) // does not execute
		{
			System.out.println(exception);// err
			System.out.println("Hello");
		} // end catch
		finally // executes regardless of what occurs in try...catch
		{
			System.out.println("Finally executed in doesNotThrowException");//err
		} // end finally

		System.out.println("End of method doesNotThrowException");
	} // end method doesNotThrowException
}// end of class
