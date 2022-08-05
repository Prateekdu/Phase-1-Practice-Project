package Lesson_Three;
public class ExceptionHandling {

	public static void main(String[] args) {
		try
		{
			int a=100/0;
			System.out.println(a);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("done");

	}

}
