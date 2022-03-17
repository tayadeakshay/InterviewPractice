package com.interviewpractice.stringoperations.annagram;
import java.util.Scanner;

public class Test {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first string to check weather it is Annagram of second");
			String str1 = sc.next();
			System.out.println("Enter the second string to check weather it is Annagram of first");
			String str2 = sc.next();
			System.out.println(Annagram.isAnnagram(str1,str2));
			
		}

}
