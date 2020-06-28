package practice;

public class duplicateelements {
	
	
	public static void main(String[] s)
	{
		
		int a[]={1,3,4,2,3,4,2,7,8,9};
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(" "+a[j]);
				}
			}
		}
	}

}
