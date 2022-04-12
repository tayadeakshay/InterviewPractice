package com.interviewpractice.collection.compare;

import java.util.TreeSet;

public class Employee implements Comparable<Employee> {
	
	int id;
	String name;
	String location;

	public Employee() {
		super();
	}

	public Employee(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}

	@Override
	public String toString() {
		return "["+ id + ", " + name + ", " + location + "]";
	}

	@Override
	public int compareTo(Employee e) {
		if(id == e.id)
			return 0;
		else if(id > e.id)
			return 1;
		else
			return -1;
		
	}

}
