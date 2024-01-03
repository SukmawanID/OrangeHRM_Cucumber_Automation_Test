package sukmawan;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// palindrome number
		Scanner number = new Scanner(System.in);
		System.out.println("Enter your original number : ");
		int firstnumber = number.nextInt();
		int originalnumber = firstnumber;
		int reversenumber = 0;
		
		while (firstnumber != 0) {
			reversenumber=reversenumber * 10 + firstnumber % 10;
			firstnumber = firstnumber / 10;
		}
		System.out.println("Your Reverse Number is " + reversenumber);
		
		if (reversenumber == originalnumber) {
			System.out.println("Your Number is Palindrome");
		}
		else {
			System.out.println("Your Number is Not Palindrome");
		}
	}

}
