
package String_Code;

import java.util.Scanner;

public class Palindrome_String 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string:");
		String s = scan.next();
		System.out.println("Given string is: " +s);
		char[] c = s.toCharArray();
		String s1 = "";
		
		for (int i = c.length-1; i >= 0; i--) 
		{
			s1=s1+c[i];
		}
		System.out.println("Reversed string is: " +s1);
		
		if(s.equalsIgnoreCase(s1))
		{
			System.out.println("The given string is Palindrome!!!");
		}
		else
		{
			System.out.println("The Given String is not a Palindrome!!!");
		}	
	}
}
