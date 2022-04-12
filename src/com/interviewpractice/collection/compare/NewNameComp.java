package com.interviewpractice.collection.compare;

import java.util.Comparator;

public class NewNameComp implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name);
		
		
	}
	

	
}
