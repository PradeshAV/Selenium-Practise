package practice;

public class whitespaces {
	
	
	public static void main(String[] s)
	{
		String a ="mohani a";
		String a11="mohan ytss";
	
	for(int i=0;i<2;i++)
	{
		switch(i)
		{
		case 0:
			a=a.replaceAll("\\s+", "");  
			
			System.out.print("removewhite"+a);
			break;
			
			
		case 1:
			
			 a11 =a11.replace(" ", "-");
			 System.out.println(a11);
			}	
		
		
		}

	}
}
