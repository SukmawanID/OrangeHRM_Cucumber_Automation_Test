package sukmawan;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 123456789;
		int count = 0;
		
		while (number>0) {
			number = number / 10;
			count++;
		}
		System.out.println(count);
	}

}
