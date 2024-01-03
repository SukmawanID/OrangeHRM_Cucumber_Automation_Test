package sukmawan;
import java.util.Scanner;

public class Test7ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your word = ");
		String word = scan.next();
		String originalword = word;
		String reverseword = "";
		
		for( int i = word.length() - 1; i >= 0; i--) {
			reverseword = reverseword + word.charAt(i);
		}
		System.out.println("Your Reverse Number is " + reverseword);
		
		
		if(originalword.equals(reverseword)) {
			System.out.println("Your Word is Palindrome");
		}
		else  {
			System.out.println("Your Word is not Palindrome");
		}
	}

}
