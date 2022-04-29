package com.interviewpractice.string;

public class Scenario2 {

	public static void main(String[] args) {

		String s1 = new String("PQR");
		
		String s2 = s1.concat("PQR");
		String s3 = "PQRPQR1";
		
		System.out.println(s2=s3);
		System.out.println(20-10 + "ABC");
		//System.out.println("ABC"+ 20 - 10);
		
		StringBuffer s5 = new StringBuffer("PQRPQR1");
		System.out.println(s5.toString() == s3);
		
		
		{
			System.out.println("Inside static block");
		}
		

	}

}
