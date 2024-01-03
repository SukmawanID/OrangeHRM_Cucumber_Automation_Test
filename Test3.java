package sukmawan;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Reverse number
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int number = scan.nextInt();
		
		int reverse = 0;
		
		while (number != 0) {
			reverse = reverse * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Your Reverse number is " + reverse);
	}
	
}
