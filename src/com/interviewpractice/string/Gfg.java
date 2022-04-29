package com.interviewpractice.string;

class Gfg
{
	// constructor
	Gfg()
	{
		System.out.println("Geeksforgeeks");
	}
	{
		System.out.println("Inside instance block");
	}
	
	static Gfg a = new Gfg(); //line 8

	public static void main(String args[])
	{
		Gfg b; //line 12
		b = new Gfg();
	}
}

