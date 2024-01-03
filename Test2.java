package sukmawan;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// how to swapping numbers
		
		int a = 10;
		int b = 20;
		
		System.out.println("number before swapping a is " + a + " and b is " + b);
		
		int t = a; // value a to t
		a = b; // value b to a
		b = t; // value t to b
		
		System.out.println("number after swapping a is " + a + " and b is " + b);
		
		int c = 30;
		int d = 40;
		
		System.out.println("number before swapping c is " + c + " and d is " + d);
		
		d=c+d; // 30+40 = 70
		c=d-c; // 70-30 = 40
		d=d-c; // 40-40 = 30
		/*
		c=c+d; 30+40 = 70
		d=c-d; 70-40 = 30
		c=c-d; 70-30 = 40
		*/
		
		System.out.println("number after swapping c is " + c + " and d is " + d);
	}

}
