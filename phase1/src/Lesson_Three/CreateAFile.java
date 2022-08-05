package Lesson_Three;
import java.io.File;
public class CreateAFile {

	public static void main(String[] args) {
		// create a file object for the current location
		File f=new File("JavaFile.java");
		try 
		{
			 // create a new file with name specified
		      // by the file object
			boolean value=f.createNewFile();
			if(value)
			{
				System.out.println("new file is created");
			}
			else
			{
				System.out.println("file is already exits.");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
