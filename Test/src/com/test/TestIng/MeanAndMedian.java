package com.test.TestIng;

import java.util.Arrays;

public class MeanAndMedian {

	public static void main(String[] args) {
		 int arr[] = {1, 3, 4, 2, 7, 5, 8, 6};
		 
		 double mean = findMean (arr);
		 
		 Arrays.sort(arr);
		 
		 double median = findMedian(arr,arr.length);
		 
		 System.out.println( mean +"  "+median);
		
	}

	private static double findMedian(int[] arr,int n) {
		
      if(n%2!=0) {
    	  return (double)arr[n/2];
      }else {
    	  return (double)((arr[(n-1)/2])+(arr[n/2]))/2.0;
      }
		
	}

	private static double findMean(int[] arr) {
		
      int sum =arr[0];
      
      for(int i=1;i<arr.length;i++) {
    	  
    	  sum +=arr[i];
    	  
      }
      
      return (double)sum/(double)arr.length;
	}
}
