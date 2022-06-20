package graph;

import java.util.*;



public class IsConnectedUndirect {

	List<List<Integer>> graph;
    static boolean [] visted;
	
	
	IsConnectedUndirect(int nodes){
		
		
		graph = new ArrayList<>();
		
		visted = new boolean[nodes];
		
		for(int i=0;i<nodes;i++) {
			graph.add(i, new ArrayList<>());
		}
	}
	
	
	public void addEdges(int start,int end) {
		graph.get(start).add(end);
		graph.get(end).add(start);
		
	}
	
	
	public void dfs(int start) {
		
		
		Stack<Integer> s = new Stack<>();
		
		s.push(start);
		visted[start] = true;
		
		while(!s.empty()) {
			
			
			System.out.print(s.peek()+" ");
			
			List<Integer> neighbourNodes = graph.get(s.pop());
			
			for(Integer i: neighbourNodes) {
				
				if(!visted[i]) {
					s.push(i);
					visted[i]=true;
				}
				
			}
			
			
			
			
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		IsConnectedUndirect dfs = new IsConnectedUndirect(7);
		
		
		dfs.addEdges(0, 1);
		dfs.addEdges(0, 2);
		dfs.addEdges(1, 3);
		dfs.addEdges(3, 5);
		dfs.addEdges(2, 4);
		dfs.addEdges(4, 5);
		
	    dfs.dfs(0);
	    
	    System.out.println();
	    
	    for(int i=0 ;i<visted.length;i++) {
	    	 if(!visted[i]) {
	    		 System.out.println("Not Connected");
	    		 return;
	    	 }
	    }
	    
		
		
		System.out.println("Connected Graph");
		
	}
}
