package com.rohit.interviewbit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;




public class MajorityElement {
	
		
	 public int majorityElement(final List<Integer> A) {
	        
	     HashMap<Integer, Integer> myMap = new HashMap<>();
	     int maxElement=A.get(0);
	     int maxCount = 1;
	     
	     for (Integer element : A) {	    	 
	    	 if(!myMap.containsKey(element)) {   		 
	    		 myMap.put(element, 1);
	    	 }
	    	 else {
	    		 int currentCount=myMap.get(element)+1;
	    		 if(currentCount>maxCount) {
	    			 maxCount=currentCount;
	    			 maxElement=element;
	    		 }
	    		 myMap.put(element, currentCount);
	    	 }
	    	 
	     }
		 return maxElement;		 
		 
	 }

}
