package sukmawan;
import java.util.Arrays;
public class Test9AscendingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {5,1,4,7,9,2,5,3,6,8};
		
		System.out.println("Your number before ascending are " + Arrays.toString(numbers));
		
		Arrays.sort(numbers);
		
		System.out.println("Your number after ascending are " + Arrays.toString(numbers));
	
	}

}
