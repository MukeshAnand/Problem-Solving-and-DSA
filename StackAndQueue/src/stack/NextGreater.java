/*package whatever //do not write package name here */
package stack;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.lang.*;
import java.io.*;

class NextGreater {
	public static void main (String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		int testCase = Integer.valueOf(scr.next());
		
		while(testCase-->0){
		    int n = scr.nextInt();
		   
		    int[] arr = new int[n];
		    
		   for(int i =0;i<n;i++) {
			   arr[i]=scr.nextInt();
		   }
		   
		    
		     arr = getNextLargerElement(arr);
		     System.out.println();
		     for(int i: arr) {
		    	 System.out.print(i+" ");
		     }
		     
		  
		    
		} 
		
		
		
	}
	
	
	public static int[] getNextLargerElement(int [] arr){
	    
	    
	    List<Integer> list = new LinkedList<>();
	    
	    
	    
	    Stack<Integer> stack =new Stack<>();
	    
	    int n = arr.length;
	    
	    stack.push(arr[n-1]);
	   
	  
	    list.add(-1);
	    
	    for(int i = n-2;i>=0;i--){
	        
	        while(stack.isEmpty()==false&&stack.peek()<=arr[i]){
	            stack.pop();
	        }
	        
	        int ps = stack.isEmpty()?-1:stack.peek();
	        
	        
	        list.add(ps);
	        
	        stack.push(arr[i]);
	    }
	     Collections.reverse(list);
	    
	    return list.stream().mapToInt(Integer::intValue).toArray();
	    
	}
}