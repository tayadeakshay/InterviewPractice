package com.interviewpractice.collection.productcompare;

import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		Product p1 = new Product(10,"Oppo",1500);
		Product p2 = new Product(30,"Vivo",1000);
		Product p3 = new Product(20,"Apple",20000);
		Product p4 = new Product(40,"Samsung",3500);

		Set t1 = new TreeSet(new AscendingPrice());
		t1.add(p3);
		t1.add(p4);
		t1.add(p1);
		t1.add(p2);
		
		System.out.println(t1);
	}
	
	
	
	

}
