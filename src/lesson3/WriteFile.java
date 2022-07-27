package lesson3;
import java.io.FileWriter;
public class WriteFile {

	public static void main(String[] args) {
		String program = "class JavaFile { " +"public static void main(String[] args) { " +
                  "System.out.println(\"This is file\");"+"}"+"}";
		try
		{
			// Creates a Writer using FileWriter
			FileWriter o=new FileWriter("JavaFile.java");
			// Writes the program to file
		    o.write(program);
		    System.out.println("Data is written to the file.");

		}
		catch(Exception e){
			System.out.println(e);
		}

	}

}
