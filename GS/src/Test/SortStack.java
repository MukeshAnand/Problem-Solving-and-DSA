package Test;
import java.util.*;
import java.lang.*;
import java.io.*;

public class SortStack {
	
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>(); 
        s.push(30); 
        s.push(-5); 
        s.push(18); 
        s.push(14); 
        s.push(-3); 
  
        System.out.println( 
            "Stack elements before sorting Recurrsive: "); 
        printStack(s); 
  
        sort(s); 
  
        System.out.println( 
            " \n\nStack elements after sorting Recurrsive :"); 
        printStack(s);
        
        System.out.println();
        s.clear();
        
        s.push(30); 
        s.push(-5); 
        s.push(18); 
        s.push(14); 
        s.push(-3); 
        
        System.out.println( 
                "Stack elements before sorting :  "); 
            printStack(s); 
      
            s=sortStack(s); 
      
            System.out.println( 
                " \n\nStack elements after sorting :"); 
            printStack(s);
		
	}
	
	public static Stack<Integer> sortStack(Stack<Integer> s) {
		
		Stack<Integer> tmp = new Stack<Integer>();
		
		while(!s.empty()) {
			int temp = s.pop();
			
			while(!tmp.empty()&&tmp.peek()>temp) {
				s.push(tmp.pop());
			}
			tmp.push(temp);
			
		}

		return tmp;
		
	}
	
	public static void sort(Stack<Integer> s){
		
		if(!s.empty()) {
			
			int temp = s.pop();
			
			sort(s);
			
			sortedInsert(s,temp);
			
		}
		
		
	}
	
	public static void sortedInsert(Stack<Integer> s, int t) {
		
		if(s.empty()|| t>s.peek()) {
			s.push(t);
			return;
		}
			int tmp = s.pop();
			sortedInsert(s,t);
			s.push(tmp);

	}
	
	 static void printStack(Stack<Integer> s) 
	    { 
	        ListIterator<Integer> lt = s.listIterator(); 
	  
	        // forwarding 
	        while (lt.hasNext()) 
	            lt.next(); 
	  
	        // printing from top to bottom 
	        while (lt.hasPrevious()) 
	            System.out.print(lt.previous() + " "); 
	    } 

}
