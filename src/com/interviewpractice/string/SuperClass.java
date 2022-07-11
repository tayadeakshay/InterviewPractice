package com.interviewpractice.string;

class superClass
{
	final public int calc(int a, int b)
	{
		return 0;
	}
}
class subClass extends superClass
{
	final public int calc(int a, int b)
	{
		return 1;
	}
}
 class Gfgg
{
	public static void main(String args[])
	{
		subClass get = new subClass();
		System.out.println("x = " + get.calc(0, 1));
	}
}
