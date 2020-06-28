package practice;


import java.util.Scanner;

public class palindromestring {
	
	
	public static void main(String[] s)
	{
		String reverse=""; 
		Scanner sc=new Scanner(System.in);
		String a =sc.nextLine();
		for(int i=a.length()-1;i>=0;i--)
		{
			reverse=reverse+a.charAt(i);
		}
		
		if(reverse.equals(a))
		{
			System.out.println("palindrome");
			
		}
		else
		{
			System.out.println("not");
		}
	}
	
}
