package practice;

import java.util.Scanner;

public class descendingorder {

	
	
	
	public static void main(String[] s)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
		System.out.print(" "+a[i]);
		}
	}
}
