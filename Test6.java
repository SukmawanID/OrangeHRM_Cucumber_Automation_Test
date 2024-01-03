package sukmawan;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Palindrome String
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int number = scan.nextInt();
		int reversenumber = 0;
		int originalnumber = number;
		
		while (number > 0) {
			reversenumber = reversenumber * 10 + number % 10;
			number = number / 10;
		}
		System.out.println(reversenumber);
		
		if(reversenumber == originalnumber) {
			System.out.println("Your number is Palindrome");
		}
		else {
			System.out.println("Your number isn't Palindrome");
		}
	}		
}
