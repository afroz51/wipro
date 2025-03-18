package Selenium;

import java.util.HashSet;

public class UniqueCharacters 
{
//	Method to check if a string has all unique characters
	public static boolean hasUniqueCharacters(String str)
	{
		HashSet<Character> charset = new HashSet<>();
		
//		Iterate through each charactera and add to the HashSet
		for(char c : str.toCharArray())
		{
			// If duplicate character is found return false, Cause while adding an element add method internally calls equals method.
			if(!charset.add(c))  
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		String word = "Wipro";
		
		if(hasUniqueCharacters(word))
		{
			System.out.println(word + " -> Unique");
		}
		else
		{
			System.out.println(word + " -> Not Unique");
		}
	}
}
