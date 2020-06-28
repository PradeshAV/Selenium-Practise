package practice;

import java.util.Scanner;

public class pattern {

	
	
	public static void main(String[] s)
	{
	int k=1;	
		
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		char b[]=n.toCharArray();
int total=n.length();
switch(k)
{

case 0:
	for(int i=0;i<total;i++)
	{
		for(int j=0;j<=i;j++)
		{
		System.out.print(b[j]);
	}
		System.out.println();
	}

	for(int i=total;i>0;i--)
	{
		for(int j=0;j<i;j++)
		{
			System.out.print(b[j]);
		}
		System.out.println();
	}
case 1:
	
	
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	for(int i=5;i>0;i--)
	{
		for(int j=i-1;j>0;j--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	
	
	
	
	}
}}