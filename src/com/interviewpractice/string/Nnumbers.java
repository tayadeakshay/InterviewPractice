package com.interviewpractice.string;

import java.util.Arrays;

public class Nnumbers {

	public static void main(String[] args) {
		
		int n =4;
		String s = "absdiuclmfdsgj";
		int j = s.length();
		int k = j/n;
		
		for(int i=0;i<n;i++)
		{
			int m =i*k;
			String s1 = "";
			for(int l=m;l<m+k;l++)
			{
			s1 =s1+ "" + s.charAt(l);
			}
			System.out.println(s1);
		}
	}
}
