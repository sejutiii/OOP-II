package exception_handling;

public class UsingExceptions3 {

	public static void main(String[] args) {
		
		try
		{
			method1();
		}
		catch(Exception exception)
		{
			System.err.println(exception.getMessage());
			exception.printStackTrace();
			
			StackTraceElement[] traceElements= exception.getStackTrace();
			
			System.out.println("Stack trace from getStackTrace:");
			System.out.println("Class\tFile\tLine\tMethod");
			
			for(StackTraceElement element: traceElements)
			{
				System.out.print(element.getClassName() + "  ");
				System.out.print(element.getFileName()+ "  ");
				System.out.print(element.getLineNumber()+ "\t");
				System.out.println(element.getMethodName());
			}
		}
	}
	
	public static void method1() throws Exception
	{
		method2();
	}
	
	public static void method2() throws Exception
	{
		method3();
	}
	
	public static void method3() throws Exception
	{
		throw new Exception("Exception thrown in method3");
	}

}
