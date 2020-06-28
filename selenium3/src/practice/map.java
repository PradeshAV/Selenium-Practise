package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map {

	
	
	public static void main(String[] s)
	{
		
		Map<String,Integer> m=new HashMap<String,Integer>();
		m.put("a", new Integer(100));
		m.put("b", new Integer(200));
		
		Set<Map.Entry<String,Integer>> st=m.entrySet();
		for(Map.Entry<String,Integer> st1:st)
		{
			System.out.print(st1.getKey()+":");
			System.out.println(st1.getValue());
		}
	}
}
