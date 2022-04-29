package com.interviewpractice.usercity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {

		List<String> list = new ArrayList();
		list.add("Mumbai");
		list.add("Pune");
		list.add("Akola");
		list.add("Amravati");
		
		List<String> list2 = new ArrayList();
		list2.add("Hyderabad");
		list2.add("Banglore");
		list2.add("Chennai");
		list2.add("Kolkata");
		
		List<String> list3 = new ArrayList();
		list3.add("Kolhapur");
		list3.add("Nagpur");
		list3.add("Wardha");
		list3.add("Nanded");
		
		User u1 = new User("Abc",20);
		User u2 = new User("PQR",10);
		User u3 = new User("DEF",30);
		
		Map<User, List<String>> map = new HashMap();
		map.put(u1, list2);
		map.put(u3, list);
		map.put(u2, list3);
		
		System.out.println("City =" + map.get(u1));
	
		
	}

}
