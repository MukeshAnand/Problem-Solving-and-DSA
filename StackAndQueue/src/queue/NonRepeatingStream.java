package queue;

import java.util.*;

/**
 * Time Complexity and Space Complexity O(n)
 * 
 * @author mukesha
 *
 */

class NonRepeatingStream {
	public static void main (String[] args) {
	    
		NonRepeatingStream gfg = new NonRepeatingStream();
	    
	    try (Scanner scr = new Scanner(System.in)) {
			int testCase = scr.nextInt();
			
			while(testCase-->0){
			    
			    int n = scr.nextInt();
			    
			    char[] c = new char[n];
			    
			     for(int i=0;i<n;i++){
			         c[i]=scr.next().charAt(0);
			     }

			    gfg.printCharStream(c);
			}
		}
	
	}
	
	
	 public void printCharStream(char[] chars){
	     
	     
	     Map<Character, Integer> map = new HashMap<>();
	     
	     Queue<Character> queue = new LinkedList<>();
	     

	     for(int i =0 ;i<chars.length;i++){
	         
	         map.put(chars[i], map.getOrDefault(chars[i],0)+1);
	         
	         if(map.get(chars[i])==1){
	             queue.add(chars[i]);
	         }

	        while(!queue.isEmpty()){
	             
	             char c = queue.peek();
	             
	             if(map.get(c)==1){
	                 break;
	             }else{
	                 queue.remove();
	             }
	 
	         }
	         
	         if(queue.isEmpty()){
	             System.out.print(-1 + " ");
	         }else{
	             System.out.print(queue.peek()+" ");
	         }
	     } 
	     System.out.println();
	 }
}