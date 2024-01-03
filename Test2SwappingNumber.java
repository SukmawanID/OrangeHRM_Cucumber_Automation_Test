package sukmawan;

public class Test2SwappingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 50;
		int b = 40;
		
		System.out.println("A Number is " + a + " and B Number is " + b);
		
		b = a + b; //50 + 40 = 90
		a = b - a; //90 - 50 = 40
		b = b - a; //90 - 40 = 50
		
		System.out.println("after Swapping A Number is " + a + " and B Number is " + b);
		
		
	}

}
