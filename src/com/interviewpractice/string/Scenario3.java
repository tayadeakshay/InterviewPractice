package com.interviewpractice.string;

public class Scenario3 {

	public static void main(String[] args) {

		Integer x=20;
		int y=x;
		System.out.println(y);
		//Long z=y; //autoboxing and implicit promotion is not possible at the same time in java
		double res =10/0.0;
		System.out.println(res); // infinity
		//int res =10/0.0; //Type mismatch
		//System.out.println(z);
		
		
	}

}
