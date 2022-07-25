

class defAccessSpecifier {
	 void display()
	 {
		 System.out.println("this is default access specifier");
	 }
}
public class accessSpecifiers1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Default Access Specifier");
		defAccessSpecifier obj=new defAccessSpecifier();
		obj.display();
	}

}
