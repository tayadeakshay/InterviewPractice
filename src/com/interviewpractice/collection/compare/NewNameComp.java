package com.interviewpractice.collection.compare;

import java.util.Comparator;

public class NewNameComp implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.id == e2.id)
			return 0;
		else if(e1.id > e2.id)
			return 1;
		else
			return -1;
		
		
	}
	

	
}
