package practice;

public class stringmethods {
	
	
	public static void main(String[] s)
	{
		
		String a ="mohankumar";
		/*//System.out.println(a.length());
String 	b=a.substring(6, 15);
	System.out.println(b);*/
		
		/*String b=a.replace("kumar", "mytheen");
	System.out.println(b);/
		String b=a.trim();
		System.out.println(b);*/
		String[] b=a.split("a",4);
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	    

	}

}
