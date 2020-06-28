package practice;

public class stringcount {
	
	
	public static void main(String[] s)
	{
		String a="mohan is a good";
		int count=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)!=' ')
			{
				count++;
			}
		}
		
		System.out.print(count);
	}

}
