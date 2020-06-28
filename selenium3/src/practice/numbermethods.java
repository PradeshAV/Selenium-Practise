package practice;

import java.util.Scanner;

import org.testng.annotations.Test;

public class numbermethods {

	
	
	@Test
	public void ascendingorder()
	
	{
		int temp;
		Scanner sc=new Scanner(System.in);
	           int n= sc.nextInt();
		 int a[]=new int[n];
		 for(int i=0;i<n;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		 
		 for(int i=0;i<a.length;i++)
		 {
			 
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(a[i]>a[j])
				 {
					 temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				 }
			 }
		 }
		 
		 
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.println(a[i]);
		 }
		 
	}
}
