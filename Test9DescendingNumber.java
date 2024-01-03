package sukmawan;
import java.util.Arrays;
import java.util.Collections;
public class Test9DescendingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] numbers = {5,1,4,7,9,2,5,3,6,8};
		
		Arrays.sort(numbers, Collections.reverseOrder());
		System.out.println("Your Descending numbers is " + Arrays.toString(numbers));
		
		
		
	}

}
