package com.test.TestIng;

public class BinarySearch {
	
	public static void main(String[] args) {
		 int[] arr = {1,2,3,4,5,6};
		 
		 System.out.println(binarySearch(arr,0,arr.length-1,3));
		
		
	}

	private static int binarySearch(int[] arr, int s,int l,int k) {
		
		
		int start =s;
		int last =l;
		
		
		while(start<=last) {
			int mid = start + last-1/2;
			
			if(arr[mid]==k)
				return mid;
			
			if(arr[mid]<k) {
				start= mid+1;
				
			}else {
				last=mid-1;
			}
		}
		
		return -1;
		
	}

}
