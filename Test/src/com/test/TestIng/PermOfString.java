package com.test.TestIng;

import java.security.Signer;
import java.util.Scanner;

public class PermOfString {

	public static void main(String[] args) {
		

		Scanner scr = new Scanner(System.in);
		
		String str = scr.next();
		
		
		permString(str," ");
		
		System.out.println();
		
		permStringDist(str," ");
		

	}

	private static void permString(String str, String ans) {
		  
		
		if(str.length() ==0 ) {
			System.out.print(ans+ " ");
		}
		
		for(int i =0;i<str.length();i++) {
			
			char c= str.charAt(i);
			
           String ros= str.substring(0,i)+str.substring(i+1);
           
           
           permString(ros,ans+c);
           
           
			
			
		}
	}
	
    private static void permStringDist(String str, String ans) {
		  
		
		if(str.length() ==0 ) {
			System.out.print(ans+ " ");
		}
		
		boolean[] alpha = new boolean[26];
		
		for(int i =0;i<str.length();i++) {
			
			char c= str.charAt(i);
			
           String ros= str.substring(0,i)+str.substring(i+1);
           
           if(alpha[c-'a']==false)
           permStringDist(ros,ans+c);
           
           alpha[c-'a']=true;
			
			
		}
	}

}
