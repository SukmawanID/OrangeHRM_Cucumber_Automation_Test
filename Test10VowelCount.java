package sukmawan;

public class Test10VowelCount {
	    public static void main(String[] args) {
	        // The input string
	        String inputString = "Sukmawan";

	        // Convert the string to lowercase to simplify vowel checking
	        String lowercaseString = inputString.toLowerCase();

	        // Initialize counters for vowels and non-vowels
	        int vowelCount = 0;
	        int nonVowelCount = 0;

	        // Iterate through each character in the string
	        for (int i = 0; i < lowercaseString.length(); i++) {
	            char currentChar = lowercaseString.charAt(i);

	            // Check if the current character is a vowel
	            if (isVowel(currentChar)) {
	                vowelCount++;
	            } else {
	                nonVowelCount++;
	            }
	        }

	        // Print the results
	        System.out.println("Input String: " + inputString);
	        System.out.println("Vowel Count: " + vowelCount);
	        System.out.println("Non-Vowel Count: " + nonVowelCount);
	    }

	    // Function to check if a character is a vowel
	    private static boolean isVowel(char c) {
	        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	    }
}
