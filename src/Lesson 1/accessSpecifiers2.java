class preAccessSpecifier
{
 private void display(){
	 System.out.println("This is private access specifier");
 }	
}
public class accessSpecifiers2 {
	public static void main(String args[])
	{
		System.out.println("Private Access Specifier");
		preAccessSpecifier obj= new preAccessSpecifier();
		obj.display();
	}
}
