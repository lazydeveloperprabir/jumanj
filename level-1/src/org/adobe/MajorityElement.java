package org.adobe;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		int[] arr = {1};
		getMajorityElement(arr);

	}
	
	static void getMajorityElement(int [] arr) {
		if(arr.length == 1) {
			System.out.println("the majority element is :" + arr[0]);
			System.exit(1);
		}
		
		Map<Integer,Integer> countMap = new HashMap<>();
		
		for(Integer num : arr) {
			if(countMap.containsKey(num)) {
				int count  = countMap.get(num);
				countMap.put(num, count+1);
			} else {
				countMap.put(num, 1);
			}
		}
		
		int sizeCheck = arr.length /2;
		countMap.forEach((key,value) ->{
			if(value >= sizeCheck) {
				System.out.println("The majority element is :" + key);
			}
		});
	

}
}