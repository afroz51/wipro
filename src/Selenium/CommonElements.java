package Selenium;

import java.util.HashSet;
import java.util.Set;

public class CommonElements 
{
	public static void main(String[] args)
	{
		int[] array1 = {1, 4, 7, 9, 2};
		int[] array2 = {1, 7, 3, 4, 5};
		
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> common = new HashSet<Integer>();
		
		for(int num:array1)
		{
			set1.add(num);
		}
		
		for(int num:array2)
		{
			if(set1.contains(num))
			{
				common.add(num);
			}
		}
		System.out.println("Common Elements: "+common);
	}
}
