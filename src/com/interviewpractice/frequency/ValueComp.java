package com.interviewpractice.frequency;

import java.util.Comparator;

public class ValueComp implements Comparator<KeyValue> {

	@Override
	public int compare(KeyValue o1, KeyValue o2) {

		if(o1.frequency == o2.frequency)
			return 1;
		else if(o1.frequency < o2.frequency)
			return 1;
		else
			return -1;
	}

}
