package com.rohit.interviewbit;

import java.util.ArrayList;
import java.util.Collections;

public class ThreeSumZero {
	
	public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {

		Collections.sort(A);
		ArrayList<ArrayList<Integer>> myArrayList = new ArrayList<>();

		int start = 0;
		int end = A.size() - 1;

		while (start < end) {

			int start1 = start + 1;
			int end1 =  end;
		
			while (start1 < end1) {

				if ((A.get(start) + A.get(start1) + A.get(end1)) == 0) {
					ArrayList<Integer> tempArrayList = new ArrayList<>();
					tempArrayList.add(A.get(start));
					tempArrayList.add(A.get(start1));
					tempArrayList.add(A.get(end1));
					if(!myArrayList.contains(tempArrayList))
						myArrayList.add(tempArrayList);
					start1++;
				} else if ((A.get(start) + A.get(start1) + A.get(end1)) < 0) {
					start1++;
				} else if ((A.get(start) + A.get(start1) + A.get(end1)) > 0) {
					end1--;
				}

			}
			start++;

		}

		return myArrayList;

	}

}
