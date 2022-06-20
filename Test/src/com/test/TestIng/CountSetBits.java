package com.test.TestIng;

import java.util.Scanner;

public class CountSetBits {

	public static void main(String[] args) {
		
		
		Scanner scr = new Scanner(System.in);
		
		int n = scr.nextInt();
		 
		int count=0;
		
		while(n>0) {
			n&=(n-1);
			count++;
		}
		
		System.out.println(count);

	}

}
