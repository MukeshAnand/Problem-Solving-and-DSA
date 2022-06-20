package com.test.TestIng;

public class InsertionSort {
	
	public static void main(String[] args) {
		
		int arr[]= {4,3,6,1,2,5};
		
		
		//insertionSort(arr);
		
		insertionRightToLeftSort(arr);
		
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

	private static void insertionSort(int[] arr) {
		
		for(int i=1;i<arr.length;i++) {
			
			int key = arr[i];
			int j=i-1;
			
			
			while(j>=0&&arr[j]>key) {
				
				
				arr[j+1]=arr[j];
				j=j-1;
				
			}
			arr[j+1]=key;
		}
		
	}
	
	private static void insertionRightToLeftSort(int[] arr) {
		
		for(int i=arr.length-1;i>0;i--) {
			
			int key = arr[i];
			int j=i-1;
			
			
			while(j<i-1&&arr[j]>key) {
				
				
				arr[j+1]=arr[j];
				j=j+1;
				
			}
			//arr[i+1]=key;
		}
		
	}


}
