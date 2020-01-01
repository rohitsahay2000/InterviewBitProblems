package com.rohit.interviewbit;

import java.util.ArrayList;

/**
 * 
 * We define f(X, Y) as number of different corresponding bits in binary representation of X and Y. 
 * For example, f(2, 7) = 2, since binary representation of 2 and 7 are 010 and 111, respectively. 
 * The first and the third bit differ, so f(2, 7) = 2.
 * You are given an array of N positive integers, A1, A2 ,…, AN. 
 * Find sum of f(Ai, Aj) for all pairs (i, j) such that 1 ≤ i, j ≤ N. Return the answer modulo 109+7.
 * @author rsahay
 *
 */

public class DifferentBitsSumPairwise {
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(1);
		arrList.add(3);
		arrList.add(5);
		
		System.out.println(new DifferentBitsSumPairwise().cntBits(arrList));
	}
	
	
	 public int cntBits(ArrayList<Integer> A) {
	  
		 long sumPairs=0;
		 
		 for (int i=0; i<32; i++) {
			 
			 long count=0;
			 for (int j=0; j<A.size(); j++) {
				 		 
				 if((A.get(j).intValue() & (1<<i))!=0) {
					 count++;
				 }			 				 
			 }
			 sumPairs=(sumPairs+ count*((A.size())-count)*2)%1000000007;
			 
		 }
		 		 
		 return (int) (sumPairs%(1000000007));
	 
	 }

}
