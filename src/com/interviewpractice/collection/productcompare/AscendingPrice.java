package com.interviewpractice.collection.productcompare;

import java.util.Comparator;

public class AscendingPrice implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {

		if(p1.price == p2.price)
			return 0;
		else if(p1.price < p2.price)
			return -1;
		else
			return 1;
	}
	
}
