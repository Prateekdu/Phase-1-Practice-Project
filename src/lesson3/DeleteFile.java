package lesson3;
import java.io.File;
public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creates a file object
	    File file = new File("JavaFile.java");

	    // deletes the file
	    boolean value = file.delete();
	    if(value) {
	      System.out.println("The File is deleted.");
	    }
	    else {
	      System.out.println("The File is not deleted.");
	    }

	}

}
