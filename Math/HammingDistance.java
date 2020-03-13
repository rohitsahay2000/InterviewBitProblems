/*
 * Hamming distance between two non-negative integers is defined as the number of positions at which the corresponding bits are different.

For example,

HammingDistance(2, 7) = 2, as only the first and the third bit differs in the binary representation of 2 (010) and 7 (111).

Given an array of N non-negative integers, find the sum of hamming distances of all pairs of integers in the array.
Return the answer modulo 1000000007.

Example

Let f(x, y) be the hamming distance defined above.

A=[2, 4, 6]

We return,
f(2, 2) + f(2, 4) + f(2, 6) + 
f(4, 2) + f(4, 4) + f(4, 6) +
f(6, 2) + f(6, 4) + f(6, 6) = 

0 + 2 + 1
2 + 0 + 1
1 + 1 + 0 = 8
 * 
 * 
 * 
 */


package com.rohit.interviewbit;

import java.util.LinkedList;
import java.util.List;

public class HammingDistance {

	public int hammingDistance(final List<Integer> A) {

		int sum = 0;

		for (int i = 0; i < A.size() ; i++) {

			for (int j = i; j < A.size(); j++) {

				int num1 = A.get(i);
				int num2 = A.get(j);

				int numFinal = num1 ^ num2;
				sum = (sum + num_of_ones(numFinal))%1000000007;

			}

		}

		return (sum*2)%1000000007;

	}
	
   public static void main(String[] args) {
	   
	List<Integer> list = new LinkedList<>();
	list.add(2);
	list.add(4);
	list.add(6);
	
	System.out.println(new HammingDistance().hammingDistance(list));
}

	int num_of_ones(int num) {
		int count = 0;
		while (num != 0) {
			if (num % 2 == 1)
				count++;
			num = num / 2;
		}
		return count;
	}

}
