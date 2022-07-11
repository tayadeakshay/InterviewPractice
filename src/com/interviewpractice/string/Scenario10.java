package com.interviewpractice.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Scenario10 {

	public static void main(String[] args) {

		String s = new String("Hello this is the GFG user");
		
		String[] s1 = s.split(" ");
		
		System.out.println(Arrays.toString(s1));
		
		List<String> list = Arrays.asList(s1);
		
		Collections.reverse(list);
		
		String[] s2 = list.toArray(s1);
		
		StringBuffer s3 = null;
		for(int i=1;i<s2.length-1;i++)
		{
			s3 = new StringBuffer(s2[i]);
			s3.reverse();
			String s4= new String(s3);
			s2[i]=s4;
		}
		System.out.println(Arrays.toString(s2));
		
		String s5="";
		for(int i=0;i<s2.length;i++)
		{
			s5 += s2[i]+" "; 
		}
		System.out.println(s5);
	}

}
