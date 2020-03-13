package com.rohit.interviewbit;
/*
 * 
 * 
 * Given two strings A and B, find the minimum number of steps required to convert A to B. (each operation is counted as 1 step.)

You have the following 3 operations permitted on a word:

Insert a character
Delete a character
Replace a character


Input Format:

The first argument of input contains a string, A.
The second argument of input contains a string, B.
Output Format:

Return an integer, representing the minimum number of steps required.
Constraints:

1 <= length(A), length(B) <= 450
Examples:

Input 1:
    A = "abad"
    B = "abac"

Output 1:
    1

Explanation 1:
    Operation 1: Replace d with c.

Input 2:
    A = "Anshuman"
    B = "Antihuman"

Output 2:
    2

Explanation 2:
    => Operation 1: Replace s with t.
    => Operation 2: Insert i.
 * 
 * 
 * 
 * 
 * 
 */
public class EditDistance {

	public static void main(String[] args) {

		System.out.println(new EditDistance().minEditDistance("abcdeeedddcdpaskjk", "abd"));

	}

	private int minEditDistance(String A, String B) {

		int arr[][] = new int[A.length() + 1][B.length() + 1];

		for (int i = 0; i <= A.length(); i++) {
			for (int j = 0; j <= B.length(); j++) {

				if (i == 0 && j == 0) {
					arr[i][j] = 0;
				}

				else if (i == 0) {
					arr[i][j] = arr[i][j - 1] + 1;
				} else if (j == 0) {
					arr[i][j] = arr[i - 1][j] + 1;
				}

				else if (A.charAt(i - 1) == B.charAt(j - 1)) {
					arr[i][j] = arr[i - 1][j - 1];
				}

				else {
					arr[i][j] = min(arr[i - 1][j], arr[i][j - 1], arr[i - 1][j - 1]) + 1;
				}
			}
		}

		return arr[A.length()][B.length()];

	}

	private int min(int a, int b, int c) {

		if (a < b && a < c)
			return a;
		else if (b < c)
			return b;
		else
			return c;
	}

}
