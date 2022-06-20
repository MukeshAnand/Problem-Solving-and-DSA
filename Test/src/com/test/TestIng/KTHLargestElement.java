package com.test.TestIng;

public class KTHLargestElement {
	
	public static void main(String[] args) {
		
		int arr[] = { 40,3,5,6,2,1,7};
		
		// quickSort(arr,0,arr.length-1);
		 
		 for(int a:arr) {
			 System.out.print(a+" ");
		 }
		 System.out.println();
		 System.out.println("Kth Smallest element");
		 
		 int small=kthSmallest(arr,0,arr.length-1,5);
		 
		 System.out.println(small);
		 
		 
		 
	}
	
	private static int kthSmallest(int []arr,int start,int last,int k) {
		
		
		
		if(k>0&&k<=last-start+1) {
			
			int pos = partition(arr,start,last);
			
			//System.out.println(pos);
			
			if(pos-start==k-1) {
				return arr[pos];
			}
			
			
			if(pos-start>k-1) {
				return kthSmallest(arr,start,pos-1,k);
			}
			
			
			return kthSmallest(arr,pos+1,last,k-pos+start-1);
	
			
		}
		
		return Integer.MAX_VALUE;
	}

	private static void quickSort(int[] arr, int i, int j) {
		
		
		if(i<j) {
		
			int pos = partition(arr,i,j);
			
			quickSort(arr,i,pos-1);
			quickSort(arr,pos+1,j);
			
			
		}
		
	}

	private static int partition(int[] arr,int start,int last) {
		
		
		int pivot =arr[last];
		int i=start;
		
		
		
		for(int j=i;j<last;j++) {
			
			if(arr[j]>=pivot) {
				
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				i++;
			}
			
		}
		
		int temp=arr[i];
		arr[i]=arr[last];
		arr[last] = temp;
		
		
		return i;
	}

}
