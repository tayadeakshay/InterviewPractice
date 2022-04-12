package com.interviewpractice.collection.compare;

import java.util.Comparator;

public class CitySorting implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.location.compareTo(o2.location);
	}
	
	

}
