package com.interview.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Scenario1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		list.add(50);
		list.add(30);
		list.add(60);
		list.add(10);
		
		System.out.println(list);
		Comparator<Integer> c=(I1,I2)-> (I1<I2)?1:(I1>I2)?-1:0;
		Collections.sort(list,c);
		list.stream().forEach(System.out::println);
		List<Integer> l2 = list.stream().filter(i->i%2 ==0).collect(Collectors.toList());
		System.out.println(l2);
		
	}
	
}
