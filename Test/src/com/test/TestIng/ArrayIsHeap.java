package com.test.TestIng;

public class ArrayIsHeap {

	public static void main(String[] args) {
		int arr[] = {90,15,10,7,12,2};
		
		int n =arr.length;
		
		boolean flag = false;
		
		for(int i =0; i<=(n-2)/2;i++) {
			
			if(arr[2*i+1]>arr[i]) {
				flag=false;
			}
			
			if(2*i+2<n&&arr[2*i+2]>arr[i]) {
				
				flag =false;
			}
		}
		
		flag=true;
		if(flag) {
			System.out.println("Heap");
		}else {
			System.out.println("Not Heap");
		}
	}
}
