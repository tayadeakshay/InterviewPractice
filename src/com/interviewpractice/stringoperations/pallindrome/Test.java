package com.interviewpractice.stringoperations.pallindrome;
import java.util.Scanner;
public class Test {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string to check weather it is Pallindrome");
			String str = sc.next();
			System.out.println(Pallindrome.isPallindrome(str));
			
		}

}
