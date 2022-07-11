package com.interviewpractice.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Scenario11 {

	public static void main(String[] args) {

		String s1 = new String("Anna and civic kayak level madam mom noon racecar");
		s1=s1.toLowerCase();
		String[] s2 = s1.split(" ");
		
		List<String> list = new ArrayList();
		//int count =0;
		for(String i:s2)
		{
			StringBuffer b1 = new StringBuffer(i);
				b1.reverse();
			String s3= new String(b1);
				if(i.equals(s3))
				{
				list.add(i);
				}
		}
		System.out.println(list);
		Collections.sort(list,(i1,i2)->(i1.length()<i2.length())?-1:(i1.length()>i2.length())?1:0);
		System.out.println(list);
		System.out.println("Smallest pallindrom is : "+list.get(0));
		System.out.println("Biggest pallindrom is : "+list.get(list.size()-1));
	}
	
	
}