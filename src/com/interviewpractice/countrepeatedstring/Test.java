package com.interviewpractice.countrepeatedstring;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		String s1 = "I'm Indian Citizen.. I live in India. India has 27 states";
		String[] s2 = null;
		s1 = s1.replace(".", "");
		s2 = s1.split(" ");
		System.out.println(Arrays.toString(s2));
		System.out.println();
		int length = s2.length;
		System.out.printf("%-10s%s \n", "String", "Count");
		for (int i = 0; i < length; i++) {
			int count = 1;
			for (int j = i + 1; j < length; j++) {
				if (s2[i].equals(s2[j])) {
					count++;
				}
			}
			for (int k = i; k > 0; k--) {
				if (s2[i].equals(s2[k-1])) {
					count=0;
				}
			}
			if(count>=1)
			System.out.printf("%-10s%02d \n", s2[i], count);
			else
				continue;
		}

	}

}
