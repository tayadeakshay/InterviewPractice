package com.interviewpractice.string;

public class Scenario4 {

	public static void main(String[] args) {

		String s1 = "ABC";
		String s2 = "PQR";
		String s3 = s1;
		s1 = s2;
		s2 = s3;
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
