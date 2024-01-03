package sukmawan;

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Sukmawan";
		
		
		//new
		
		String s2 = new String("Sukmawan");
		
		String name = "Muhammad Zayn Ibrahim";
		String[] SplitString = name.split(" ");
		System.out.println(SplitString[0]);
		System.out.println(SplitString[1]);
		System.out.println(SplitString[2]);
		System.out.println("------Print Per Character From First to Last Character------");
		for (int i = 0; i < name.length(); i++)
		{
			System.out.println(name.charAt(i));
		}
		System.out.println("------Done------");
		System.out.println("------Print Per Character From Last to First Character------");
		for (int i = name.length()-1; i >= 0; i--)
		{
			System.out.println(name.charAt(i));
		}
		System.out.println("------Done------");	
			
		String name_daughter = "Khadijah Ameera Sheenaz";
		String[] SplitStringRemove = name_daughter.split("Ameera");
		System.out.println(SplitStringRemove[0]);
		System.out.println(SplitStringRemove[1]);
		System.out.println(SplitStringRemove[1].trim());
		System.out.println("------Done------");	
		String namewife = "Dian Elysa Putri";
		String[] SplitSpaceName = namewife.split(" ");
		System.out.println(SplitSpaceName[0]);
		System.out.println(SplitSpaceName[1]);
		System.out.println(SplitSpaceName[2]);
		System.out.println("------Done------");	
		for (int i=0; i < namewife.length();i++)
		{
			System.out.println(namewife.charAt(i));
		}
		System.out.println("------Done------");	
		for (int i=namewife.length()-1; i >= 0; i--)
		{
			System.out.println(namewife.charAt(i));
		}
	}

}
