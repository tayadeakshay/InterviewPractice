package com.interviewpractice.exception.custom;

public class InvalidAgeException extends RuntimeException {
	
	private static String msg = "Invalid Age";
	
	public InvalidAgeException()
	{
	this(msg);
	}
	public InvalidAgeException(String msg)
	{
	super(msg);
	}
	
}
