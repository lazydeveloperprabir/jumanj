package org.leetcode.array;

import java.util.Scanner;

//Kadane's algorithm for max sum in a postive aray of numbers
public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		int[] arr = {7,1,5,3,6,4};
		getMaxSumOfArray(arr);
		
	}
	
	static void getMaxSumOfArray(int[] arr) {
		if(arr.length == 0) {
			System.out.println("The max profit is :"+ 0);
			System.exit(1);
		}
	     int min = arr[0];
	     int max = 0;
	     
	     for(int i =1;i<arr.length;i++) {
	    	 	if(arr[i] > min) {
	    	 		max = Math.max(max, arr[i]-min);
	    	 	} else {
	    	 		min = arr[i];
	    	 	}
	     }
	     System.out.println("the maximum profit is :" + max);
	}

}
