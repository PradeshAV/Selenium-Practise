package practice;

import java.awt.List;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;

public class list {
	
	
	
	public static void main(String[] s)
	{
		
		
		for(int i=0;i<4;i++)
		{
			
			switch(i)
			{
			
			
			
			case 0:
				int arr[]=new int[]{1,3,4,5,6};
				Vector<Integer> v=new Vector<Integer>();
				Hashtable<Integer, String > h1=new Hashtable();
				v.addElement(1);
				v.addElement(5);
				h1.put(0,"mohan");
				h1.put(1,"kumar");
				System.out.println(v.elementAt(0));
				System.out.println(h1.get(0));
				break;
				
			case 1:
			ArrayList<Integer> l=new ArrayList<Integer>();
			l.add(1);
			l.add(5);
			l.add(67);
			
			System.out.print(l.get(2));
				
				ArrayList<Integer> l2=new ArrayList<Integer>();
				l2.addAll(l);
				System.out.println(l2);
				break;
				
				
				
				
			case 2:
				ArrayList<String> l3=new ArrayList<String>();	
			l3.add("mohan");
			System.out.println(l3.indexOf(0));
			break;
			
			case 3:
				ArrayList<String> l4=new ArrayList<String>();	
			l4.add("mohan");
			l4.add("kum");
			l4.add("mano");
			l4.add("nbm");
			System.out.println(l4.subList(1, 3));
			break;
			
			}
		}
	}

}
