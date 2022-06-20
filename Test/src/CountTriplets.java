import java.util.HashSet;
import java.util.Scanner;

public class CountTriplets {

	public static void main (String[] args) {
	    
		Scanner scr = new Scanner(System.in);
		
	    int testCase = scr.nextInt();
	    
	    while(testCase --> 0) {
	    	
	    	int n = scr.nextInt();
	    	
	    	int[] arr = new int[n];
	    	HashSet<Integer> hs = new HashSet();
	    	
	    	for(int i=0;i<n;i++) {
	    		arr[i] = scr.nextInt();
	    		hs.add(arr[i]);
	    	}
	    	
	    	
	    	boolean flag = false;
	    	int count=0;
	    	
	    	for(int i =0;i<n;i++) {
	    		
	    		for(int j=i+1;j<n;j++) {
	    			 int sum = arr[i]+arr[j];
	    			 
	    			 if(hs.contains(sum)){
	    			     count ++;
	    			     flag= true;
	    			 }
	    			   
	    		}
	    		
	    	}
	    		
	       if(!flag) {
	    	   System.out.println(-1);
	       }else {
	    	   System.out.println(count);
	       }	
	    	
	    }
		
	}

}
