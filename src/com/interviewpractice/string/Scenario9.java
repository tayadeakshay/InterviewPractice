package com.interviewpractice.string;

import java.util.Arrays;

public class Scenario9 {

	public static void main(String[] args) {
		
		int[] arr = {5,3,8,6};
		Arrays.sort(arr);
		int[] brr = new int[10];
		int temp = 0;
		
		for(int i=0;i<=9;i++)
		{
			int count = 0;
			for(int j=0;j<arr.length;j++)
			{
				if(i == arr[j])
				{
					count++;
					brr[temp++] = arr[j];
					break;
				}
			}
			if(count == 0)
				brr[temp++] = i;
		}
		System.out.println(Arrays.toString(brr));
		
	}
}
