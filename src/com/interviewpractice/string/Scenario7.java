package com.interviewpractice.string;

public class Scenario7 {

	static int num = 100;

	public static void calc(int num) {
		num = num * 10;
		System.out.println(num);
	}

	public static void printNum() {
		System.out.println(num);
	}

	public static void main(String[] args) {
		Scenario7 obj = new Scenario7();
		calc(2);
		printNum();
	}
}
