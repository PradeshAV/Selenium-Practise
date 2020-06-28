package practice;

import java.util.Scanner;

public class reversestring {
	
	
	public static void main(String[] s)
	{
		Scanner sc = new Scanner(System.in);
	String a=	sc.nextLine();
	char c []=a.toCharArray();
	int b=a.length();
	System.out.println(b);
	for(int i=b-1;i>=0;i--)
	{
		System.out.print(c[i]);
	}
	}

}
