package org.adobe;

import java.util.Scanner;

/*
 * //Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

//For example:
//Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

//Follow up:
//Could you do it without any loop/recursion in O(1) runtime?
 */


public class AddDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num =  sc.nextInt();
		
		if (num < 0) {
			System.out.println("Please enter a valid non-negative integer");
		}

		if (num <10) {
			System.out.println(num);
		}else {
			System.out.println(result(num));
			System.out.println(sumDigits(num));
		}
	
	}
	
	//using while loop
	public static int result(int num) {
		while(num >=10) {
			int temp= 0;
			while(num >0) {
				temp += num %10;
				num /=10;
			}
			num = temp;
		}
		return num;
	}
	
	//using no loops with O(1) 
	
//	public static int noLoopSol(int num) {
//		String number = Integer.toString(num);
//		if(number.length() > 1) {
//		return Integer.valueOf(number);
//	}else {
//		
//	}
//}
	
	static int sumDigits(int no)
    {
        return no == 0 ? 0 : no%10 + 
                  sumDigits(no/10) ;
    }

}
