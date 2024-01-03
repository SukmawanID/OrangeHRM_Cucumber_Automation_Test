package sukmawan;
import java.util.Arrays;
import java.util.Collections;

public class Test9 {
	
	public static void main (String[] args) {
		
		Integer[] number = {3,1,5,2,6,9,8,7};
		
		Arrays.sort(number);
		
		System.out.println("Sorted Number (Ascending) :" + Arrays.toString(number));
		
		
		Arrays.sort(number, Collections.reverseOrder());
		System.out.println("Sorted Number (Descending) : " + Arrays.toString(number));
		
		
		
	}
}
