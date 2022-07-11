package com.interviewpractice.string;

public class ReverseString {

	
	static String s = "Akshay";
	
	static StringBuffer s1 = new StringBuffer(s);
	static StringBuffer s2 = s1.reverse();
	
	public static void main(String[] args) {

//		String s = "Akshay";
//		
//		StringBuffer s1 = new StringBuffer(s);
//		StringBuffer s2 = s1.reverse();
		
		
		System.out.println(s2);
		
		String s3 = new String(s2);
	}
}
