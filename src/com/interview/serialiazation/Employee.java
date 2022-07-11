package com.interview.serialiazation;

import java.io.Serializable;

public class Employee implements Serializable {

	transient int id;
	String Name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + "]";
	}
	
	
}
