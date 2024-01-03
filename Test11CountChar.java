package sukmawan;
import java.util.HashMap;
import java.util.Map;
public class Test11CountChar {
	    public static void main(String[] args) {
	        // The input string
	        String inputString = "Andri";

	        // Convert the string to lowercase to ensure case-insensitive counting
	        String lowercaseString = inputString.toLowerCase();

	        // Create a Map to store character counts
	        Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
	        
	        // Iterate through each character in the string
	        for (int i = 0; i < lowercaseString.length(); i++) {
	            char currentChar = lowercaseString.charAt(i);

	            // Update the count in the map
	            charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);
	        }

	        // Print the character counts
	        System.out.println("Character Counts for '" + inputString + "':");
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	}

}
