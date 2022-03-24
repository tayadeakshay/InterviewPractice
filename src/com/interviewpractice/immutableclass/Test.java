package com.interviewpractice.immutableclass;

public class Test {

	public static void main(String[] args) {

		Address add1 = new Address(411034,"Pune","India");
		Student s1 = new Student(10,"Ram",add1);
		
		
		System.out.println("before change: "+s1);
		
		
		add1.setCity("Mumbai");
		System.out.println("after change:  "+s1);
	}

}
