package sukmawan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5,10,25,50,75,100,111,222,333,444,555,800,1000};
		//i want to print multiple of 2
		for (int i=0 ; i < array.length ; i++)
		{
			if (array[i] % 2 == 0)
			{
				System.out.println(array[i]);
			}
			else 
			{
				System.out.println(array[i] + " is not multiple of 2");
			}
		}
		
		for (int i=0; i < array.length; i++)
		{
			if (array[i] % 2 == 0)
			{
				System.out.println(array[i]);
				break;
			}
			else
			{
				System.out.println(array[i] + " is not multiple of 2");
			}
		}
		
//		ArrayList<String> a = new ArrayList<String>();
//		a.add("Sukmawan");
//		a.add("Dian");
//		a.add("Khadijah");
//		a.add("Muhammad");
//		
//		System.out.println(a.get(3));
//		
		
		ArrayList<String> family = new ArrayList<String>();
		family.add("Sukmawan");
		family.add("Dian Elysa Putri");
		family.add("Khadijah Ameera Sheenaz");
		family.add("Muhammad Zayn Ibrahim");
		
		System.out.println(family.get(3));
		
		for (int i = 0; i < family.size(); i++)
		{
			System.out.println(family.get(i));
		}
		
		System.out.println("----------------------");
		
		for( String val : family)
		{
			System.out.println(val);
		}
		//item is present in ArrayList
		System.out.println(family.contains("Muhammad Zayn Ibrahim"));
		System.out.println("----------------------");
		
		String[] name = {"Wawan","Dian","Khadijah","Muhammad"};
		
		List<String> nameArrayList = Arrays.asList(name);
		nameArrayList.contains("Khadijah");
		
		
		
		
		
		
		
		
		}
}
