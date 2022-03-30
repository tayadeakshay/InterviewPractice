package com.interviewpractice.exception.custom;

public class CustomException {

	public static void main(String[] args) {
		try {
			isValidAge(17);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
	}

	private static boolean isValidAge(int age) {

		if (age < 18)
			throw new InvalidAgeException();
		else
			return true;
	}

}
