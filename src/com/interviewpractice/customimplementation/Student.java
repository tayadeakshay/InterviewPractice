package com.interviewpractice.customimplementation;

import java.util.Objects;

public class Student {

	String name;
	int id;
	Address add;
	
	
	
	public Student(String name, int id, Address add) {
		super();
		this.name = name;
		this.id = id;
		this.add = add;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", add=" + add + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(add, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(add, other.add) && id == other.id && Objects.equals(name, other.name);
	}
	
	
	}
	
	

