package Selenium;

public class PasswordValidator 
{
	public static boolean isValidPassword(String password)
	{
		if(password.length() != 8)
		{
			return false;
		}
		return password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[a-zA-z]).{8}$");
	}
	
	public static void main(String[] args) 
	{
		String[] passwords = {"Test1234", "test1234", "T1234567", "Pass12wd", "Test@1234"};
		for(String password :passwords)
		{
			System.out.println(password + " -> " + (isValidPassword(password) ? "Valid" : "Invalid"));
		}
	}
}
