package Exception;

public class ExceptionHandling {
	public static void main(String[] args) {
		int arr[]= {10,20,5,0};
		int result=0;
		try {
		result=arr[1]/arr[2];
		int sum=Integer.parseInt("abc");
	}
	catch(ArithmeticException e)
	{
		System.out.println("Error"+e.getMessage());
	}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array access error @"+ e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Main errors");
		}
		finally
		{
			System.out.println("Result is :"+result);
		}

	}
}
