package sukmawan;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 123456789;
		int even_count = 0;
		int odd_count = 0;
		
		while(number > 0) {
			int resultnumber = number % 10;
			
			if (resultnumber % 2 == 0) {
				even_count++;
			}
			else {
				odd_count++;
			}
		number = number / 10;
		}
		System.out.println("Even count is " + even_count);
		System.out.println("Odd count is " + odd_count);
	}

}
