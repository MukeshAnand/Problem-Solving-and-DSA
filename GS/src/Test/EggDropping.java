package Test;



import java.util.*;
import java.lang.*;
import java.io.*;

class EggDropping {
	public static void main (String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(read.readLine());
		
		ArrayList<Integer> al = new ArrayList<>();
		
		while(test-->0){
		    
		    String[] st = read.readLine().trim().split("\\s+");
		    
		    int eggs = Integer.parseInt(st[0]);
		    
		    int floors = Integer.parseInt(st[1]);
		    
		    int res = calculate(eggs,floors);
		   
		    		al.add(res);
		    		
		    		
		    int result = calculateRecursive(eggs,floors);
		         al.add(result);
   
		}

		al.stream().forEach(System.out::println);
		
	}
	
	public static int calculate(int eggs, int floors){
	    
	    
	    int T[][] = new int[eggs+1][floors+1];
	    
	    int c=0;
	    
	    for(int i=0;i<=floors;i++){
	        T[1][i] = i;
	    }
	    
	    
	    for(int e=2;e<=eggs;e++){
	        
	        for(int f=1;f<=floors;f++){
	            
	            T[e][f] = Integer.MAX_VALUE;
	            
	            for(int k=1;k<=f;k++){
	                
	                c = 1+Math.max(T[e-1][k-1],T[e][f-k]);
	                
	                if(c<T[e][f]){
	                    T[e][f] = c;
	                }
 
	            }
	            
	            
	        }
	        
	        
	    }
	    return T[eggs][floors];
	    
	}
	
	public static int calculateRecursive(int eggs,int floors) {
		
		
		if(eggs ==1) {
			return floors;
		}
		
		if(floors ==0) {
			return 0;
		}
		
		int min = 1000;
		
		for(int f=1;f<=floors;f++) {
			
			int c = 1+Math.max(calculateRecursive(eggs-1,f-1), calculateRecursive(eggs,floors-f));
			
			if(c<min) {
				min = c;
			}
			
			
		}
		
		return min;
	}
}