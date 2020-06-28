package practice;

public class palindrome {

	
	public static void main(String[] s)
	{
		
		
		int n=352,sum=0,r;
		int temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
		}
		if(temp==sum)
		{
			System.out.println("palindrome");
			
		}
		else
		{
			System.out.print("not");
		}
	}
}
