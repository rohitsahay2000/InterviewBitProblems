package com.rohit.interviewbit;

import java.util.ArrayList;

public class AntiDiagonals {
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		
		ArrayList<Integer> l2 = new ArrayList<>();
		l2.add(4);
		l2.add(5);
		l2.add(6);
		
		ArrayList<Integer> l3 = new ArrayList<>();
		l3.add(7);
		l3.add(8);
		l3.add(9);
		
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		A.add(l1);
		A.add(l2);
		A.add(l3);
		
		new AntiDiagonals().diagonal(A);
		
	}
	
	
	 public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
	 
		 ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	 
		 int arr[][] = new int [A.size()][A.get(0).size()];
		 
		 for(int i=0; i<A.size(); i++) {
			 for (int j=0; j<A.get(0).size(); j++) {
				 arr[i][j]=A.get(i).get(j);
			 }
		 }
		 
		 int i=0;
		 int j=0;
		 
		 while(j<arr[0].length && i<arr.length) {
			 	 
			 
			 int temp_i=i;
			 int temp_j=j;
			 
			 ArrayList<Integer> tmpResult = new ArrayList<>();
			 while(temp_i>=0 && temp_j>=0 && temp_i<arr.length && temp_j<arr[0].length) {
				 tmpResult.add(arr[temp_i][temp_j]);
				 temp_i++;
				 temp_j--;
			 }	
			 result.add(tmpResult);
			 if(j==arr[0].length-1) {
				 i++;
				 continue;
			 }	 
			 j++;
		 }
		 
		 
		 
		 return result;
	 }

}
