package com.rohit.interviewbit;

import java.util.ArrayList;

/*
 * Given numRows, generate the first numRows of Pascal’s triangle.
 * Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.
 * Example:
 * Given numRows = 5,
 * Return
 * [
     [1],
     [1,1],
     [1,2,1],
     [1,3,3,1],
     [1,4,6,4,1]
	]
 * 
 */


public class PascalTriangle {
	
	public static void main(String[] args) {
		new PascalTriangle().solve(4);
	}
	
	public ArrayList<ArrayList<Integer>> solve(int A) {

		ArrayList<ArrayList<Integer>> arrList = new ArrayList<>();

		int arr[][] = new int[A][A];

		for (int i = 0; i < A; i++) {
			arr[i][0] = 1;
		}

		for (int i = 1; i < A; i++) {
			for (int j = 1; j < A; j++) {
				arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
			}

		}

		for (int i = 0; i < A; i++) {
			ArrayList<Integer> tempList = new ArrayList<>();
			for (int j = 0; j < A; j++) {
				if (arr[i][j] != 0) {
					tempList.add(arr[i][j]);
				} else
					break;
			}
			arrList.add(tempList);
		}
		System.out.println(arrList);
		return arrList;

	}
}
