package com.rohit.interviewbit;

import java.util.List;

public class SearchRotatedSortedArray {

	    // DO NOT MODIFY THE LIST
	    public int search(final List<Integer> a, int b) {
	        
	        return binsearch(a,b,0,a.size()-1);
	    }
	    
	    
	     private int binsearch(List<Integer> arrlist, int key, int low, int high) {
	      
	      int mid= (low+high)/2;
	      
	      if(low>high)
	          return -1;
	      
	      if(arrlist.get(mid)==key)
	          return mid;
	      
	      if(arrlist.get(mid)>arrlist.get(low)) {
	          
	          if(key>=arrlist.get(low) && key<=arrlist.get(mid)) {
	              return binsearch(arrlist,key,low,mid-1);
	          }
	          else {
	              return binsearch(arrlist,key,mid+1,high);
	          }
	          
	      }
	      
	      else {      
	          if(key>=arrlist.get(mid) && key<=arrlist.get(high)) {
	              return binsearch(arrlist,key,mid+1,high);
	          }
	          else {
	              return binsearch(arrlist,key,low,mid-1);
	          }
	                
	      }
	      
	  }
	}


