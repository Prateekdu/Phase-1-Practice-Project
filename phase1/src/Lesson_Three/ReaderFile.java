package Lesson_Three;

import java.io.FileReader;
public class ReaderFile {

	public static void main(String[] args) {
		char[] array = new char[100];
	    try {
	      // Creates a reader using the FileReader
	      FileReader input = new FileReader("JavaFile.java");

	      // Reads characters
	      input.read(array);
	      System.out.println("Data in the file:");
	      System.out.println(array);

	    }
	    catch(Exception e) {
	     System.out.println(e);
	    }
	}

}
