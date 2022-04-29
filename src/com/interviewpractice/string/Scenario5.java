package com.interviewpractice.string;

public class Scenario5 {

	public static void main(String[] args) {

		int i = 10;
		int j = 20;
		
		int k = addIterative(i,j);
		System.out.println(k);
		 k = add
				 (50,60);
		 System.out.println(k);
		
	
	}
	public static int addIterative(int a, int b){  
        while (b != 0){
            int carry = (a & b) ; //CARRY is AND of two bits
          
            a = a ^ b; //SUM of two bits is A XOR B
          
            b = carry << 1; //shifts carry to 1 bit to calculate sum
        }
        return a;
        
 }

	public static int add(int a, int b){
        if(b == 0) return a;
        int sum = a ^ b; //SUM of two integer is A XOR B
        int carry = (a & b) << 1;  //CARRY of two integer is A AND B
        return add(sum, carry);
 }




}
