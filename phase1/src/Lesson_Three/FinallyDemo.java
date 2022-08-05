package Lesson_Three;

public class FinallyDemo {

	public static void main(String[] args) {
		try
		{
			int data=25/0;
			System.out.println(data);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("done code");

	}

}
