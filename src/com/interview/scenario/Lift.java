package com.interview.scenario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Lift {
public static void main(String[] args) {
	
	int direction = 1;
	int currentFloor = 20;
	
	Integer[] arr = {10,30,7,8,23,54,23};
	
	Set<Integer> FloorSet = new HashSet(Arrays.asList(arr));
	createSequence(direction,currentFloor,FloorSet);
}

private static void createSequence(int direction, int currentFloor, Set<Integer> floorSet) {
	
	List<Integer> list1 = new ArrayList();
	List<Integer> list2 = new ArrayList();
	
 	int liftDirection = direction*currentFloor;
	if(liftDirection<0)
	{
		list1 = floorSet.stream().filter(i -> i<currentFloor).sorted((i1,i2)-> (i1>i2)?-1:(i1<i2)?1:0).collect(Collectors.toList());
		list2 = floorSet.stream().filter(i -> i>currentFloor).sorted().collect(Collectors.toList());

		list1.addAll(list2);
		System.out.println("Elevator will stop on floors in the following sequence:"+"\r\n"+list1);
	}else {
		list1 = floorSet.stream().filter(i -> i>currentFloor).sorted().collect(Collectors.toList());
		list2 = floorSet.stream().filter(i -> i<currentFloor).sorted((i1,i2)-> (i1>i2)?-1:(i1<i2)?1:0).collect(Collectors.toList());
		
		list1.addAll(list2);
		System.out.println("Elevator will stop on floors in the following sequence:"+"\r\n"+list1);
	}
}
}
