package Selenium;

import java.util.ArrayList;

public class LargestPrimefactor
{
	public static void main(String[] args) 
	{
		int n = 455;
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 2; i < n - 1 ; i++)
		{
			if(n%i == 0 && isprime(i))
			{
				list.add(i);
			}
		}
		System.out.println(list.get(list.size()-1));
	}

	private static boolean isprime(int i) 
	{
		for(int k = 2; k <= Math.sqrt(i); k++)
		{
			if(i%k == 0)
			{
				return false;
			}
		}
		return true;
	}
}
