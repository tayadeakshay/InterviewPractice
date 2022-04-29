package com.interviewpractice.frequency;

public class KeyValue {

	String str;
	int frequency;
	
	public KeyValue() {
		super();
	}

	public KeyValue(String str, int frequency) {
		super();
		this.str = str;
		this.frequency = frequency;
	}

	@Override
	public String toString() {
		return str + " "+frequency ;
	}
	
}
