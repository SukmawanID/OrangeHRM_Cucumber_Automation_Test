package sukmawan;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// reverse word
		
		String word = "ABCDEFG";
		String reverseword = "";
		
		for (int i=word.length()-1; i>=0; i--) {
			reverseword = reverseword + word.charAt(i);
		}
		System.out.println("Your Reverse Word is " + reverseword);
	}

}
