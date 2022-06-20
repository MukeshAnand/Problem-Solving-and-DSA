package com.test.TestIng;

import java.util.Scanner;

public class PrimeNmber {
	
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		int testCase = scr.nextInt();
				
	   while(testCase -->0) {			
		
		int num = scr.nextInt();
		
		boolean flag = true;
		
		
		for(int i=2;i<num;i++) {
			
			if(num%i ==0) {
				
				System.out.println("Not Prime");
				flag = false;
				break;
				
			}
		}
		if(flag)
		System.out.println("Prime");
		
		
	}
	}

}
