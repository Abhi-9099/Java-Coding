package first;

public class Swaping {

	public static void main(String[] args) {
		int a=20;
		int b=30;
		System.out.println("Before swapping of a =" +a +" b is =" + b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping of a =" +a + " b is =" + b);
	}

}
