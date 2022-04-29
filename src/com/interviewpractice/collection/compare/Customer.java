package com.interviewpractice.collection.compare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;

public class Customer {

	public static void main(String[] args) {
		
		HashMap h1 = new HashMap();
		
		h1.put(10,20);
		h1.put(20,20);
		h1.put(30,30);

		ArrayList list = new ArrayList();
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(70);
		list.add(h1);
		
		System.out.println(list);
		
		ListIterator itr = list.listIterator(5);
		//Iterator itr1 = list.descendingIterator();
		
		
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
//		while(itr1.hasNext())
//		{
//			System.out.println(itr1.next());
//		}
	}

}
