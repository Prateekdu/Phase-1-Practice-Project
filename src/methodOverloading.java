
public class methodOverloading {
	void operation(int c) {
		c=c*10;
		System.out.println(c);
	}
public static void main(String args[])
{
	methodOverloading mo=new methodOverloading();
	mo.operation(10);
}
}
