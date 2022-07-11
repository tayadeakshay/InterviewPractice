package com.interviewpractice.string;

public class Test
{
	try
	{
		void myMethod()
		{
			System.out.println("GeeksforGeeks");
			throw new Exception();
		}
	}
	catch(Exception e)
	{
		System.out.println("GFG");
	}
	public static void main(String[] args)
	{
		Test test = new Test();
	}
}

