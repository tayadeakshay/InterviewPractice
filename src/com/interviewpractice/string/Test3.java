package com.interviewpractice.string;

public class Test3
{
	public static void main(String[] args)
	{
		StringBuilder s1 = new StringBuilder("Java");
		String s2 = "Love";
		s1.append(s2);
		s1.substring(4);
		int foundAt = s1.indexOf(s2);
		System.out.println(foundAt);
		
		
		String s3 = "HelloWorld";
		System.out.println(s3.indexOf("World"));
		s2.concat("Hi");
	}
}
