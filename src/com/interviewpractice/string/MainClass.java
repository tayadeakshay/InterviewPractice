package com.interviewpractice.string;

import java.util.ArrayList;
import java.util.List;

class First
{
	int i = 10;

	public First(int j)
	{
		System.out.println(i);
		this.i = j * 10;
	}
}

class Second extends First
{
	public Second(int j)
	{
		super(j);
		System.out.println(i);
		this.i = j * 20;
	}
}

public class MainClass
{
	//int k =20;
	public static void main(String[] args)
	{
		Second n = new Second(20);
		System.out.println(n.i);
		//System.out.println(k);
	
	Object a1 = new ArrayList().listIterator();
	
	System.out.println(a1 instanceof List);
	}
}

