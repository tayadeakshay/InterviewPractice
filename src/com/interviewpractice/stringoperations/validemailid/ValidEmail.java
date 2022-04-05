package com.interviewpractice.stringoperations.validemailid;

public class ValidEmail {

	public static boolean isValidEmail(String email) {
		if (email.contains("@gmail") || email.contains("@yahoo") || email.contains("@zohomail")
				|| email.contains("@rediffmail")) {
			if (email.endsWith(".com") || email.endsWith(".in") || email.endsWith(".org")) {
				return checkPrefix(email);
			} else
				return false;
		} else
			return false;
	}

	public static boolean checkPrefix(String email) {
		String[] a1 = email.split("@");
		if (a1.length > 2)
			return false;
		else {
			String a2 = a1[0];
			if (a2.charAt(0) == '1' || a2.charAt(0) == '2' || a2.charAt(0) == '3' || a2.charAt(0) == '4'
					|| a2.charAt(0) == '5' || a2.charAt(0) == '6' || a2.charAt(0) == '7' || a2.charAt(0) == '8'
					|| a2.charAt(0) == '9' || a2.charAt(0) == '0')
				return false;
			else if ((a2.contains("a") || a2.contains("b") || a2.contains("c") || a2.contains("d") || a2.contains("e")
					|| a2.contains("f") || a2.contains("g") || a2.contains("h") || a2.contains("i") || a2.contains("j")
					|| a2.contains("k") || a2.contains("l") || a2.contains("m") || a2.contains("n") || a2.contains("o")
					|| a2.contains("p") || a2.contains("q") || a2.contains("r") || a2.contains("s") || a2.contains("t")
					|| a2.contains("u") || a2.contains("v") || a2.contains("w") || a2.contains("x") || a2.contains("y")
					|| a2.contains("z") || a2.contains(".") || a2.contains("_") || a2.contains("0") || a2.contains("1")
					|| a2.contains("2") || a2.contains("3") || a2.contains("4") || a2.contains("5") || a2.contains("6")
					|| a2.contains("7") || a2.contains("8") || a2.contains("9"))
					&& (!(a2.contains("!") || a2.contains("@") || a2.contains("#") || a2.contains("$")
							|| a2.contains("%") || a2.contains("^") || a2.contains("&") || a2.contains("*")
							|| a2.contains("(") || a2.contains(")") || a2.contains("+") || a2.contains("=")
							|| a2.contains("{") || a2.contains("}") || a2.contains(":") || a2.contains(":")
							|| a2.contains("\"") || a2.contains("'") || a2.contains("<") || a2.contains(",")
							|| a2.contains(">") || a2.contains(".") || a2.contains("?") || a2.contains("/")
							|| a2.contains("|") || a2.contains("\\") || a2.contains("~") || a2.contains("`")
							|| a2.contains(" "))))
				return true;
			else
				return false;
		}
	}
}