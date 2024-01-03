package sukmawan;


public class Test1 {
	public static void main(String[] args) {
		int number = 200;
		
		for (int i = 1; i <= number; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			}
			else if (i % 3 == 0) {
				System.out.println("Fizz");
			}
			else if (i % 5 == 0) {
				System.out.println("Buzz");
			}
			else {
			System.out.println(i);
			}
		}
	}
}
		

