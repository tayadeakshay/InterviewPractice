package com.interviewpractice.string;

public class Scenario {

	public static void main(String[] args) {

		
		
		String s1 = new String("ABC");// ABC -HEAP
		String s2 = s1.concat(new String("ABC"));//ABCABC -HEAP
		
		String s3 = s2.intern();//ABCABC -SCP
		String s4 = "ABCABC";//ABCABC -SCP
		
		System.out.println(s2==s3);
		System.out.println(s3==s4);
		
		String s5 = new String("PQR");
		s5 = s5.intern();
		String s6 = s5.intern();
		
		System.out.println(s5==s6);
	}

}
