package Lesson_Three;
class CustomExe extends Exception {
	   String message;
	   CustomExe(String str) {
	      message = str;
	   }
	   public String toString() {
	      return ("Custom Exception Occurred : " + message);
	   }
	}
public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	         throw new CustomExe("This is a custom message");
	      } catch(CustomExe e) {
	         System.out.println(e);
	      }
	}

}
