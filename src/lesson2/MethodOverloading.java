package lesson2;

public class MethodOverloading {

	void operation(int c) {
		c=c*10;
		System.out.println(c);
	}
public static void main(String args[])
{
	MethodOverloading mo=new MethodOverloading();
	mo.operation(10);
}
}
