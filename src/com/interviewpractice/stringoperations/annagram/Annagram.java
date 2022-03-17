package com.interviewpractice.stringoperations.annagram;

import java.util.Arrays;

public class Annagram {

	
	public static String isAnnagram(String original1,String original2)
	{
		
		char[] s1 = original1.toUpperCase().toCharArray();
		char[] s2 = original2.toUpperCase().toCharArray();
		
		Arrays.sort(s1);
		Arrays.sort(s2);

		String s3 = Arrays.toString(s1);
		String s4 = Arrays.toString(s2);
		
		if(s3.equals(s4))
		return "It is an Annagram";
		else
			return "Not an Annagram";
	
}}
