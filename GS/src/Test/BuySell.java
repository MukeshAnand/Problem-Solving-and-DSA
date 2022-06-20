package Test;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class BuySell {
	public static void main (String[] args) throws IOException{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		int test  = Integer.parseInt(read.readLine());
		
		while(test --> 0){
		    
		    int n = Integer.parseInt(read.readLine());
		    
		    String[] str = read.readLine().trim().split("\\s+");
		    
		    int[] arr = new int[n];
		    
		    for(int i=0;i<n;i++){
		        arr[i] = Integer.parseInt(str[i]);
		    }
		    
		    
		    int buyDay =0;
		    int sellDay =0;
		    
		    boolean flag = false;
		    
		    for(int i=1;i<n;i++){
		        
		        if(arr[i]>arr[i-1]){
		            sellDay =i;
		        }else{
		            
		            if(buyDay!=sellDay){
		                System.out.print("("+buyDay+" "+sellDay+") ");
		                flag = true;
		            }
		            buyDay=i;sellDay=i;
		        }
		        
		    }
		    
		    if(buyDay!=sellDay){
		        System.out.print("("+buyDay+" "+sellDay+")");
		    }else if(!flag){
		        System.out.print("No Profit");
		    }
		    
		   
         System.out.println();
		}
	}
	
}
	
	