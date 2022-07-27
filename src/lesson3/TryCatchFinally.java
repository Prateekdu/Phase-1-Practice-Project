package lesson3;

public class TryCatchFinally {

	public static void main(String[] args) {
		int[] a=new int[5];
		try
		{
			int i=a[5];
			System.out.println("Inside try block");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block executed");
		}
		System.out.println("Outside try-catch-finally");
	}

}
