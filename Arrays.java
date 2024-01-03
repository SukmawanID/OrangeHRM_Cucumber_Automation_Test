package sukmawan;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Case 1
		int[] arrays = new int[5]; 
		
		arrays[0] = 10;
		arrays[1] = 200;
		arrays[2] = 3000;
		arrays[3] = 40000;
		arrays[4] = 500000;
		
		System.out.println("Case 0");
		for (int i=0; i < arrays.length; i++)
		{
			if(arrays[i] == 200) 
			{
				System.out.println(arrays[i] + " this is price for what i get");
			}
			else 
			{
				System.out.println(arrays[i]);
			}
		}
		System.out.println("Case 1");
		// Case 2
		int[] arrays2 = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i=0; i < arrays2.length ; i++) 
		{
			System.out.println(arrays2[i]);
		}
		System.out.println("Case 2");
		// Case 3
		for(int i=0; i < arrays2.length; i++ )
		{
			if (arrays2[i] % 2 == 0) 
			{
			System.out.println(arrays2[i] + " is 0");
			}
			else 
			{
			System.out.println(arrays2[i] + " is 1");	
			}
		}
		System.out.println("Case 3");
		// Case 4
		for (int i=0; i < arrays2.length; i++) {
			if (arrays2[i] % 2 == 0) {
				System.out.println(arrays[i]);
				break;
			}
		}
		System.out.println("Case 4");
		// Case 5
		String[] name = {"Sukmawan","Dian Elysa Putri","Khadijah Ameera Sheenaz","Muhammad Zayn Ibrahim"};
			
		
		
		for (int i=0; i < name.length; i++)
		{
			if (name[i] == "Sukmawan")
			{
				System.out.println(name[i] + " is father");
			}
		}
		System.out.println("Case 5");
		// Case 6
		for (String family: name) {
			System.out.println(family);
		}
		System.out.println("Case 6");
		// Case 7
		for (int i=0; i < name.length; i++) {
			System.out.println(name[i] + " has length of string is " + name[i].length());
		}
		System.out.println(name[2].toUpperCase());
		System.out.println(name[3].toLowerCase());
		
		System.out.println("Case 7");
		//Case 8
		for (int a=1; a <= 3; a++) {
			System.out.println("Outer is " + a);
			for (int b=1; b <=5; b++) {
				System.out.println("  Inner is " + b);
			}		
		}
		System.out.println("Case 8");
		
		
		
	}	
}
		
		
		
