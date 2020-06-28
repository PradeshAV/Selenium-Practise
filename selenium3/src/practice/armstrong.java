package practice;

public class armstrong {

	
	
	public static void main(String[] s)
	{
		
		int temp, n=1953,c=0,a;
		temp=n;
		
	while(n>0)
	{
		
		a=n%10;
		n=n/10;
		c=c+(a*a*a);
		
		
	}
	if(temp==c)
	{
		System.out.println("arm");
	}
	else
	{
		System.out.println("noy");
	}
	}
	
}
