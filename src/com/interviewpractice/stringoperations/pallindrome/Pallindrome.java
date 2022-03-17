package com.interviewpractice.stringoperations.pallindrome;

import java.util.Arrays;

public class Pallindrome {

	public static String isPallindrome(String original) {

		char[] s1 = original.toCharArray();
		char[] s2 = new char[s1.length];
		int index = 0;
		for (int i = s1.length - 1; i >= 0; i--) {
			s2[index++] = s1[i];
		}

		String s3 = Arrays.toString(s1);
		String s4 = Arrays.toString(s2);
		if (s3.equalsIgnoreCase(s4))
			return "It is a Pallindrome";
		else
			return "It is not a Pallindrome";
	}

}
