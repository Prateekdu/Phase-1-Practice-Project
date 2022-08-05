package Lesson_Three;
class car{  
	  void run(){System.out.println("running");}  
	}  
public class Polymorphism extends car {
	void run()
	{
		System.out.println("running safely with 60km");
	}  
	public static void main(String args[]){  
	    car b = new Polymorphism();//upcasting  
	    b.run();  
	}

}
