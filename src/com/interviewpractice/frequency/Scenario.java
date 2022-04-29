package com.interviewpractice.frequency;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Scenario {
	public static void main(String[] args) {
		//String s1 = "Failure is not opposite of success, it is part of Success. It does not matter how slowly you go as long as you do not stop";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String to check frequency");
		String s1 = scanner.nextLine();

		Map<String, Integer> map = Frequency.getFrequency(s1);

		Set tree = new TreeSet(new ValueComp());
		KeyValue keyValue = null;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			keyValue = new KeyValue(entry.getKey(), entry.getValue());
			tree.add(keyValue);
		}
		Iterator itr = tree.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}

	}
}
