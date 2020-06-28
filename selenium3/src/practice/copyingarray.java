package practice;

public class copyingarray {
	
	
	public static void main(String[] s)
	{
		
		int a[]={23,25,27,29};
		int b[]=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		
		
		
		System.out.println("new array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+b[i]);
		}
	}

}
