package com.interviewpractice.string;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HashMapIteration {
public static void main(String[] args) {
	
	Map<String,Integer> hash = new TreeMap();
	
	hash.put("ABC", 20);
	hash.put("XYZ", 10);
	hash.put("PQR", 300);
	
	
	Iterator itr = hash.entrySet().iterator();
	while(itr.hasNext())
	{
		Map.Entry e = (Map.Entry) itr.next(); 
		System.out.println(e.getKey() + " "+e.getValue());
	}
	
	for(Map.Entry e : hash.entrySet())
	{
System.out.println(e.getKey() +" "+ e.getValue());		
	}
	
}
}
