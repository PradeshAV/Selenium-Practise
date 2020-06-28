package practice;

import java.util.Scanner;

public class smallest
{
	
public static void main(String[] s)
{
	int max1 = 0;
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
	max1=a[0];
	if(max1>a[i])
	{
		max1=a[i];
	}
		
	}
	System.out.print(max1);
}
	
}
