package com.interviewpractice.collection.compare;

import java.util.Iterator;
import java.util.TreeSet;


public class Test {

	public static void main(String[] args) {

		Employee e1 = new Employee(40,"ABC","Hyderabad");
		Employee e2 = new Employee(20,"PQR","Delhi");
		Employee e3 = new Employee(10,"JKL","Pune");
		Employee e4 = new Employee(30,"XYZ","Mumbai");
		
		TreeSet t1 = new TreeSet();
		t1.add(e1);
		t1.add(e2);
		t1.add(e4);
		t1.add(e3);

		System.out.println("Sorting by Id       : "+ t1);
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		NewNameComp sortByName = new NewNameComp();
		TreeSet t2 = new TreeSet(sortByName);
		t2.add(e1);
		t2.add(e2);
		t2.add(e4);
		t2.add(e3);

		
		System.out.println("Sorting by Name     : "+t2);
		System.out.println("----------------------------------------------------------------------------------------------------");
		CitySorting sortByLocation = new CitySorting();
		TreeSet t3 = new TreeSet(sortByLocation);
		t3.add(e1);
		t3.add(e2);
		t3.add(e4);
		t3.add(e3);
		
		System.out.println("Sorting by Location : "+t3);
		
	}

}
