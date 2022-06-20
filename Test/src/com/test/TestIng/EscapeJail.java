package com.test.TestIng;

public class EscapeJail {
	
	public static void main(String[] args) {
		int arr[]= {11,21};
		
		System.out.println(jumpsNeed(10,1,arr));
		
	}

	public static int jumpsNeed(int x,int y,int[] h) {
		
		int n =h.length;
		
		int jumps=0;
		
		
		for(int i=0;i<n;i++) {
			
			jumps++;
			
			if(h[i]>x) {
				
				int height = h[i]-(x-y);
				
				jumps+=height/(x-y);
				
				if((height%(x-y))>1)
						jumps++;
				
				
			}
		}
		return jumps;
	}
}
