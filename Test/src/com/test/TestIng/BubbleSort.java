package com.test.TestIng;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		//int arr[] = {4,5,2,1,3,6,8,7};
		
		int arr[] = {1,2,3,4,5,6};
		
		Arrays.sort(arr);
		
		int n=arr.length;
		boolean swapped =false;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] =arr[j+1];
					arr[j+1] =temp;
					swapped =true;
				
				}
				
			}
			
			if(!swapped) {
				System.out.println("Breaked");
				break;
			}
		}
		
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}
