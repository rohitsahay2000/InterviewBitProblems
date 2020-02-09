package com.rohit.interviewbit;

import java.util.ArrayList;

/*
 * 
 * Given an index k, return the kth row of the Pascal’s triangle.
 * Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.
 * Example:
 * Input : k = 3
 * Return : [1,3,3,1]
 * NOTE : k is 0 based. k = 0, corresponds to the row [1]. 
 * Note:Could you optimize your algorithm to use only O(k) extra space?
 * 
 */

public class KthRowPascalTriangle {
	
	
	public static void main(String[] args) {
		
		System.out.println(new KthRowPascalTriangle().getRow(3));
		
	}

	public ArrayList<Integer> getRow(int A) {

		ArrayList<Integer> arrList = new ArrayList<>();

		int arr[][] = new int[A+1][A+1];

		for (int i = 0; i <= A; i++) {
			arr[i][0] = 1;
		}

		for (int i = 1; i <= A; i++) {
			for (int j = 1; j <= A; j++) {
				arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
			}

		}

		for (int i = 0; i <= A; i++) {
			arrList.add(arr[A][i]);
		}

		return arrList;

	}

}
