package lesson3;
class employee{
	float salary=12000;
}
public class InheritanceDemo extends employee {
	int bonus=1000;
	public static void main(String[] args) {
		InheritanceDemo in=new InheritanceDemo();
		System.out.println("salary is : "+in.salary);
		System.out.println("bonus is : "+in.bonus);

	}

}
