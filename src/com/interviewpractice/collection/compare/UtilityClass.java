package com.interviewpractice.collection.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class UtilityClass {

	public static void main(String[] args) {

		
		HashMap h1 = new HashMap();
		
		h1.put(10,10);
		h1.put(20,10);
		h1.put(40,10);
		h1.put(30,10);
		
		TreeMap m1 = new TreeMap();
		m1.putAll(h1);

		System.out.println(h1);
		
		Set set =  h1.entrySet();
		List list = new ArrayList(set);
		Collections.sort(list);
		System.out.println(list);
		
	
	}

}
