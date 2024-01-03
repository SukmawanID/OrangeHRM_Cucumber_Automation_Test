package sukmawan;

public class BeginnerInJavaCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrays = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		for(int i=0;i<arrays.length;i++)
		{
			if (arrays[i] % 2 == 0)
			{
				System.out.println(arrays[i]);
			}
			else
			{
				System.out.println(arrays[i] + " is not multiple of 2");
			}
		}
		
		for(int i=0; i < arrays.length; i++)
		{
			if(arrays[i] % 2 == 0)
			{
				System.out.println(arrays[i]);
				break;
			}
			else
			{
				System.out.println(arrays[i] + " is not multiple of 2");
			}
		}
		
	}

}
