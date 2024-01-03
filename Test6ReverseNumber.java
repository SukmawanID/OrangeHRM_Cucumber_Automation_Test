package sukmawan;
import java.util.Scanner;
public class Test6ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int number = scan.nextInt();
		int reverse = 0;
		int originalnumber = number;
		while(number != 0) {
			reverse = reverse * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Your Reverse Number is " + reverse);
		
		if(originalnumber==reverse) {
			System.out.println("Your Number is Palindrome");
		}
		else {
			System.out.println("Your Number is Not Palindrome");
		}
		
	}

}
