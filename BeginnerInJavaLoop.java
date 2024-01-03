package sukmawan;

public class BeginnerInJavaLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrays = new int[5];
		arrays[0] = 1;
		arrays[1] = 3;
		arrays[2] = 5;
		arrays[3] = 7;
		arrays[4] = 9;
		
		
		int[] arrays2 = {2,4,6,8,10};
		
		
		String[] name = {"Sukmawan", "Dian Elysa Putri", "Khadijah Ameera Sheenaz", "Muhammad Zayn Ibrahim"};
		
		
		for (int i=0; i < arrays.length; i++)
		{
			System.out.println(arrays[i]);
		}
		System.out.println("");
		for(int i=2; i < arrays2.length; i++)
		{
			System.out.println(arrays2[i]);
		}
		System.out.println("");
		for(int i=0; i < name.length; i++)
		{
			System.out.println(name[i]);
		}
		for(String n:name) 
		{
			System.out.println(n);
		}
	}

}
