package com.interview.serialiazation;

import java.io.Serializable;

public class Student implements Serializable{

	int rollNo;
	transient String Name;
	
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		Name = name;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", Name=" + Name + "]";
	}
	
	
	
}
