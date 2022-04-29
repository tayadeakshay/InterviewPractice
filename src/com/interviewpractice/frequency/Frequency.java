package com.interviewpractice.frequency;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Frequency {
	public static Map getFrequency(String s1)
	{
	String s2 = s1.replaceAll("[,.!@#$%^&*():;\"|~`?/]", "");
	String s3 =s2.trim();
	System.out.println(s3);
	String s4 = s3.toLowerCase();
	String[] s5 = s4.split(" ");
	
	List<String> list  = Arrays.asList(s5);
	int k =0;
	Map<String,Integer> map = new TreeMap();
	for(String s:list)
	{
		k = Collections.frequency(list, s);
		map.put(s, k);
	}
	return map;
	}

}
