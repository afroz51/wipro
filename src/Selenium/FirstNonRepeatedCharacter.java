package Selenium;

import java.util.HashMap;

public class FirstNonRepeatedCharacter 
{
	public static void main(String[] args) 
	{
		String str = "Java concept of the day";
		System.out.println("First non-repeated character: "+ getFirstNonRepeatedCharacter(str));
	}

	private static char getFirstNonRepeatedCharacter(String str) 
	{
		HashMap<Character, Integer> charCount = new HashMap<>();
		
		for(char c : str.toCharArray())
		{
			if(c != ' ')
			{
				charCount.put(c, charCount.getOrDefault(c, 0) + 1);
			}
		}
		
		for(char c : str.toCharArray())
		{
			if(c != ' ' && charCount.get(c) == 1)
			{
				return c;
			}
		}
		return '\0';
	}
}
