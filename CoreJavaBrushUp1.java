package sukmawan;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNum = 5;
		String website = "Rahul Shetty Academy";
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;
		
		System.out.println(myNum + " is the value stored in the myNum variable");
		System.out.println(website);
		//Arrays
		
		int[] array = new int[5];
		array[0] = 1;
		array[1] = 5;
		array[2] = 10;
		array[3] = 15;
		array[4] = 20;
		
		for(int i=0; i<array.length; i++)
		{
			System.out.println(array[i]);
		}
		
		int[] array2 = {1,3,5,7,9};
		System.out.println(array2[0]);
		System.out.println(array2[3]);
		
		for(int i=0; i<array2.length; i++)
		{
			System.out.println(array2[i]);
		}
		
		String[] name = {"Wawan","Dian","Khadijah","Muhammad"};
		
		for (int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		for ( String s: name)
		{
			System.out.println(s);
		}
	}

}
