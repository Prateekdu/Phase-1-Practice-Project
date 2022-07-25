
public class typeCasting {

public static void main(String args[])
	{
		System.out.println("Implicit Type Casting");
		char a='G';
		System.out.println("Value of a : "+a);
		int b=a;
		System.out.println("Value of b : "+b);
		float c=a;
		System.out.println("Value of c : "+c);
		double d=a;
		System.out.println("Value of d : "+d);
		long l=a;
		System.out.println("Value of l : "+l);
		System.out.println();
		System.out.println("Explicit Type Casting");
		int x=15;
		float y=(float)x;
		double r=(double)x;
		long k=(long)x;
		System.out.println(x);
		System.out.println(y);
		System.out.println(r);
		System.out.println(k);
		
		
	}

}
