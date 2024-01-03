package sukmawan;

public class Test8EvenOddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 123456789;
		int odd_count = 0;
		int even_count = 0;
		
		
		while(number > 0) {
			int resultnumber = number % 10;
		if (resultnumber % 2 == 0) {
			odd_count++;
		}
		else {
			even_count++;
		}
		number = number / 10;
		}
		System.out.println("Your Odd Count is " + odd_count);
		System.out.println("Your Even Count is " + even_count);
	}

}
