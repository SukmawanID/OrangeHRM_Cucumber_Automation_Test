package sukmawan;
import java.util.Scanner;
public class Test7ReverseString2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your word : ");
		String word = scan.next();
		String reverseword = "";
		String originalword = word;
		
		for(int i=word.length()-1;i>=0;i--) {
			reverseword = reverseword + word.charAt(i);
		}
		System.out.println("Your reverse word is " + reverseword);
		
		if(reverseword.equals(originalword)) {
			System.out.println("Your word is Palindrome");
		}
		else {
			System.out.println("Your word isn't Palindrome");
		}
	}		
}
