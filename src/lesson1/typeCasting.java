package lesson1;

public class typeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Implicit type casting  ");
		char a='A';
		System.out.println("a "+a);
		int b=a;
		System.out.println("b "+b);
		float c=a;
		System.out.println("c "+c);
		double d=a;
		System.out.println("d "+d);
		long e=a;
		System.out.println("e "+e);
		System.out.println();
		System.out.println("explicit type casting ");
		int x=10;
		float f=(float)x;
		long l=(long)x;
		double k= (double)x;
		System.out.println(f);
		System.out.println(l);
		System.out.println(k);
	}

}
