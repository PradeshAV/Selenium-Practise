package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class set {
	
	
	
	public static void main(String[] s)
	{
		
		for(int i=0;i<2;i++)
		{
			
		switch(i)
		{
		case 0:
		
		Set<Integer> s1=new HashSet<Integer>();
		s1.add(1);
		s1.add(45);
		s1.add(23);
		s1.add(2);
		s1.add(2);
		System.out.println(s1);
		Set<Integer> s2=new TreeSet<Integer>(s1);
		System.out.println(s2);
		break;
		
		case 1:
			
			
			Set<Integer> s3=new HashSet<Integer>();
			s3.addAll(Arrays.asList(new Integer[] {1,5,6,7,8,9}));
			Set<Integer> s4=new HashSet<Integer>();
			s4.addAll(Arrays.asList(new Integer[]{1,4,5,7,8,3,5}));
			
			Set<Integer> union=new HashSet<Integer>(s3);
			union.addAll(s4);
			
			Set<Integer> intersection=new HashSet<Integer>(s3);
			intersection.retainAll(s4);
			System.out.println(intersection);
			
			Set<Integer> diff=new HashSet<Integer>(s3);
			diff.removeAll(s4);
			System.out.println(diff);
			
			break;
		
	}

}
}}