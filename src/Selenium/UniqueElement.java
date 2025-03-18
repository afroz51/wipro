package Selenium;

import java.util.ArrayList;
import java.util.List;

public class UniqueElement
{
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(20);	
		list.add(10);
		list.add(9);
		list.add(10);
	
		for(int i = 0; i < list.size()-1; i++)
		{
			int count = 0;
			Integer element = list.get(i);
			for(int j = 0 ; j <= list.size()-1; j++)
			{
				if(element.equals(list.get(j)))
				{
					count++;
				}
			}
			if(count == 1)
			{
				System.out.println(element);
			}
			
		}
	}
}
