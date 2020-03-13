/*
 * The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.

N Queens: Example 1

Given an integer n, return all distinct solutions to the n-queens puzzle.

Each solution contains a distinct board configuration of the n-queens’ placement, where 'Q' and '.' both indicate a queen and an empty space respectively.

For example,
There exist two distinct solutions to the 4-queens puzzle:

[
 [".Q..",  // Solution 1
  "...Q",
  "Q...",
  "..Q."],

 ["..Q.",  // Solution 2
  "Q...",
  "...Q",
  ".Q.."]
]
 * 
 * 
 */

package com.rohit.interviewbit;

import java.util.ArrayList;

public class NQueensPrintAllSolutions {

	public static void main(String[] args) {

		new NQueensPrintAllSolutions().solveNQueens(1);

	}

	public ArrayList<ArrayList<String>> solveNQueens(int a) {

		ArrayList<ArrayList<String>> boardList = new ArrayList<ArrayList<String>>();
		int arr[][] = new int[a][a];
		solveNQueensUtils(arr, 0, arr.length, boardList);
		return boardList;

	}

	private void solveNQueensUtils(int arr[][], int col, int a, ArrayList<ArrayList<String>> boardList) {

		if (col >= a) {
			boardList.add(getBoard(arr, arr.length));
			return;

		}

		for (int row = 0; row < a; row++) {

			if (isSafe(row, col, arr)) {
				arr[row][col] = 1;

				solveNQueensUtils(arr, col + 1, a, boardList);

				arr[row][col] = 0;
			}
		}

	}

	private ArrayList<String> getBoard(int arr[][], int a) {

		ArrayList<String> arrList = new ArrayList<>();

		for (int i = 0; i < a; i++) {
			StringBuilder strBuilder = new StringBuilder();
			for (int j = 0; j < a; j++) {
				if (arr[i][j] == 0)
					strBuilder.append(".");
				else if (arr[i][j] == 1)
					strBuilder.append("Q");
			}
			arrList.add(strBuilder.toString());
		}
		return arrList;
	}

	private boolean isSafe(int row, int col, int arr[][]) {

		for (int i = 0; i < row; i++) {
			if (arr[i][col] == 1)
				return false;
		}

		for (int i = 0; i < col; i++) {
			if (arr[row][i] == 1)
				return false;
		}

		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (arr[i][j] == 1)
				return false;
		}

		for (int i = row, j = col; i < arr.length && j >= 0; i++, j--) {
			if (arr[i][j] == 1)
				return false;
		}
		return true;
	}

}
