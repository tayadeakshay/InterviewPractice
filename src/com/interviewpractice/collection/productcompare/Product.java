package com.interviewpractice.collection.productcompare;

public class Product implements Comparable<Product> {

	int id;
	String name;
	int price;
	
	public Product() {
		super();
	}

	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	public int compareTo(Product p)
	{
		if(this.id == p.id)
			return 0;
		else if(this.id < p.id)
			return -1;
		else
			return 1;
	}
	
	
}
