package Test;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scr = new Scanner(System.in);
		
		int test = scr.nextInt();
		
		while(test-->0){
		    
		    int n = scr.nextInt();
		    
		    String []arr1 = new String[n];
		    String []arr2 = new String[n];
		    
		    for(int i =0;i<n;i++){
		        
		        arr1[i] = scr.next();
	
		    }
		    
		    for(int i=0;i<n;i++){
		        
		       arr2[i] = scr.next();
		    }
		    
		    Arrays.sort(arr1);
		    Arrays.sort(arr2);
		    int count=0;
		    
		    for(int i=0;i<n;i++){
		        if(arr1[i]==arr2[i]){
		            count++;
		        }
		    }
		    
		    if(count==n){
		        System.out.println(1);
		    }else{
		        System.out.println(0);
		    }
		    
		    
		}
		
	}
}